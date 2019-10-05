package swing;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.*;
public class RegistrationForm  {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","");  
		
		if (con != null)
		{
			System.out.println("Connected");
		}
		else
		{
			System.out.println("not Connected");
		}
		
		Statement statement=con.createStatement();
		
		
		
		
JFrame f=new JFrame("Registration");
JLabel l1,l2,l3,l4,l5,l6;
JTextField t1,t2,t3,t4,t5,t6;
JButton b=new JButton("Submit");
l1=new JLabel("First Name:");
t1=new JTextField();
l2=new JLabel("Last Name:");
t2=new JTextField();
l3=new JLabel("Password:");
t3=new JTextField();
l4=new JLabel("Re-enter Password:");
t4=new JTextField();
l5=new JLabel("Mobile No:");
t5=new JTextField();
l6=new JLabel("Email:");
t6=new JTextField();

l1.setBounds(50,50, 130,30);
t1.setBounds(200, 50, 120,30);

l2.setBounds(50,100, 130,30);
t2.setBounds(200, 100, 120,30);

l3.setBounds(50,150, 130,30);
t3.setBounds(200, 150, 120,30);

l4.setBounds(50,200, 130,30);
t4.setBounds(200, 200, 120,30);

l5.setBounds(50,250, 130,30);
t5.setBounds(200, 250, 120,30);

l6.setBounds(50,300, 130,30);
t6.setBounds(200, 300, 120,30);

b.setBounds(125, 400, 100, 30);

f.add(l1);
f.add(t1);

f.add(l2);
f.add(t2);

f.add(l3);
f.add(t3);

f.add(l4);
f.add(t4);

f.add(l5);
f.add(t5);

f.add(l6);
f.add(t6);

f.add(b);
f.setBackground(Color.pink);
//JTextArea ta=new JTextArea();
//ta.setBounds(125, 550, 200, 120);

b.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	String fn,ln,pswd,rpswd,mob,email;
	fn = t1.getText();
	ln = t2.getText();
	pswd = t3.getText();
	rpswd = t4.getText();
	mob = t5.getText();
	email=t6.getText();
	try {
		statement.executeUpdate("INSERT INTO register VALUES('"+fn+"','"+ln+"','"+pswd+"','"+rpswd+"','"+mob+"','"+email+"')");
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	 
	}
});

	

f.setSize(500, 800);
f.setLayout(null);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
