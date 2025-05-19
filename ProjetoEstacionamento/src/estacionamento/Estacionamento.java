package estacionamento;

public class Estacionamento {
	private VagaEstacionamento[] vagas;

	Estacionamento(int capacidade) {
		vagas = new VagaEstacionamento[capacidade];
		for (int i = 0; i < capacidade; i++) {
			vagas[i] = new VagaEstacionamento();
		}
	}

	public boolean registrarEntrada(Veiculo veiculo) {
		for (VagaEstacionamento vaga : vagas) {
			if (!vaga.isOcupada()) {
				try {
					vaga.ocupar(veiculo);
					return true;
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		System.out.println("Estacionamento cheio.");
		return false;
	}
	 
	public double registrarSaida(String placa) {
	        for (VagaEstacionamento vaga : vagas) {
	            if (vaga.isOcupada() && vaga.getVeiculo().getPlaca().equals(placa)) {
	                long horaSaida = System.currentTimeMillis();
	                Veiculo v = vaga.liberar();
	                return v.calcularPreco(horaSaida);
	            }
	        }
	        System.out.println("Veículo não encontrado.");
	        return 0.0;
	    }

	public void consultarVagas() {
		for (int i = 0; i < vagas.length; i++) {
			System.out.printf("Vaga ", i + ": " + (vagas[i].isOcupada() ? "Ocupada" : "Livre"));
		}
	}

	public int vagasLivres() {
		int count = 0;
		for (VagaEstacionamento vaga : vagas) {
			if (!vaga.isOcupada())
				count++;
		}
		return count;
	}

	public int vagasOcupadas() {
		return vagas.length - vagasLivres();
	}
}
