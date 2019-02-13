package forms;

public class Checkbox extends Input
{
	private boolean checked;
	
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
