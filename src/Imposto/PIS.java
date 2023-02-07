package Imposto;

public class PIS {

	private int CST;
	private Double vBC;
	private Double pPIS;
	private Double vPIS;
	
	public PIS() {}

	public PIS(int cST, Double vBC, Double pPIS, Double vPIS) {
		super();
		CST = cST;
		this.vBC = vBC;
		this.pPIS = pPIS;
		this.vPIS = vPIS;
	}

	public int getCST() {
		return CST;
	}

	public void setCST(int cST) {
		CST = cST;
	}

	public Double getvBC() {
		return vBC;
	}

	public void setvBC(Double vBC) {
		this.vBC = vBC;
	}

	public Double getpPIS() {
		return pPIS;
	}

	public void setpPIS(Double pPIS) {
		this.pPIS = pPIS;
	}

	public Double getvPIS() {
		return vPIS;
	}

	public void setvPIS(Double vPIS) {
		this.vPIS = vPIS;
	}
	
	
	
}
