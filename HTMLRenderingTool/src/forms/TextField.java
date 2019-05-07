package forms;

import attributes.Attributes;

/**
 * This class represents a text input.
 * @author colli
 *
 */
public class TextField extends Input implements Attributes.MinLength, Attributes.MaxLength, Attributes.Size, Attributes.Pattern, Attributes.PlaceHolder, Attributes.SpellCheck
{	
	/**
	 * Minlength attribute.
	 */
	private int minLength;
	
	/**
	 * Maxlength attribute.
	 */
	private int maxLength;
	
	/**
	 * Size attribute.
	 */
	private int size;
	
	/**
	 * Pattern attribute.
	 */
	private String pattern;
	
	/**
	 * Placeholder attribute.
	 */
	private String placeholder;
	
	/**
	 * Spellcheck attribute.
	 */
	private String spellcheck;
	
	/**
	 * Constructor. Creates an input of type "text".
	 */
	public TextField()
	{
		setType("text");
	}
	
	/**
	 * Gets the spellcheck attribute.
	 * @return spellcheck value
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
	 * Gets placeholder attribute.
	 * @return placeholder value
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
	 * @param p pattern value
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
	 * Sets the size attribute. < 0 to remove.
	 * @param i size value
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
	 * Gets the maxlength attribute.
	 * @return maxlength value
	 */
	public int getMaxLength()
	{
		return maxLength;
	}
	
	/**
	 * Sets the maxlength attribute. < 0 to remove.
	 * @param l maxlength value
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
	 * Gets the minlength attribute.
	 * @return minlength value
	 */
	public int getMinLength()
	{
		return minLength;
	}
	
	/**
	 * Sets the minlength attribute. < 0 to remove.
	 * @param l minlength value
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
