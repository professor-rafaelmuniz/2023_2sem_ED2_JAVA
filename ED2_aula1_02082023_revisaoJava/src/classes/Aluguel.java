package classes;

public class Aluguel {
	private String dataInicio;
	private String dataTermino;
	private Float valor;
	private Cliente cliente;
	private Carro carro;
	
	public Aluguel() {
		
	}
	
	
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	@Override
	public String toString() {
		return "Aluguel [dataInicio=" + dataInicio + ", dataTermino=" + dataTermino + ", valor=" + valor + ", cliente="
				+ cliente + ", carro=" + carro + "]";
	}
	
	
	
	
}
