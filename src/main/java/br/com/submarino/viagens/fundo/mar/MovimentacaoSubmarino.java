package br.com.submarino.viagens.fundo.mar;

import java.util.HashMap;
import java.util.Map;

import br.com.submarino.Submarino;
import br.com.submarino.comandos.Descer;
import br.com.submarino.comandos.MoverParaDireita;
import br.com.submarino.comandos.MoverParaEsquerda;
import br.com.submarino.comandos.Movimentacao;
import br.com.submarino.comandos.Subir;
import br.com.submarino.custom.exception.SubmarinoSobreSuperficieDoMarException;
import br.com.submarino.servicos.Comando;

public class MovimentacaoSubmarino {

	public String getCoordenadaFinal(String comandoParaMovintarsubmarino) throws SubmarinoSobreSuperficieDoMarException {
		
		Map<String, Comando> comandos = getComandos();

		Submarino submarino = executaComandoParaEncontrarCoordenada(comandoParaMovintarsubmarino, comandos);
		
		if (submarino.getEixoZ() > 0) {
			throw new SubmarinoSobreSuperficieDoMarException("Submarino não pode subir para a superfície!");
		}

		return submarino.getEixoX() + " " + submarino.getEixoY() + " " + submarino.getEixoZ() + " " +submarino.getDirecao();
	}

	private Submarino executaComandoParaEncontrarCoordenada(String comandoParaMovintarsubmarino, Map<String, Comando> comandos) throws SubmarinoSobreSuperficieDoMarException {
		Submarino submarino = new Submarino();

		String[] coordenadas = comandoParaMovintarsubmarino.split("");

		for (String coordenada : coordenadas) {
			comandos.get(coordenada).moverSubmarino(submarino);
		}
		
		return submarino;
	}

	private Map<String, Comando> getComandos() {

		Map<String, Comando> comandos = new HashMap<String, Comando>();
		comandos.put("M", new Movimentacao());
		comandos.put("L", new MoverParaEsquerda());
		comandos.put("R", new MoverParaDireita());
		comandos.put("U", new Subir());
		comandos.put("D", new Descer());

		return comandos;
	}
}
