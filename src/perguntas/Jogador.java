package perguntas;

import java.util.ArrayList;

public class Jogador {

	// Atributos
	private String jogador;
	private int pontuacao;
	private String data;

	// ArrayList
	public static ArrayList<Jogador> dados = new ArrayList<>();

	// Métodos magicos

	public String getNome() {
		return jogador;

	}

	public void setNome(String jogador) {
		this.jogador = jogador;

	}

	public int getPontuacao() {
		return pontuacao;

	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;

	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public static ArrayList<Jogador> getDados() {
		return dados;
	}

	public static void setDados(ArrayList<Jogador> dados) {
		Jogador.dados = dados;
	}
	
	

}