package br.com.praticas.si.projetocarnaval.questao05;

public class EstadoSigla {

		
		String[] nomes = {"Minas Gerais" , "Sao Paulo", "Rio Grande do Sul", "Bahia", "Parana", "Santa Catarina", "Goiás", "Piaui", "Paraiba", "Maranhao",
				"Pernambuco", "Ceara", "Rio Grande do Norte", "Pará", "Mato Grosso", "Tocantins", "Alagoas", "Rio de Janeiro", "Mato Grosso do Sul",
				"Espirito Santo", "Sergipe", "Amazonas", "Rondônia", "Amapá", "Roraima"};
		String[] siglas = {"MG","SP","RS","BA","PR","SC","GO","PI","PB","MA","PE","CE","RN","PA","MG","TO","AL","RJ","MS","ES","SE","AM","RO",
				"AP","RR"};

		public String recuperarNome(String sigla){
			for (int i = 0; i < siglas.length; i++) {
				if(sigla.equals(siglas[i]))
					return nomes[i];
			}
			return null;
		}

}
