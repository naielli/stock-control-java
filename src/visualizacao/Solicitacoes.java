package visualizacao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import modelo.Estoque;
import modelo.NaoPerecivel;

public class Solicitacoes {
	public static int solicitaOpcao() {
		String[] opcoes= {"Cadastrar Produto", "Registrar Movimentacao", "Editar Localizacao", "Visualizar Produto", "Alterar Produto", "Visualizar Estoque"};
		JComboBox menu = new JComboBox(opcoes);
		JOptionPane.showConfirmDialog(null,menu, "Selecione a opção desejada.", JOptionPane.OK_CANCEL_OPTION);
		
		//aqui ele retorna a opção que o usuário escolheu em forma de index
		return menu.getSelectedIndex();
	}
	
	public static String solicitaNome() {
		return JOptionPane.showInputDialog("Informe o nome do produto");
	}
	
	public static String solicitaMarca() {
		return JOptionPane.showInputDialog("Informe a marca do produto");
	}
	
	public static String solicitaDescricao() {
		return JOptionPane.showInputDialog("Informe a descrição do produto");
	}
	
	public static String solicitaLocalizacao() {
		return JOptionPane.showInputDialog("Informe a localização do produto");
	}
	
	public static int solicitaQuantidade() {
		return Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto"));
	}
	
	public static int solicitaTipo() {
		String[] tipos= {"Perecível", "Não Perecível"};
		JComboBox menuTipos = new JComboBox(tipos);
		JOptionPane.showConfirmDialog(null,menuTipos, "Selecione o tipo do produto.", JOptionPane.OK_CANCEL_OPTION);
		
		//aqui ele retorna a opção que o usuário escolheu em forma de index
		return menuTipos.getSelectedIndex();
	}
	
	public static String solicitaValidade() {
		return JOptionPane.showInputDialog("Informe a validade do produto");
	}
	
	public static String solicitaLote() {
		return JOptionPane.showInputDialog("Informe o lote do produto");
	}
	
	public static int solicitaMovimentacao() {
		String[] tipos= {"Entrada", "Saída"};
		JComboBox menuTipos = new JComboBox(tipos);
		JOptionPane.showConfirmDialog(null,menuTipos, "Qual a movimentação?", JOptionPane.OK_CANCEL_OPTION);
		
		//aqui ele retorna a opção que o usuário escolheu em forma de index
		return menuTipos.getSelectedIndex();
	}
	
	public static int selecionaNomeProduto() {
		String[] tipos= Estoque.nomeProdutos.toArray(new String[Estoque.nomeProdutos.size()]);
		JComboBox menuTipos = new JComboBox(tipos);
		JOptionPane.showConfirmDialog(null,menuTipos, "Qual o produto?", JOptionPane.OK_CANCEL_OPTION);
		
		//aqui ele retorna a opção que o usuário escolheu em forma de index
		return menuTipos.getSelectedIndex();
	}
}
