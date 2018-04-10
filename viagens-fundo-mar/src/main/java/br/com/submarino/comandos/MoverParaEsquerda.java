package br.com.submarino.comandos;

import br.com.submarino.Submarino;
import br.com.submarino.direcao.Leste;
import br.com.submarino.direcao.Norte;
import br.com.submarino.direcao.Oeste;
import br.com.submarino.direcao.Sul;
import br.com.submarino.servicos.Comando;

public class MoverParaEsquerda implements Comando{
	
	public void moverSubmarino(Submarino submarino) {
		
		switch (submarino.getDirecao()) {
		
		case "NORTE":
			new Norte().moverDirecaoEsquerda(submarino);
			break;
		case "SUL":
			new Sul().moverDirecaoEsquerda(submarino);
			break;
		case "LESTE":
			new Leste().moverDirecaoEsquerda(submarino);
			break;
		case "OESTE":
			new Oeste().moverDirecaoEsquerda(submarino);
			break;

		default:
			break;
		}
	}

}
