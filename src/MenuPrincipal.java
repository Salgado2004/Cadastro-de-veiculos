import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Ve\u00EDculos!");
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setFont(new Font("Ink Free", Font.BOLD, 22));
		lblNewLabel.setBackground(SystemColor.activeCaption);
		lblNewLabel.setBounds(108, 11, 221, 75);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Escolha o tipo de ve\u00EDculo:");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(126, 83, 188, 23);
		contentPane.add(lblNewLabel_1);
		
		JButton btnCarro = new JButton("Carro");
		btnCarro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cadastro cadastro = new Cadastro ();
				cadastro.setVisible(true);
				dispose();
			}
		});
		btnCarro.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnCarro.setBounds(42, 117, 122, 46);
		contentPane.add(btnCarro);
		
		JButton btnMoto = new JButton("Moto");
		btnMoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cadastro cadastro = new Cadastro ();
				cadastro.setVisible(true);
				dispose();
			}
		});
		btnMoto.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnMoto.setBounds(256, 117, 122, 46);
		contentPane.add(btnMoto);
		
		JButton btnTruck = new JButton("Caminh\u00E3o");
		btnTruck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cadastro cadastro = new Cadastro ();
				cadastro.setVisible(true);
				dispose();
			}
		});
		btnTruck.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnTruck.setBounds(42, 204, 122, 46);
		contentPane.add(btnTruck);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
		btnSair.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnSair.setBounds(256, 204, 122, 46);
		contentPane.add(btnSair);
	}
}
