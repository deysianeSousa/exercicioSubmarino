package br.com.submarino.direcao;

import br.com.submarino.Submarino;
import br.com.submarino.servicos.Direcao;

public class Leste implements Direcao{

	public void calcularDirecao(Submarino submarino) {
		int eixoX = submarino.getEixoX() + 1;   
		submarino.setEixoX(eixoX);		
	}

	public void moverDirecaoEsquerda(Submarino submarino) {
		submarino.setDirecao("NORTE");
		
	}

	public void moverDirecaoDireita(Submarino submarino) {
		submarino.setDirecao("SUL");
		
	}


}
