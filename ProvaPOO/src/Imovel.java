// Guilherme Soares

import java.util.ArrayList;

public class Imovel {
	private char tipo;
	private char uso;
	private char finalidade;
	private float valor;
	private String proprietario;
	private String endereco;
	private ArrayList<Comodo> comodos = new ArrayList<Comodo>();
	
	public Imovel(char tipo, char uso, char fin, float valor, 
				  String prop, String ende) {
		setTipo(tipo);
		setUso(uso);
		setFinalidade(fin);
		setValor(valor);
		setProprietario(prop);
		setEndereco(ende);
	}
	
	public float getIndiceVentilacao() {
		float soma = 0;
		for(Comodo c: comodos) {
			soma += c.getIndiceVentilacao();
		}
		return soma / comodos.size();
	}
	
	public float getAreaTotal() {
		float areaTotal = 0;
		for(Comodo c: comodos) {
			areaTotal += c.getArea();
		}
		return areaTotal;
	}
	
	public int compareTo(Imovel outro) {
		if(this.getTipo() != outro.getTipo() || this.getUso() != outro.getUso()) { // caso os tipos e usos sejam diferentes
			return 5;
		} 
		else {
			if(this.getFinalidade() != outro.getFinalidade()) { // caso as finalidades sejam diferentes
				return -5;
			}
		}
		if (this.getValor() > outro.getValor()) { // caso o valor do primeiro for maior
			return 1;
		} 
		else {
			if (this.getValor() == outro.getValor()) { // caso os valores sejam iguais
				return 0;
			}
			else {
				if(this.getValor() < outro.getValor()) { // caso o valor do segundo seja maior
					return -1;
				}
			}
		}
		return -2; // na apresentacao chamaria um alerta de erro, aqui n deu pra retornar null
	}
	
	public float getIndiceRentabilidadeLocacao() {
		if (this.finalidade == 'V') { // caso a finalidade for vendas
			return -1;
		}
		return (this.getValor() / this.getAreaTotal()) / comodos.size();
	}
	
	public void addComodo(String descricao, float largura, float comprimento, int portas, int janelas) {
		Comodo c = new Comodo(descricao, largura, comprimento,portas,janelas);
		comodos.add(c);
	}
	
	// gets e sets padroes abaixo ***************************************************************************************************************
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		if(tipo == 'C' || tipo == 'A' || tipo == 'G' || tipo == 'T' || tipo == 'O') { // casa / apart. / galpao / telheiro / outros
			this.tipo = tipo;
		}
	}
	
	public char getUso() {
		return uso;
	}
	public void setUso(char uso) {
		if(uso == 'R' || uso == 'C' || uso == 'I' || uso == 'S' || uso == 'O') { // residencial / comercial / industrial / servico / outro
			this.uso = uso;
		}
	}
	
	public char getFinalidade() {
		return finalidade;
	}
	public void setFinalidade(char fin) {
		if(fin == 'V' || fin == 'L') { // venda / locacao
			this.finalidade = fin;
		}
	}
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		if(valor > 0) {
			this.valor = valor;
		}
	}
	
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	
	
	
	
}
