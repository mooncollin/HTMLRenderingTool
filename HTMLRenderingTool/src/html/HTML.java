package html;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * A class containing static methods for constructing html tags as strings.
 * @author colli
 *
 */
public class HTML
{
	/**
	 * A constant list of self closing html tags.
	 */
	public static final List<String> SELF_CLOSING_TAGS;
	
	static
	{
		SELF_CLOSING_TAGS = new ArrayList<String>(14);
		SELF_CLOSING_TAGS.add("area");
		SELF_CLOSING_TAGS.add("base");
		SELF_CLOSING_TAGS.add("br");
		SELF_CLOSING_TAGS.add("col");
		SELF_CLOSING_TAGS.add("embed");
		SELF_CLOSING_TAGS.add("hr");
		SELF_CLOSING_TAGS.add("img");
		SELF_CLOSING_TAGS.add("input");
		SELF_CLOSING_TAGS.add("link");
		SELF_CLOSING_TAGS.add("meta");
		SELF_CLOSING_TAGS.add("param");
		SELF_CLOSING_TAGS.add("source");
		SELF_CLOSING_TAGS.add("track");
		SELF_CLOSING_TAGS.add("wbr");
	}
	
	/**
	 * Constructor. Creates a tag with the given
	 * parameter with no data and no attributes.
	 * @param tag a tag label
	 * @return a string representation of the opening html tag
	 */
	public static String tag(String tag)
	{
		return tag(tag, null, null);
	}
	
	/**
	 * Constructor. Creates a tag with the given parameters with
	 * data no attributes.
	 * @param tag a tag label
	 * @param data information to be included inside the tag
	 * @return a string representation of the opening html tag
	 */
	public static String tag(String tag, String data)
	{
		return tag(tag, data, null);
	}
	
	/**
	 * Constructor. Creates a tag with the given parameters with no data and
	 * attributes.
	 * @param tag a tag label
	 * @param attributes key-value attribute information
	 * @return a string representation of the opening html tag
	 */
	public static String tag(String tag, Map<String, String> attributes)
	{
		return tag(tag, null, attributes);
	}
	
	/**
	 * Constructor. Creates a tag with the given parameters with data and attributes.
	 * @param tag a tag label
	 * @param data information to be included inside the tag
	 * @param attributes key-value attribute information
	 * @return a string representation of the opening html tag
	 */
	public static String tag(String tag, String data, Map<String, String> attributes)
	{
		String tagCreation = "";
		if(!tag.isEmpty())
		{
			tagCreation = "<" + tag;
		}
		if(attributes != null)
		{
			if(!attributes.isEmpty())
			{
				tagCreation += " ";
			}
			
			Iterator<String> it = attributes.keySet().iterator();
			
			while(it.hasNext())
			{
				String key = it.next();
				tagCreation += key + "=\"" + attributes.get(key) + "\"";
				if(it.hasNext())
				{
					tagCreation += " ";
				}
			}
		}
		
		if(SELF_CLOSING_TAGS.contains(tag))
		{
			tagCreation += "/>";
		}
		else
		{
			if(!tag.isEmpty())
			{
				tagCreation += ">";
			}
			if(data != null)
			{
				tagCreation += data;
			}
		}
		
		return tagCreation;
	}
	
	/**
	 * Creates the appropriate end tag for the given tag.
	 * @param tag a tag label
	 * @return the appropriate ending tag, or blank if it is
	 * a self closing tag
	 */
	public static String endTag(String tag)
	{
		if(SELF_CLOSING_TAGS.contains(tag) || tag.isEmpty())
		{
			return "";
		}
		
		return "</" + tag + ">";
	}
	
	/**
	 * Creates a link tag with the given stylesheet source.
	 * @param sheet the stylesheet href value
	 * @return a string representation of a link tag with the href source
	 * included
	 */
	public static String stylesheet(String sheet)
	{
		Map<String, String> attributes = new TreeMap<String, String>();
		attributes.put("rel", "stylesheet");
		attributes.put("type", "text/css");
		attributes.put("href", sheet);
		return tag("link", attributes);
	}
	
	/**
	 * Creates a script tag with the given script source.
	 * @param src the script src value
	 * @return a string representation of a src tag with the source included
	 */
	public static String script(String src)
	{
		Map<String, String> attributes = new TreeMap<String, String>();
		attributes.put("src", src);
		return tag("script", attributes) + endTag("script");
	}
}
