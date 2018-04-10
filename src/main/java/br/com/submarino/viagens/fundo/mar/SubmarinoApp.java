package br.com.submarino.viagens.fundo.mar;

import javax.swing.JOptionPane;


public class SubmarinoApp {
	
	public static void main( String[] args ) {

		String comandoSubmarino = JOptionPane.showInputDialog("Digite o camando");
		
		MovimentacaoSubmarino movimentacaoSubmarino = new MovimentacaoSubmarino();
		
		JOptionPane.showMessageDialog(null, movimentacaoSubmarino.getCoordenadaFinal(comandoSubmarino));
	}

	
}
