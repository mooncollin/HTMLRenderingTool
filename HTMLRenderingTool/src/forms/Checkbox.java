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
	 * Whether this checkbox is currently checked.
	 */
	private boolean checked;
	
	/**
	 * Constructor. Creates an input of type "checkbox".
	 */
	public Checkbox()
	{
		setType("checkbox");
		var checked = Attributes.checked(this);
		properties.put(checked.getKey(), checked.getValue());
	}
	
	/**
	 * Sets the checked status of this checkbox.
	 * @param c true to have this checkbox be checked, false otherwise
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
	
	public boolean getChecked()
	{
		return checked;
	}
}
