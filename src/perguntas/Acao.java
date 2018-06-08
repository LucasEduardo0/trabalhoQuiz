package perguntas;
import java.sql.Date;

import javax.swing.table.DefaultTableModel;

public class Acao {
	
	// Métodos para cadastro
	public static void Cadastrar(String nome, int pontuacao) {

		
		
		// Criar objeto
		Jogador pc = new Jogador();
		pc.setNome(nome);
		pc.setPontuacao(pontuacao);
		

		// Add ao ArrayList
		Jogador.dados.add(pc);

	}

	// Método para retornar os dados do cliente cadastrado
	public DefaultTableModel listarClienteCadastrado() {

		// DefaultTableModel
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Nome");
		modelo.addColumn("Pontuação");
		modelo.addColumn("Data");

		for (int indice = 0; indice < Jogador.dados.size(); indice++) {

			modelo.addRow(new Object[] { Jogador.dados.get(indice).getNome(),
					Jogador.dados.get(indice).getPontuacao(), 
					Jogador.dados.get(indice).getData()
					});

		}

		// Retorno
		return modelo;

	}


}