package estacionamento;

public class VagaEstacionamento {
	private Veiculo veiculo;

    public boolean isOcupada() {
        return veiculo != null;
    }

    public void ocupar(Veiculo veiculo) throws Exception {
        if (this.veiculo != null) {
            throw new Exception("Vaga já ocupada!");
        }
        this.veiculo = veiculo;
    }

    public Veiculo liberar() {
        Veiculo v = this.veiculo;
        this.veiculo = null;
        return v;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
}
