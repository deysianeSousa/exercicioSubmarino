package br.com.submarino;

public class Submarino {
	
	private int eixoX;
	private int eixoY;
	private int eixoZ;
	private String direcao;

	public Submarino(){
		this.eixoX = 0;
		this.eixoY = 0;
		this.eixoZ = 0;
		this.direcao = "NORTE";
	}
	
	public int getEixoX() {
		return eixoX;
	}
	public void setEixoX(int eixoX) {
		this.eixoX = eixoX;
	}
	public int getEixoY() {
		return eixoY;
	}
	public void setEixoY(int eixoY) {
		this.eixoY = eixoY;
	}
	public int getEixoZ() {
		return eixoZ;
	}
	public void setEixoZ(int eixoZ) {
		this.eixoZ = eixoZ;
	}

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

}
