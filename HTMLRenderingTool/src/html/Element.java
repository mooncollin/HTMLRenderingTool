package html;

import java.util.Map;
import java.util.TreeMap;

public class Element
{
	private Map<String, String> attributes;
	private String tag;
	private String data;
	
	public Element(String tag)
	{
		this(tag, null, null);
	}
	
	public Element(String tag, String data)
	{
		this(tag, data, null);
	}
	
	public Element(String tag, Map<String, String> attributes)
	{
		this(tag, null, attributes);
	}
	
	public Element(String tag, String data, Map<String, String> attributes)
	{
		setTag(tag);
		setData(data);
		setAttributes(attributes);
	}
	
	public String getData()
	{
		return data;
	}
	
	public void setData(String data)
	{
		if(data == null)
		{
			this.data = "";
		}
		else
		{
			this.data = data;
		}
	}
	
	public Map<String, String> getAttributes()
	{
		return attributes;
	}
	
	public String getTag()
	{
		return tag;
	}
	
	public void setTag(String tag)
	{
		if(tag == null)
		{
			throw new NullPointerException();
		}
		this.tag = tag;
	}
	
	public void setAttributes(Map<String, String> attributes)
	{
		if(attributes == null)
		{
			this.attributes = new TreeMap<String, String>();
		}
		else
		{
			this.attributes = attributes;
		}
	}
	
	public void setAttribute(String key, String value)
	{
		if(key == null)
		{
			throw new NullPointerException();
		}
		
		if(value == null)
		{
			value = "";
		}
		
		this.attributes.put(key, value);
	}
	
	public String getAttribute(String key)
	{
		if(key == null)
		{
			throw new NullPointerException();
		}
		
		return this.attributes.get(key);
	}
	
	public String updateAttribute(String key, String value)
	{
		if(key == null)
		{
			throw new NullPointerException();
		}
		if(!attributes.containsKey(key))
		{
			return null;
		}
		
		return attributes.replace(key, String.format("%s %s", attributes.get(key), value));
	}
	
	public String getHTML()
	{
		return HTML.tag(tag, data, attributes) + HTML.endTag(tag);
	}
	
	@Override
	public String toString()
	{
		return getHTML();
	}
}
