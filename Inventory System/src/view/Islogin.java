package view;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Islogin extends JFrame {

	private JButton loginButton;
	private JTextField usernameTF, passwordTF;
	private JLabel usernameL, passwordL;
	
	private JPanel IsloginPanel;

	Islogin(){
		setupFrame();
		initialize();
		setupLayout();
		setVisible(true);
	}
	public void setupFrame(){
		setSize(300,500);
		setTitle("Inventory System");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	public void initialize(){
		IsloginPanel = new JPanel();
		IsloginPanel.setLayout(null);
		getContentPane().add(IsloginPanel);
		
		loginButton = new JButton("Login");
		
		usernameTF = new JTextField(20);
		passwordTF = new JTextField(20);
		
		usernameL = new JLabel("Username");
		passwordL = new JLabel("Password");	
	}
	public void setupLayout(){
		IsloginPanel.add(usernameL);
		IsloginPanel.add(usernameTF);
		IsloginPanel.add(passwordL);
		IsloginPanel.add(passwordTF);
		
		IsloginPanel.add(loginButton);
		
		usernameL.setBounds(243,144,-147,-22);
		usernameTF.setBounds(143,122,22,0);
		passwordL.setBounds(143,122,22,0);
		passwordTF.setBounds(143,122,22,0);
		loginButton.setBounds(143,122,22,0);
	}
	public static void main(String[] args){
		Islogin z = new Islogin();
	}
}
