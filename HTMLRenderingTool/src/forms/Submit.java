package forms;

import util.Default;

/**
 * This class represents a submit input.
 * @author colli
 *
 */
public class Submit extends Input
{
	/**
	 * Formaction attribute.
	 */
	private String formaction;
	
	/**
	 * Formenctype attribute.
	 */
	private String formenctype;
	
	/**
	 * Formmethod attribute.
	 */
	private String formmethod;
	
	/**
	 * Formnovalidate attribute.
	 */
	private boolean formnovalidate;
	
	/**
	 * Formtarget attribute.
	 */
	private String formtarget;
	
	/**
	 * Constructor. Creates an input of type "submit".
	 */
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
	
	/**
	 * Gets the formtarget attribute.
	 * @return formtarget value
	 */
	public String getFormTarget()
	{
		return formtarget;
	}
	
	/**
	 * Sets the formtarget attribute. Null to remove.
	 * @param formTarget formtarget value
	 */
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
	
	/**
	 * Sets the formnovalidate attribute.
	 * @return formnovalidate value
	 */
	public boolean getFormNoValidate()
	{
		return formnovalidate;
	}
	
	/**
	 * Sets the formnovalidate attribute.
	 * @param validate formnovalidate value
	 */
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
	
	/**
	 * Gets the formmethod attribute.
	 * @return formmethod value
	 */
	public String getFormMethod()
	{
		return formmethod;
	}
	
	/**
	 * Sets the formmethod attribute. Null to remove.
	 * @param formMethod formmethod value
	 */
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
	
	/**
	 * Gets formenctype attribute.
	 * @return formenctype value
	 */
	public String getFormEncType()
	{
		return formenctype;
	}
	
	/**
	 * Sets formenctype attribute. Null to remove.
	 * @param formEnc formenctype value
	 */
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
	
	/**
	 * Gets the formaction attribute.
	 * @return formaction value
	 */
	public String getFormAction()
	{
		return formaction;
	}
	
	/**
	 * Sets the formaction attribute. Null to remove.
	 * @param formAction formaction value
	 */
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
