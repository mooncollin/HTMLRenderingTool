package tags;

import html.CompoundElement;
import attributes.Attributes;

public class TextArea extends CompoundElement implements Attributes.AutoCapitalize, Attributes.AutoComplete,
		Attributes.AutoFocus, Attributes.Cols, Attributes.Disabled, Attributes.Form, Attributes.MaxLength,
		Attributes.MinLength, Attributes.Name, Attributes.PlaceHolder, Attributes.ReadOnly, Attributes.Required,
		Attributes.Rows, Attributes.SpellCheck, Attributes.Wrap
{
	public static final String TAG = "textarea";

	private String autocapitalize;
	private String autocomplete;
	private boolean autofocus;
	private int cols;
	private boolean disabled;
	private String form;
	private int maxlength;
	private int minlength;
	private String name;
	private String placeholder;
	private boolean readonly;
	private boolean required;
	private int rows;
	private String spellcheck;
	private String wrap;

	public TextArea()
	{
		this(null);
	}

	public TextArea(String data)
	{
		super(TAG, data);
	}

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}

	public void setAutoCapitalize(String in)
	{
		this.autocapitalize = in;
		if (this.autocapitalize == null)
		{
			_removeAttribute("autocapitalize");
		}
		else
		{
			_setAttribute("autocapitalize", this.autocapitalize);
		}
	}

	public String getAutoCapitalize()
	{
		return autocapitalize;
	}

	public void setAutoComplete(String in)
	{
		this.autocomplete = in;
		if (this.autocomplete == null)
		{
			_removeAttribute("autocomplete");
		}
		else
		{
			_setAttribute("autocomplete", this.autocomplete);
		}
	}

	public String getAutoComplete()
	{
		return autocomplete;
	}

	public void setAutoFocus(boolean in)
	{
		this.autofocus = in;
		if (!this.autofocus)
		{
			_removeAttribute("autofocus");
		}
		else
		{
			_setAttribute("autofocus", "");
		}
	}

	public boolean getAutoFocus()
	{
		return autofocus;
	}

	public void setCols(int in)
	{
		this.cols = in < 0 ? -1 : in;
		if (this.cols < 0)
		{
			_removeAttribute("cols");
		}
		else
		{
			_setAttribute("cols", String.valueOf(this.cols));
		}
	}

	public int getCols()
	{
		return cols;
	}

	public void setDisabled(boolean in)
	{
		this.disabled = in;
		if (!this.disabled)
		{
			_removeAttribute("disabled");
		}
		else
		{
			_setAttribute("disabled", "");
		}
	}

	public boolean getDisabled()
	{
		return disabled;
	}

	public void setForm(String in)
	{
		this.form = in;
		if (this.form == null)
		{
			_removeAttribute("form");
		}
		else
		{
			_setAttribute("form", this.form);
		}
	}

	public String getForm()
	{
		return form;
	}

	public void setMaxLength(int in)
	{
		this.maxlength = in < 0 ? -1 : in;
		if (this.maxlength < 0)
		{
			_removeAttribute("maxlength");
		}
		else
		{
			_setAttribute("maxlength", String.valueOf(this.maxlength));
		}
	}

	public int getMaxLength()
	{
		return maxlength;
	}

	public void setMinLength(int in)
	{
		this.minlength = in < 0 ? -1 : in;
		if (this.minlength < 0)
		{
			_removeAttribute("minlength");
		}
		else
		{
			_setAttribute("minlength", String.valueOf(this.minlength));
		}
	}

	public int getMinLength()
	{
		return minlength;
	}

	public void setName(String in)
	{
		this.name = in;
		if (this.name == null)
		{
			_removeAttribute("name");
		}
		else
		{
			_setAttribute("name", this.name);
		}
	}

	public String getName()
	{
		return name;
	}

	public void setPlaceHolder(String in)
	{
		this.placeholder = in;
		if (this.placeholder == null)
		{
			_removeAttribute("placeholder");
		}
		else
		{
			_setAttribute("placeholder", this.placeholder);
		}
	}

	public String getPlaceHolder()
	{
		return placeholder;
	}

	public void setReadOnly(boolean in)
	{
		this.readonly = in;
		if (!this.readonly)
		{
			_removeAttribute("readonly");
		}
		else
		{
			_setAttribute("readonly", "");
		}
	}

	public boolean getReadOnly()
	{
		return readonly;
	}

	public void setRequired(boolean in)
	{
		this.required = in;
		if (!this.required)
		{
			_removeAttribute("required");
		}
		else
		{
			_setAttribute("required", "");
		}
	}

	public boolean getRequired()
	{
		return required;
	}

	public void setRows(int in)
	{
		this.rows = in < 0 ? -1 : in;
		if (this.rows < 0)
		{
			_removeAttribute("rows");
		}
		else
		{
			_setAttribute("rows", String.valueOf(this.rows));
		}
	}

	public int getRows()
	{
		return rows;
	}

	public void setSpellCheck(String in)
	{
		this.spellcheck = in;
		if (this.spellcheck == null)
		{
			_removeAttribute("spellcheck");
		}
		else
		{
			_setAttribute("spellcheck", this.spellcheck);
		}
	}

	public String getSpellCheck()
	{
		return spellcheck;
	}

	public void setWrap(String in)
	{
		this.wrap = in;
		if (this.wrap == null)
		{
			_removeAttribute("wrap");
		}
		else
		{
			_setAttribute("wrap", this.wrap);
		}
	}

	public String getWrap()
	{
		return wrap;
	}
}
