package day20;

import java.applet.Applet;
import java.awt.Graphics;

public class Applet1 extends Applet
{
	

	StringBuffer buffer;
	public void init()
	{
		buffer= new StringBuffer();
		 Item("initializing... ");//it passing the string to Item method..
	}
	
	public void start()
	{
		Item("Starting....");
	}
	public void stop()
	{
		Item("Stop....");
	}
	public void destroy()
	{
		Item("Prepare");
	}
	private void Item(String newWorld)
	{
		System.out.println(newWorld);
		buffer.append(newWorld);// it is used to join two methods
        
		
	}
	public void paint(Graphics g)// it is use to provide graphical representation to applet
	{
		g.drawRect(0, 0, getWidth()-5, getHeight()-5);
		g.drawString(buffer.toString(), 50, 50);
	}
}
