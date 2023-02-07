package Entities;

public class NotaFiscal {
	
	    protected Integer infNfseID;
	    protected String signature;
	    protected String versao;
	    
	    
	    public NotaFiscal() {
	    	
	    }
		public NotaFiscal(Integer infNfseID, String signature, String versao) {
			this.infNfseID = infNfseID;
			this.signature = signature;
			this.versao = versao;
		}
		public Integer getInfNfseID() {
			return infNfseID;
		}
		public void setInfNfseID(Integer infNfseID) {
			this.infNfseID = infNfseID;
		}
		public String getSignature() {
			return signature;
		}
		public void setSignature(String signature) {
			this.signature = signature;
		}
		public String getVersao() {
			return versao;
		}
		public void setVersao(String versao) {
			this.versao = versao;
		}
		public void NotafiscalX() {
		}
	    
}
