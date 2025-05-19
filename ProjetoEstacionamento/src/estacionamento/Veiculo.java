package estacionamento;

public abstract class Veiculo {
 
	protected String placa;
	protected String modelo;
	protected String marca;
	protected long horaEntrada;
	
	Veiculo(String placa, String modelo, String marca){
		
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.horaEntrada = System.currentTimeMillis();
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public long getHoraEntrada() {
		return horaEntrada;
	}
	
	public abstract double calcularPreco(long horaSaida);
	
}
