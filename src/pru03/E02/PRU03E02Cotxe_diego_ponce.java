package pru03.E02;

public class PRU03E02Cotxe_diego_ponce extends CotxeAbstracte implements InterfaceCotxe {
	
	//DECLARAMOS ESTA IGUALDAD PARA QUE INICIE EL MOTOR EN MODO (APAGADO).
	EstatsMotorCotxe motor=EstatsMotorCotxe.Apagado;
	
	//DECLARAMOS LOS ATRIBUTOS PARA EL OBJETO COCHE (Cotxe).
	TipusCanvi tipuscanvi;
	String marca;
	String modelo;
	
	//CREAMOS EL CONSTRUCTOR
	public PRU03E02Cotxe_diego_ponce(String marca,String modelo, TipusCanvi tipuscanvi) {
		super(marca,modelo, tipuscanvi);
			this.marca=marca;
			this.tipuscanvi=tipuscanvi;
	}
	@Override
	public void arrancarMotor() throws Exception {
		
		if (motor.equals(EstatsMotorCotxe.Apagado)) { //EL (equals) ES PARA QUE COMPARE DOS COSAS
													 //EN ESTE CASO YA QUE (MOTOR=APAGADO), LO COMPARARA CON EL MOTOR APAGADO,
			motor=EstatsMotorCotxe.EnMarcha;		//Y SI SE CUMPLE, SE ARRANCARA EL MOTOR EJECUTANDO EL METODO ARRANCAR.	
		} 
		else {
			throw new Exception ("El motor ya sea ha encendido");
		}	
	}
	@Override
	public EstatsMotorCotxe comprovaMotor() {
		if (motor.equals(EstatsMotorCotxe.Apagado)) { //AQUI SIMPLEMENTE HACEMOS ESTA COMPARACION(equals) PARA QUE COMPRUEBE EL MOTOR
			return motor;							 // Y DEVUELVA SU ESTADO
		} else {									 
			return motor;						  
		}
	}
	@Override
	public int getRevolucions() {
		if (motor.equals(EstatsMotorCotxe.Apagado)) { //AQUI UTILIZAMOS EL (equals) 										 
													 //PARA QUE NOS DEVUELVA EL ESTADO ACTUAL DEL MOTOR YA ESTE ARRANCADO O PARADO
			return 0;								//PARA QUE COMPARE EL MOTOR Y SI EL MOTOR ESTABA APAGADO,
		} else {								   //EL 'IF' SE CUMPLE Y POR TANTO EL VALOR DE REVOLUCIONES SERA == 0
			return (int)(Math.random()*6500)+1;	  //SI NO SE CUMPLE INTRODUCIRA UN VALOR ALEATORIO ENTRE 1 Y 6500 (REVOLUCIONES).
		}
	}
	@Override
	public void aturarMotor() throws Exception {       //POR ULTIMO DENTRO DE LA CONDICION 'IF' EL (equals) 
		if (motor.equals(EstatsMotorCotxe.EnMarcha)) {//COMPARARA EL ESTADO Y SI ESTA ENCENDIDO EJECUTARA EL METODO APAGAR.
			motor=EstatsMotorCotxe.Apagado;
		} else {
			throw new Exception ("El motor ya sea ha apagado.");//Y SI YA ESTA APAGADO, LANZARA LA EXCEPCION AVISANDO QUE YA ESTA APAGADO
		}
		
	}
}


