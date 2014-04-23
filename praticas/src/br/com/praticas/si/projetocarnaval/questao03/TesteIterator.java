package br.com.praticas.si.projetocarnaval.questao03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TesteIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lista = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++){
			lista.add(i);
			set.add(i);
		}
		
		System.out.println("LISTA");
		Iterator<Integer> x = lista.iterator();
		
		while (x.hasNext()){
			
			int numero = x.next();
			System.out.println(numero + " ");
		}
		
		System.out.println("SET");
		Iterator<Integer> y = set.iterator();
		
		while(y.hasNext()){
			
			int numero = y.next();
			System.out.println(numero + " ");
		}

	}

}
