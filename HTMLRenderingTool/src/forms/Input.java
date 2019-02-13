package forms;

import html.Element;
import util.Default;

abstract public class Input extends Element
{
	private Element label; 
	private boolean required;
	private boolean autofocus;
	private boolean disabled;
	private String autocomplete;
	private String form;
	private String list;
	private String name;
	private boolean readonly;
	private int tabindex;
	private String value;
	private String type;
	
	public Input()
	{
		this("");
	}
	
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
			properties.put("tabindex", new Object[] {getClass().getMethod("setTabIndex", int.class), new Default(), -1});
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
	
	protected void setType(String type)
	{
		if(type == null)
		{
			throw new IllegalArgumentException();
		}
		this.type = type;
		_setAttribute("type", this.type);
	}
	
	public String getType()
	{
		return type;
	}
	
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
	
	public String getValue()
	{
		return value;
	}
	
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
	
	public boolean getReadonly()
	{
		return readonly;
	}
	
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
	
	public String getList()
	{
		return list;
	}
	
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
	
	public String getForm()
	{
		return form;
	}
	
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
	
	public boolean getDisabled()
	{
		return disabled;
	}
	
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
	
	public boolean getAutoFocus()
	{
		return autofocus;
	}
	
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
	
	public String getAutocomplete()
	{
		return autocomplete;
	}
	
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
	
	public void setLabelText(String label)
	{
		this.label.setData(label);
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getLabelText()
	{
		return label.getData();
	}
	
	public Element getLabel()
	{
		return label;
	}
}
