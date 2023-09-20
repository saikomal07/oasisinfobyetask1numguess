import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
class numguess extends Frame implements ActionListener
{
	Label l1,l2,l3,l4,l6,l7;
	TextField t1,t2;
	Button b1;
	String s,f;
	int n,sr=100;
	Random r=new Random();
	int num=r.nextInt(100);
	boolean flag=true;
	int c=1,k;
	numguess()
	{
		l1=new Label("Attempts:");
		l1.setBounds(50,100,100,20);

		l2=new Label("Score:");
		l2.setBounds(350,100,100,20);
		l7=new Label();
		l7.setBounds(450,100,50,20);

		l3=new Label("enter number betwen 1-100:");
		l3.setBounds(150,200,350,50);

		l4=new Label();
		l4.setBounds(150,100,30,30);

		l6=new Label();
		l6.setBounds(150,150,150,50);

		t1=new TextField("enter here");
		t1.setBounds(150,250,100,30);

		b1=new Button("submit");
		b1.setBounds(200,300,100,30);

		t2=new TextField("");
		t2.setBounds(200,310,100,50);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l7);
		add(l6);
		add(t1);
		add(b1);
		add(t2);
		b1.addActionListener(this);
		setVisible(true);
		setLayout(null);
		setSize(500,500);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e){
				dispose();
		}});
	}
	public void actionPerformed(ActionEvent e){
		s=t1.getText();
		n=Integer.parseInt(s);
		System.out.println(c);
		l7.setText(String.valueOf(sr));		
			if(n==num)
			{
				l6.setText("success");
				k=10-c;
				f=String.valueOf(k*10);
				f="Score "+f;
				t1.setText(f);
				l4.setText(String.valueOf(c));
				sr=sr-10;
				l7.setText(String.valueOf(sr));
			}
			else if(n>num)
			{
				l6.setText("too high");
				sr=sr-10;
				l7.setText(String.valueOf(sr));
				l4.setText(String.valueOf(c));
				c++;
			}
			else if(n<num)
			{
				l6.setText("guess high");
				sr=sr-10;
				l7.setText(String.valueOf(sr));
				l4.setText(String.valueOf(c));
				c++;
			}
			if(c>10)
			{
				l6.setText("you failed");
				t1.setText("score: 0");
			}				
	}

}
public class numgus{
	public static void main(String[] args)
	{
		new numguess();
	}
}