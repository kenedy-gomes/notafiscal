package Entities;

public class Dest {

	private double CPF;
	private String xNome;
	private int indIEDest;
	private String email;
	
	public Dest() {
	}

	public Dest(double cPF, String xNome, int indIEDest, String email) {
		super();
		CPF = cPF;
		this.xNome = xNome;
		this.indIEDest = indIEDest;
		this.email = email;
	}

	public double getCPF() {
		return CPF;
	}

	public void setCPF(double cPF) {
		CPF = cPF;
	}

	public String getxNome() {
		return xNome;
	}

	public void setxNome(String xNome) {
		this.xNome = xNome;
	}

	public int getIndIEDest() {
		return indIEDest;
	}

	public void setIndIEDest(int indIEDest) {
		this.indIEDest = indIEDest;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
