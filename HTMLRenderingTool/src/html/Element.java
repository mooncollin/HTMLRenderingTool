package html;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Element
{
	private Map<String, String> attributes;
	private List<String> classes;
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
		this.attributes = new TreeMap<String, String>();
		setClasses(null);
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
			this.tag = "";
		}
		else
		{
			this.tag = tag;
		}
	}
	
	public void addClasses(String... classes)
	{
		for(String c : classes)
		{
			addClass(c);
		}
	}
	
	public void addClass(String classString)
	{
		if(classString == null)
		{
			throw new NullPointerException();
		}
		classes.add(classString);
	}
	
	public void removeClass(String classString)
	{
		if(classString == null)
		{
			throw new NullPointerException();
		}
		
		classes.remove(classString);
	}
	
	public void setClasses(List<String> classes)
	{
		if(classes == null)
		{
			this.classes = new LinkedList<String>();
		}
		else
		{
			this.classes = classes;
		}
	}
	
	public List<String> getClasses()
	{
		return classes;
	}
	
	public void setAttributes(Map<String, String> attributes)
	{
		if(attributes == null)
		{
			this.attributes = new TreeMap<String, String>();
		}
		else
		{
			for(String key : attributes.keySet())
			{
				setAttribute(key, attributes.get(key));
			}
			if(this.attributes.containsKey("class"))
			{
				addClasses(this.attributes.remove("class").split(" "));
			}
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
		
		if(value.equals("class"))
		{	
			addClasses(value.split(" "));
		}
		else
		{
			this.attributes.put(key, value);
		}
	}
	
	public String getAttribute(String key)
	{
		if(key == null)
		{
			throw new NullPointerException();
		}
		
		if(key.equals("class"))
		{
			return String.join(" ", this.classes);
		}
		
		return this.attributes.get(key);
	}
	
	public void removeAttribute(String key)
	{
		if(key == null)
		{
			throw new NullPointerException();
		}
		
		if(key.equals("class"))
		{
			classes.clear();
		}
		
		attributes.remove(key);
	}
	
	public String getHTML()
	{
		Map<String, String> fullAttributes = new TreeMap<String, String>(attributes);
		fullAttributes.put("class", String.join(" ", classes));
		return HTML.tag(tag, data, fullAttributes) + HTML.endTag(tag);
	}
	
	@Override
	public String toString()
	{
		return getHTML();
	}
}
