package br.com.praticas.si.projetocarnaval.questao04;

import java.io.Serializable;
import java.util.ArrayList;

import br.com.praticas.si.projetocarnaval.questao01.Funcionario;

public class Departamento implements Serializable {
	
	private String nome;
	ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	public Object getFuncionarios;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void adicionarFuncionario (Funcionario funcionario){
		funcionarios.add(funcionario);
	}
	
	public ArrayList getFuncionarios() {
		return funcionarios;
	}
	
	public void setFuncionarios(ArrayList funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((funcionarios == null) ? 0 : funcionarios.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		if (funcionarios == null) {
			if (other.funcionarios != null)
				return false;
		} else if (!funcionarios.equals(other.funcionarios))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Departamento [nome=" + nome + ", funcionarios=" + funcionarios
				+ "]";
	}
	
}
