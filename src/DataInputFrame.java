import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class DataInputFrame {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataInputFrame window = new DataInputFrame();
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
	public DataInputFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(165, 136, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(149, 53, 105, 30);
		frame.getContentPane().add(textPane);
		
		JButton btnNewButton_1 = new JButton("Previous");
		btnNewButton_1.setBounds(10, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JTextPane txtpnClickInThe = new JTextPane();
		txtpnClickInThe.setText("Click in the box below to start recording barcodes");
		txtpnClickInThe.setBounds(95, 105, 243, 20);
		frame.getContentPane().add(txtpnClickInThe);
	}
}
