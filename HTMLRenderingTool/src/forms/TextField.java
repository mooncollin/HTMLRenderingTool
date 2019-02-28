package forms;

import util.Default;

/**
 * This class represents a text input.
 * @author colli
 *
 */
public class TextField extends Input
{
	/**
	 * Text attribute.
	 */
	private String text;
	
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
		try
		{
			properties.put("minlength", new Object[] {getClass().getMethod("parseMinLength", String.class), new Default(), "-1"});
			properties.put("maxlength", new Object[] {getClass().getMethod("parseMaxLength", String.class), new Default(), "-1"});
			properties.put("size", new Object[] {getClass().getMethod("parseSize", String.class), new Default(), "-1"});
			properties.put("pattern", new Object[] {getClass().getMethod("setPattern", String.class), new Default(), null});
			properties.put("placeholder", new Object[] {getClass().getMethod("setPlaceholder", String.class), new Default(), null});
			properties.put("spellcheck", new Object[] {getClass().getMethod("setSpellcheck", String.class), new Default(), null});
		} catch (NoSuchMethodException | SecurityException e)
		{
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	/**
	 * Gets the spellcheck attribute.
	 * @return spellcheck value
	 */
	public String getSpellcheck()
	{
		return spellcheck;
	}
	
	/**
	 * Sets the spellcheck attribute. Null to remove.
	 * @param s spellcheck value
	 */
	public void setSpellcheck(String s)
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
	public String getPlaceholder()
	{
		return placeholder;
	}
	
	/**
	 * Sets the placeholder attribute. Null to remove.
	 * @param p placeholder value
	 */
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
	 * Gets the text attribute.
	 * @return text value
	 */
	public String getText()
	{
		return text;
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
	
	/**
	 * Parses the given string as a number and sets the size
	 * attribute.
	 * @param size number as a string
	 */
	public void parseSize(String size)
	{		
		setSize(size == null ? -1 : Integer.parseInt(size));
	}
	
	/**
	 * Parses the given string as a number and sets the maxlength
	 * attribute.
	 * @param maxLength number as a string
	 */
	public void parseMaxLength(String maxLength)
	{
		setMaxLength(maxLength == null ? -1 : Integer.parseInt(maxLength));
	}
	
	/**
	 * Parses the given string as a number and sets the minlength
	 * attribute.
	 * @param minLength number as a string
	 */
	public void parseMinLength(String minLength)
	{
		setMinLength(minLength == null ? -1 : Integer.parseInt(minLength));
	}
}
