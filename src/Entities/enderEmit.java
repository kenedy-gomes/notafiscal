package Entities;

public class enderEmit {

	private String xLgr;
	private int nro;
	private int xCpl;
	private String xBairro;
	private int cMun;
	private String xMun;
	private String UF;
	private int CEP;
	private int cPais;
	private String xPais;
	private int fone;
	public enderEmit(String xLgr, int nro, int xCpl, String xBairro, int cMun, String xMun, String uF, int cEP,
			int cPais, String xPais, int fone) {
		this.xLgr = xLgr;
		this.nro = nro;
		this.xCpl = xCpl;
		this.xBairro = xBairro;
		this.cMun = cMun;
		this.xMun = xMun;
		UF = uF;
		CEP = cEP;
		this.cPais = cPais;
		this.xPais = xPais;
		this.fone = fone;
	}
	public String getxLgr() {
		return xLgr;
	}
	public void setxLgr(String xLgr) {
		this.xLgr = xLgr;
	}
	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
	}
	public int getxCpl() {
		return xCpl;
	}
	public void setxCpl(int xCpl) {
		this.xCpl = xCpl;
	}
	public String getxBairro() {
		return xBairro;
	}
	public void setxBairro(String xBairro) {
		this.xBairro = xBairro;
	}
	public int getcMun() {
		return cMun;
	}
	public void setcMun(int cMun) {
		this.cMun = cMun;
	}
	public String getxMun() {
		return xMun;
	}
	public void setxMun(String xMun) {
		this.xMun = xMun;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
	public int getCEP() {
		return CEP;
	}
	public void setCEP(int cEP) {
		CEP = cEP;
	}
	public int getcPais() {
		return cPais;
	}
	public void setcPais(int cPais) {
		this.cPais = cPais;
	}
	public String getxPais() {
		return xPais;
	}
	public void setxPais(String xPais) {
		this.xPais = xPais;
	}
	public int getFone() {
		return fone;
	}
	public void setFone(int fone) {
		this.fone = fone;
	}
	
	
	
}
