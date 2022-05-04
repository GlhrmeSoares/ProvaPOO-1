// Guilherme Soares

public class Comodo {
	private String descricao;
	private float largura;
	private float comprimento;
	private int qtdPortas;
	private int qtdJanelas;
	
	public Comodo(String descricao, float largura, float comprimento, int portas, int janelas) { // construtor
		setDescricao(descricao);
		setLargura(largura);
		setComprimento(comprimento);
		setQtdPortas(portas);
		setQtdJanelas(janelas);
	}
	
	public float getIndiceVentilacao() {
		float indice = 1;
		
		if(qtdJanelas > 0) {
			indice = (float) ((this.getArea() / qtdJanelas) * 0.08);
		}
		
		return indice;
	}
	
	public float getArea() {
		return this.comprimento * this.largura;
	}
	
	// gets e sets padroes abaixo ***********************************************************************************************
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getLargura() {
		return largura;
	}
	
	public void setLargura(float largura) {
		if(largura > 0) {
			this.largura = largura;
		}
	}
	
	public double getComprimento() {
		return comprimento;
	}
	
	public void setComprimento(float comprimento) {
		if(comprimento > 0) {
			this.comprimento = comprimento;
		}
	}
	
	public int getQtdPortas() {
		return qtdPortas;
	}
	
	public void setQtdPortas(int qtdPortas) {
		if (qtdPortas > 1) {
			this.qtdPortas = qtdPortas;
		} else {
			this.qtdPortas = 1;
		}
	}
	
	public int getQtdJanelas() {
		return qtdJanelas;
	}
	
	public void setQtdJanelas(int qtdJanelas) {
		this.qtdJanelas = qtdJanelas;
	}
	
}
