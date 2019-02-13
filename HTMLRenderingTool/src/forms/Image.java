package forms;

import util.Default;

public class Image extends Input
{
	private String alt;
	private String formaction;
	private String formenctype;
	private String formmethod;
	private boolean formnovalidate;
	private String formtarget;
	private int height;
	private int width;
	private String src;
	
	public Image()
	{
		setType("image");
		try
		{
			properties.put("alt", new Object[] {getClass().getMethod("setAlt", String.class), new Default(), null});
			properties.put("formaction", new Object[] {getClass().getMethod("setFormAction", String.class), new Default(), null});
			properties.put("formenctype", new Object[] {getClass().getMethod("setFormEncType", String.class), new Default(), null});
			properties.put("formmethod", new Object[] {getClass().getMethod("setFormMethod", String.class), new Default(), null});
			properties.put("formtarget", new Object[] {getClass().getMethod("setFormTarget", String.class), new Default(), null});
			properties.put("formnovalidate", new Object[] {getClass().getMethod("setFormNoValidate", boolean.class), true, false});
			properties.put("height", new Object[] {getClass().getMethod("parseHeight", String.class), new Default(), "-1"});
			properties.put("width", new Object[] {getClass().getMethod("parseWidth", String.class), new Default(), "-1"});
			properties.put("src", new Object[] {getClass().getMethod("setSrc", String.class), new Default(), null});
		} catch (NoSuchMethodException | SecurityException e)
		{
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public String getSrc()
	{
		return src;
	}
	
	public void setSrc(String src)
	{
		this.src = src;
		if(this.src == null)
		{
			_removeAttribute("src");
		}
		else
		{
			_setAttribute("src", this.src);
		}
	}
	
	public void setWidth(int width)
	{
		this.width = width < 0 ? -1 : width;
		if(this.width < 0)
		{
			_removeAttribute("width");
		}
		else
		{
			_setAttribute("width", String.valueOf(this.width));
		}
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void setHeight(int height)
	{
		this.height = height < 0 ? -1 : height;
		if(this.height < 0)
		{
			_removeAttribute("height");
		}
		else
		{
			_setAttribute("height", String.valueOf(this.height));
		}
	}
	
	public String getFormTarget()
	{
		return formtarget;
	}
	
	public void setFormTarget(String formTarget)
	{
		this.formtarget = formTarget;
		if(this.formtarget == null)
		{
			_removeAttribute("formtarget");
		}
		else
		{
			_setAttribute("formtarget", this.formtarget);
		}
	}
	
	public boolean getFormNoValidate()
	{
		return formnovalidate;
	}
	
	public void setFormNoValidate(boolean validate)
	{
		this.formnovalidate = validate;
		if(this.formnovalidate)
		{
			_setAttribute("formnovalidate", "");
		}
		else
		{
			_removeAttribute("formnovalidate");
		}
	}
	
	public String getFormMethod()
	{
		return formmethod;
	}
	
	public void setFormMethod(String formMethod)
	{
		this.formmethod = formMethod;
		if(this.formmethod == null)
		{
			_removeAttribute("formmethod");
		}
		else
		{
			_setAttribute("formmethod", this.formmethod);
		}
	}
	
	public String getFormEncType()
	{
		return formenctype;
	}
	
	public void setFormEncType(String formEnc)
	{
		this.formenctype = formEnc;
		if(this.formenctype == null)
		{
			_removeAttribute("formenctype");
		}
		else
		{
			_setAttribute("formenctype", this.formenctype);
		}
	}
	
	public String getFormAction()
	{
		return formaction;
	}
	
	public void setFormAction(String formAction)
	{
		this.formaction = formAction;
		if(this.formaction == null)
		{
			_removeAttribute("formaction");
		}
		else
		{
			_setAttribute("formaction", this.formaction);
		}
	}
	
	public String getAlt()
	{
		return alt;
	}
	
	public void setAlt(String alt)
	{
		this.alt = alt;
		if(this.alt == null)
		{
			_removeAttribute("alt");
		}
		else
		{
			_setAttribute("alt", this.alt);
		}
	}
	
	public void parseHeight(String height)
	{
		setHeight(height == null ? -1 : Integer.parseInt(height));
	}
	
	public void parseWidth(String width)
	{
		setWidth(width == null ? -1 : Integer.parseInt(width));
	}
}
