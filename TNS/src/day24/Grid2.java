package day24;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Event;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Grid2 extends Applet{
	Panel1 p1;
	Panel2 p2;
	
	public void init()
	{
		setLayout(new GridLayout(1,2));
		add(p1=new Panel1());
		add(p2=new Panel2());
		p1.c1.setState(true);
		p1.c2.setState(true);
		p1.c3.setState(true);
		p2.t.setText("300");
		p2.t.setEditable(false);
	}
	public boolean action(Event e, Object o)
	{
		if(p1.c1.getState())
		{
			p2.c1.setState(true);
			p2.c2.setState(false);
			p2.c3.setState(true);
			p2.t.setText("3000");
		}
		if(p1.c2.getState())
		{
			p2.c1.setState(false);
			p2.c2.setState(true);
			p2.c3.setState(true);
			p2.t.setText("5000");
			
		}
		if(p1.c3.getState())
		{
			p2.c1.setState(true);
			p2.c2.setState(true);
			p2.c3.setState(true);
			p2.t.setText("7000");
		}
		return true;
	}

}
class Panel1 extends Panel
{
	Checkbox c1,c2,c3;
	CheckboxGroup g1;
	public Panel1() {
		g1 = new CheckboxGroup();// without this statement there is not any error shows but in runtime error was shown...
		setLayout(new GridLayout(3,1));
		add(c1 = new Checkbox("Tour1", g1 , true ));
		add(c2 = new Checkbox("Tour2", g1 , true ));
		add(c3 = new Checkbox("Tour3", g1 , false ));
	}
}
class Panel2 extends Panel
{
	Checkbox c1,c2,c3;
	TextField t;
	public Panel2()
	{
		setLayout(new GridLayout(4,1));
		add(c1=new Checkbox("Manali"));
		add(c2=new Checkbox("shimala"));
		add(c3=new Checkbox("Dalhousie"));
		add(t=new TextField(20));
	}
	
}
