package br.com.conta;

public class ContaBanco {

	private int numConta;
	private String tipo;
	private String nome;
	private double saldo;
	private boolean status;

	// Default
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}

	// Parametrizado
	public ContaBanco(int numConta, String tipo, String nome, double saldo, boolean status) {
		super();
		this.numConta = numConta;
		this.tipo = tipo;
		this.nome = nome;
		this.saldo = saldo;
		this.status = status;
	}

	// Get e set
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ContaBanco [numConta=" + numConta + ", tipo=" + tipo + ", nome=" + nome + ", saldo=" + saldo
				+ ", status=" + status + "]";
	}


}
