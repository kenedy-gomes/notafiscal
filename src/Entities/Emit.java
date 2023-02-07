package Entities;

public class Emit {

	private int CNPJ;
	private String xNome;
	private int IE;
	private int CRT;
	
	public Emit() {
		
	}
	public Emit(int cNPJ, String xNome, int iE, int cRT) {
		super();
		CNPJ = cNPJ;
		this.xNome = xNome;
		IE = iE;
		CRT = cRT;
	}
	public int getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}
	public String getxNome() {
		return xNome;
	}
	public void setxNome(String xNome) {
		this.xNome = xNome;
	}
	public int getIE() {
		return IE;
	}
	public void setIE(int iE) {
		IE = iE;
	}
	public int getCRT() {
		return CRT;
	}
	public void setCRT(int cRT) {
		CRT = cRT;
	}
	
	 
	
	 
	 
}
