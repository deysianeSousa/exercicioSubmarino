package br.com.submarino.viagens_fundo_mar;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import br.com.submarino.custom.exception.SubmarinoSobreSuperficieDoMarException;
import br.com.submarino.viagens.fundo.mar.MovimentacaoSubmarino;

public class SubmarinoAppTest {
	private MovimentacaoSubmarino movimentacaoSubmarino;
	
	@Rule
	public ExpectedException e = ExpectedException.none();
	
	@Before
	public void setUp(){
		movimentacaoSubmarino = new MovimentacaoSubmarino();
	}
	
	@Test
	public void deveValidarPrimeiroComandoExercicio() throws SubmarinoSobreSuperficieDoMarException{
		String coordenada = movimentacaoSubmarino.getCoordenadaFinal("LMRDDMMUU");
		assertEquals("-1 2 0 NORTE", coordenada);
	}
	
	@Test
	public void deveValidarSegundoComandoExercicio() throws SubmarinoSobreSuperficieDoMarException{
		String coordenada = movimentacaoSubmarino.getCoordenadaFinal("RMMLMMMDDLL");
		assertEquals("2 3 -2 SUL", coordenada);
	}
	
	@Test
	public void deveMoverParaOeste() throws SubmarinoSobreSuperficieDoMarException{
		String coordenada = movimentacaoSubmarino.getCoordenadaFinal("L");
		assertEquals("0 0 0 OESTE", coordenada);
	}

	@Test
	public void deveMoverParaSul() throws SubmarinoSobreSuperficieDoMarException{
		String coordenada = movimentacaoSubmarino.getCoordenadaFinal("LL");
		assertEquals("0 0 0 SUL", coordenada);
	}
	

	@Test
	public void deveMoverParaLeste() throws SubmarinoSobreSuperficieDoMarException{
		String coordenada = movimentacaoSubmarino.getCoordenadaFinal("R");
		assertEquals("0 0 0 LESTE", coordenada);
	}
 
	@Test
	public void deveMovimentarDuasVezesEmDirecaoAoSul() throws SubmarinoSobreSuperficieDoMarException{
		String coordenada = movimentacaoSubmarino.getCoordenadaFinal("LLMM");
		assertEquals("0 -2 0 SUL", coordenada);
	}
	
	@Test
	public void deveMovimentarUmaVezEmDirecaoAoOeste() throws SubmarinoSobreSuperficieDoMarException{
		String coordenada = movimentacaoSubmarino.getCoordenadaFinal("LM");
		assertEquals("-1 0 0 OESTE", coordenada);
	}
	
	@Test
	public void deveSubirUmaVez() throws SubmarinoSobreSuperficieDoMarException{
		e.expect(SubmarinoSobreSuperficieDoMarException.class);
		movimentacaoSubmarino.getCoordenadaFinal("U");
	}
	
	@Test
	public void deveDescerUmaVez() throws SubmarinoSobreSuperficieDoMarException{
		String coordenada = movimentacaoSubmarino.getCoordenadaFinal("D");
		assertEquals("0 0 -1 NORTE", coordenada);
	}

}
