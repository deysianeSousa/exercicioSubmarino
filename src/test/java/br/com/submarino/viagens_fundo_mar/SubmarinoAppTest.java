package br.com.submarino.viagens_fundo_mar;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.submarino.viagens.fundo.mar.MovimentacaoSubmarino;

public class SubmarinoAppTest {
	private MovimentacaoSubmarino movimentacaoSubmarino;
	
	
	@Before
	public void setUp(){
		movimentacaoSubmarino = new MovimentacaoSubmarino();
		
	}
	
	@Test
	public void deveValidarPrimeiroComandoExercicio(){
		String coordenada = movimentacaoSubmarino.getCoordenadaFinal("LMRDDMMUU");
		assertEquals("-1 2 0 NORTE", coordenada);
	}
	
	@Test
	public void deveValidarSegundoComandoExercicio(){
		String coordenada = movimentacaoSubmarino.getCoordenadaFinal("RMMLMMMDDLL");
		assertEquals("2 3 -2 SUL", coordenada);
	}
	
	@Test
	public void deveMoverParaOeste(){
		String coordenada = movimentacaoSubmarino.getCoordenadaFinal("L");
		assertEquals("0 0 0 OESTE", coordenada);
	}

	@Test
	public void deveMoverParaSul(){
		String coordenada = movimentacaoSubmarino.getCoordenadaFinal("LL");
		assertEquals("0 0 0 SUL", coordenada);
	}
	

	@Test
	public void deveMoverParaLeste(){
		String coordenada = movimentacaoSubmarino.getCoordenadaFinal("R");
		assertEquals("0 0 0 LESTE", coordenada);
	}
 
	@Test
	public void deveMovimentarDuasVezesEmDirecaoAoSul(){
		String coordenada = movimentacaoSubmarino.getCoordenadaFinal("LLMM");
		assertEquals("0 -2 0 SUL", coordenada);
	}
	
	@Test
	public void deveMovimentarUmaVezEmDirecaoAoOeste(){
		String coordenada = movimentacaoSubmarino.getCoordenadaFinal("LM");
		assertEquals("-1 0 0 OESTE", coordenada);
	}
	
	@Test
	public void deveSubirUmaVez(){
		String coordenada = movimentacaoSubmarino.getCoordenadaFinal("U");
		assertEquals("0 0 1 NORTE", coordenada);
	}
	
	@Test
	public void deveDescerUmaVez(){
		String coordenada = movimentacaoSubmarino.getCoordenadaFinal("D");
		assertEquals("0 0 -1 NORTE", coordenada);
	}

}
