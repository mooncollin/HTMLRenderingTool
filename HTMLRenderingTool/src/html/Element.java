package html;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import util.Default;

/**
 * An Element represents a singular html tag. This can be self-closing
 * or not. A pure Element cannot contain other elements inside of it.
 * 
 * NOTE: There are several _underscore methods in this class. This is used
 * to bypass attribute/tag overrides.
 * @author colli
 *
 */
public class Element
{
	/**
	 * Key-value attributes that this element has. This corresponds
	 * to the attributes in the opening tag of the html, such as
	 * an href to an 'a' tag.
	 */
	private Map<String, String> attributes;
	
	/**
	 * Children of the Element class may want to override setting
	 * certain attributes to make easy setters and getters for specific
	 * attributes. The properties map allows for this.
	 * 
	 * To override setting an attribute, the key to add to this map is the
	 * name of the attribute to override. The value to add is an array of three
	 * values.
	 * 
	 * The first value of the array is a java.lang.reflect.Method Object that
	 * corresponds to the setter method responsible for that specific attribute.
	 * This method must take only one parameter.
	 * It is also HIGHLY RECOMMENDED that eventually that method used will add
	 * that attribute into the attributes map by using various underscore methods
	 * that will bypass the properties override. These methods include:
	 * _setAttribute and _removeAttribute.
	 * Failure to add or remove the correct attribute eventually will cause it
	 * the render the html incorrectly according to the object's state.
	 * 
	 * The second value of the array is the default value when the attribute is
	 * being set. For instance, Input element have a required field. This is either
	 * existing or not. So by setting it, we can pass it a <code>true</code> if it
	 * takes a boolean as a default value. If needed to use the value passed into the
	 * <code>setAttribute</code> method, then have this value be an instance of the
	 * util.Default class. This just checks whether it is of this class type to use
	 * the value passed to <code>setAttribute</code> method.
	 * NOTE: If the default value is used, the method used in the first value MUST
	 * take a string. The current implementation will not convert that value to
	 * another class. Try making a method to convert the String to another class for this.
	 * 
	 * The second value of the array is the default value when the attribute is being removed.
	 * This cannot contain a default value, since there is no value passed to the <code>removeAttribute</code>
	 * method. However, it still must match the class type of the method.
	 * 
	 * This implementation of overriding attribute setting and removing is only checked
	 * at runtime of executing that specific attribute. So misspellings of the method name
	 * or having incorrect default values will be a runtime exception and cannot be checked
	 * at compile time.
	 * 
	 * The third value of the arra
	 */
	protected Map<String, Object[]> properties;
	
	/**
	 * A list of the currently used classes for the "class" attribute. This
	 * is used to easily add and observe classes of this Element.
	 */
	private List<String> classes;
	
	/**
	 * The tag of this Element.
	 */
	private String tag;
	
	/**
	 * The information that will be fit inside this Element.
	 * This goes in-between the opening and closing tags.
	 * Self-closing tags will not render this data.
	 */
	private String data;
	
	/**
	 * The id of this element.
	 */
	private String id;
	
	/**
	 * Constructor. Creates an Element with the given tag, with no
	 * data and no starting attributes.
	 * @param tag the tag of this element
	 */
	public Element(String tag)
	{
		this(tag, null, null);
	}
	
	/**
	 * Constructor. Creates an Element with the given tag, given data,
	 * and no starting attributes.
	 * @param tag the tag of this element
	 * @param data the data of this element
	 */
	public Element(String tag, String data)
	{
		this(tag, data, null);
	}
	
	/**
	 * Constructor. Creates an Element with the given tag, no data,
	 * and given attributes.
	 * @param tag the tag of this element
	 * @param attributes key-value attributes of this element
	 */
	public Element(String tag, Map<String, String> attributes)
	{
		this(tag, null, attributes);
	}
	
