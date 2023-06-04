package modelo;

import java.util.ArrayList;

public class Estoque {
	public static ArrayList<Perecivel> listaPereciveis = new ArrayList<Perecivel>();
	public static ArrayList<NaoPerecivel> listaNaoPereciveis = new ArrayList<NaoPerecivel>();
	
	public static ArrayList<String> nomeProdutos = new ArrayList<String>();
	
	public static void separarArray(int tipo) {
		if (tipo == 0) {
			for(Perecivel perecivel : listaPereciveis) {
				 nomeProdutos.add(perecivel.getNome());
				  
			}
		}else if(tipo == 1) {
			for(NaoPerecivel naoPerecivel : listaNaoPereciveis) {
				 nomeProdutos.add(naoPerecivel.getNome());	  
			}
		}
	}
	
	public static String getNomeProduto() {
		Perecivel nomeSelecionado = null;
		for (Perecivel perecivel :listaPereciveis) {
			if(perecivel.getNome().equals(nomeSelecionado)) {
				nomeSelecionado = perecivel;
			}
		}
		
	}
	
}