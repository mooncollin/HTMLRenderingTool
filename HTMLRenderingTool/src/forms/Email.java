package forms;

import attributes.Attributes;

/**
 * This class represents an email input.
 * @author colli
 *
 */
public class Email extends Input implements Attributes.Multiple, 
	Attributes.MinLength, Attributes.MaxLength, Attributes.Size, Attributes.Pattern, 
	Attributes.PlaceHolder, Attributes.SpellCheck
{	
	/**
	 * Constructor. Creates an input of type "email".
	 */
	public Email()
	{
		setType("email");
	}
}
