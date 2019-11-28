package forms;

import attributes.Attributes;

/**
 * This class represents a telephone input.
 * @author colli
 *
 */
public class Telephone extends Input implements Attributes.MinLength, 
	Attributes.MaxLength, Attributes.Size, Attributes.Pattern, Attributes.PlaceHolder
{	
	/**
	 * Constructor. Creates an input of type "tel".
	 */
	public Telephone()
	{
		setType("tel");
	}
}
