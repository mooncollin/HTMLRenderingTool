package forms;

import attributes.Attributes;
/**
 * This class represents a checkbox input.
 * @author colli
 *
 */
public class Checkbox extends Input implements Attributes.Checked
{	
	/**
	 * Constructor. Creates an input of type "checkbox".
	 */
	public Checkbox()
	{
		setType("checkbox");
	}
}
