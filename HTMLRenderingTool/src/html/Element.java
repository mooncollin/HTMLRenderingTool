package html;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import util.Default;

public class Element
{
	protected Map<String, String> attributes;
	private Map<String, Object[]> properties;
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
		this.classes = new LinkedList<String>();
		this.properties = new HashMap<String, Object[]>();
		_setTag(tag);
		setData(data);
		setAttributes(attributes);
	}
	
	protected void _setTag(String tag)
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
		_setAttribute("class", String.join(" ", classes));
	}
	
	public void removeClass(String classString)
	{
		if(classString == null)
		{
			throw new NullPointerException();
		}
		
		classes.remove(classString);
		_setAttribute("class", String.join(" ", classes));
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
		else if(properties.containsKey(key))
		{
			Object[] props = properties.get(key);
			Object parameter = props[1] instanceof Default ? value : props[1];
			try
			{
				((Method) props[0]).invoke(this, parameter);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e)
			{
				e.printStackTrace();
				throw new RuntimeException();
			}
		}
		else
		{
			attributes.put(key, value);
		}
	}
	
	public String getAttribute(String key)
	{
		if(key == null)
		{
			throw new NullPointerException();
		}
		
		return attributes.get(key);
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
		else if(properties.containsKey(key))
		{
			Object[] props = properties.get(key);
			try
			{
				((Method) props[0]).invoke(this, props[2]);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e)
			{
				e.printStackTrace();
				throw new RuntimeException();
			}
		}
		else
		{
			attributes.remove(key);
		}
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
	
	protected void _setAttribute(String key, String value)
	{
		if(key == null)
		{
			throw new NullPointerException();
		}
		
		if(value == null)
		{
			value = "";
		}
		
		attributes.put(key, value);
	}
	
	protected void _removeAttribute(String key)
	{
		if(key == null)
		{
			throw new NullPointerException();
		}
		
		attributes.remove(key);
	}
}
