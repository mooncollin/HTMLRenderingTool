package forms;

import java.util.Map;

import attributes.Attributes;
import html.Element;

/**
 * All specific Inputs should extend from this class.
 * This class offers specific attributes that all Inputs have.
 * @author colli
 *
 */
abstract public class Input extends Element implements Attributes.Required, 
	Attributes.AutoFocus, Attributes.Disabled, Attributes.AutoComplete, 
	Attributes.Form, Attributes.List, Attributes.Name, Attributes.ReadOnly, 
	Attributes.TabIndex, Attributes.Value, Attributes.Type
{
	/**
	 * Label that may be used for this input.
	 */
	private Element label;
	
	/**
	 * Constructor. Creates an input with no name.
	 */
	public Input()
	{
		this("", null);
	}
	
	/**
	 * Constructor. Creates an input with the given name.
	 * @param name name attribute
	 */
	public Input(String name)
	{
		this(name, null);
	}
	
	public Input(String name, Map<String, Object> attributes)
	{
		super("input", attributes);
		
		setName(name);
		label = new Element("label");
		setLabelText("");
	}
	
	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
	
	@Override
	public Input removeAttribute(String key)
	{
		if(key != null)
		{
			if(key.equals("id"))
			{
				if(label == null)
				{
					label = new Element("label");
				}
				label.setAttribute("for", "");
			}
			else if(key.equals("type"))
			{
				throw new IllegalArgumentException("Cannot change attribute: type");
			}
		}
		
		super.removeAttribute(key);
		
		return this;
	}
	
	@Override
	public Input setAttribute(String key, Object value)
	{
		if(key != null)
		{
			if(key.equals("id"))
			{
				if(label == null)
				{
					label = new Element("label");
				}
				label.setAttribute("for", value == null ? "" : value);
			}
			else if(key.equals("type"))
			{
				throw new IllegalArgumentException("Cannot change attribute: type");
			}
		}
		super.setAttribute(key, value);
		
		return this;
	}
	
	/**
	 * Sets the text for this Input's label.
	 * @param label text to display in the label
	 */
	public void setLabelText(String label)
	{
		this.label.setData(label);
	}
	
	/**
	 * Gets the current text of this Input's label.
	 * @return text of label
	 */
	public String getLabelText()
	{
		return label.getData();
	}
	
	/**
	 * Gets the label as an Element.
	 * @return label element
	 */
	public Element getLabel()
	{
		return label;
	}
}
