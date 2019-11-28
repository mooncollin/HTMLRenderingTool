package forms;

import attributes.Attributes;

/**
 * This class represents a time input.
 * @author colli
 *
 */
public class Time extends Input implements Attributes.Max, Attributes.Min, Attributes.Step
{	
	/**
	 * Constructor. Creates an input of type "time".
	 */
	public Time()
	{
		setType("time");
	}
}
