package forms;

import attributes.Attributes;

/**
 * This class represents a search input.
 * @author colli
 *
 */
public class Search extends Input implements Attributes.MinLength, Attributes.MaxLength, 
	Attributes.Size, Attributes.Pattern, Attributes.PlaceHolder, Attributes.SpellCheck
{	
	/**
	 * Constructor. Creates an input of type "search".
	 */
	public Search()
	{
		setType("search");
	}
}
