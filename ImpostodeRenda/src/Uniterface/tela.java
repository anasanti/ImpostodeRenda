package Uniterface;

import Business.*;
import Persistence.*;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tela {

	private JFrame frame;
	private JTextField textNome;
	private JTextField textCPF;
	private JTextField textDep;
	private JTextField textIdade;
	private JTextField textCont;
	private JTextField textRend;
	private JTextField textSimpl;
	private JTextField textCompl;
	/**
	 * @wbp.nonvisual location=611,149
	 */
	private final JTextField textField = new JTextField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
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
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		textField.setColumns(10);
		
		Pessoa pe;
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCancelar.setBounds(335, 228, 89, 23);
		frame.getContentPane().add(btnCancelar);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnConfirmar.setBounds(236, 228, 89, 23);
		frame.getContentPane().add(btnConfirmar);
		
		JButton btnSimplificada = new JButton("Simplificada");
		btnSimplificada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblSimplificada.setText(Integer.toString(Simplificada.calcular(pe)));
			}
		});
		btnSimplificada.setBounds(10, 228, 89, 23);
		frame.getContentPane().add(btnSimplificada);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 23, 46, 14);
		frame.getContentPane().add(lblNome);
		
		textNome = new JTextField();
		textNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNome.setText(null);
			}
		});
		textNome.setBounds(51, 20, 147, 20);
		frame.getContentPane().add(textNome);
		textNome.setColumns(10);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setBounds(10, 51, 46, 14);
		frame.getContentPane().add(lblCPF);
		
		textCPF = new JTextField();
		textCPF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCPF.setText(null);
			}
		});
		textCPF.setBounds(51, 48, 147, 20);
		frame.getContentPane().add(textCPF);
		textCPF.setColumns(10);
		
		JLabel lblDependentes = new JLabel("Dependentes:");
		lblDependentes.setBounds(10, 110, 89, 14);
		frame.getContentPane().add(lblDependentes);
		
		textDep = new JTextField();
		textDep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDependentes.setText(null);
			}
		});
		textDep.setBounds(89, 107, 109, 20);
		frame.getContentPane().add(textDep);
		textDep.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(10, 79, 46, 14);
		frame.getContentPane().add(lblIdade);
		
		textIdade = new JTextField();
		textIdade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblIdade.setText(null);
			}
		});
		textIdade.setBounds(51, 76, 147, 20);
		frame.getContentPane().add(textIdade);
		textIdade.setColumns(10);
		
		JLabel lblContribuicao = new JLabel("Contribui\u00E7\u00E3o:");
		lblContribuicao.setBounds(10, 138, 74, 14);
		frame.getContentPane().add(lblContribuicao);
		
		textCont = new JTextField();
		textCont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblContribuicao.setText(null);
			}
		});
		textCont.setBounds(89, 135, 109, 20);
		frame.getContentPane().add(textCont);
		textCont.setColumns(10);
		
		JLabel lblRendimentoTotal = new JLabel("Rendimento Total:");
		lblRendimentoTotal.setBounds(10, 169, 89, 14);
		frame.getContentPane().add(lblRendimentoTotal);
		
		textRend = new JTextField();
		textRend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblRendimentoTotal.setText(null);
			}
		});
		textRend.setBounds(109, 166, 89, 20);
		frame.getContentPane().add(textRend);
		textRend.setColumns(10);
		
		JLabel lblSimplificada = new JLabel("Simplificada");
		lblSimplificada.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblSimplificada.setBounds(259, 21, 153, 14);
		frame.getContentPane().add(lblSimplificada);
		
		JLabel lblCompleta = new JLabel("Completa");
		lblCompleta.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblCompleta.setBounds(259, 108, 153, 14);
		frame.getContentPane().add(lblCompleta);
		
		textSimpl = new JTextField();
		textSimpl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		textSimpl.setBounds(236, 48, 188, 20);
		frame.getContentPane().add(textSimpl);
		textSimpl.setColumns(10);
		
		textCompl = new JTextField();
		textCompl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		textCompl.setBounds(236, 135, 188, 20);
		frame.getContentPane().add(textCompl);
		textCompl.setColumns(10);
		
		JButton btnCompleta = new JButton("Completa");
		btnCompleta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCompleta.setText(Integer.toString(Completa.calcular(pe)));
			}
		});
		btnCompleta.setBounds(109, 228, 89, 23);
		frame.getContentPane().add(btnCompleta);
	}
}
