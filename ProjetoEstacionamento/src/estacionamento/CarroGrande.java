package estacionamento;

public class CarroGrande extends Veiculo {
	    public CarroGrande(String placa, String modelo, String marca) {
	        super(placa, modelo, marca);
	    }

	    
	    public double calcularPreco(long horaSaida) {
	        long duracaoHoras = (horaSaida - horaEntrada) / 3600000; 
	        if (duracaoHoras == 0) duracaoHoras = 1;
			return duracaoHoras; 
	
	    }
}
