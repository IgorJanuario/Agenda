package br.com.caelum.jdbc.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

import br.com.caelum.jdbc.control.Controller;
import br.com.caelum.jdbc.model.Contato;

import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.JSplitPane;
import javax.swing.JEditorPane;
import javax.swing.BoxLayout;
import java.awt.Font;
import java.awt.FlowLayout;

public class JanelaInserir {

	private JFrame frmInserirContato;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaInserir window = new JanelaInserir();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JanelaInserir() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInserirContato = new JFrame();
		frmInserirContato.setTitle("Inserir contato");
		frmInserirContato.setBounds(100, 100, 450, 300);
		frmInserirContato.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInserirContato.getContentPane().setLayout(null);
		frmInserirContato.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBounds(22, 63, 383, 30);
		frmInserirContato.getContentPane().add(panel);
		
		JLabel lblNome = new JLabel("Nome:");
		panel.add(lblNome);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		panel.add(lblTelefone);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(22, 104, 383, 30);
		frmInserirContato.getContentPane().add(panel_1);
		
		JLabel lblEmail = new JLabel("E-mail:");
		panel_1.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_1.add(textField_2);
		
		JLabel lblEndereo = new JLabel("Endereço:");
		panel_1.add(lblEndereo);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_1.add(textField_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(22, 145, 383, 30);
		frmInserirContato.getContentPane().add(panel_2);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		panel_2.add(lblDataDeNascimento);
		
		textField_4 = new JTextField();
		textField_4.setColumns(14);
		panel_2.add(textField_4);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller control = new Controller();
				try {
					control.Inserir(textField.getText(), textField_1.getText(), textField_2.getText(), textField_3.getText(), textField_4.getText());
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnCadastrar.setBounds(335, 211, 89, 23);
		frmInserirContato.getContentPane().add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(241, 211, 89, 23);
		
		frmInserirContato.getContentPane().add(btnVoltar);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(22, 22, 383, 30);
		frmInserirContato.getContentPane().add(panel_3);
		
		JLabel lblCadastraContato = new JLabel("Cadastra contato");
		lblCadastraContato.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_3.add(lblCadastraContato);
	}
	private static String format(String pattern, Object value) {
        MaskFormatter mask;
        try {
            mask = new MaskFormatter(pattern);
            mask.setValueContainsLiteralCharacters(false);
            return mask.valueToString(value);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
