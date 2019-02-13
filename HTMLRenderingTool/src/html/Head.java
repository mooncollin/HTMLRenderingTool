package html;

import java.util.Map;
import java.util.TreeMap;

public class Head extends CompoundElement
{
	private Element title; 
	
	public Head()
	{
		this(null);
	}
	
	public Element getTitle()
	{
		return title;
	}
	
	public Head(Map<String, String> attributes)
	{
		super("head", attributes);
		title = new Element("title");
		addElement(title);
	}
	
	public void addScript(String src)
	{
		Map<String, String> attributes = new TreeMap<String, String>();
		attributes.put("src", src);
		addElement(new Element("script", attributes));
	}
	
	public void addStylesheet(String sheet)
	{
		Map<String, String> attributes = new TreeMap<String, String>();
		attributes.put("rel", "stylesheet");
		attributes.put("typ", "text/css");
		attributes.put("href", sheet);
		addElement(new Element("link", attributes));
	}
}
