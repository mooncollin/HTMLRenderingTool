package forms;

import attributes.Attributes;

/**
 * This class represents a month input.
 * @author colli
 *
 */
public class Month extends Input implements Attributes.Max, Attributes.Min, 
	Attributes.Step
{	
	/**
	 * Constructor. Creates an input of type "month".
	 */
	public Month()
	{
		setType("month");
	}
}
