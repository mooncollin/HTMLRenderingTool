package forms;

import attributes.Attributes;

/**
 * This class represents a range input.
 * @author colli
 *
 */
public class Range extends Input implements Attributes.Max, Attributes.Min, 
	Attributes.Step
{	
	/**
	 * Constructor. Creates an input of type "range".
	 */
	public Range()
	{
		setType("range");
	}
}
