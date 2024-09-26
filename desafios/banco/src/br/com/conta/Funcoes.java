package br.com.conta;

public class Funcoes {

	ContaBanco conta = new ContaBanco();
	
	
	public void estadoAtual(ContaBanco conta) {
		
		System.out.println("\nConta: " + conta.getNumConta());
		System.out.println("Tipo: " + conta.getTipo());
		System.out.println("Dono: " + conta.getNome());
		System.out.println("Saldo: " + conta.getSaldo());
		System.out.println("Status: " + conta.isStatus() + "\n");
	}

	public void abrirConta(String t, ContaBanco conta) {

		
		conta.setTipo(t);
		conta.setStatus(true);

		if (t == "CC") {
			conta.setSaldo(50);
		} else if (t == "CP") {
			conta.setSaldo(150);
		}
		System.out.println("\n------------------------------");
		System.out.println("Conta aberta com sucesso\n");
	}

	public void fecharConta() {

		if (conta.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada, pois ainda tem dinheiro");
		} else if (conta.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada, pois ainda tem débito");
		} else {
			conta.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}

	public void depositar(float v, ContaBanco conta) {

		if (conta.isStatus() == true) {
			conta.setSaldo(conta.getSaldo() + v);
			System.out.println("Depósito realizado com sucesso na conta " + conta.getNome());
		} else {
			System.out.println("Não pode depositar numa conta fechada");
		}

	}

	public void sacar(float v,ContaBanco conta) {
		if (conta.isStatus() == true) {
			if (conta.getSaldo() >= v) {
				conta.setSaldo(conta.getSaldo() - v);
				System.out.println("Saque realizado com sucesso na conta " + conta.getNome());
			} else {
				System.out.println("Saldo insuficiente para saque");
			}
		} else {
			System.out.println("Não da pra sacar de uma conta fechada");
		}
	}

	public void pegarMensalidade(ContaBanco conta) {
		int v = 0;
		
		if (conta.getTipo() == "CC") {
			v = 12;
		} else if (conta.getTipo() == "CP") {
			v = 20;
		}
		if (conta.isStatus() == true) {
			conta.setSaldo(conta.getSaldo() - v);
			System.out.println("Mensalidadade paga com sucesso!");
		} else {
			System.out.println("Não da para pagar a mensalidadade, conta fechada");
		}
	}
}
