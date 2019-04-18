import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastro {
	

	private JFrame frame;
	private JTextField textDiretor;
	private JTextField textDataNasc;
	private JTextField textFilme;
	private JTextField textAnoFilme;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro window = new TelaCadastro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Dados dados = new Dados();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setBounds(0, 0, 432, 16);
		lblCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblCadastro);
		
		JLabel lblDiretor = new JLabel("Diretor");
		lblDiretor.setBounds(10, 52, 39, 26);
		frame.getContentPane().add(lblDiretor);
		
		JLabel lblFilme = new JLabel("Filme");
		lblFilme.setBounds(10, 120, 56, 16);
		frame.getContentPane().add(lblFilme);
		
		JLabel lblDataNasc = new JLabel("Data de Nascimento");
		lblDataNasc.setBounds(12, 91, 119, 16);
		frame.getContentPane().add(lblDataNasc);
		
		JLabel lblAnoLancamento = new JLabel("Ano de Lan\u00E7amento");
		lblAnoLancamento.setBounds(10, 149, 121, 16);
		frame.getContentPane().add(lblAnoLancamento);
		
		textDiretor = new JTextField();
		textDiretor.setBounds(155, 56, 116, 22);
		frame.getContentPane().add(textDiretor);
		textDiretor.setColumns(10);
		
		textDataNasc = new JTextField();
		textDataNasc.setBounds(155, 88, 116, 22);
		frame.getContentPane().add(textDataNasc);
		textDataNasc.setColumns(10);
		
		textFilme = new JTextField();
		textFilme.setBounds(155, 117, 116, 22);
		frame.getContentPane().add(textFilme);
		textFilme.setColumns(10);
		
		textAnoFilme = new JTextField();
		textAnoFilme.setBounds(155, 152, 116, 22);
		frame.getContentPane().add(textAnoFilme);
		textAnoFilme.setColumns(10);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome = textDiretor.getText();
				String datanasc = textDataNasc.getText();
				String nomeFilme = textFilme.getText();
				String anoLancamento = textAnoFilme.getText();
				
				Diretor d = new Diretor(nome, datanasc);
				Filme f = new Filme(nomeFilme, anoLancamento);
				
				dados.CadastroDiretor(d);
				dados.CadastroFilme(f);
				
				System.out.println(d);
				//System.out.println(f);
			}
		});
		btnAdicionar.setBounds(323, 215, 97, 25);
		frame.getContentPane().add(btnAdicionar);
	}
}
