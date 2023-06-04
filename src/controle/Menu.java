package controle;
//import java.util.ArrayList;
import javax.swing.JOptionPane;

import visualizacao.Solicitacoes;
import modelo.*;

public class Menu {

	
	
	public void exibeMenu() {
		int opcao;
		do {
			//pergunta ao usuario o que ele quer fazer
			opcao = Solicitacoes.solicitaOpcao();
			switch (opcao) {
				
			
				//"Cadastrar Produto" 
				case 0:
				int tipo = Solicitacoes.solicitaTipo();
				
				if(tipo == 0 ) {
					Perecivel produto = new Perecivel();
					produto.setNome(Solicitacoes.solicitaNome());
					produto.setMarca(Solicitacoes.solicitaMarca());
					produto.setLocalizacao(Solicitacoes.solicitaLocalizacao());
					produto.setQuantidade(Solicitacoes.solicitaQuantidade());
					produto.setDescricao(Solicitacoes.solicitaDescricao());
					produto.setValidade(Solicitacoes.solicitaValidade());
					
					Estoque.listaPereciveis.add(produto); 
				}else if(tipo == 1) {
					NaoPerecivel produto = new NaoPerecivel();
					produto.setNome(Solicitacoes.solicitaNome());
					produto.setMarca(Solicitacoes.solicitaMarca());
					produto.setLocalizacao(Solicitacoes.solicitaLocalizacao());
					produto.setQuantidade(Solicitacoes.solicitaQuantidade());
					produto.setDescricao(Solicitacoes.solicitaDescricao());
					produto.setLote(Solicitacoes.solicitaLote());
					
					Estoque.listaNaoPereciveis.add(produto); 
				}else JOptionPane.showMessageDialog(null, "Seleciona uma opção certa poura");
				
				
				
				break;
				
				//"Registrar Movimentacao", 
				case 1:
					//pergunta se é entrada ou saída
					int movimentacao = Solicitacoes.solicitaMovimentacao();
					
					//entrada
					if(movimentacao == 0) {
						tipo = Solicitacoes.solicitaTipo();
						Estoque.separarArray(tipo);

						//pega informações
						int produto = Solicitacoes.selecionaNomeProduto();
						int quantidade = Solicitacoes.solicitaQuantidade();
	
						
						
						//faz a movimentacao
						//a quantidade + a getquantidade
					} else if (movimentacao == 1) {
						
						//saida
						
						tipo = Solicitacoes.solicitaTipo();
						
						//solicita nome
						
						
						//solicita a quantidade
						//int quantidade = Solicitacoes.solicitaQuantidade();
						
						//faz a movimentacao
						//a quantidade - a getquantidade
					}
				break;
				
				//"Editar Localizacao", 
				//"Visualizar Produto", 
				//"Alterar Produto", 
				//"Visualizar Estoque"
			}
			
				
		}while(opcao !=7);
	}
	
}
