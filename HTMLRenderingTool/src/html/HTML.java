package html;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HTML
{
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
	
	public static String tag(String tag)
	{
		return tag(tag, null, null);
	}
	
	public static String tag(String tag, String data)
	{
		return tag(tag, data, null);
	}
	
	public static String tag(String tag, Map<String, String> attributes)
	{
		return tag(tag, null, attributes);
	}
	
	public static String tag(String tag, String data, Map<String, String> attributes)
	{
		String tagCreation = "";
		if(!tag.isEmpty())
		{
			tagCreation = "<" + tag + " ";
		}
		if(attributes != null)
		{
			for(String key : attributes.keySet())
			{
				tagCreation += key + "=\"" + attributes.get(key) + "\" ";
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
				tagCreation += "> ";
			}
			if(data != null)
			{
				tagCreation += data;
			}
		}
		
		return tagCreation;
	}
	
	public static String endTag(String tag)
	{
		if(SELF_CLOSING_TAGS.contains(tag) || tag.isEmpty())
		{
			return "";
		}
		
		return "</" + tag + ">";
	}
	
	public static String stylesheet(String sheet)
	{
		Map<String, String> attributes = new TreeMap<String, String>();
		attributes.put("rel", "stylesheet");
		attributes.put("typ", "text/css");
		attributes.put("href", sheet);
		return tag("link", attributes);
	}
	
	public static String script(String src)
	{
		Map<String, String> attributes = new TreeMap<String, String>();
		attributes.put("src", src);
		return tag("script", attributes) + endTag("script");
	}
}
