package forms;

import attributes.Attributes;

/**
 * This class represents an image input.
 * @author colli
 *
 */
public class Image extends Input implements Attributes.Alt, Attributes.FormAction, Attributes.FormTarget, Attributes.FormEnctype, Attributes.FormMethod, Attributes.FormNoValidate, Attributes.Height, Attributes.Width, Attributes.Src 
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
		var alt = Attributes.alt(this);
		var formaction = Attributes.formaction(this);
		var formenctype = Attributes.formenctype(this);
		var formmethod = Attributes.formmethod(this);
		var formnovalidate = Attributes.formnovalidate(this);
		var formtarget = Attributes.formtarget(this);
		var height = Attributes.height(this);
		var width = Attributes.width(this);
		var src = Attributes.src(this);
		properties.put(alt.getKey(), alt.getValue());
		properties.put(formaction.getKey(), formaction.getValue());
		properties.put(formmethod.getKey(), formmethod.getValue());
		properties.put(formenctype.getKey(), formenctype.getValue());
		properties.put(formnovalidate.getKey(), formnovalidate.getValue());
		properties.put(formtarget.getKey(), formtarget.getValue());
		properties.put(height.getKey(), height.getValue());
		properties.put(width.getKey(), width.getValue());
		properties.put(src.getKey(), src.getValue());
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
	
	public int getWidth()
	{
		return width;
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
	public String getFormEnctype()
	{
		return formenctype;
	}
	
	/**
	 * Sets the formenctype attribute. Null to remove. 
	 * @param formEnc formenctype value
	 */
	public void setFormEnctype(String formEnc)
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
}
