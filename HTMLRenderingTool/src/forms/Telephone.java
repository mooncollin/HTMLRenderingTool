package forms;

import util.Default;

public class Telephone extends Input
{
	private int minLength;
	private int maxLength;
	private int size;
	private String pattern;
	private String placeholder;
	
	public Telephone()
	{
		setType("tel");
		try
		{
			properties.put("minlength", new Object[] {getClass().getMethod("parseMinLength", String.class), new Default(), "-1"});
			properties.put("maxlength", new Object[] {getClass().getMethod("parseMaxLength", String.class), new Default(), "-1"});
			properties.put("size", new Object[] {getClass().getMethod("parseSize", String.class), new Default(), "-1"});
			properties.put("pattern", new Object[] {getClass().getMethod("setPattern", String.class), new Default(), null});
			properties.put("placeholder", new Object[] {getClass().getMethod("setPlaceholder", String.class), new Default(), null});
		} catch (NoSuchMethodException | SecurityException e)
		{
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public String getPlaceholder()
	{
		return placeholder;
	}
	
	public void setPlaceholder(String p)
	{
		this.placeholder = p;
		if(this.placeholder == null)
		{
			_removeAttribute("placeholder");
		}
		else
		{
			_setAttribute("placeholder", p);
		}
	}
	
	public String getPattern()
	{
		return pattern;
	}
	
	public void setPattern(String p)
	{
		this.pattern = p;
		if(this.pattern == null)
		{
			_removeAttribute("pattern");
		}
		else
		{
			_setAttribute("pattern", p);
		}
	}
	
	public int getSize()
	{
		return size;
	}
	
	public void setSize(int i)
	{
		this.size = i < 0 ? -1 : i;
		if(this.size < 0)
		{
			_removeAttribute("size");
		}
		else
		{
			_setAttribute("size", String.valueOf(this.size));
		}
	}

	public int getMaxLength()
	{
		return maxLength;
	}
	
	public void setMaxLength(int l)
	{
		this.maxLength = l;
		if(this.maxLength < 0)
		{
			this.maxLength = -1;
			_removeAttribute("maxlength");
		}
		else
		{
			_setAttribute("maxlength", String.valueOf(this.maxLength));
		}
	}
	
	public int getMinLength()
	{
		return minLength;
	}
	
	public void setMinLength(int l)
	{
		this.minLength = l;
		if(this.minLength < 0)
		{
			this.minLength = -1;
			_removeAttribute("minlength");	
		}
		else
		{
			_setAttribute("minlength", String.valueOf(this.minLength));
		}
	}
	
	public void parseSize(String size)
	{		
		setSize(size == null ? -1 : Integer.parseInt(size));
	}
	
	public void parseMaxLength(String maxLength)
	{
		setMaxLength(maxLength == null ? -1 : Integer.parseInt(maxLength));
	}
	
	public void parseMinLength(String minLength)
	{
		setMinLength(minLength == null ? -1 : Integer.parseInt(minLength));
	}
}
