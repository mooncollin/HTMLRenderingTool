package forms;

import java.util.ArrayList;
import java.util.List;

import html.CompoundElement;

public class Form extends CompoundElement
{
	private List<Input> inputs;
	
	public Form()
	{
		super("form");
		inputs = new ArrayList<Input>();
	}
	
	public void addInput(Input in)
	{
		if(in == null)
		{
			throw new NullPointerException();
		}
		
		inputs.add(in);
	}
	
	public Input getInput(int index)
	{
		return inputs.get(index);
	}
	
	public List<Input> getInputs()
	{
		return inputs;
	}
}
