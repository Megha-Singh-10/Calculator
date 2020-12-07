import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener 
{
	final JTextArea t;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bd,bc;
	JButton addb,sub,mul,div;
	JButton submit;
	JLabel l;
    double num1,num2,result;
    int addc=0,subc=0,mulc=0,divc=0;
	public Calculator()
	{
		JFrame p=new JFrame("Calculator");
		l=new JLabel("Calculator",JLabel.CENTER);
		t=new JTextArea();
		bc=new JButton("C");
		b0=new JButton("0");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		bd=new JButton(".");
		addb=new JButton("+");
		sub=new JButton("-");
		mul=new JButton("*");
		div=new JButton("/");
		submit=new JButton("=");
		
		l.setBounds(150,20,80,30);
		t.setBounds(80,60,230,30);
		b1.setBounds(80,100,50,20);
		b2.setBounds(140,100,50,20);
		b3.setBounds(200,100,50,20);
		addb.setBounds(260,100,50,20);
		b4.setBounds(80,130,50,20);
		b5.setBounds(140,130,50,20);
		b6.setBounds(200,130,50,20);
		sub.setBounds(260,130,50,20);
		b7.setBounds(80,160,50,20);
		b8.setBounds(140,160,50,20);
		b9.setBounds(200,160,50,20);
		mul.setBounds(260,160,50,20);
		bd.setBounds(80,190,50,20);
		b0.setBounds(140,190,50,20);
		bc.setBounds(200,190,50,20);
		div.setBounds(260,190,50,20);
		submit.setBounds(150,220,80,30);
		
		b0.addActionListener((ActionListener) this);
		b1.addActionListener((ActionListener) this);
		b2.addActionListener((ActionListener) this);
		b3.addActionListener((ActionListener) this);
		b4.addActionListener((ActionListener) this);
		b5.addActionListener((ActionListener) this);
		b6.addActionListener((ActionListener) this);
		b7.addActionListener((ActionListener) this);
		b8.addActionListener((ActionListener)this);
		b9.addActionListener((ActionListener) this);
		
		bd.addActionListener((ActionListener) this);
		bc.addActionListener((ActionListener) this);
		
		addb.addActionListener((ActionListener) this);
		sub.addActionListener((ActionListener) this);
		mul.addActionListener((ActionListener) this);
		div.addActionListener((ActionListener)this);
		submit.addActionListener((ActionListener) this);
		//t.addActionListener((ActionListener) this);
		//JPanel p=new JPanel();
		p.add(b0);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		
		
		p.add(bc);
		p.add(l);
		
		p.add(t);
		p.add(bd);
		p.add(submit);
		p.add(addb);
		p.add(sub);
		p.add(mul);
		p.add(div);
		p.setBackground(Color.blue);
		//f.add(p);
		p.setSize(400,400);
		p.setLayout(null);
		p.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
	   	Object src=e.getSource();
	   	if(src==b1)
	   	{
	   		t.append("1");
	   	}
	   	if(src==b2)
	   	{
	   		t.append("2");
	   	}
	   	if(src==b3)
	   	{
	   		t.append("3");
	   	}
	   	if(src==b4)
	   	{
	   		t.append("4");
	   	}
	   	if(src==b5)
	   	{
	   		t.append("5");
	   	}
	   	if(src==b6)
	   	{
	   		t.append("6");
	   	}
	   	
	   	if(src==b7)
	   	{
	   		t.append("7");
	   	}
	   	if(src==b8)
	   	{
	   		t.append("8");
	   	}
	   	if(src==b9)
	   	{
	   		t.append("9");
	   	}
	   	if(src==b0)
	   	{
	   		t.append("0");
	   	}
	   	if(src==bd)
	   	{
	   		t.append(".");
	   	}
	   	if(src==addb)
	   	{
	   		num1=read_num();
	   		addc=1;
	   		t.setText("");
	   	}
	   	if(src==div)
	   	{
	   		num1=read_num();
	   		divc=1;
	   		t.setText("");
	   	}
	   	if(src==sub)
	   	{
	   		num1=read_num();
	   	    subc=1;
	   		t.setText("");
	   	}
	   	if(src==mul)
	   	{
	   		num1=read_num();
	   	    mulc=1;
	   		t.setText("");
	   	}
	   	if(src==submit)
	   	{
	   		num2=read_num();
	   		if(addc>0)
	   		{
	   			result=num1+num2;
	   			t.setText(Double.toString(result));
	   			//addc=0;
	   		}
	   		if(subc>0)
	   		{
	   			result=num1-num2;
	   			t.setText(Double.toString(result));
	   			//subc=0;
	   		}
	   		if(mulc>0)
	   		{
	   			result=num1*num2;
	   			t.setText(Double.toString(result));
	   			//mulc=0;
	   		}
	   		if(divc>0)
	   		{
	   			result=num1/num2;
	   			t.setText(Double.toString(result));
	   			//divc=0;
	   		}
	   	}
	   	if(src==bc)
	   	{
	   		num1=0.0;
	   		num2=0.0;
	   		t.setText("");
	   		addc=0;
	   		subc=0;
	   		mulc=0;
	   		divc=0;
	   	}
	}
	double read_num()
	{
		String s;
		s=t.getText();
		double num;
		num=Double.valueOf(s);
		return num;
	}
	public static void main(String args[])
	{
		Calculator c=new Calculator();
	}
}
 