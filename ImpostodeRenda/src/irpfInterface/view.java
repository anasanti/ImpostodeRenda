package irpfInterface;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import irpfnogocio.Completa;
import irpfnogocio.Pessoa;
import irpfnogocio.Simplificada;

public class view {

	private JFrame frame;
	private JTextField textNome;
	private JTextField textIdade;
	private JTextField textCPF;
	private JTextField textDependentes;
	private JTextField textContribuicao;
	private JTextField textRendimentoTotal;
	private JTextField textSimplificada;
	private JTextField textCompleta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view window = new view();
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
	public view() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Pessoa pe = new Pessoa();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 648, 315);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 23, 46, 14);
		frame.getContentPane().add(lblNome);
		
		textNome = new JTextField();
		textNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNome.setText(null);
			}
		});
		textNome.setBounds(66, 20, 245, 20);
		frame.getContentPane().add(textNome);
		textNome.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(10, 54, 46, 14);
		frame.getContentPane().add(lblIdade);
		
		textIdade = new JTextField();
		textIdade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblIdade.setText(null);
			}
		});
		textIdade.setBounds(66, 51, 245, 20);
		frame.getContentPane().add(textIdade);
		textIdade.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 85, 46, 14);
		frame.getContentPane().add(lblCpf);
		
		textCPF = new JTextField();
		textCPF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCpf.setText(null);
			}
		});
		textCPF.setBounds(66, 82, 245, 20);
		frame.getContentPane().add(textCPF);
		textCPF.setColumns(10);
		
		JLabel lblDependentes = new JLabel("Dependentes:");
		lblDependentes.setBounds(9, 116, 68, 14);
		frame.getContentPane().add(lblDependentes);
		
		textDependentes = new JTextField();
		textDependentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDependentes.setText(null);
			}
		});
		textDependentes.setBounds(87, 113, 224, 20);
		frame.getContentPane().add(textDependentes);
		textDependentes.setColumns(10);
		
		JLabel lblContribuicao = new JLabel("Contribuicao\u00E7\u00E3o:");
		lblContribuicao.setBounds(10, 147, 88, 14);
		frame.getContentPane().add(lblContribuicao);
		
		textContribuicao = new JTextField();
		textContribuicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblContribuicao.setText(null);
			}
		});
		textContribuicao.setBounds(108, 144, 203, 20);
		frame.getContentPane().add(textContribuicao);
		textContribuicao.setColumns(10);
		
		JLabel lblRendimentoTotal = new JLabel("Rendimento Total:");
		lblRendimentoTotal.setBounds(10, 178, 97, 14);
		frame.getContentPane().add(lblRendimentoTotal);
		
		textRendimentoTotal = new JTextField();
		textRendimentoTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblRendimentoTotal.setText(null);
			}
		});
		textRendimentoTotal.setBounds(108, 175, 203, 20);
		frame.getContentPane().add(textRendimentoTotal);
		textRendimentoTotal.setColumns(10);
		
		JButton btnSimplificada = new JButton("Simplificada");
		btnSimplificada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pe.setNome(textNome.getText());
				pe.setIdade(Integer.parseInt(textIdade.getText()));
				pe.setCpf(textCPF.getText());
				pe.setDependente(Integer.parseInt(textDependentes.getText()));
				pe.setContribuicao(Double.parseDouble(textContribuicao.getText()));
				pe.setTotalRendimentos(Double.parseDouble(textRendimentoTotal.getText()));
				
				textSimplificada.setText(String.valueOf(Simplificada.calcular(pe)));
				
			}
		});
		btnSimplificada.setBounds(18, 226, 116, 23);
		frame.getContentPane().add(btnSimplificada);
		
		JButton btnCompleta = new JButton("Completa");
		btnCompleta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pe.setNome(textNome.getText());
				pe.setIdade(Integer.parseInt(textIdade.getText()));
				pe.setCpf(textCPF.getText());
				pe.setDependente(Integer.parseInt(textDependentes.getText()));
				pe.setContribuicao(Double.parseDouble(textContribuicao.getText()));
				pe.setTotalRendimentos(Double.parseDouble(textRendimentoTotal.getText()));
				
				textCompleta.setText(String.valueOf(Completa.calcular(pe)));
			}
		});
		btnCompleta.setBounds(195, 226, 116, 23);
		frame.getContentPane().add(btnCompleta);
		
		JLabel lblSimplificada = new JLabel("Simplificada");
		lblSimplificada.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblSimplificada.setBounds(375, 23, 203, 45);
		frame.getContentPane().add(lblSimplificada);
		
		textSimplificada = new JTextField();
		textSimplificada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSimplificada.setText(null);
			}
		});
		textSimplificada.setEditable(false);
		textSimplificada.setBounds(375, 82, 203, 20);
		frame.getContentPane().add(textSimplificada);
		textSimplificada.setColumns(10);
		
		JLabel lblCompleta = new JLabel("Completa");
		lblCompleta.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblCompleta.setBounds(375, 116, 203, 45);
		frame.getContentPane().add(lblCompleta);
		
		textCompleta = new JTextField();
		textCompleta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCompleta.setText(null);
			}
		});
		textCompleta.setEditable(false);
		textCompleta.setBounds(375, 175, 203, 20);
		frame.getContentPane().add(textCompleta);
		textCompleta.setColumns(10);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textCompleta.setText("");
				textSimplificada.setText("");
			}
		});
		btnLimpar.setBounds(375, 226, 89, 23);
		frame.getContentPane().add(btnLimpar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(489, 226, 89, 23);
		frame.getContentPane().add(btnSair);
	}
}
