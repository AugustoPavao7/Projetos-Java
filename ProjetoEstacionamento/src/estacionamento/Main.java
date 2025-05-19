package estacionamento;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Estacionamento est = new Estacionamento(10);
		Scanner scanner = new Scanner (System.in);
		int opcao;
		
		 do {
	            System.out.println("1. Entrada veículo\n2. Saída veículo\n3. Consultar vagas\n0. Sair");
	            opcao = scanner.nextInt(); scanner.nextLine();
	            
	            switch(opcao) {
	            case 1: 
	            	System.out.println("Tipo (1=Pequeno, 2=Grande, 3=Moto): ");
	            	int tipo = scanner.nextInt(); scanner.nextLine();
	            	System.out.println("Placa: ");
	            	String placa = scanner.nextLine();
	            	System.out.println("Modelo: ");
	            	String modelo = scanner.nextLine();
	            	System.out.println("Marca: ");
	            	String marca = scanner.nextLine();
	            	
	            	Veiculo v;
	            	if(tipo == 1) v = new CarroPequeno (placa, modelo, marca);
	            	else if (tipo == 2) v = new CarroGrande(placa, modelo, marca);
	            	else v = new Moto(placa, modelo, marca);
	            	
	            case 2:
	            	System.out.println("Placa do veículo: ");
	            	String placaSaida = scanner.nextLine();
	            	double valor = est.registrarSaida(placaSaida);
	            	if (valor > 0) System.out.println("Valor a pagar: R$" + valor);
	            	break;
	            	
	            case 3:
	            	est.consultarVagas();
	            	break;
	            }
	        } while(opcao != 0);

	    scanner.close();
	}
}
