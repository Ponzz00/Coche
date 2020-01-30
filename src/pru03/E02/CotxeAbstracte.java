package pru03.E02;

public abstract class CotxeAbstracte implements InterfaceCotxe {
	
	protected String marca;
	protected String modelo;
	protected TipusCanvi tipuscanvi;
	
	public CotxeAbstracte(String marca, String modelo, TipusCanvi tipuscanvi) {
		this.marca=marca;
		this.marca=modelo;
		this.tipuscanvi=tipuscanvi;
	}

}