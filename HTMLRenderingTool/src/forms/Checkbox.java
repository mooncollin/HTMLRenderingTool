package forms;

/**
 * This class represents a checkbox input.
 * @author colli
 *
 */
public class Checkbox extends Input
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
		try
		{
			properties.put("checked", new Object[] {getClass().getMethod("setChecked", boolean.class), true, false});
		} catch (NoSuchMethodException | SecurityException e)
		{
			e.printStackTrace();
			throw new RuntimeException();
		}
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
}
