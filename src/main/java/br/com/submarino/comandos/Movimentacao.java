package br.com.submarino.comandos;

import br.com.submarino.Submarino;
import br.com.submarino.direcao.Leste;
import br.com.submarino.direcao.Norte;
import br.com.submarino.direcao.Oeste;
import br.com.submarino.direcao.Sul;
import br.com.submarino.servicos.Comando;

public class Movimentacao implements Comando {

	public void moverSubmarino(Submarino submarino) {
		
		switch (submarino.getDirecao()) {
		case "NORTE":
			new Norte().calcularDirecao(submarino);
			break;
		case "SUL":
			new Sul().calcularDirecao(submarino);
			break;
		case "LESTE":
			new Leste().calcularDirecao(submarino);
			break;
		case "OESTE":
			new Oeste().calcularDirecao(submarino);
			break;

		default:
			break;
		}
		
	}

}
