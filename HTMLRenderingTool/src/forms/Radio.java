package forms;

import attributes.Attributes;

/**
 * This class represents a radio input.
 * @author colli
 *
 */
public class Radio extends Input implements Attributes.Checked, Attributes.AutoComplete
{
	/**
	 * Constructor. Creates an input of type "radio".
	 */
	public Radio()
	{
		setType("radio");
	}
}
