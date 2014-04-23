package br.com.praticas.si.projetocarnaval.questao01;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class PrincipalEmpresa {
	
	public static void main (String [] args){
		
		Empresa empresa = null;
		
		Departamento departamentoFinancas = null;
		Departamento departamentoServicos = null;
		
		Funcionario x = null;
		Funcionario y = null;
		
		empresa.setCnpj(0356602300);
		empresa.setRazaoSocial("Padaria Bom Sabor");
		
		x.setNome("Gustavo");
		departamentoFinancas.adicionarFuncionario(x);
		
		y.setNome("Lucio");
		departamentoServicos.adicionarFuncionario(y);
		
		
		for (int i = 0; i < departamentoFinancas.getFuncionarios().size(); i++) {
			double aumento = (departamentoFinancas.getFuncionarios.get(i).getSalario();
			aumento = aumento + (aumento * 0.10);
			((Funcionario) departamentoFinancas.getFuncionarios().get(i)).setSalario(aumento);
			
		}
		
		
	}

}
