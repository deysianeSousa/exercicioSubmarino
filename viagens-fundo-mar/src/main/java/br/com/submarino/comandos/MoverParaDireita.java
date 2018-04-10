package br.com.submarino.comandos;

import br.com.submarino.Submarino;
import br.com.submarino.direcao.Leste;
import br.com.submarino.direcao.Norte;
import br.com.submarino.direcao.Oeste;
import br.com.submarino.direcao.Sul;
import br.com.submarino.servicos.Comando;

public class MoverParaDireita implements Comando {
	
	public void moverSubmarino(Submarino submarino) {
	
		switch (submarino.getDirecao()) {
		case "NORTE":
			new Norte().moverDirecaoDireita(submarino);
			break;
		case "SUL":
			new Sul().moverDirecaoDireita(submarino);
			break;
		case "LESTE":
			new Leste().moverDirecaoDireita(submarino);
			break;
		case "OESTE":
			new Oeste().moverDirecaoDireita(submarino);
			break;

		default:
			break;
		}
	}

}
