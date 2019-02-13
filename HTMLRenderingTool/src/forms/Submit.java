package forms;

import util.Default;

public class Submit extends Input
{
	private String formaction;
	private String formenctype;
	private String formmethod;
	private boolean formnovalidate;
	private String formtarget;
	
	public Submit()
	{
		setType("submit");
		try
		{
			properties.put("formaction", new Object[] {getClass().getMethod("setFormAction", String.class), new Default(), null});
			properties.put("formenctype", new Object[] {getClass().getMethod("setFormEncType", String.class), new Default(), null});
			properties.put("formmethod", new Object[] {getClass().getMethod("setFormMethod", String.class), new Default(), null});
			properties.put("formtarget", new Object[] {getClass().getMethod("setFormTarget", String.class), new Default(), null});
			properties.put("formnovalidate", new Object[] {getClass().getMethod("setFormNoValidate", boolean.class), true, false});
		} catch (NoSuchMethodException | SecurityException e)
		{
			e.printStackTrace();
			throw new RuntimeException();
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
}
