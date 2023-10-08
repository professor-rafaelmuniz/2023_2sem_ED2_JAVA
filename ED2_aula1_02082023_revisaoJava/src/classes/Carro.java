package classes;

import java.util.Objects;

public class Carro {
	// ATRIBUTOS
	// CONSTRUTORES
	// METODOS
	
	private String modelo;
	private Integer ano; 
	private String placa;
	
	
	public Carro() {
		
	}
	public Carro(String modelo, Integer ano, String placa) {
		this.modelo = modelo;
		this.ano 	= ano;
		this.placa 	= placa;
	}
	
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", ano=" + ano + ", placa=" + placa + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(placa);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(placa, other.placa);
	}
	
	
	
	
	
	
	
}
