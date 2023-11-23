package bank.management.system;
import javax.swing.*;
import org.w3c.dom.Text;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.spec.PSSParameterSpec;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener{

	JLabel label1,label2,label3;
	JTextField txtField1;
	JPasswordField psField1;
	JButton btn1,btn2,btn3;
	Login(){
		super("Bank Management System");
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
		Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(350,10,100,100);
		add(image);
		
		ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
		Image ii2=ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		ImageIcon ii3=new ImageIcon(ii2);
		JLabel iimage=new JLabel(ii3);
		iimage.setBounds(630,350,100,100);
		add(iimage);
		
		
		label1=new JLabel("WELCOME TO ATM");
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font("AvantGarder",Font.BOLD,38));
		label1.setBounds(220,125,450,40);
		add(label1);
		
		label2=new JLabel("Card No:");
		label2.setFont(new Font("Ralway",Font.BOLD,28));
		label2.setForeground(Color.WHITE);
		label2.setBounds(150,190,375,30);
		add(label2);
		
		txtField1 =new JTextField(15);
		txtField1.setBounds(325,190,230,30);
		txtField1.setFont(new Font("Arial",Font.BOLD,14));
		add(txtField1);
		
		
		label3=new JLabel("PIN: ");
		label3.setFont(new Font("Ralway",Font.BOLD,28));
		label3.setForeground(Color.WHITE);
		label3.setBounds(150,250,375,30);
		add(label3);
	
		psField1=new JPasswordField(15);
		psField1.setBounds(325,250,230,30);
		psField1.setFont(new Font("Arial",Font.BOLD,14));
		add(psField1);
		
		btn1=new JButton("SIGN IN");
		btn1.setFont(new Font("Arial",Font.BOLD,14));
		btn1.setForeground(Color.WHITE);
		btn1.setBackground(Color.BLACK);
		btn1.setBounds(300,300,100,30);
		btn1.addActionListener(this);
		add(btn1);
		
		
		btn2=new JButton("CLEAR");
		btn2.setFont(new Font("Arial",Font.BOLD,14));
		btn2.setForeground(Color.WHITE);
		btn2.setBackground(Color.BLACK);
		btn2.setBounds(430,300,100,30);
		btn2.addActionListener(this);
		add(btn2);
		
		btn3=new JButton("SIGN UP");
		btn3.setFont(new Font("Arial",Font.BOLD,14));
		btn3.setForeground(Color.WHITE);
		btn3.setBackground(Color.BLACK);
		btn3.setBounds(300,350,230,30);
		btn3.addActionListener(this);
		add(btn3);
		
		
		ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
		Image iii2=iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
		ImageIcon iii3=new ImageIcon(iii2);
		JLabel iiimage=new JLabel(iii3);
		iiimage.setBounds(0,0,850,480);
		add(iiimage);
		
		
		
		
		
		
		setLayout(null);
		setSize(850,480);
		setLocation(400,200);
//		setUndecorated(true);//for removing th eminimmize and close button
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
	
		try {
			if(e.getSource()==btn1) {
				connn c=new connn();
				String cardno=txtField1.getText();
				String pin=psField1.getText();
				String q="select * from login where cardno='"+cardno+"' and pin='"+pin+"'";
				ResultSet resultset=c.statement.executeQuery(q);
				if(resultset.next()) {
					setVisible(false);
					new main_Class(pin);
				}
			}
			else if(e.getSource()==btn2) {
				
				txtField1.setText("");
				psField1.setText("");
			}
			else if(e.getSource()==btn3) {
				new Signup();
				setVisible(false);
			}
		}
		catch(Exception E){
			E.printStackTrace();
		}
	}
		public static void main(String[] args) {
			new Login();
		}

		
}
