package day22;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.Label;
import java.awt.TextField;

public class Applet4 extends Applet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//by clicking warning 
	TextField t1,t2,t3,t4;
	Label l;
	Button b;
	public void init()
	{
		add(t1 = new TextField(10));
		add(l = new Label("+"));
		add(t2 = new TextField(5));
		add(b = new Button("="));
		add(t3 = new TextField(15));
		
		add(t1 = new TextField(10));
		add(l = new Label("-"));
		add(t2 = new TextField(5));
		add(b = new Button("="));
		add(t3 = new TextField(15));
		add(t4 = new TextField(15));
	}
	public boolean action(Event e, Object o)
	{
		String s1 = t1.getText();
		int i = Integer.parseInt(s1);
		String s2 = t2.getText();
		int j = Integer.parseInt(s2);
		int k = i+j;
		//int m =i*j;
		
		//int d = i/j;
		String s3 = String.valueOf(k);
		t3.setText(s3);
		
		String s4 = t1.getText();
		int l = Integer.parseInt(s1);
		String s5 = t2.getText();
		int m = Integer.parseInt(s2);
		int s =i-j;
		String s6 = String.valueOf(s);
		t4.setText(s6);
		return true;
	}
	
	

	}


