package forms;

import attributes.Attributes;

/**
 * This class represents an image input.
 * @author colli
 *
 */
public class Image extends Input implements Attributes.Alt, Attributes.FormAction, 
	Attributes.FormTarget, Attributes.FormEnctype, Attributes.FormMethod, 
	Attributes.FormNoValidate, Attributes.Height, Attributes.Width, Attributes.Src 
{	
	/**
	 * Constructor. Creates an input of type "image".
	 */
	public Image()
	{
		setType("image");
	}
}
