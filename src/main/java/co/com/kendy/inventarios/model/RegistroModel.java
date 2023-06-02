package co.com.kendy.inventarios.model;

public class RegistroModel {
	
	private String idBodega;
	private String referencia;
	private Integer cantidad;
	public String getIdBodega() {
		return idBodega;
	}
	public void setIdBodega(String idBodega) {
		this.idBodega = idBodega;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "RegistroModel [idBodega=" + idBodega + ", referencia=" + referencia + ", cantidad=" + cantidad + "]";
	}
	
	
}
