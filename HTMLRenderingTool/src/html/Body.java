package html;

import java.util.Map;
import java.util.TreeMap;

public class Body extends CompoundElement
{
	public Body()
	{
		this(null);
	}
	
	public Body(Map<String, String> attributes)
	{
		super("head", attributes);
	}
	
	public void addScript(String src)
	{
		Map<String, String> attributes = new TreeMap<String, String>();
		attributes.put("src", src);
		getEndElements().add(new Element("script", attributes));
	}
}
