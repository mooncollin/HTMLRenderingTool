package html;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import attributes.Attribute;
import attributes.Attributes;
import attributes.Attributes.Hidden;
import attributes.Attributes.ID;
import attributes.Attributes.OnClick;
import attributes.Attributes.OnDblClick;
import attributes.Attributes.OnKeyDown;
import attributes.Attributes.OnKeyPress;
import attributes.Attributes.OnKeyUp;
import attributes.Attributes.OnMouseDown;
import attributes.Attributes.OnMouseMove;
import attributes.Attributes.OnMouseOut;
import attributes.Attributes.OnMouseOver;
import attributes.Attributes.OnMouseUp;
import attributes.Attributes.Style;
import attributes.Attributes.Title;

/**
 * An Element represents a singular html tag. This can be self-closing or not. A
 * pure Element cannot contain other elements inside of it.
 * 
 * NOTE: There are several _underscore methods in this class. This is used to
 * bypass attribute/tag overrides.
 * 
 * @author colli
 *
 */
public class Element implements Attributes.ID, Attributes.OnClick, Attributes.OnDblClick, Attributes.OnMouseDown,
		Attributes.OnMouseUp, Attributes.OnMouseOver, Attributes.OnMouseMove, Attributes.OnMouseOut,
		Attributes.OnKeyPress, Attributes.OnKeyDown, Attributes.OnKeyUp, Attributes.Title, Attributes.Hidden, Attributes.Style
{
	private static final Pattern STYLE_REGEX = Pattern.compile("\\s*(?<name>.*)?\\s*:\\s*(?<value>.*)?[^'\\\"]*;?[^'\\\"]*\\s*");
	
	/**
	 * Key-value attributes that this element has. This corresponds to the
	 * attributes in the opening tag of the html, such as an href to an 'a' tag.
	 */
	private Map<String, String> attributes;

	/**
	 * Element class may want to override setting certain attributes
	 * to make easy setters and getters for specific attributes. The properties map
	 * allows for this.
	 */
	private Map<String, Attribute<? extends Object>> properties;

	/**
	 * A list of the currently used classes for the "class" attribute. This is used
	 * to easily add and observe classes of this Element.
	 */
	private List<String> classes;

	/**
	 * The tag of this Element.
	 */
	private String tag;

	/**
	 * The information that will be fit inside this Element. This goes in-between
	 * the opening and closing tags. Self-closing tags will not render this data.
	 */
	private String data;
	
	private Styles styles; 

	/**
	 * Constructor. Creates an Element with the given tag, with no data and no
	 * starting attributes.
	 * 
	 * @param tag the tag of this element
	 */
	public Element(String tag)
	{
		this(tag, null, null);
	}

	/**
	 * Constructor. Creates an Element with the given tag, given data, and given
	 * attributes.
	 * 
	 * @param tag        the tag of this element
	 * @param data       the data of this element
	 */
	public Element(String tag, String data)
	{
		this(tag, data, null);
	}
	
	public Element(String tag, Map<String, Object> attributes)
	{
		this(tag, null, attributes);
	}
	
	@SuppressWarnings("unchecked")
	public Element(String tag, String data, Map<String, Object> attributes)
	{
		this.attributes = new TreeMap<String, String>();
		this.classes = new LinkedList<String>();
		this.properties = new HashMap<String, Attribute<? extends Object>>();
		this.styles = new Styles();
		_setTag(tag);
		setData(data);
		
		Arrays.stream(getClass().getClasses())
			  .filter(c -> c.isInterface())
			  .distinct()
			  .forEach(c -> {
				try
				{
					var prop = (Map.Entry<String, Attribute<? extends Object>>) c.getMethod(Attributes.GET_ENTRY_NAME, c).invoke(this, this);
					properties.put(prop.getKey(), prop.getValue());
				} catch (Exception e)
				{
				}
			  });
		
		setAttributes(attributes);
	}

	/**
	 * Underscore method. This is meant to set the private tag value by bypassing
	 * the public <code>setTag</code> method that might disallow public changing of
	 * the tag.
	 * 
	 * @param tag the new tag of this element
	 */
	protected void _setTag(String tag)
	{
		this.tag = Objects.requireNonNullElse(tag, "");
	}

	/**
	 * Returns the data of this Element.
	 * 
	 * @return this element's data
	 */
	public String getData()
	{
		return data;
	}

	/**
	 * Sets this element's data.
	 * 
	 * @param data new data to be set
	 */
	public void setData(String data)
	{
		this.data = Objects.requireNonNullElse(data, "");
	}

	/**
	 * Returns an unmodifiable map of this Element's attributes. New additions to
	 * the attributes may not be always reflected in this. Must be called everytime
	 * to get the newest attributes.
	 * 
	 * @return a map of the attributes
	 */
	public Map<String, String> getAttributes()
	{
		return Collections.unmodifiableMap(attributes);
	}

	/**
	 * Returns this Element's tag.
	 * 
	 * @return the element's tag
	 */
	public String getTag()
	{
		return tag;
	}

	/**
	 * Sets this Element's tag.
	 * 
	 * @param tag the new tag for this element
	 */
	public void setTag(String tag)
	{
		this.tag = Objects.requireNonNullElse(tag, "");
	}
	
	public Styles getStyles()
	{
		return styles;
	}


	public void setID(String id)
	{
		if (id == null)
		{
			_removeAttribute(ID.ATTRIBUTE_NAME);
		}
		else
		{
			_setAttribute(ID.ATTRIBUTE_NAME, id);
		}
	}
	

	public String getID()
	{
		return getAttribute(ID.ATTRIBUTE_NAME);
	}
	

	public void setOnClick(String onclick)
	{
		if (onclick == null)
		{
			_removeAttribute(OnClick.ATTRIBUTE_NAME);
		}
		else
		{
			_setAttribute(OnClick.ATTRIBUTE_NAME, onclick);
		}
	}
	

	public String getOnClick()
	{
		return getAttribute(OnClick.ATTRIBUTE_NAME);
	}
	

	public void setOnDblClick(String ondblclick)
	{
		if (ondblclick == null)
		{
			_removeAttribute(OnDblClick.ATTRIBUTE_NAME);
		}
		else
		{
			_setAttribute(OnDblClick.ATTRIBUTE_NAME, ondblclick);
		}
	}
	

	public String getOnDblClick()
	{
		return getAttribute(OnDblClick.ATTRIBUTE_NAME);
	}
	

	public void setOnMouseDown(String onmousedown)
	{
		if (onmousedown == null)
		{
			_removeAttribute(OnMouseDown.ATTRIBUTE_NAME);
		}
		else
		{
			_setAttribute(OnMouseDown.ATTRIBUTE_NAME, onmousedown);
		}
	}
	

	public String getOnMouseDown()
	{
		return getAttribute(OnMouseDown.ATTRIBUTE_NAME);
	}
	

	public void setOnMouseUp(String onmouseup)
	{
		if (onmouseup == null)
		{
			_removeAttribute(OnMouseUp.ATTRIBUTE_NAME);
		}
		else
		{
			_setAttribute(OnMouseUp.ATTRIBUTE_NAME, onmouseup);
		}
	}
	

	public String getOnMouseUp()
	{
		return getAttribute(OnMouseUp.ATTRIBUTE_NAME);
	}
	

	public void setOnMouseOver(String onmouseover)
	{
		if (onmouseover == null)
		{
			_removeAttribute(OnMouseOver.ATTRIBUTE_NAME);
		}
		else
		{
			_setAttribute(OnMouseOver.ATTRIBUTE_NAME, onmouseover);
		}
	}
	

	public String getOnMouseOver()
	{
		return getAttribute(OnMouseOver.ATTRIBUTE_NAME);
	}
	

	public void setOnMouseMove(String onmousemove)
	{
		if (onmousemove == null)
		{
			_removeAttribute(OnMouseMove.ATTRIBUTE_NAME);
		}
		else
		{
			_setAttribute(OnMouseMove.ATTRIBUTE_NAME, onmousemove);
		}
	}
	

	public String getOnMouseMove()
	{
		return getAttribute(OnMouseMove.ATTRIBUTE_NAME);
	}
	

	public void setOnMouseOut(String onmouseout)
	{
		if (onmouseout == null)
		{
			_removeAttribute(OnMouseOut.ATTRIBUTE_NAME);
		}
		else
		{
			_setAttribute(OnMouseOut.ATTRIBUTE_NAME, onmouseout);
		}
	}
	

	public String getOnMouseOut()
	{
		return getAttribute(OnMouseOut.ATTRIBUTE_NAME);
	}
	

	public void setOnKeyPress(String onkeypress)
	{
		if (onkeypress == null)
		{
			_removeAttribute(OnKeyPress.ATTRIBUTE_NAME);
		}
		else
		{
			_setAttribute(OnKeyPress.ATTRIBUTE_NAME, onkeypress);
		}
	}
	

	public String getOnKeyPress()
	{
		return getAttribute(OnKeyPress.ATTRIBUTE_NAME);
	}
	

	public void setOnKeyDown(String onkeydown)
	{
		if (onkeydown == null)
		{
			_removeAttribute(OnKeyDown.ATTRIBUTE_NAME);
		}
		else
		{
			_setAttribute(OnKeyDown.ATTRIBUTE_NAME, onkeydown);
		}
	}
	

	public String getOnKeyDown()
	{
		return getAttribute(OnKeyDown.ATTRIBUTE_NAME);
	}
	

	public void setOnKeyUp(String onkeyup)
	{
		if (onkeyup == null)
		{
			_removeAttribute(OnKeyUp.ATTRIBUTE_NAME);
		}
		else
		{
			_setAttribute(OnKeyUp.ATTRIBUTE_NAME, onkeyup);
		}
	}
	

	public String getOnKeyUp()
	{
		return getAttribute(OnKeyUp.ATTRIBUTE_NAME);
	}
	

	public void setTitle(String title)
	{
		if (title == null)
		{
			_removeAttribute(Title.ATTRIBUTE_NAME);
		}
		else
		{
			_setAttribute(Title.ATTRIBUTE_NAME, title);
		}
	}
	

	public String getTitle()
	{
		return getAttribute(Title.ATTRIBUTE_NAME);
	}
	

	public void setHidden(boolean hidden)
	{
		if (!hidden)
		{
			_removeAttribute(Hidden.ATTRIBUTE_NAME);
		}
		else
		{
			_setAttribute(Hidden.ATTRIBUTE_NAME, "");
		}
	}
	

	public boolean getHidden()
	{
		String attribute = getAttribute(Hidden.ATTRIBUTE_NAME);
		if (attribute == null)
		{
			return false;
		}
		return true;
	}
	
	
	public void setStyle(String style)
	{
		if (style == null)
		{
			_removeAttribute(Style.ATTRIBUTE_NAME);
		}
		else
		{
			_setAttribute(Style.ATTRIBUTE_NAME, style);
		}
	}
	

	public String getStyle()
	{
		return getAttribute(Style.ATTRIBUTE_NAME);
	}
	


	/**
	 * Adds the given classes to the list of classes. This will also change the
	 * "class" attribute for rendering.
	 * 
	 * @param classes a list of classes
	 */
	public Element addClasses(String... classes)
	{
		for (var c : classes)
		{
			addClass(c);
		}
		
		return this;
	}

	/**
	 * Adds a class to the list of classes. This will also change the "class"
	 * attribute for rendering.
	 * 
	 * @param classString a class to add
	 */
	public Element addClass(String classString)
	{
		classes.add(Objects.requireNonNull(classString));
		_setAttribute("class", String.join(" ", classes));
		return this;
	}

	/**
	 * Removes a class from the list of classes. This will also change the "class"
	 * attribute for rendering.
	 * 
	 * @param classString a class to remove
	 */
	public Element removeClass(String classString)
	{
		classes.remove(Objects.requireNonNull(classString));
		_setAttribute("class", String.join(" ", classes));
		return this;
	}

	/**
	 * Can set the whole list of classes by giving a list of strings. If given a
	 * null, will remove all classes.
	 * 
	 * @param classes a list of strings
	 */
	public Element setClasses(List<String> classes)
	{
		this.classes = new LinkedList<String>();
		_removeAttribute("class");
		if (classes != null)
		{
			classes.forEach(this::addClass);
		}
		
		return this;
	}

	/**
	 * Returns an unmodifiable list of the current classes. This list may not update
	 * when adding or removing classes.
	 * 
	 * @return a list of the current classes
	 */
	public List<String> getClasses()
	{
		return Collections.unmodifiableList(classes);
	}

	/**
	 * Sets the attributes to this map. Will set the attributes from this map and
	 * removes any old attributes. If given null, it removes all attributes.
	 * 
	 * @param attributes a map of key-value attributes
	 */
	public Element setAttributes(Map<String, Object> attributes)
	{
		this.attributes = new HashMap<String, String>();
		if (attributes != null)
		{
			attributes.forEach(this::setAttribute);
		}
		
		return this;
	}

	/**
	 * Sets the given attribute to the given value. If the key is "class", then it
	 * will split the value on spaces and add those classes to the list of classes.
	 * Children of Element may choose to override certain attributes to redirect to
	 * specific setter methods, which should set the specific instance variable to
	 * the passed value, or a default value, and change the underlying attributes
	 * map to contain the correct value for rendering. If the given value is null,
	 * the value is converted to an empty string. Overriding of certain attributes
	 * may not follow the null rule.
	 * 
	 * @param key   the name of the key to add
	 * @param value the value to add
	 */
	@SuppressWarnings("unchecked")
	public Element setAttribute(String key, Object value)
	{
		Objects.requireNonNull(key);

		if (key.equals("class"))
		{
			if (value == null)
			{
				setClasses(null);
			}
			else
			{
				if (value instanceof String)
				{
					addClasses(String.class.cast(value).split(" "));
				}
			}
		}
		else if (properties.containsKey(key))
		{
			var attribute = properties.get(key);
			var parameter = attribute.getDefaultSet() == null ? value : attribute.getDefaultSet();
			var calling = (Consumer<Object>) attribute.getSetterMethod();
			calling.accept(attribute.convert(String.valueOf(parameter)));
		}
		else
		{
			_setAttribute(key, String.valueOf(value));
		}
		
		return this;
	}

	/**
	 * Gets the value of a certain attribute or null if not found.
	 * 
	 * @param key attribute to retrieve
	 * @return value for the given attribute
	 */
	public String getAttribute(String key)
	{
		setStyleString();
		return attributes.getOrDefault(Objects.requireNonNull(key), null);
	}

	/**
	 * Removes the given attribute.
	 * 
	 * @param key attribute to remove
	 */
	@SuppressWarnings("unchecked")
	public Element removeAttribute(String key)
	{
		Objects.requireNonNull(key);

		if (key.equals("class"))
		{
			setClasses(null);
		}
		else if (properties.containsKey(key))
		{
			var attribute = properties.get(key);
			var calling = (Consumer<Object>) attribute.getSetterMethod();
			calling.accept(attribute.getDefaultRemove());
		}
		else
		{
			_removeAttribute(key);
		}
		
		return this;
	}

	/**
	 * Gives the rendered HMTL of this element.
	 * 
	 * @return the html of this element
	 */
	public String getHTML()
	{
		setStyleString();
		return HTML.tag(tag, data, attributes) + HTML.endTag(tag);
	}

	/**
	 * Gives the same value as <code>getHTML()</code>.
	 * 
	 * @return the html of this element
	 */
	@Override
	public String toString()
	{
		return getHTML();
	}

	/**
	 * Checks if two element are equal by their rendered HTML.
	 * 
	 * @return true if both have the same html, false otherwise
	 */
	@Override
	public boolean equals(Object other)
	{
		if (other instanceof Element)
		{
			return Element.class.cast(other).getHTML().equals(this.getHTML());
		}

		return false;
	}
	
	protected void setStyleString()
	{
		String styleString = String.join(";", styles.getStyles()
			    .entrySet()
		 	    .stream()
		        .map(e -> String.format("%s: %s", e.getKey(), e.getValue()))
   		        .toArray(String[]::new));
		
		if(!styleString.isEmpty())
		{
			attributes.put("style", styleString);
		}
	}

	/**
	 * Underscore method. This method is used to bypass the public
	 * <code>setAttribute</code> method and directly set an attribute.
	 * 
	 * @param key   attribute to set
	 * @param value value to set
	 */
	protected void _setAttribute(String key, String value)
	{
		Objects.requireNonNull(key);

		if(value == null)
		{
			removeAttribute(key);
		}
		else
		{
			if(key == "style")
			{
				Matcher m = STYLE_REGEX.matcher(value);
				while(m.find())
				{
					String styleName = m.group("name");
					String styleValue = m.group("value");
					styles.addStyle(styleName, styleValue);
				}
			}
			else
			{
				attributes.put(key, value);
			}
		}
	}

	/**
	 * Underscore method. This method is used to bypass the public
	 * <code>removeAttribute</code> method and directly remove an attribute.
	 * 
	 * @param key attribute to remove
	 */
	protected void _removeAttribute(String key)
	{
		Objects.requireNonNull(key);
		attributes.remove(key);
		if(key == "style")
		{
			styles.clear();
		}
	}
}
