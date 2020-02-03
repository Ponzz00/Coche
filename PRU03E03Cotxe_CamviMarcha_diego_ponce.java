package pru03.E02;

public class PRU03E03Cotxe_CamviMarcha_diego_ponce extends PRU03E02Cotxe_diego_ponce implements InterfaceCotxe {

	public PRU03E03Cotxe_CamviMarcha_diego_ponce(String marca, String modelo, TipusCanvi tipuscanvi) {
		super(marca, modelo, tipuscanvi);
	
		this.marca=marca;
		this.modelo=modelo;
		this.tipuscanvi=tipuscanvi;
	}

	public enum MarxaAutomatic {
		F,
		N,
		R;
	}
	
	
	public MarxaAutomatic CanviarMarxaAutomatic(int cambiar) throws Exception{
		EstatsMotorCotxe motor=EstatsMotorCotxe.Apagado;
		MarxaAutomatic marxa=MarxaAutomatic.N;
		if (motor.equals(EstatsMotorCotxe.EnMarcha)) {
			if (marxa.equals(MarxaAutomatic.N)) {
				if (cambiar==1) {
					marxa=MarxaAutomatic.F;
				} 
				else if (cambiar==2) {
					marxa=MarxaAutomatic.R;
				}	
			}
			if (marxa.equals(MarxaAutomatic.R)) {
				if (cambiar==0) {
					marxa=MarxaAutomatic.N;
				}
			}
			if (marxa.equals(MarxaAutomatic.F)) {
				if (cambiar==0) {
					marxa=MarxaAutomatic.N;
				}
				
			}
			return marxa;
		}
		else {
			throw new Exception ("El coche esta apagado, no cambies de marcha.");
		}	
	}

	public enum MarxaManual {
		primera,segunda,tercera,cuarta,quinta,sesta, R;
	}
	
	public MarxaManual CanviarMarxaManual(int cambiar) throws Exception {
		EstatsMotorCotxe motor=EstatsMotorCotxe.EnMarcha;
		MarxaManual marxa=MarxaManual.primera;
		if (motor.equals(EstatsMotorCotxe.EnMarcha)) {
			if (marxa.equals(MarxaManual.primera)) {
			
				if (cambiar==1) {
					marxa=MarxaManual.segunda;
				}
				else if (cambiar==0) {
					marxa=MarxaManual.R;
				}
			}	
			}		
		else {
			throw new Exception ("No sirve de nada cambiar de marcha si el cohe esta apagado");
		}
		return marxa;
	}



public static void main(String[] args) throws Exception {
	PRU03E03Cotxe_CamviMarcha_diego_ponce a=new PRU03E03Cotxe_CamviMarcha_diego_ponce("Ferrari", "Spider", TipusCanvi.CanviAutomatic);
	a.arrancarMotor();
	System.out.println(a.CanviarMarxaAutomatic(1));

}}

