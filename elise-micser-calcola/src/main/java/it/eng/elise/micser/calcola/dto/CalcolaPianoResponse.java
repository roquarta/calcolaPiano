package it.eng.elise.micser.calcola.dto;

public class CalcolaPianoResponse {
	
	private double importoRata;


	public double getImportoRata() {
		return importoRata;
	}

	public void setImportoRata(double importoRata) {
		this.importoRata = importoRata;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CalcolaPianoResponse [importoRata=");
		builder.append(importoRata);
		builder.append("]");
		return builder.toString();
	}
}
