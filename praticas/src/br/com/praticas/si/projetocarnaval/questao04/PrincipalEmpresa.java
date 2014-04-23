package br.com.praticas.si.projetocarnaval.questao04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.praticas.si.projetocarnaval.questao01.Departamento;
import br.com.praticas.si.projetocarnaval.questao01.Empresa;
import br.com.praticas.si.projetocarnaval.questao01.Funcionario;

public class PrincipalEmpresa {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Empresa empresa = new Empresa();
		
		try {
			
			FileOutputStream out = new FileOutputStream("f://atividadeCarnaval.txt");
			ObjectOutputStream objectOut = new ObjectOutputStream(out);
			objectOut.writeObject(objectOut);
			objectOut.close();
			System.out.println("Empresa");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			FileInputStream input = new FileInputStream("f://atividadeCarnaval.txt");
			ObjectInputStream objectInput = new ObjectInputStream(input);
			Empresa recebe = (Empresa) objectInput.readObject();
			System.out.println(recebe.toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		Empresa empresaP = null;
		
		Departamento departamentoFinancas = null;
		Departamento departamentoServicos = null;
		
		Funcionario x = null;
		Funcionario y = null;
		
		empresaP.setCnpj(0356602300);
		empresaP.setRazaoSocial("Padaria Bom Sabor");
		
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
