package html;

import java.util.Map;
import java.util.TreeMap;

/**
 * This class represents a body element with extra functionality.
 * @author colli
 *
 */
public class Body extends CompoundElement
{
	/**
	 * Constructor. Creates a Body with no attributes.
	 */
	public Body()
	{
		this(null);
	}
	
	/**
	 * Constructor. Creates a Body with the given attributes.
	 * @param attributes key-value attributes
	 */
	public Body(Map<String, String> attributes)
	{
		super("head", attributes);
	}
	
	/**
	 * Adds a script tag into the bottom of the body with the given source.
	 * @param src the source path of the script
	 */
	public void addScript(String src)
	{
		Map<String, String> attributes = new TreeMap<String, String>();
		attributes.put("src", src);
		addEndElement(new Element("script", attributes));
	}
}
