package forms;

import html.Element;
import util.Default;

/**
 * All specific Inputs should extend from this class.
 * This class offers specific attributes that all Inputs have.
 * @author colli
 *
 */
abstract public class Input extends Element
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
		this("");
	}
	
	/**
	 * Constructor. Creates an input with the given name.
	 * @param name name attribute
	 */
	public Input(String name)
	{
		super("input");
		try
		{
			properties.put("required", new Object[] {getClass().getMethod("setRequired", boolean.class), true, false});
			properties.put("autofocus", new Object[] {getClass().getMethod("setAutoFocus", boolean.class), true, false});
			properties.put("disabled", new Object[] {getClass().getMethod("setDisabled", boolean.class), true, false});
			properties.put("autocomplete", new Object[] {getClass().getMethod("setAutocomplete", String.class), new Default(), null});
			properties.put("form", new Object[] {getClass().getMethod("setForm", String.class), new Default(), null});
			properties.put("list", new Object[] {getClass().getMethod("setList", String.class), new Default(), null});
			properties.put("name", new Object[] {getClass().getMethod("setName", String.class), new Default(), null});
			properties.put("readonly", new Object[] {getClass().getMethod("setReadonly", boolean.class), true, false});
			properties.put("tabindex", new Object[] {getClass().getMethod("parseTabIndex", String.class), new Default(), "-1"});
			properties.put("value", new Object[] {getClass().getMethod("setValue", String.class), new Default(), null});
		} catch (NoSuchMethodException | SecurityException e)
		{
			e.printStackTrace();
			throw new RuntimeException();
		}

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
	
	/**
	 * Gets the readonly attribute.
	 * @return readonly value
	 */
	public boolean getReadonly()
	{
		return readonly;
	}
	
	/**
	 * Sets the readonly attribute.
	 * @param r readonly value
	 */
	public void setReadonly(boolean r)
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
	public String getAutocomplete()
	{
		return autocomplete;
	}
	
	/**
	 * Sets the autocomplete attribute. Null to remove.
	 * @param in autocomplete value
	 */
	public void setAutocomplete(String in)
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
	public void removeAttribute(String key)
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
	}
	
	@Override
	public void setAttribute(String key, String value)
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
	
	/**
	 * Parses the given string as a number and sets the
	 * tabindex attribute.
	 * @param tabIndex number as a string
	 */
	public void parseTabIndex(String tabIndex)
	{
		setTabIndex(tabIndex == null ? -1 : Integer.parseInt(tabIndex));
	}
}
