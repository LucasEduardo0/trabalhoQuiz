package perguntas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class FormularioConhecimentosGerais extends JFrame {

	private JPanel contentPane;
	private int indice = 0;
	int acertos;
	int erros;
	int pular;
	int pergunta;

	public FormularioConhecimentosGerais() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
		
		//Carregar todas as 20 questões
		ConhecimentosGerais cg = new ConhecimentosGerais();
		cg.cadastrarPerguntas();
				
		//Obter três índices aleatórios
		Padrao.gerarValoresAleatorios();
		
		//Exibir as perguntas do índice aleatório
		int indiceExibirQuestao = Padrao.indicesAleatorios[indice];
		System.out.println(Padrao.conjuntoPerguntas.get(indiceExibirQuestao).getQuestaoA());
				
		JLabel label = new JLabel(Padrao.conjuntoPerguntas.get(indiceExibirQuestao).getPergunta());
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(10, 11, 588, 42);
				
		JRadioButton rdbtnPergunta = new JRadioButton(Padrao.conjuntoPerguntas.get(indiceExibirQuestao).getQuestaoA());
		rdbtnPergunta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnPergunta.setActionCommand("a");
		rdbtnPergunta.setBounds(10, 82, 402, 23);
				
		JRadioButton rdbtnPergunta_1 = new JRadioButton(Padrao.conjuntoPerguntas.get(indiceExibirQuestao).getQuestaoB());
		rdbtnPergunta_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnPergunta_1.setActionCommand("b");
		rdbtnPergunta_1.setBounds(10, 119, 359, 23);
				
		JRadioButton rdbtnPergunta_2 = new JRadioButton(Padrao.conjuntoPerguntas.get(indiceExibirQuestao).getQuestaoC());
		rdbtnPergunta_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnPergunta_2.setActionCommand("c");
		rdbtnPergunta_2.setBounds(10, 163, 363, 23);
				
		JRadioButton rdbtnPergunta_3 = new JRadioButton(Padrao.conjuntoPerguntas.get(indiceExibirQuestao).getQuestaoD());
		rdbtnPergunta_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnPergunta_3.setActionCommand("d");
		rdbtnPergunta_3.setBounds(10, 203, 359, 23);
		
		ButtonGroup questoes = new ButtonGroup();
		questoes.add(rdbtnPergunta);
		questoes.add(rdbtnPergunta_1);
		questoes.add(rdbtnPergunta_2);
		questoes.add(rdbtnPergunta_3);
		
		JLabel label_1 = new JLabel();
		label_1.setBounds(200, 142, 46, 14);
		contentPane.add(label_1);
		
		System.out.println(Padrao.conjuntoPerguntas.get(indiceExibirQuestao).getResposta());

				
		JButton btnResponder = new JButton("Responder");
		btnResponder.setBounds(288, 265, 253, 42);
		btnResponder.addActionListener(new ActionListener() {
			
					
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
					try{
						if(Padrao.conjuntoPerguntas.get(Padrao.indicesAleatorios[indice]).getResposta() == questoes.getSelection().getActionCommand().charAt(0)) {
						
							JOptionPane.showMessageDialog(null, "Resposta Certa");
							acertos++;
						
						}else {
					
							JOptionPane.showMessageDialog(null, "Resposta Errada");
							erros++;
						
						}
					
					}catch(Exception erro){
						JOptionPane.showMessageDialog(null, "Selecione um turno");
					}
					
					if(pergunta != 10) {
					

						indice++;
						int indiceExibirQuestao = Padrao.indicesAleatorios[indice];
					
						System.out.println(Padrao.conjuntoPerguntas.get(indiceExibirQuestao).getPergunta());
					
						label.setText(Padrao.conjuntoPerguntas.get(indiceExibirQuestao).getPergunta());
						rdbtnPergunta.setText(Padrao.conjuntoPerguntas.get(indiceExibirQuestao).getQuestaoA());
						rdbtnPergunta_1.setText(Padrao.conjuntoPerguntas.get(indiceExibirQuestao).getQuestaoB());
						rdbtnPergunta_2.setText(Padrao.conjuntoPerguntas.get(indiceExibirQuestao).getQuestaoC());
						rdbtnPergunta_3.setText(Padrao.conjuntoPerguntas.get(indiceExibirQuestao).getQuestaoD());
						Padrao.conjuntoPerguntas.get(indiceExibirQuestao).getResposta();
						
						pergunta++;
						
					}else if (pergunta == 10) {
					
					JOptionPane.showMessageDialog(null, "Opa");
					
				}
				
			}
				
			
			
			
			});
			contentPane.add(btnResponder);
				
			contentPane.add(label);
			contentPane.add(rdbtnPergunta);
			contentPane.add(rdbtnPergunta_1);
			contentPane.add(rdbtnPergunta_2);
			contentPane.add(rdbtnPergunta_3);
			
			JButton btnPular = new JButton("Pular");
			btnPular.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					if(pular != 3) {
					
					indice++;
					int indiceExibirQuestao = Padrao.indicesAleatorios[indice];
					
					System.out.println(Padrao.conjuntoPerguntas.get(indiceExibirQuestao).getPergunta());
					
					label.setText(Padrao.conjuntoPerguntas.get(indiceExibirQuestao).getPergunta());
					rdbtnPergunta.setText(Padrao.conjuntoPerguntas.get(indiceExibirQuestao).getQuestaoA());
					rdbtnPergunta_1.setText(Padrao.conjuntoPerguntas.get(indiceExibirQuestao).getQuestaoB());
					rdbtnPergunta_2.setText(Padrao.conjuntoPerguntas.get(indiceExibirQuestao).getQuestaoC());
					rdbtnPergunta_3.setText(Padrao.conjuntoPerguntas.get(indiceExibirQuestao).getQuestaoD());
					
					pular++;
					pergunta--;
					
					}else if (pular == 3) {
						
						JOptionPane.showMessageDialog(null, "Sem mais pular");
						
					}
					
				}
			});
			btnPular.setBounds(25, 265, 253, 42);
			contentPane.add(btnPular);
			
	}
}


