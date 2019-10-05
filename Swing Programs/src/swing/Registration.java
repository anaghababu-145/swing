package swing;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Registration {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
JTextArea ta=new JTextArea();
ta.setBounds(125, 550, 200, 120);

//ImageIcon img=new ImageIcon("bridge-lake-bokeh");
//f.setIconImage(img.getImage());
b.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	ta.setText(t1.getText()+"\n"+t2.getText()+"\n"+t3.getText()+"\n"+t4.getText()+"\n"+t5.getText()+"\n"+t6.getText());
	 
	}
});

	
f.add(ta);
f.setSize(500, 800);
f.setLayout(null);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
