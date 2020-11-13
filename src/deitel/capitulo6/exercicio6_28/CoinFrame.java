package deitel.capitulo6.exercicio6_28;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.border.EtchedBorder;
import javax.swing.UIManager;

public class CoinFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoinFrame frame = new CoinFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}//main

	/**
	 * Create the frame.
	 */
	public CoinFrame() {
		
		Coin coin = new Coin();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(UIManager.getColor("FormattedTextField.inactiveBackground"));
		textPane.setFont(new Font("Tahoma", Font.BOLD, 11));
		textPane.setEditable(false);
		textPane.setBounds(135, 111, 164, 99);
		contentPane.add(textPane);
		
		
		JButton btnNewButton = new JButton("Toss Coin");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textPane.setText("Lançamento: " + coin.flip() + "\n"
								+ "HEADS :  " + coin.getHead() + "\n"
								+ "TAILS  :  " + coin.getTail());
				
			}//actionPerformed
		});
		btnNewButton.setBounds(172, 46, 89, 23);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(114, 95, 206, 131);
		contentPane.add(panel);
		
		
		
		
		
		
		
		
	}//CoinFrame
}//class
