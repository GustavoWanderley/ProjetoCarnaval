package br.com.praticas.si.projetocarnaval.questao02;

public class ContaEspecial extends ContaCorrente {
	
	public void sacar (double valorSacar){
		if (this.saldo <= 0){
			System.out.println("Liso, ta sem dinheiro");
		}
		if ((this.saldo > 0) && (this.saldo < valorSacar)){
			System.out.println("Seu saldo nao eh suficiente !");
			System.out.println(this.toString());
		}
		else {
			saldo = saldo - valorSacar;
			saldo = saldo - ((0.1 /100) * valorSacar);
		}
	}

}
