package br.com.praticas.si.projetocarnaval.questao06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Writer;

public class Arquivo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader local;
		BufferedReader ler = null;
		
		try {
			local = new FileReader("arquivoTeste.txt");
			ler = new BufferedReader(local);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("deu erro!");
		}
		
		try {
			String textoLinha;
			
			while (ler.ready()){
				textoLinha = ler.readLine();
				System.out.println(textoLinha);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERRO");
		}
	}

}
