package perguntas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class FormularioInicio extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public FormularioInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JComboBox<String> combo = new JComboBox();
		combo.setBounds(215, 80, 161, 20);
		combo.addItem("Selecione uma categoria");
		combo.addItem("Super Herois");
		combo.addItem("Esportes");
		combo.addItem("Conhecimentos Gerais");
		contentPane.add(combo);
		
		JLabel lblQuiz = new JLabel("Quiz");
		lblQuiz.setFont(new Font("Viner Hand ITC", Font.PLAIN, 30));
		lblQuiz.setBounds(34, 0, 86, 44);
		contentPane.add(lblQuiz);
		
		textField = new JTextField("");
		textField.setBounds(85, 80, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSelecionarOFormulario = new JLabel("Selecionar o Formulario");
		lblSelecionarOFormulario.setFont(new Font("Viner Hand ITC", Font.PLAIN, 15));
		lblSelecionarOFormulario.setBounds(215, 54, 161, 14);
		contentPane.add(lblSelecionarOFormulario);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Viner Hand ITC", Font.PLAIN, 15));
		lblNome.setBounds(10, 84, 46, 14);
		contentPane.add(lblNome);
		
		JButton btnNewButton = new JButton("Vamos Jogar");
		btnNewButton.setFont(new Font("Viner Hand ITC", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(!textField.getText().equals("")) {
				
				if(combo.getSelectedIndex() == 1) {
					
					String nome = textField.getText();
					
					int pontuacao = 0;
					
					LocalDateTime tempo = LocalDateTime.now();
					LocalDate datas = tempo.toLocalDate();
					
					String data = ""+datas;
					
					Acao as = new Acao();
					
					as.Cadastrar(nome, pontuacao);
					
					FormularioSuperHerois fsh = new FormularioSuperHerois();
					dispose();
					
				}else if(combo.getSelectedIndex() == 3) {
					
String nome = textField.getText();
					
					int pontuacao = 0;
					
					LocalDateTime tempo = LocalDateTime.now();
					LocalDate datas = tempo.toLocalDate();
					
					String data = ""+datas;
					
					Acao as = new Acao();
					
					as.Cadastrar(nome, pontuacao);
					
					
					FormularioConhecimentosGerais fsh = new FormularioConhecimentosGerais();
					dispose();
					
				}else if(combo.getSelectedIndex() == 2) {
					
String nome = textField.getText();
					
					int pontuacao = 0;
					
					LocalDateTime tempo = LocalDateTime.now();
					LocalDate datas = tempo.toLocalDate();
					
					String data = ""+datas;
					
					Acao as = new Acao();
					
					as.Cadastrar(nome, pontuacao);
					
					
					FormularioGeografia fsh = new FormularioGeografia();
					dispose();
					
				}
				
				}else {
					JOptionPane.showMessageDialog(null, "Nome não informado");
				}
				
			}
		});
		btnNewButton.setBounds(195, 173, 161, 44);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(FormularioInicio.class.getResource("/imagens/ludome-quiz-1.png")));
		label.setBounds(10, 115, 161, 135);
		contentPane.add(label);
		
		
		
		
	}
}