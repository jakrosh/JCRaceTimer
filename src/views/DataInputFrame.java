package views;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class DataInputFrame {

	private JFrame frmJcracetimer;
	private JTextField txtLinkUrl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataInputFrame window = new DataInputFrame();
					window.frmJcracetimer.setVisible(true);
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
		frmJcracetimer = new JFrame();
		frmJcracetimer.setTitle("JCRaceTimer");
		frmJcracetimer.setBounds(100, 100, 450, 300);
		frmJcracetimer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJcracetimer.getContentPane().setLayout(null);
		
		JButton btnTimerFrame = new JButton("Finish Line Timer");
		btnTimerFrame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTimerFrame.setBounds(254, 128, 170, 23);
		frmJcracetimer.getContentPane().add(btnTimerFrame);
		
		JButton btnAssignBarcode = new JButton("Assign Barcode");
		btnAssignBarcode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnAssignBarcode.setBounds(10, 165, 170, 23);
		frmJcracetimer.getContentPane().add(btnAssignBarcode);
		
		JLabel lblLinkUrl = new JLabel("Enter Google Sheets Link:");
		lblLinkUrl.setBounds(10, 11, 141, 14);
		frmJcracetimer.getContentPane().add(lblLinkUrl);
		
		txtLinkUrl = new JTextField();
		txtLinkUrl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtLinkUrl.setBounds(138, 8, 286, 20);
		frmJcracetimer.getContentPane().add(txtLinkUrl);
		txtLinkUrl.setColumns(10);
		
		JButton btnEstablishLink = new JButton("Establish Link");
		btnEstablishLink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GSheetsSync gSheets = new GSheetsSync(txtLinkUrl.getText());	//sends the link url entered to the gsheets class and returns status  
				if(gSheets.isLinkEstablished()){
					JOptionPane.showMessageDialog(null, "Link Established.");	
				}
				else{
					JOptionPane.showMessageDialog(null, "Something went wrong, Try again.");	
				}
				
				txtLinkUrl.setText(null); 	//resets the text box 
			}
		});
		btnEstablishLink.setBounds(316, 39, 108, 23);
		frmJcracetimer.getContentPane().add(btnEstablishLink);
		
		JButton btnRegisterParticipant = new JButton("Register Participant");
		btnRegisterParticipant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegisterParticipant.setBounds(10, 128, 170, 23);
		frmJcracetimer.getContentPane().add(btnRegisterParticipant);
	}
}
