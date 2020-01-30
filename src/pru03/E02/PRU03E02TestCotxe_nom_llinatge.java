package pru03.E02;

public class PRU03E02TestCotxe_diego_ponce {

	public static void main(String[] args) throws Exception {
		
		PRU03E02Cotxe_diego_ponce coche1=new PRU03E02Cotxe_diego_ponce("Ferrari","Spider2.0", TipusCanvi.CanviManual);//CREAMOS EL OBJETO EL CUAL VAMOS A USAR PRUEBA 
		
		
		//----------------------------------------------------------------------------------------------------------------------------
		coche1.arrancarMotor();//"ACTIVAMOS" EL METODO (ARRANCAR) PARA QUE ARRANQUE AL EJECUTAR EL PROGRAMA.
		
		System.out.println("El motor está " +coche1.comprovaMotor());//YA QUE EL COCHE ESTA ARRANCADO, COMPRUEBA EL ESTADO DEL MOTOR
		
		System.out.println("Las revoluciones del motor son " +coche1.getRevolucions());//AQUI MUESTRA EL VALOR ALEATORIO QUE HE CREADO EN LA CLASE 'Cotxe_diego_ponce'
		
		//----------------------------------------------------------------------------------------------------------------------------
		coche1.aturarMotor();//AQUI SE EJECUTA EL METODO (ATURAR) PARA QUE EL MOTOR/COCHE SE APAGUE
		
		System.out.println(coche1.comprovaMotor());//VOLVEMOS A COMPROBAR EL MOTOR PARA VER QUE EL METODO SE HA EJECUTADO Y EL MOTOR SE HA APAGADO CORRECTAMENTE
		
		System.out.println("Las revoluciones del motor son "+coche1.getRevolucions());//COMO ESTA APAGADO ENTONCES LAS REVOLUCIONES TIENEN QUE SER==0
		
		}
	}	
	
