package br.com.sistema;

import br.com.conta.ContaBanco;
import br.com.conta.Funcoes;

public class Sistema {

	public static void main(String[] args) {

		ContaBanco p1 = new ContaBanco();
		Funcoes f = new Funcoes();

		p1.setNumConta(111);
		p1.setNome("Thiago");
		f.abrirConta("CC",p1);
		f.depositar(500, p1);
		f.sacar(200, p1);
		f.estadoAtual(p1);
		
		ContaBanco p2 = new ContaBanco();

		p2.setNumConta(222);
		p2.setNome("Tereza");
		f.abrirConta("CP",p2);
		f.depositar(300, p2);
		f.sacar(1000, p2);
		f.estadoAtual(p2);
		
	}

}
