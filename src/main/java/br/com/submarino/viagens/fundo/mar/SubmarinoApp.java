package br.com.submarino.viagens.fundo.mar;

import javax.swing.JOptionPane;

import br.com.submarino.custom.exception.SubmarinoSobreSuperficieDoMarException;


public class SubmarinoApp {
	
	public static void main( String[] args ) throws SubmarinoSobreSuperficieDoMarException {

		String comandoSubmarino = JOptionPane.showInputDialog("Digite o comando");
		
		MovimentacaoSubmarino movimentacaoSubmarino = new MovimentacaoSubmarino();
		
		JOptionPane.showMessageDialog(null, movimentacaoSubmarino.getCoordenadaFinal(comandoSubmarino));
	}

	
}
