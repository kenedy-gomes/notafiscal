package Entities;

public class Prod {
	private int cProd;
	private String cEAN;
	private String xProd;
	private int NCM;
    private int CEST; 
    private int CFOP;
    private String uCom;
    private int qCom;
    private int vUnCom;
    private int vProd;
    private String cEANTrib;
    private String  uTri;
    private Double qTrib;
    private Double vUnTrib;
    private int indTot;
    
    public Prod() {}

	public Prod(int cProd, String cEAN, String xProd, int nCM, int cEST, int cFOP, String uCom, int qCom, int vUnCom,
			int vProd, String cEANTrib, String uTri, Double qTrib, Double vUnTrib, int indTot) {
		super();
		this.cProd = cProd;
		this.cEAN = cEAN;
		this.xProd = xProd;
		NCM = nCM;
		CEST = cEST;
		CFOP = cFOP;
		this.uCom = uCom;
		this.qCom = qCom;
		this.vUnCom = vUnCom;
		this.vProd = vProd;
		this.cEANTrib = cEANTrib;
		this.uTri = uTri;
		this.qTrib = qTrib;
		this.vUnTrib = vUnTrib;
		this.indTot = indTot;
	}

	public int getcProd() {
		return cProd;
	}

	public void setcProd(int cProd) {
		this.cProd = cProd;
	}

	public String getcEAN() {
		return cEAN;
	}

	public void setcEAN(String cEAN) {
		this.cEAN = cEAN;
	}

	public String getxProd() {
		return xProd;
	}

	public void setxProd(String xProd) {
		this.xProd = xProd;
	}

	public int getNCM() {
		return NCM;
	}

	public void setNCM(int nCM) {
		NCM = nCM;
	}

	public int getCEST() {
		return CEST;
	}

	public void setCEST(int cEST) {
		CEST = cEST;
	}

	public int getCFOP() {
		return CFOP;
	}

	public void setCFOP(int cFOP) {
		CFOP = cFOP;
	}

	public String getuCom() {
		return uCom;
	}

	public void setuCom(String uCom) {
		this.uCom = uCom;
	}

	public int getqCom() {
		return qCom;
	}

	public void setqCom(int qCom) {
		this.qCom = qCom;
	}

	public int getvUnCom() {
		return vUnCom;
	}

	public void setvUnCom(int vUnCom) {
		this.vUnCom = vUnCom;
	}

	public int getvProd() {
		return vProd;
	}

	public void setvProd(int vProd) {
		this.vProd = vProd;
	}

	public String getcEANTrib() {
		return cEANTrib;
	}

	public void setcEANTrib(String cEANTrib) {
		this.cEANTrib = cEANTrib;
	}

	public String getuTri() {
		return uTri;
	}

	public void setuTri(String uTri) {
		this.uTri = uTri;
	}

	public Double getqTrib() {
		return qTrib;
	}

	public void setqTrib(Double qTrib) {
		this.qTrib = qTrib;
	}

	public Double getvUnTrib() {
		return vUnTrib;
	}

	public void setvUnTrib(Double vUnTrib) {
		this.vUnTrib = vUnTrib;
	}

	public int getIndTot() {
		return indTot;
	}

	public void setIndTot(int indTot) {
		this.indTot = indTot;
	}
    
    
	
}
