package com.app;
import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;



public class Applet2 extends Applet {
	Button b;
	TextField h;
	
	public void init ()
	{
		b= new Button("Submit");
		h= new TextField("Chetan");
		h.setBounds(50, 10, 20, 30);    
		add(b);
		add(h);
	}
	
}
