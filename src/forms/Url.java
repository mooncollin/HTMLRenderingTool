package forms;

import attributes.Attributes;

/**
 * This class represents a url input.
 * @author colli
 *
 */
public class Url extends Input implements Attributes.MinLength, Attributes.MaxLength, 
	Attributes.Size, Attributes.Pattern, Attributes.PlaceHolder, Attributes.SpellCheck
{	
	/**
	 * Constructor. Creates an input of type "url".
	 */
	public Url()
	{
		setType("url");
	}
}
