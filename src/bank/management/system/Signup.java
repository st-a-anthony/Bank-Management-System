package bank.management.system;

import javax.swing.*;
import org.w3c.dom.Text;

import com.toedter.calendar.JDateChooser;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.spec.PSSParameterSpec;
import java.util.Random;
public class Signup  extends JFrame implements ActionListener{
	JRadioButton r1,r2,m1,m2;
	JButton next;
	JTextField txtpin,txtstate,txtName,txtc,txtMs,txtFname,txtEmail,txtadd;
	JDateChooser dataChooser;
Random r=new Random();
long first4=(r.nextLong()% 9000L)+1000L;
String first=" "+Math.abs(first4);


	Signup(){ 
		super("APPLICATION FORM");
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
		Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(20,10,100,100);
		add(image);
		
		JLabel label1=new JLabel("APPLICATION FORM NO"+ first);
		label1.setBounds(160,20,600,40);
		label1.setFont(new Font("Raleway",Font.BOLD,38));
		add(label1);
		
		JLabel label2=new JLabel("page 1");
		label2.setFont(new Font("Ralway",Font.BOLD,22));
		label2.setBounds(350,70,600,30);
		add(label2);
		
		JLabel label3=new JLabel("Personal Details");
		label3.setFont(new Font("Raleway",Font.BOLD,22));
		label3.setBounds(300,120,600,30);
		add(label3);
		
		
		JLabel labelname=new JLabel("Name :");
		labelname.setFont(new Font("Raleway",Font.BOLD,20));
		labelname.setBounds(100,190,100,30);
		add(labelname);
		
		txtName=new JTextField();
		txtName.setFont(new Font("Raleway",Font.BOLD,14));
		txtName.setBounds(300,190,400,30);
		add(txtName);
		
		
		
		JLabel labelfname=new JLabel("Father's Name :");
		labelfname.setFont(new Font("Raleway",Font.BOLD,20));
		labelfname.setBounds(100,240,200,30);
		add(labelfname);
		
		txtFname=new JTextField();
		txtFname.setFont(new Font("Raleway",Font.BOLD,14));
		txtFname.setBounds(300,240,400,30);
		add(txtFname);
		
		JLabel dob=new JLabel("Date Of Birth :");
		dob.setFont(new Font("Raleway",Font.BOLD,20));
		dob.setBounds(100,300,200,30);
		add(dob);
		
		dataChooser=new JDateChooser();
		dataChooser.setForeground(new Color(105,105,105));
		dataChooser.setBounds(300,300,400,30);
		add(dataChooser);
		
		JLabel labelG=new JLabel("Gender");
		labelG.setFont(new Font("Raleway",Font.BOLD,20));
		labelG.setBounds(100,350,200,30);
		add(labelG);
		
		r1=new JRadioButton("Male");
		r1.setFont(new Font("Raleway",Font.BOLD,14));
		r1.setBounds(300,350,60,30);
		r1.setBackground(new Color(222,255,228));
		add(r1);
		
		r2=new JRadioButton("Female");
		r2.setFont(new Font("Raleway",Font.BOLD,14));
		r2.setBackground(new Color(222,255,228));
		r2.setBounds(400,350,90,30);
		add(r2);
		
		ButtonGroup gp=new ButtonGroup();
		gp.add(r1);
		gp.add(r2);
		
		
		JLabel labelEmail=new JLabel("Email :");
		labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
		labelEmail.setBounds(100,390,200,30);
		add(labelEmail);
		
		txtEmail=new JTextField();
		txtEmail.setFont(new Font("Raleway",Font.BOLD,14));
		txtEmail.setBounds(300,390,400,30);
		add(txtEmail);
		
		JLabel labelMs=new JLabel("Marital Status :");
		labelMs.setFont(new Font("Raleway",Font.BOLD,20));
		labelMs.setBounds(100,440,200,30);
		add(labelMs);
		
		m1=new JRadioButton("Married");
		m1.setFont(new Font("Raleway",Font.BOLD,14));
		m1.setBounds(300,440,100,30);
		m1.setBackground(new Color(222,255,228));
		add(m1);
		
		m2=new JRadioButton("Unmarried");
		m2.setFont(new Font("Raleway",Font.BOLD,14));
		m2.setBackground(new Color(222,255,228));
		m2.setBounds(400,440,100,30);
		add(m2);
		
		ButtonGroup gp1=new ButtonGroup();
		gp1.add(m1);
		gp1.add(m2);
		
		JLabel labeladd=new JLabel("Adderess :");
		labeladd.setFont(new Font("Raleway",Font.BOLD,20));
		labeladd.setBounds(100,490,200,30);
		add(labeladd);
		
		txtadd=new JTextField();
		txtadd.setFont(new Font("Raleway",Font.BOLD,14));
		txtadd.setBounds(300,490,400,30);
		add(txtadd);
		
		
		JLabel labelCity=new JLabel("City :");
		labelCity.setFont(new Font("Raleway",Font.BOLD,20));
		labelCity.setBounds(100,540,200,30);
		add(labelCity);
		
		txtc=new JTextField();
		txtc.setFont(new Font("Raleway",Font.BOLD,14));
		txtc.setBounds(300,540,400,30);
		add(txtc);
		
		JLabel labelPin=new JLabel("Pin Code :");
		labelPin.setFont(new Font("Raleway",Font.BOLD,20));
		labelPin.setBounds(100,590,200,30);
		add(labelPin);
		
		txtpin=new JTextField();
		txtpin.setFont(new Font("Raleway",Font.BOLD,14));
		txtpin.setBounds(300,590,400,30);
		add(txtpin);
		

		JLabel labelstate=new JLabel("State :");
		labelstate.setFont(new Font("Raleway",Font.BOLD,20));
		labelstate.setBounds(100,640,200,30);
		add(labelstate);
		
		txtstate=new JTextField();
		txtstate.setFont(new Font("Raleway",Font.BOLD,14));
		txtstate.setBounds(300,640,400,30);
		add(txtstate);
		
		
		next=new JButton("Next");
		next.setFont(new Font("Raleway",Font.BOLD,14));
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setBounds(620,710,80,30);
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(new Color(222,255,228));
		setLayout(null);
		setSize(850,800);
		setLocation(360,40);
		setVisible(true);
		
		
			}
	
	public void actionPerformed(ActionEvent e) {
		
		String formno=first;
		String name=txtName.getText();
		String fname=txtFname.getText();
		String dob=((JTextField) dataChooser.getDateEditor().getUiComponent()).getText();
		String gender=null;
		if(r1.isSelected()) {
			gender="Male";
			
		}
		else if(r2.isSelected()){
			gender="Female";
		}
		String email=txtEmail.getText();
		String marital=null;
		if(m1.isSelected()) {
			gender="Married";
			
		}
		else if(m2.isSelected()) {
			gender="Unmarried";
		}
		
		String address=txtadd.getText();
		String city=txtc.getText();
		String pincode=txtpin.getText();
		String state=txtstate.getText();
		
		try {
			if(txtName.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"Fill All The Fields");
			}
			else{
				connn con1=new connn();
				String q="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
				con1.statement.executeUpdate(q);
				new Singup2(first);
				setVisible(false);
			}
		}
		catch(Exception E) {
			E.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Signup();
	}
}
