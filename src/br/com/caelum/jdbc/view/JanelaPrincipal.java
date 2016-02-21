package br.com.caelum.jdbc.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JLayeredPane;

public class JanelaPrincipal {

	private JFrame frmCrudAgenda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal window = new JanelaPrincipal();
					window.frmCrudAgenda.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JanelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCrudAgenda = new JFrame();
		frmCrudAgenda.setTitle("CRUD Agenda");
		frmCrudAgenda.setBounds(100, 100, 450, 300);
		frmCrudAgenda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLayeredPane layeredPane = new JLayeredPane();
		frmCrudAgenda.getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		JButton bpesquisar = new JButton("Pesquisar");
		bpesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		bpesquisar.setBounds(163, 45, 89, 23);
		layeredPane.add(bpesquisar);
		
		JButton binserir = new JButton("Inserir");
		binserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaInserir window = new JanelaInserir();
			}
		});
		binserir.setBounds(163, 79, 89, 23);
		layeredPane.add(binserir);
		
		JButton balterar = new JButton("Alterar");
		balterar.setBounds(163, 113, 89, 23);
		layeredPane.add(balterar);
		
		JButton bexcluir = new JButton("Excluir");
		bexcluir.setBounds(163, 147, 89, 23);
		layeredPane.add(bexcluir);
		
		JButton bconsultar = new JButton("Consultar");
		bconsultar.setBounds(163, 181, 89, 23);
		layeredPane.add(bconsultar);
	}
}
