package clases;

public class Empresa {
	private String cuit, razonSocial;
	private SituacionIVAEnum situacionIva;
	
	public Empresa(String cuit, String razonSocial, SituacionIVAEnum situacionIva) {
		super();
		this.cuit = cuit;
		this.razonSocial = razonSocial;
		this.situacionIva = situacionIva;
	}

	@Override
	public String toString() {
		return "Empresa [cuit=" + cuit + ", razonSocial=" + razonSocial + ", situacionIva=" + situacionIva + "]";
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (cuit == null) {
			if (other.cuit != null)
				return false;
		} else if (!cuit.equals(other.cuit))
			return false;
		if (razonSocial == null) {
			if (other.razonSocial != null)
				return false;
		} else if (!razonSocial.equals(other.razonSocial))
			return false;
		if (situacionIva != other.situacionIva)
			return false;
		return true;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public SituacionIVAEnum getSituacionIva() {
		return situacionIva;
	}

	public void setSituacionIva(SituacionIVAEnum situacionIva) {
		this.situacionIva = situacionIva;
	}
	
	
	
	
}
