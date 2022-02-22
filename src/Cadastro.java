import java.awt.BorderLayout;
import java.util.List;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.SystemColor;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JScrollPane;

public class Cadastro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	List <String> carro = new ArrayList<String>(); 
	List <String> moto = new ArrayList<String>();
	List <String>caminhao = new ArrayList<String>();
	private JTextField marca;
	private JTextField modelo;
	private JTextField placa;
	private JTextField ano;
	private JTextField cor;
	private JTextField nPortas;
	private JTextField nEixos;
	private int registros;
	JList list = new JList();
	DefaultListModel model = new DefaultListModel();

	/**
	 * Create the frame.
	 */
	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(SystemColor.inactiveCaption);
		tabbedPane.setBounds(0, 0, 424, 250);
		contentPane.add(tabbedPane);
		
		
		JPanel cad_1 = new JPanel();
		cad_1.setBackground(SystemColor.inactiveCaption);
		tabbedPane.addTab("Cadastro", null, cad_1, null);
		cad_1.setLayout(null);
		

		JLabel lblNewLabel_1 = new JLabel(registros + " - registros");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(48, 146, 105, 30);
		cad_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("**Os campos inexistentes devem ser deixados em branco");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.ITALIC, 13));
		lblNewLabel_2.setBounds(30, 128, 362, 21);
		cad_1.add(lblNewLabel_2);
		
		JButton btnVoltar = new JButton("voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal menu = new MenuPrincipal ();
				menu.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnVoltar.setBounds(297, 184, 95, 27);
		cad_1.add(btnVoltar);
		
		JButton btnLimpar = new JButton("limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marca.setText("");
				modelo.setText("");
				placa.setText("");
				ano.setText("");
				cor.setText("");
				nPortas.setText("");
				nEixos.setText("");
				
			}
		});
		btnLimpar.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnLimpar.setBounds(163, 184, 95, 27);
		cad_1.add(btnLimpar);
		
		JButton btnSalvar = new JButton("salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (nPortas.getText().equalsIgnoreCase("") && nEixos.getText().equalsIgnoreCase("")) {
					Moto cad = new Moto (modelo.getText(), marca.getText(), ano.getText(), placa.getText(), cor.getText());
					moto.add(cad.getCadastro());
					model.addElement(cad.getCadastro());
					list.setModel(model);
					registros = registros + 1;
					lblNewLabel_1.setText(registros + " - registros");
					
				}else if (nPortas.getText().equalsIgnoreCase("") ) {
					Caminhao cad = new Caminhao (modelo.getText(), marca.getText(), ano.getText(), placa.getText(), cor.getText(), nEixos.getText());
					caminhao.add(cad.getCadastro());
					model.addElement(cad.getCadastro());
					list.setModel(model);
					registros = registros + 1;
					lblNewLabel_1.setText(registros + " - registros");
				}else{
					Carro cad = new Carro (modelo.getText(), marca.getText(), ano.getText(), placa.getText(), cor.getText(), nPortas.getText());
					carro.add(cad.getCadastro());
					model.addElement(cad.getCadastro());
					list.setModel(model);
					registros = registros + 1;
					lblNewLabel_1.setText(registros + " - registros");
				}
			}
		});
		btnSalvar.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnSalvar.setBounds(30, 187, 95, 27);
		cad_1.add(btnSalvar);
		
		JLabel lblNewLabel = new JLabel("marca");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 11, 45, 21);
		cad_1.add(lblNewLabel);
		
		JLabel lblModelo = new JLabel("modelo");
		lblModelo.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblModelo.setBounds(10, 50, 45, 21);
		cad_1.add(lblModelo);
		
		JLabel lblPlaca = new JLabel("placa");
		lblPlaca.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblPlaca.setBounds(10, 96, 45, 21);
		cad_1.add(lblPlaca);
		
		JLabel lblAnoDeFabricao = new JLabel("ano ");
		lblAnoDeFabricao.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblAnoDeFabricao.setBounds(163, 15, 45, 21);
		cad_1.add(lblAnoDeFabricao);
		
		JLabel lblCor = new JLabel("cor");
		lblCor.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblCor.setBounds(163, 54, 45, 21);
		cad_1.add(lblCor);
		
		JLabel lblNDePortas = new JLabel("n\u00BA de portas");
		lblNDePortas.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblNDePortas.setBounds(163, 100, 78, 21);
		cad_1.add(lblNDePortas);
		
		JLabel lblNDeEixos = new JLabel("n\u00BA de eixos");
		lblNDeEixos.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblNDeEixos.setBounds(297, 15, 78, 21);
		cad_1.add(lblNDeEixos);
		
		marca = new JTextField();
		marca.setBounds(67, 12, 86, 20);
		cad_1.add(marca);
		marca.setColumns(10);
		
		modelo = new JTextField();
		modelo.setColumns(10);
		modelo.setBounds(65, 51, 86, 20);
		cad_1.add(modelo);
		
		placa = new JTextField();
		placa.setColumns(10);
		placa.setBounds(65, 97, 86, 20);
		cad_1.add(placa);
		
		ano = new JTextField();
		ano.setColumns(10);
		ano.setBounds(201, 12, 86, 20);
		cad_1.add(ano);
		
		cor = new JTextField();
		cor.setColumns(10);
		cor.setBounds(201, 51, 86, 20);
		cad_1.add(cor);
		
		nPortas = new JTextField();
		nPortas.setColumns(10);
		nPortas.setBounds(242, 97, 45, 20);
		cad_1.add(nPortas);
		
		nEixos = new JTextField();
		nEixos.setColumns(10);
		nEixos.setBounds(368, 12, 41, 20);
		cad_1.add(nEixos);
		
		JPanel lista = new JPanel();
		lista.setBackground(SystemColor.inactiveCaption);
		tabbedPane.addTab("Lista", null, lista, null);
		lista.setLayout(null);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resp = JOptionPane.showInputDialog("Certeza que deseja remover este elemento?");
				if (resp.equalsIgnoreCase("sim")) {
					model.removeElement(list.getSelectedValue());
					list.setModel(model);
				}
			}
		});
		btnRemover.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnRemover.setBounds(40, 186, 133, 25);
		lista.add(btnRemover);
		
		JButton btnRemoverTodos = new JButton("Remover todos");
		btnRemoverTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resp = JOptionPane.showInputDialog("Certeza que deseja remover todos os elementos?");
				if (resp.equalsIgnoreCase("sim")) {
					model.removeAllElements();
					list.setModel(model);
				}
			}
		});
		btnRemoverTodos.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnRemoverTodos.setBounds(240, 186, 133, 25);
		lista.add(btnRemoverTodos);
		lista.add(list);
		
		
		list.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		list.setBounds(10, 11, 399, 164);
	}
}
