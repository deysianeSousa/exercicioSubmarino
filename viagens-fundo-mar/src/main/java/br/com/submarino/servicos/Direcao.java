package br.com.submarino.servicos;

import br.com.submarino.Submarino;

public interface Direcao {
	
	public void calcularDirecao(Submarino submarino);
	public void moverDirecaoEsquerda(Submarino submarino);
	public void moverDirecaoDireita(Submarino submarino);

}
