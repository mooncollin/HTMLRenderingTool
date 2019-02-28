package forms;

import util.Default;

/**
 * This class represents an image input.
 * @author colli
 *
 */
public class Image extends Input
{
	/**
	 * Alternative text attribute.
	 */
	private String alt;
	
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
	 * Height attribute.
	 */
	private int height;
	
	/**
	 * Width attribute.
	 */
	private int width;
	
	/**
	 * Src attribute.
	 */
	private String src;
	
	/**
	 * Constructor. Creates an input of type "image".
	 */
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
	
	/**
	 * Gets the src attribute.
	 * @return src value
	 */
	public String getSrc()
	{
		return src;
	}
	
	/**
	 * Sets the src attribute. Null to remove.
	 * @param src src value
	 */
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
	
	/**
	 * Sets the width attribute. < 0 to remove.
	 * @param width width value
	 */
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
	
	/**
	 * Gets the height attribute.
	 * @return height value
	 */
	public int getHeight()
	{
		return height;
	}
	
	/**
	 * Sets the height attribute. < 0 to remove.
	 * @param height height value
	 */
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
	 * Gets the formnovalidate attribute.
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
	 * Gest the formenctype attribute.
	 * @return formenctype value
	 */
	public String getFormEncType()
	{
		return formenctype;
	}
	
	/**
	 * Sets the formenctype attribute. Null to remove. 
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
	
	/**
	 * Gets the alt attribute.
	 * @return alt value
	 */
	public String getAlt()
	{
		return alt;
	}
	
	/**
	 * Sets the alt attribute. Null to remove.
	 * @param alt alt value
	 */
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
	
	/**
	 * Parses the given string as a number and sets the height
	 * attribute.
	 * @param height number as a string
	 */
	public void parseHeight(String height)
	{
		setHeight(height == null ? -1 : Integer.parseInt(height));
	}
	
	/**
	 * Parses the given string as a number and sets the width
	 * attribute.
	 * @param width number as a string
	 */
	public void parseWidth(String width)
	{
		setWidth(width == null ? -1 : Integer.parseInt(width));
	}
}
