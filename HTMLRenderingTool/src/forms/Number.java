package forms;

import attributes.Attributes;

/**
 * This class represents a number input.
 * @author colli
 *
 */
public class Number extends Input implements Attributes.Max, Attributes.Min, 
	Attributes.PlaceHolder, Attributes.Step
{	
	/**
	 * Constructor. Creates an input of type "number".
	 */
	public Number()
	{
		setType("number");
	}
}
