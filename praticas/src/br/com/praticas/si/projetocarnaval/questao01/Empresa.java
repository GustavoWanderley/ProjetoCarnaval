package br.com.praticas.si.projetocarnaval.questao01;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private String razaoSocial;
	private long cnpj;
	List departamentos = new ArrayList<Departamento>();
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public long getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
	public void adicionaDepartamento (Departamento departamento){
		departamentos.add(departamento);
	}
	
	public List getDepartamentos() {
		return departamentos;
	}
	
	public void setDepartamentos(List departamentos) {
		this.departamentos = departamentos;
	}
	
	public boolean transfereFuncionario (Funcionario funcionario, Departamento destino){
		for (int i = 0; i < departamentos.size(); i++){
			for (int j = 0; j < ((Departamento) departamentos.get(i)).getFuncionarios().size(); j++){
				if (((Departamento) departamentos.get(i)).getFuncionarios().get(j) == funcionario){
					destino.adicionarFuncionario(funcionario);
					return true;
				}
			}
		}
		return false;
	}
	
}
