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
	 * Checked attribute.
	 */
	private boolean checked;
	
	/**
	 * Autocomplete attribute.
	 */
	private String autocomplete;
	
	/**
	 * Constructor. Creates an input of type "radio".
	 */
	public Radio()
	{
		setType("radio");
	}
	
	/**
	 * Sets autocomplete attribute. Null to remove.
	 * @param a autcomplete value
	 */
	public void setAutocomplete(String a)
	{
		this.autocomplete = a;
		if(this.autocomplete == null)
		{
			_removeAttribute("autocomplete");
		}
		else
		{
			_setAttribute("autocomplete", this.autocomplete);
		}
	}
	
	/**
	 * Gets the checked attribute.
	 * @return checked value
	 */
	public boolean getChecked()
	{
		return checked;
	}
	
	/**
	 * Sets the checked attribute.
	 * @param c checked value
	 */
	public void setChecked(boolean c)
	{
		this.checked = c;
		if(this.checked)
		{
			_setAttribute("checked", "");
		}
		else
		{
			_removeAttribute("checked");
		}
	}
}
