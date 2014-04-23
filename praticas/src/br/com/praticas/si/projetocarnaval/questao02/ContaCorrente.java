package br.com.praticas.si.projetocarnaval.questao02;

import br.com.praticas.si.projetocarnaval.questao07.SaldoInsuficienteExpecion;

public class ContaCorrente {
	
	protected double saldo = 0;

	public double getSaldo() {
		return saldo;
	}
	
	public void depositar (double valor){
		this.saldo = saldo + valor;
	}
	
	public void sacar (double valorSacar) throws SaldoInsuficienteExpecion{
		if (this.saldo <= 0){
			throw new SaldoInsuficienteExpecion(); //7 questão
		}
		if ((this.saldo > 0) && (this.saldo < valorSacar)){
			System.out.println("Seu saldo nao eh suficiente !");
			System.out.println(this.toString());
		}
		else {
			saldo = saldo - valorSacar;
			saldo = saldo - ((0.5 /100) * valorSacar);
		}
		
	}

	@Override
	public String toString() {
		return "ContaCorrente [saldo=" + saldo + "]";
	}
	
}
