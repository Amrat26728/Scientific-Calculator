import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{

	private JLabel label;
	private JTextField tf;
	private JRadioButton on,off;
	private JButton bt,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,sqrt,exp,sin,cos,tan,inverse,log,sinInverse,cosInverse,
	                tanInverse,sinh,cosh,tanh,power,remainder,clear,backspace,division,multi,add,subt,cube,sqr,addSubt,fact,point,equal;
	private Container c;
	private ButtonGroup bg;
	private double first,second,result;
	private String operation,answer;
	
	
	MyFrame()
	{
		setTitle("Scientific Calculator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(380,450);
		setLocationRelativeTo(null);
		
		ImageIcon icon=new ImageIcon("D:\\Lab_Tasks/Cal.jpg");
		this.setIconImage(icon.getImage());
		
		c=getContentPane();
		c.setLayout(null);
		
		
		label=new JLabel("Scientific Calculator");
		label.setFont(new Font("Windings",Font.BOLD,20));
		label.setBounds(85,10,260,30);
		add(label);
		
		tf=new JTextField();
		tf.setFont(new Font("windings",Font.BOLD,15));
		tf.setBounds(10,45,345,45);
		add(tf);
		tf.getCaret().setVisible(false);
		
		bg=new ButtonGroup();
		
		on=new JRadioButton("ON");
		on.setBounds(13,90,50,30);
		add(on);
		
		off=new JRadioButton("OFF");
		off.setBounds(68,90,50,30);
		add(off);
		
		bg.add(on);
		bg.add(off);
		
		off.setSelected(true);
		
		sqrt=new JButton("\u221A");
		sqrt.setBounds(10,130,65,30);
		add(sqrt);
		
		exp=new JButton("e^x");
		exp.setBounds(80,130,65,30);
		add(exp);
		
		sin=new JButton("sin");
		sin.setFont(new Font(null,Font.PLAIN,12));
		sin.setBounds(150,130,65,30);
		add(sin);
		
		cos=new JButton("cos");
		cos.setFont(new Font(null,Font.PLAIN,12));
		cos.setBounds(220,130,65,30);
		add(cos);
		
		tan=new JButton("tan");
		tan.setFont(new Font(null,Font.PLAIN,12));
		tan.setBounds(290,130,65,30);
		add(tan);
		
		inverse=new JButton("x-1");
		inverse.setBounds(10,165,65,30);
		add(inverse);
		
		log=new JButton("Log");
		log.setBounds(80,165,65,30);
		add(log);
		
		sinInverse=new JButton("sin-1");
		sinInverse.setFont(new Font(null,Font.PLAIN,12));
		sinInverse.setBounds(150,165,65,30);
		add(sinInverse);
		
		cosInverse=new JButton("cos-1");
		cosInverse.setFont(new Font(null,Font.PLAIN,12));
		cosInverse.setBounds(220,165,65,30);
		add(cosInverse);
		
		tanInverse=new JButton("tan-1");
		tanInverse.setFont(new Font(null,Font.PLAIN,12));
		tanInverse.setBounds(290,165,65,30);
		add(tanInverse);
		
		power=new JButton("x^y");
		power.setBounds(10,200,65,30);
		add(power);
		
		remainder=new JButton("%");
		remainder.setFont(new Font("Windings",Font.BOLD,15));
		remainder.setBounds(80,200,65,30);
		add(remainder);
		
		clear=new JButton("C");
		clear.setBounds(150,200,65,30);
		add(clear);
		
		backspace=new JButton("\uF0E7");
		backspace.setBounds(220,200,65,30);
		add(backspace);
		
		division=new JButton("/");
		division.setFont(new Font("Windings",Font.BOLD,20));
		division.setBounds(290,200,65,30);
		add(division);
		
		cube=new JButton("x^3");
		cube.setBounds(10,235,65,30);
		add(cube);
		
		bt7=new JButton("7");
		bt7.setFont(new Font("Windings",Font.BOLD,15));
		bt7.setBounds(80,235,65,30);
		add(bt7);
		
		bt8=new JButton("8");
		bt8.setFont(new Font("Windings",Font.BOLD,15));
		bt8.setBounds(150,235,65,30);
		add(bt8);
		
		bt9=new JButton("9");
		bt9.setFont(new Font("Windings",Font.BOLD,15));
		bt9.setBounds(220,235,65,30);
		add(bt9);
		
		multi=new JButton("*");
		multi.setFont(new Font("Windings",Font.BOLD,20));
		multi.setBounds(290,235,65,30);
		add(multi);
		
		sqr=new JButton("x^2");
		sqr.setBounds(10,270,65,30);
		add(sqr);
		
	    bt4=new JButton("4");
	    bt4.setFont(new Font("Windings",Font.BOLD,15));
		bt4.setBounds(80,270,65,30);
		add(bt4);
		
		bt5=new JButton("5");
		bt5.setFont(new Font("Windings",Font.BOLD,15));
		bt5.setBounds(150,270,65,30);
		add(bt5);
		
		bt6=new JButton("6");
		bt6.setFont(new Font("Windings",Font.BOLD,15));
		bt6.setBounds(220,270,65,30);
		add(bt6);
		
		subt=new JButton("-");
		subt.setFont(new Font("Windings",Font.BOLD,20));
		subt.setBounds(290,270,65,30);
		add(subt);
		
		addSubt=new JButton("+/-");
		addSubt.setFont(new Font("Windings",Font.BOLD,15));
		addSubt.setBounds(10,305,65,30);
		add(addSubt);
		
		bt1=new JButton("1");
		bt1.setFont(new Font("Windings",Font.BOLD,15));
		bt1.setBounds(80,305,65,30);
		add(bt1);
		
		bt2=new JButton("2");
		bt2.setFont(new Font("Windings",Font.BOLD,15));
		bt2.setBounds(150,305,65,30);
		add(bt2);
		
		bt3=new JButton("3");
		bt3.setFont(new Font("Windings",Font.BOLD,15));
		bt3.setBounds(220,305,65,30);
		add(bt3);
		
		add=new JButton("+");
		add.setFont(new Font("windings",Font.BOLD,15));
		add.setBounds(290,305,65,30);
		add(add);
		
		fact=new JButton("n!");
		fact.setBounds(10,340,65,30);
		add(fact);
		
		bt=new JButton("0");
		bt.setFont(new Font("Windings",Font.BOLD,15));
		bt.setBounds(80,340,135,30);
		add(bt);
		
		point=new JButton(".");
		point.setFont(new Font("windings",Font.BOLD,30));
		point.setBounds(220,340,65,30);
		add(point);
		
		equal=new JButton("=");
		equal.setFont(new Font("windings",Font.BOLD,15));
		equal.setBounds(290,340,65,30);
		add(equal);
		
		sqrt.setEnabled(false);
		exp.setEnabled(false);
		sin.setEnabled(false);
		cos.setEnabled(false);
		tan.setEnabled(false);
		inverse.setEnabled(false);
		log.setEnabled(false);
		sinInverse.setEnabled(false);
		cosInverse.setEnabled(false);
		tanInverse.setEnabled(false);
		power.setEnabled(false);
		remainder.setEnabled(false);
		clear.setEnabled(false);
		backspace.setEnabled(false);
		division.setEnabled(false);
		cube.setEnabled(false);
		bt7.setEnabled(false);
		bt8.setEnabled(false);
		bt9.setEnabled(false);
		multi.setEnabled(false);
		sqr.setEnabled(false);
		bt4.setEnabled(false);
		bt5.setEnabled(false);
		bt6.setEnabled(false);
		subt.setEnabled(false);
		addSubt.setEnabled(false);
		bt1.setEnabled(false);
		bt2.setEnabled(false);
		bt3.setEnabled(false);
		add.setEnabled(false);
		fact.setEnabled(false);
		bt.setEnabled(false);
		point.setEnabled(false);
		equal.setEnabled(false);
		tf.setEditable(false);
		
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=tf.getText()+bt.getText();
				tf.setText(num);
			}
		});
		
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=tf.getText()+bt1.getText();
				tf.setText(num);
			}
		});
		
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=tf.getText()+bt2.getText();
				tf.setText(num);
			}
		});
		
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=tf.getText()+bt3.getText();
				tf.setText(num);
			}
		});
		
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=tf.getText()+bt4.getText();
				tf.setText(num);
			}
		});
		
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=tf.getText()+bt5.getText();
				tf.setText(num);
			}
		});
		
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=tf.getText()+bt6.getText();
				tf.setText(num);
			}
		});
		
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=tf.getText()+bt7.getText();
				tf.setText(num);
			}
		});
		
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=tf.getText()+bt8.getText();
				tf.setText(num);
			}
		});
		
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=tf.getText()+bt9.getText();
				tf.setText(num);
			}
		});
		
		point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=tf.getText()+point.getText();
				tf.setText(num);
			}
		});
		
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()>0)
				{
				first=Double.parseDouble(tf.getText());
				tf.setText("");
				operation="+";
				}
				else
				{
					tf.setText(null);
				}
			}
		});
		
		subt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()>0)
				{
				first=Double.parseDouble(tf.getText());
				tf.setText("");
				operation="-";
				}
				else 
				{
					tf.setText(null);
				}
			}
		});
		
		multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()>0)
				{
				first=Double.parseDouble(tf.getText());
				tf.setText("");
				operation="*";
				}
				else
				{
					tf.setText(null);
				}
			}
		});
		
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()>0)
				{
				first=Double.parseDouble(tf.getText());
				tf.setText("");
				operation="/";
				}
				else
				{
					tf.setText(null);
				}
			}
		});
		
		remainder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()>0)
				{
				first=Double.parseDouble(tf.getText());
				tf.setText("");
				operation="%";
				}
				else 
				{
					tf.setText(null);
				}
			}
		});
		
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()>0)
				{
				second=Double.parseDouble(tf.getText());
				tf.setText(null);
				if(operation=="+")
				{
				result=first+second;
				answer=String.format("%.2f", result);
				tf.setText(answer);
				}
				
				else if(operation=="-")
				{
				result=first-second;
				answer=String.format("%.2f", result);
				tf.setText(answer);
				}
				
				else if(operation=="*")
				{
				result=first*second;
				answer=String.format("%.2f", result);
				tf.setText(answer);
				}
				
				else if(operation=="/")
				{
				result=first/second;
				answer=String.format("%.2f", result);
				tf.setText(answer);
				}
				
				else if(operation=="%")
				{
				result=first%second;
				answer=String.format("%.2f", result);
				tf.setText(answer);
				}
				
				else if(operation=="x^y")
				{
				 result=1;
				 for(int i=1;i<=second;i++)
				 {
					 result=result*first;
				 }
				 answer=String.format("%.2f", result);
				 tf.setText(tf.getText()+result);
				}
				
				}
				else
				{
					tf.setText(null);
				}
				
				
			}
		});
		
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(null);
			}
		});
		
		backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bs=null;
				if(tf.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(tf.getText());
					str.deleteCharAt(tf.getText().length()-1);
					bs=str.toString();
					tf.setText(bs);
				}
			}
		});
		
		sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(tf.getText().length()>0)
				{
					double num=Double.parseDouble(tf.getText());
					double num2=Math.sin(Math.toRadians(num));
					tf.setText(null);
					tf.setText(tf.getText()+num2);
				}
				else 
				{
					tf.setText(null);
				}
			}
		});
		
		cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()>0)
				{
					double num=Double.parseDouble(tf.getText());
					double num2=Math.cos(Math.toRadians(num));
					tf.setText(null);
					tf.setText(tf.getText()+num2);
				}
				else 
				{
					tf.setText(null);
				}
			}
		});
		
		tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()>0)
				{
					double num=Double.parseDouble(tf.getText());
					double num2=Math.tan(Math.toRadians(num));
					tf.setText(null);
					tf.setText(tf.getText()+num2);
				}
				else 
				{
					tf.setText(null);
				}
			}
		});
		
		sqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()>0)
				{
				double num=StrictMath.sqrt(Double.parseDouble(tf.getText()));
				tf.setText(null);
				String str=String.valueOf(num);
				tf.setText(tf.getText()+str);
				}
				else 
				{
					tf.setText(null);
				}
			}
		});
		
		sinInverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()>0)
				{
				 double num=Math.toDegrees(Math.asin(Double.parseDouble(tf.getText())));
				 tf.setText(null);
				 tf.setText(tf.getText()+num);
				}
				else 
				{
					tf.setText(null);
				}
			}
		});
		
		cosInverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()>0)
				{
					double num=Math.toDegrees(Math.acos(Double.parseDouble(tf.getText())));
					tf.setText(null);
				    tf.setText(tf.getText()+num);
				}
				else 
				{
					tf.setText(null);
				}
			}
		});
		
		tanInverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()>0)
				{
					double num=Math.toDegrees(Math.atan(Double.parseDouble(tf.getText())));
					tf.setText(null);
					tf.setText(tf.getText()+num);
				}
				else 
				{
					tf.setText(null);
				}
			}
		});
		
		log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()>0)
				{
				double num=Math.log10(Double.parseDouble(tf.getText()));
				tf.setText(null);
				tf.setText(tf.getText()+num);
				}
				else 
				{
					tf.setText(null);
				}
			}
		});
		
		exp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()>0)
				{
				double num=Math.exp(Double.parseDouble(tf.getText()));
				tf.setText(null);
				tf.setText(tf.getText()+num);
				}
				else 
				{
					tf.setText(null);
				}
			}
		});
		
		inverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()>0)
				{
				double num=1/(Double.parseDouble(tf.getText()));
				tf.setText(null);
				tf.setText(tf.getText()+num);
				}
				else 
				{
					tf.setText(null);
				}
			}
		});
		
		sqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()>0)
				{
				double num=Double.parseDouble(tf.getText());
				tf.setText(null);
				result=num*num;
				tf.setText(tf.getText()+result);
				}
				else
				{
					tf.setText(null);
				}
			}
		});
		
		cube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()>0)
				{
				double num=Double.parseDouble(tf.getText());
				tf.setText(null);
				result=num*num*num;
				tf.setText(tf.getText()+result);
				}
				else
				{
					tf.setText(null);
				}
			}
		});
		
		addSubt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()>0)
				{
				double num=Double.parseDouble(String.valueOf(tf.getText()));
				num=num*(-1);
				tf.setText(null);
				tf.setText(tf.getText()+num);
				}
				else
				{
					tf.setText(null);
				}
			}
		});
		
		fact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()>0)
				{
				double num=Double.parseDouble(tf.getText());
				tf.setText(null);
				double fac=1;
				if(num!=0)
				{
				while(num!=0)
				{
					fac=fac*num;
					num--;
				}
				}
				else if(num==0)
				{
					fac=1;
				}
				tf.setText(tf.getText()+fac);
				}
				else
				{
					tf.setText(null);
				}
			}
		});
		
		power.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()>0)
				{
				first=Double.parseDouble(tf.getText());
				tf.setText("");
				operation="x^y";
				}
				else 
				{
					tf.setText(null);
				}
			}
		});
		
		
		off.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				tf.setText(null);
				sqrt.setEnabled(false);
				exp.setEnabled(false);
				sin.setEnabled(false);
				cos.setEnabled(false);
				tan.setEnabled(false);
				inverse.setEnabled(false);
				log.setEnabled(false);
				sinInverse.setEnabled(false);
				cosInverse.setEnabled(false);
				tanInverse.setEnabled(false);
				power.setEnabled(false);
				remainder.setEnabled(false);
				clear.setEnabled(false);
				backspace.setEnabled(false);
				division.setEnabled(false);
				cube.setEnabled(false);
				bt7.setEnabled(false);
				bt8.setEnabled(false);
				bt9.setEnabled(false);
				multi.setEnabled(false);
				sqr.setEnabled(false);
				bt4.setEnabled(false);
				bt5.setEnabled(false);
				bt6.setEnabled(false);
				subt.setEnabled(false);
				addSubt.setEnabled(false);
				bt1.setEnabled(false);
				bt2.setEnabled(false);
				bt3.setEnabled(false);
				add.setEnabled(false);
				fact.setEnabled(false);
				bt.setEnabled(false);
				point.setEnabled(false);
				equal.setEnabled(false);
				tf.setEditable(false);
				
			}
		});
		
		
		on.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				sqrt.setEnabled(true);
				exp.setEnabled(true);
				sin.setEnabled(true);
				cos.setEnabled(true);
				tan.setEnabled(true);
				inverse.setEnabled(true);
				log.setEnabled(true);
				sinInverse.setEnabled(true);
				cosInverse.setEnabled(true);
				tanInverse.setEnabled(true);
				power.setEnabled(true);
				remainder.setEnabled(true);
				clear.setEnabled(true);
				backspace.setEnabled(true);
				division.setEnabled(true);
				cube.setEnabled(true);
				bt7.setEnabled(true);
				bt8.setEnabled(true);
				bt9.setEnabled(true);
				multi.setEnabled(true);
				sqr.setEnabled(true);
				bt4.setEnabled(true);
				bt5.setEnabled(true);
				bt6.setEnabled(true);
				subt.setEnabled(true);
				addSubt.setEnabled(true);
				bt1.setEnabled(true);
				bt2.setEnabled(true);
				bt3.setEnabled(true);
				add.setEnabled(true);
				fact.setEnabled(true);
				bt.setEnabled(true);
				point.setEnabled(true);
				equal.setEnabled(true);
				tf.setEditable(true);
	
			}
		});
		
		
		
		
		
		setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
