package br.com.submarino.direcao;

import br.com.submarino.Submarino;
import br.com.submarino.servicos.Direcao;

public class Sul implements Direcao {

	public void calcularDirecao(Submarino submarino) {
		int eixoY = submarino.getEixoY() - 1;   
		submarino.setEixoY(eixoY);	
		
	}
	
	public void moverDirecaoEsquerda(Submarino submarino) {
		submarino.setDirecao("LESTE");
		
	}

	public void moverDirecaoDireita(Submarino submarino) {
		submarino.setDirecao("OESTE");
		
	}

}
