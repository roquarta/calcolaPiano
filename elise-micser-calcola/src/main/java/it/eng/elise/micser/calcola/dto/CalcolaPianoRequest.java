package it.eng.elise.micser.calcola.dto;

public class CalcolaPianoRequest {
	
	
	private double importo;
	private int    durata;
	private double tasso;
	
	public double getImporto() {
		return importo;
	}
	public void setImporto(double importo) {
		this.importo = importo;
	}
	public int getDurata() {
		return durata;
	}
	public void setDurata(int durata) {
		this.durata = durata;
	}
	public double getTasso() {
		return tasso;
	}
	public void setTasso(double tasso) {
		this.tasso = tasso;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CalcolaPianoRequest [importo=");
		builder.append(importo);
		builder.append(", durata=");
		builder.append(durata);
		builder.append(", tasso=");
		builder.append(tasso);
		builder.append("]");
		return builder.toString();
	}
}
