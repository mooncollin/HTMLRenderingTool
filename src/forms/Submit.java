package forms;

import attributes.Attributes;

/**
 * This class represents a submit input.
 * @author colli
 *
 */
public class Submit extends Input implements Attributes.FormAction, 
	Attributes.FormEnctype, Attributes.FormMethod, Attributes.FormTarget,
	Attributes.FormNoValidate
{	
	/**
	 * Constructor. Creates an input of type "submit".
	 */
	public Submit()
	{
		setType("submit");
	}
}
