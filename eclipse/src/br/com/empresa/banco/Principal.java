package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class Principal {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(0, "");
		conta.deposita(100.0);
		System.out.println(conta.getSaldo());

	}

}
