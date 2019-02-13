package forms;

import util.Default;

public class Radio extends Input
{
	private boolean checked;
	private String autocomplete;
	
	public Radio()
	{
		setType("radio");
		try
		{
			properties.put("checked", new Object[] {getClass().getMethod("setChecked", boolean.class), true, false});
			properties.put("autocomplete", new Object[] {getClass().getMethod("setAutocomplete", String.class), new Default(), null});
		} catch (NoSuchMethodException | SecurityException e)
		{
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
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
	
	public boolean getChecked()
	{
		return checked;
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
