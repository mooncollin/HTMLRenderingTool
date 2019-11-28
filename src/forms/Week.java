package forms;

import attributes.Attributes;

/**
 * This class represents a week input.
 * @author colli
 *
 */
public class Week extends Input implements Attributes.Max, Attributes.Min, 
	Attributes.Step
{	
	/**
	 * Constructor. Creates an input of type "week".
	 */
	public Week()
	{
		setType("week");
	}
}