	/**
	 * Constructor. Creates an Element with the given tag, given data,
	 * and given attributes.
	 * @param tag the tag of this element
	 * @param data the data of this element
	 * @param attributes key-value attributes of this element
	 */
	public Element(String tag, String data, Map<String, String> attributes)
	{
		this.attributes = new TreeMap<String, String>();
		this.classes = new LinkedList<String>();
		this.properties = new HashMap<String, Object[]>();
		_setTag(tag);
		setData(data);
		setAttributes(attributes);
		
		try
		{
			properties.put("id", new Object[] {getClass().getMethod("setID", String.class), new Default(), "-1"});
		} catch (NoSuchMethodException | SecurityException e)
		{
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	/**
	 * Underscore method. This is meant to set the private tag value
	 * by bypassing the public <code>setTag</code> method that might
	 * disallow public changing of the tag.
	 * @param tag the new tag of this element
	 */
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
	
	/**
	 * Returns the data of this Element.
	 * @return this element's data
	 */
	public String getData()
	{
		return data;
	}
	
	/**
	 * Sets this element's data.
	 * @param data new data to be set
	 */
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
	
	/**
	 * Returns the id of this element.
	 * @return this element's id
	 */
	public String getID()
	{
		return id;
	}
	
	public void setID(String id)
	{
		this.id = id;
		if(this.id == null)
		{
			_removeAttribute("id");
		}
		else
		{
			_setAttribute("id", this.id);
		}
	}
	
	/**
	 * Returns an unmodifiable map of this Element's attributes.
	 * New additions to the attributes may not be always reflected
	 * in this. Must be called everytime to get the newest attributes.
	 * @return a map of the attributes
	 */
	public Map<String, String> getAttributes()
	{
		return Collections.unmodifiableMap(attributes);
	}
	
	/**
	 * Returns this Element's tag.
	 * @return the element's tag
	 */
	public String getTag()
	{
		return tag;
	}
	
	/**
	 * Sets this Element's tag.
	 * @param tag the new tag for this element
	 */
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
	
	/**
	 * Adds the given classes to the list of classes. This will also
	 * change the "class" attribute for rendering.
	 * @param classes a list of classes
	 */
	public void addClasses(String... classes)
	{
		for(String c : classes)
		{
			addClass(c);
		}
	}
	
	/**
	 * Adds a class to the list of classes. This will also change the "class"
	 * attribute for rendering.
	 * @param classString a class to add
	 */
	public void addClass(String classString)
	{
		if(classString == null)
		{
			throw new NullPointerException();
		}
		classes.add(classString);
		_setAttribute("class", String.join(" ", classes));
	}
	
	/**
	 * Removes a class from the list of classes. This will also change the "class"
	 * attribute for rendering.
	 * @param classString a class to remove
	 */
	public void removeClass(String classString)
	{
		if(classString == null)
		{
			throw new NullPointerException();
		}
		
		classes.remove(classString);
		_setAttribute("class", String.join(" ", classes));
	}
	
	/**
	 * Can set the whole list of classes by giving a list of strings.
	 * If given a null, will remove all classes.
	 * @param classes a list of strings
	 */
	public void setClasses(List<String> classes)
	{
		this.classes = new LinkedList<String>();
		_removeAttribute("class");
		if(classes != null)
		{
			classes.forEach(this::addClass);
		}
	}
	
	/**
	 * Returns an unmodifiable list of the current classes. This
	 * list may not update when adding or removing classes.
	 * @return a list of the current classes
	 */
	public List<String> getClasses()
	{
		return Collections.unmodifiableList(classes);
	}
	
	/**
	 * Sets the attributes to this map. Will set the attributes from this map
	 * and removes any old attributes. If given null, it removes all attributes.
	 * @param attributes a map of key-value attributes
	 */
	public void setAttributes(Map<String, String> attributes)
	{
		this.attributes.forEach((key, value) -> removeAttribute(key));
		if(attributes != null)
		{
			attributes.forEach((key, value) -> setAttribute(key, value));
		}
	}
	
	/**
	 * Sets the given attribute to the given value. If the key is "class", then
	 * it will split the value on spaces and add those classes to the list of classes.
	 * Children of Element may choose to override certain attributes to redirect to
	 * specific setter methods, which should set the specific instance variable to the 
	 * passed value, or a default value, and change the underlying attributes map to contain
	 * the correct value for rendering. If the given value is null, the value is converted
	 * to an empty string. Overriding of certain attributes may not follow the null rule.
	 * @param key the name of the key to add
	 * @param value the value to add
	 */
	public void setAttribute(String key, String value)
	{
		if(key == null)
		{
			throw new NullPointerException();
		}
		
		if(key.equals("class"))
		{
			if(value == null)
			{
				setClasses(null);
			}
			else
			{
				addClasses(value.split(" "));
			}
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
			if(value == null)
			{
				value = "";
			}
			attributes.put(key, value);
		}
	}
	
	/**
	 * Gets the value of a certain attribute or null if not found.
	 * @param key attribute to retrieve
	 * @return value for the given attribute
	 */
	public String getAttribute(String key)
	{
		if(key == null)
		{
			throw new NullPointerException();
		}
		
		return attributes.getOrDefault(key, null);
	}
	
	/**
	 * Removes the given attribute.
	 * @param key attribute to remove
	 */
	public void removeAttribute(String key)
	{
		if(key == null)
		{
			throw new NullPointerException();
		}
		
		if(key.equals("class"))
		{
			setClasses(null);
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
	
	/**
	 * Gives the rendered HMTL of this element.
	 * @return the html of this element
	 */
	public String getHTML()
	{
		return HTML.tag(tag, data, attributes) + HTML.endTag(tag);
	}
	
	/**
	 * Gives the same value as <code>getHTML()</code>.
	 * @return the html of this element
	 */
	@Override
	public String toString()
	{
		return getHTML();
	}
	
	/**
	 * Checks if two element are equal by their rendered
	 * HTML.
	 * @return true if both have the same html, false otherwise
	 */
	@Override
	public boolean equals(Object other)
	{
		if(other instanceof Element)
		{
			return ((Element) other).getHTML().equals(this.getHTML());
		}
		
		return false;
	}
	
	/**
	 * Underscore method. This method is used to bypass the public
	 * <code>setAttribute</code> method and directly set an attribute.
	 * @param key attribute to set
	 * @param value value to set
	 */
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
	
	/**
	 * Underscore method. This method is used to bypass the public
	 * <code>removeAttribute</code> method and directly remove an attribute.
	 * @param key attribute to remove
	 */
	protected void _removeAttribute(String key)
	{
		if(key == null)
		{
			throw new NullPointerException();
		}
		
		attributes.remove(key);
	}
}
