package br.com.submarino.comandos;

import br.com.submarino.Submarino;
import br.com.submarino.servicos.Comando;

public class Subir implements Comando{

	public void moverSubmarino(Submarino submarino) {
		int eixoZ = submarino.getEixoZ() + 1;   
		submarino.setEixoZ(eixoZ);
		
		
	}

}
