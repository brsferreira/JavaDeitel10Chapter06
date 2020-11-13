package deitel.capitulo6.exercicio6_30;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
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
	public Frame() {
		
		FindNumber fn = new FindNumber();
		fn.randomNumbre();
		
		setTitle("Guess a number");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextField textField = new TextField();
		textField.setBounds(10, 72, 72, 22);
		contentPane.add(textField);
		
		
		Label label = new Label("Digite o valor desejado:");
		label.setBounds(10, 47, 135, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("Guess a number between1 and 1000.");
		label_1.setForeground(SystemColor.textHighlight);
		label_1.setFont(new Font("Dialog", Font.BOLD, 12));
		label_1.setBounds(106, 10, 232, 22);
		contentPane.add(label_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(88, 72, 336, 22);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Avaliar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int choice = (Integer.parseInt(textField.getText()));
				fn.setChoice(choice);
				fn.finder();
				lblNewLabel.setText(fn.getMensagem());
				
				
			}
		});
		btnNewButton.setBounds(10, 100, 72, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(335, 228, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Resetar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				fn.randomNumbre();
			}
		});
		btnNewButton_2.setBounds(236, 228, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
