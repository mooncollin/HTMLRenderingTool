package html;

import java.util.Map;
import java.util.TreeMap;

/**
 * This class represents a head element with extra functionality.
 * @author colli
 *
 */
public class Head extends CompoundElement
{
	/**
	 * An element representing a title tag.
	 */
	private Element title; 
	
	/**
	 * Constructor. Creates a Head with no attributes.
	 */
	public Head()
	{
		this(null);
	}
	
	/**
	 * Gets the title element.
	 * @return title element
	 */
	public Element getTitle()
	{
		return title;
	}
	
	/**
	 * Constructor. Creates a Head with the given attributes.
	 * @param attributes key-value attributes
	 */
	public Head(Map<String, String> attributes)
	{
		super("head", attributes);
		title = new Element("title");
		addElement(title);
	}
	
	/**
	 * Adds a script tag into the head with the given source.
	 * @param src the source path of the script
	 */
	public void addScript(String src)
	{
		Map<String, String> attributes = new TreeMap<String, String>();
		attributes.put("src", src);
		addElement(new Element("script", attributes));
	}
	
	/**
	 * Adds a stylesheet into the head with the given source.
	 * @param sheet the source path of the stylesheet
	 */
	public void addStylesheet(String sheet)
	{
		Map<String, String> attributes = new TreeMap<String, String>();
		attributes.put("rel", "stylesheet");
		attributes.put("typ", "text/css");
		attributes.put("href", sheet);
		addElement(new Element("link", attributes));
	}
}
