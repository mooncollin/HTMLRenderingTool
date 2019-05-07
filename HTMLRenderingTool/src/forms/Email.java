package forms;

import attributes.Attributes;

/**
 * This class represents an email input.
 * @author colli
 *
 */
public class Email extends Input implements Attributes.Multiple, Attributes.MinLength, Attributes.MaxLength, Attributes.Size, Attributes.Pattern, Attributes.PlaceHolder, Attributes.SpellCheck
{
	/**
	 * Allows for multiple values.
	 */
	private boolean multiple;
	
	/**
	 * The minimum length of this input.
	 */
	private int minLength;
	
	/**
	 * THe maxmimum length of this input.
	 */
	private int maxLength;
	
	/**
	 * The size of this input.
	 */
	private int size;
	
	/**
	 * The regex pattern of this input.
	 */
	private String pattern;
	
	/**
	 * A placeholder for this input.
	 */
	private String placeholder;
	
	/**
	 * A spellcheck for this input.
	 */
	private String spellcheck;
	
	/**
	 * Constructor. Creates an input of type "email".
	 */
	public Email()
	{
		setType("email");
	}
	
	/**
	 * Gets the multiple attribute.
	 * @return true if multiple inputs are allowed, false otherwise
	 */
	public boolean getMultiple()
	{
		return multiple;
	}
	
	/**
	 * Sets the multiple attribute.
	 * @param m true if multiple inputs are allowed, false otherwise
	 */
	public void setMultiple(boolean m)
	{
		this.multiple = m;
		if(this.multiple)
		{
			_setAttribute("multiple", "");
		}
		else
		{
			_removeAttribute("multiple");
		}
	}
	
	/**
	 * Gets the spellcheck attribute.
	 * @return spellcheck attribute
	 */
	public String getSpellCheck()
	{
		return spellcheck;
	}
	
	/**
	 * Sets the spellcheck attribute. Null to remove.
	 * @param s spellcheck value
	 */
	public void setSpellCheck(String s)
	{
		this.spellcheck = s;
		if(this.spellcheck == null)
		{
			_removeAttribute("spellcheck");
		}
		else
		{
			_setAttribute("spellcheck", s);
		}
	}
	
	/**
	 * Gets the placeholder attribute.
	 * @return
	 */
	public String getPlaceHolder()
	{
		return placeholder;
	}
	
	/**
	 * Sets the placeholder attribute. Null to remove.
	 * @param p placeholder value
	 */
	public void setPlaceHolder(String p)
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
	
	/**
	 * Gets the pattern attribute.
	 * @return pattern value
	 */
	public String getPattern()
	{
		return pattern;
	}
	
	/**
	 * Sets the pattern attribute. Null to remove.
	 * @param p patter value
	 */
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
	
	/**
	 * Gets the size attribute.
	 * @return size value
	 */
	public int getSize()
	{
		return size;
	}
	
	/**
	 * Sets the size attribute.
	 * @param i size value. < 0 to remove.
	 */
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
	
	/**
	 * Gets the max length attribute.
	 * @return max length value
	 */
	public int getMaxLength()
	{
		return maxLength;
	}
	
	/**
	 * Sets the max length attribute.
	 * @param l max length value. < 0 to remove.
	 */
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
	
	/**
	 * Gets the min length attribute.
	 * @return min length value
	 */
	public int getMinLength()
	{
		return minLength;
	}
	
	/**
	 * Sets the min length attribute.
	 * @param l min length value. < 0 to remove.
	 */
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
}
