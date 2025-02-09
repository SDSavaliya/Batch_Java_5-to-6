package Tasks;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileOutputStream;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Frame1 implements ItemListener,ActionListener
{
	JFrame frame;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JTextField tf1,tf2,tf3,tf4;
	JRadioButton rb1,rb2;
	JPasswordField P1,P2;
	JComboBox a,b,c;
	JButton btn;
//	String courses[] = {"ME/M TECT","BE-CE","BE-CIVIL","BSC-PHY","BSC-PHY"};
	String branch[] = {"COMPUTER ENGINEERING","MECHANICAL ENGINEERING","B.S.C","B.COM","IT","CIVIL ENGINEERING"};
	String semester[] = {"1","2","3","4","5","6","7","8"};
	String gender ="";
	
	public Frame1()
	{
		frame = new JFrame();
		
		l1 = new JLabel("Registration Form");
		l1.setBounds(155, 21, 150, 16);
		
		l2 = new JLabel("Firstname");
		l2.setBounds(16, 86, 90, 16);
		
		l3 = new JLabel("Lastname");
		l3.setBounds(16, 123, 90, 16);
		
		l4 = new JLabel("Email Id");
		l4.setBounds(16, 161, 90, 16);
		
		l5 = new JLabel("Password");
		l5.setBounds(16, 205, 90, 16);
		
		tf1 = new JTextField();
		tf1.setBounds(129, 81, 130, 26);
		
		tf2 = new JTextField();
		tf2.setBounds(129, 118, 130, 26);
		
		tf3 = new JTextField();
		tf3.setBounds(129, 156, 130, 26);
		
		tf4 = new JTextField();
		tf4.setBounds(129, 200, 130, 26);
		
		rb1 = new JRadioButton("Male");
		rb1.setBounds(51, 248, 99, 23);
		
		rb2 = new JRadioButton("Female");
		rb2.setBounds(178, 248, 99, 23);
		
		l6 = new  JLabel("Password");
		l6.setBounds(16, 298, 99, 16);
		
		P1 = new JPasswordField();
		P1.setBounds(129, 293, 136, 26);
		
		l7 = new JLabel("Re-Password");
		l7.setBounds(16, 339, 99, 16);
		
		P2 = new JPasswordField();
		P2.setBounds(129, 334, 136, 26);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		l8 = new JLabel("Branch");
		l8.setBounds(16, 376, 90, 16);
		
		a = new JComboBox<>(branch);
		a.setBounds(129, 372, 150, 27);
		
//		l9 = new JLabel("Courses");
//		l9.setBounds(16, 415, 90, 16);
//		
//		b = new JComboBox<>(courses);
//		b.setBounds(127, 411, 150, 27);
		
		l9 = new JLabel("Semester");
		l9.setBounds(16, 415, 90, 16);
		
		c = new JComboBox<>(semester);
		c.setBounds(127, 411, 150, 27);
	
		btn = new JButton("Register");
		btn.setBounds(178, 479, 157, 29);
		
		
		btn.addActionListener(this);
		a.addItemListener(this);
		//b.addItemListener(this);
		c.addItemListener(this);
		
		frame.setSize(600, 600);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
		frame.add(tf4);
		frame.add(rb1);
		frame.add(rb2);
		frame.add(l6);
		frame.add(l7);
		frame.add(P1);
		frame.add(P2);
		frame.add(l8);
		frame.add(l9);
		//frame.add(l10);
		frame.add(a);
		frame.add(b);
		frame.add(c);
		frame.add(btn);
		
	}
	public static void main(String[] args) 
	{
		new Frame1();
		
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==rb1)
		{
			gender = "Male";
		}
		if(e.getSource()==rb2)
		{
			gender = "Female";
		}
		if(e.getSource()==a)
		{
			System.out.println("\nYour cource is : "+a.getItemAt(a.getSelectedIndex()));
		}
		if(e.getSource()==b)
		{
			System.out.println("\nYour branch is : "+b.getItemAt(b.getSelectedIndex()));
		}
		if(e.getSource()==c)
		{
			System.out.println("\nYour semester is : "+c.getItemAt(c.getSelectedIndex()));
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		String fname1 = tf1.getText().toString();
		String lname1 = tf2.getText().toString();
		String email1 = tf3.getText().toString();
		String pass1 = tf4.getText().toString();
		
		System.out.println(fname1+" "+lname1+" "+email1+" "+pass1);
		
		try 
		{
			
			
			
			FileOutputStream fout = new FileOutputStream("D://file.txt");
			String fname = "\n Your firstname is : ";
			fout.write(fname.getBytes());
			fout.write(fname1.getBytes());
			
			String lname = "\n Yor lastname is : ";
			fout.write(lname.getBytes());
			fout.write(lname1.getBytes());
			
			String email = "\n Your email is : ";
			fout.write(email.getBytes());
			fout.write(email1.getBytes());
			
			String pass = "\n Your password is : ";
			fout.write(pass.getBytes());
			fout.write(pass1.getBytes());
			
//			String gender1 = "\n Your gender is : ";
//			fout.write(gender.getBytes());
//			fout.write(gender.getBytes());
//			
		}
		catch (Exception e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("sucess");
	}

}
