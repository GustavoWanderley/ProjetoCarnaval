package br.com.praticas.si.projetocarnaval.questao02;

public class BancoPrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.depositar(1000);
		contaCorrente.toString();
		
		
		//7 questão
		try {
			contaCorrente.sacar(1500);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		contaCorrente.sacar(300);
		
		
		ContaCorrente contaEspecial = new ContaEspecial();
		contaEspecial.depositar(100);
		contaEspecial.sacar(80);
		contaEspecial.toString();
		

	}

}
