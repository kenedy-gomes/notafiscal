package Imposto;

public class ICMS {
	
	private int orig;
	private Double CST;
	private int modBC;
	private Double vBC;
	private Double pICMS;
	private Double vICMS;
	
	public ICMS() {}

	public ICMS(int orig, Double cST, int modBC, Double vBC, Double pICMS, Double vICMS) {
		super();
		this.orig = orig;
		CST = cST;
		this.modBC = modBC;
		this.vBC = vBC;
		this.pICMS = pICMS;
		this.vICMS = vICMS;
	}

	public int getOrig() {
		return orig;
	}

	public void setOrig(int orig) {
		this.orig = orig;
	}

	public Double getCST() {
		return CST;
	}

	public void setCST(Double cST) {
		CST = cST;
	}

	public int getModBC() {
		return modBC;
	}

	public void setModBC(int modBC) {
		this.modBC = modBC;
	}

	public Double getvBC() {
		return vBC;
	}

	public void setvBC(Double vBC) {
		this.vBC = vBC;
	}

	public Double getpICMS() {
		return pICMS;
	}

	public void setpICMS(Double pICMS) {
		this.pICMS = pICMS;
	}

	public Double getvICMS() {
		return vICMS;
	}

	public void setvICMS(Double vICMS) {
		this.vICMS = vICMS;
	}
	
	
}
