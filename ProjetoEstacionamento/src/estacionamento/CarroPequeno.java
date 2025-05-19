package estacionamento;

public class CarroPequeno extends Veiculo {
	
	public CarroPequeno(String placa, String modelo, String marca){
		super (placa, modelo, marca);
	}
	
	public double calcularPreco(long horaSaida) {
		long duracao = (horaSaida - horaEntrada) / 3600000;
		if (duracao == 0) duracao = 1;
		return duracao * 16.0;
	}
}
