package forms;

import attributes.Attributes;

/**
 * This class represents a password input.
 * @author colli
 *
 */
public class Password extends Input implements Attributes.MinLength, 
	Attributes.MaxLength, Attributes.Size, Attributes.Pattern, Attributes.PlaceHolder 
{	
	/**
	 * Constructor. Creates an input of type "password".
	 */
	public Password()
	{
		setType("password");
	}
}
