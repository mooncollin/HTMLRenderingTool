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
abstract public class Input extends Element implements Attributes.Required, Attributes.AutoFocus, Attributes.Disabled, Attributes.AutoComplete, Attributes.Form, Attributes.List, Attributes.Name, Attributes.ReadOnly, Attributes.TabIndex, Attributes.Value
{
	/**
	 * Label that may be used for this input.
	 */
	private Element label;
	
	/**
	 * Required attribute.
	 */
	private boolean required;
	
	/**
	 * Autofocus attribute.
	 */
	private boolean autofocus;
	
	/**
	 * Disabled attribute.
	 */
	private boolean disabled;
	
	/**
	 * Autocomplete attribute.
	 */
	private String autocomplete;
	
	/**
	 * Form attribute.
	 */
	private String form;
	
	/**
	 * List attribute.
	 */
	private String list;
	
	/**
	 * Name attribute.
	 */
	private String name;
	
	/**
	 * Readonly attribute.
	 */
	private boolean readonly;
	
	/**
	 * Tabindex attribute.
	 */
	private int tabindex;
	
	/**
	 * Value attribute.
	 */
	private String value;
	
	/**
	 * Type attribute.
	 */
	private String type;
	
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
	
	/**
	 * Sets the type attribute. 
	 * @param type type value
	 */
	protected void setType(String type)
	{
		if(type == null)
		{
			throw new IllegalArgumentException();
		}
		this.type = type;
		_setAttribute("type", this.type);
	}
	
	/**
	 * Gets the type attribute.
	 * @return type value
	 */
	public String getType()
	{
		return type;
	}
	
	/**
	 * Sets the value attribute. Null to remove.
	 * @param v value's value
	 */
	public void setValue(String v)
	{
		this.value = v;
		if(this.value == null)
		{
			_removeAttribute("value");
		}
		else
		{
			_setAttribute("value", this.value);
		}
	}
	
	/**
	 * Gets the value attribute
	 * @return value's value
	 */
	public String getValue()
	{
		return value;
	}
	
	/**
	 * Sets the tabindex attribute. < 0 to remove.
	 * @param t tabindex value
	 */
	public void setTabIndex(int t)
	{
		this.tabindex = t < 0 ? -1 : t;
		if(this.tabindex < 0)
		{
			_removeAttribute("tabindex");
		}
		else
		{
			_setAttribute("tabindex", String.valueOf(this.tabindex));
		}
	}
	
	public int getTabIndex()
	{
		return tabindex;
	}
	
	/**
	 * Gets the readonly attribute.
	 * @return readonly value
	 */
	public boolean getReadOnly()
	{
		return readonly;
	}
	
	/**
	 * Sets the readonly attribute.
	 * @param r readonly value
	 */
	public void setReadOnly(boolean r)
	{
		this.readonly = r;
		if(this.readonly)
		{
			_setAttribute("readonly", "");
		}
		else
		{
			_removeAttribute("readonly");
		}
	}
	
	/**
	 * Sets the name attribute. Null to remove.
	 * @param n name value
	 */
	public void setName(String n)
	{
		this.name = n;
		if(this.name == null)
		{
			_removeAttribute("name");
		}
		else
		{
			_setAttribute("name", this.name);
		}
	}
	
	/**
	 * Gets the list attribute.
	 * @return list value
	 */
	public String getList()
	{
		return list;
	}
	
	/**
	 * Sets the list attribute. Null to remove.
	 * @param l list value
	 */
	public void setList(String l)
	{
		this.list = l;
		if(this.list == null)
		{
			_removeAttribute("list");
		}
		else
		{
			_setAttribute("list", this.list);
		}
	}
	
	/**
	 * Gets the form attribute.
	 * @return form value
	 */
	public String getForm()
	{
		return form;
	}
	
	/**
	 * Sets the form attribute. Null to remove.
	 * @param f form value
	 */
	public void setForm(String f)
	{
		this.form = f;
		if(this.form == null)
		{
			_removeAttribute("form");
		}
		else
		{
			_setAttribute("form", f);
		}
	}
	
	/**
	 * Gets the disabled attribute.
	 * @return disabled value
	 */
	public boolean getDisabled()
	{
		return disabled;
	}
	
	/**
	 * Sets the disabled attribute.
	 * @param d disabled value
	 */
	public void setDisabled(boolean d)
	{
		this.disabled = d;
		if(this.disabled)
		{
			_setAttribute("disabled", "");
		}
		else
		{
			_removeAttribute("disabled");
		}
	}
	
	/**
	 * Gets the autofocus attribute.
	 * @return autofocus value
	 */
	public boolean getAutoFocus()
	{
		return autofocus;
	}
	
	/**
	 * Sets the autofocus attribute.
	 * @param f autofocus value
	 */
	public void setAutoFocus(boolean f)
	{
		this.autofocus = f;
		if(this.autofocus)
		{
			_setAttribute("autofocus", "");
		}
		else
		{
			_removeAttribute("autofocus");
		}
	}
	
	/**
	 * Gets the autocomplete attribute.
	 * @return autocomplete value
	 */
	public String getAutoComplete()
	{
		return autocomplete;
	}
	
	/**
	 * Sets the autocomplete attribute. Null to remove.
	 * @param in autocomplete value
	 */
	public void setAutoComplete(String in)
	{
		autocomplete = in;
		if(in == null)
		{
			_removeAttribute("autocomplete");
		}
		else
		{
			_setAttribute("autocomplete", in);
		}
	}
	
	/**
	 * Sets the required attribute.
	 * @param r required value
	 */
	public void setRequired(boolean r)
	{
		required = r;
		if(required)
		{
			_setAttribute("required", "");
		}
		else
		{
			_removeAttribute("required");
		}
	}
	
	/**
	 * Gets the required attribute.
	 * @return required value
	 */
	public boolean getRequired()
	{
		return required;
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
	 * Gets the name attribute.
	 * @return name value
	 */
	public String getName()
	{
		return name;
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
