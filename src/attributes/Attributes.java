package attributes;

import java.util.Map;

public class Attributes
{
	public static final <T> Map.Entry<String, T> makeAttribute(String attributeName, T attributeValue)
	{
		return Map.entry(attributeName, attributeValue);
	}

	public interface ID
	{
		public static final String ATTRIBUTE_NAME = "id";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setID(String id)
		{
			if(id == null)
			{
				_removeAttribute(ID.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(ID.ATTRIBUTE_NAME, id);
			}
		}
		public default String getID()
		{
			String attribute = getAttribute(ID.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String id)
		{
			return Map.entry(ID.ATTRIBUTE_NAME, id);
		}
	}
	

	public interface Checked
	{
		public static final String ATTRIBUTE_NAME = "checked";
		public static final Class<Boolean> ATTRIBUTE_TYPE = Boolean.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setChecked(Boolean checked)
		{
			if(!checked)
			{
				_removeAttribute(Checked.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Checked.ATTRIBUTE_NAME, "");
			}
		}
		public default Boolean getChecked()
		{
			String attribute = getAttribute(Checked.ATTRIBUTE_NAME);
			if (attribute == null || Boolean.valueOf(attribute) == false)
			{
				return false;
			}
			return true;
		}

		public static Map.Entry<String, Boolean> makeAttribute(Boolean checked)
		{
			return Map.entry(Checked.ATTRIBUTE_NAME, checked);
		}
	}
	

	public interface Multiple
	{
		public static final String ATTRIBUTE_NAME = "multiple";
		public static final Class<Boolean> ATTRIBUTE_TYPE = Boolean.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setMultiple(Boolean multiple)
		{
			if(!multiple)
			{
				_removeAttribute(Multiple.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Multiple.ATTRIBUTE_NAME, "");
			}
		}
		public default Boolean getMultiple()
		{
			String attribute = getAttribute(Multiple.ATTRIBUTE_NAME);
			if (attribute == null || Boolean.valueOf(attribute) == false)
			{
				return false;
			}
			return true;
		}

		public static Map.Entry<String, Boolean> makeAttribute(Boolean multiple)
		{
			return Map.entry(Multiple.ATTRIBUTE_NAME, multiple);
		}
	}
	

	public interface MinLength
	{
		public static final String ATTRIBUTE_NAME = "minlength";
		public static final Class<Integer> ATTRIBUTE_TYPE = Integer.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setMinLength(Integer minlength)
		{
			if(minlength == null)
			{
				_removeAttribute(MinLength.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(MinLength.ATTRIBUTE_NAME, String.valueOf(minlength));
			}
		}
		public default Integer getMinLength()
		{
			String attribute = getAttribute(MinLength.ATTRIBUTE_NAME);
			if (attribute == null || Integer.valueOf(attribute) == -1)
			{
				return -1;
			}
			return Integer.valueOf(attribute);
		}

		public static Map.Entry<String, Integer> makeAttribute(Integer minlength)
		{
			return Map.entry(MinLength.ATTRIBUTE_NAME, minlength);
		}
	}
	

	public interface MaxLength
	{
		public static final String ATTRIBUTE_NAME = "maxlength";
		public static final Class<Integer> ATTRIBUTE_TYPE = Integer.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setMaxLength(Integer maxlength)
		{
			if(maxlength == null)
			{
				_removeAttribute(MaxLength.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(MaxLength.ATTRIBUTE_NAME, String.valueOf(maxlength));
			}
		}
		public default Integer getMaxLength()
		{
			String attribute = getAttribute(MaxLength.ATTRIBUTE_NAME);
			if (attribute == null || Integer.valueOf(attribute) == -1)
			{
				return -1;
			}
			return Integer.valueOf(attribute);
		}

		public static Map.Entry<String, Integer> makeAttribute(Integer maxlength)
		{
			return Map.entry(MaxLength.ATTRIBUTE_NAME, maxlength);
		}
	}
	

	public interface Size
	{
		public static final String ATTRIBUTE_NAME = "size";
		public static final Class<Integer> ATTRIBUTE_TYPE = Integer.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setSize(Integer size)
		{
			if(size == null)
			{
				_removeAttribute(Size.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Size.ATTRIBUTE_NAME, String.valueOf(size));
			}
		}
		public default Integer getSize()
		{
			String attribute = getAttribute(Size.ATTRIBUTE_NAME);
			if (attribute == null || Integer.valueOf(attribute) == -1)
			{
				return -1;
			}
			return Integer.valueOf(attribute);
		}

		public static Map.Entry<String, Integer> makeAttribute(Integer size)
		{
			return Map.entry(Size.ATTRIBUTE_NAME, size);
		}
	}
	

	public interface Pattern
	{
		public static final String ATTRIBUTE_NAME = "pattern";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setPattern(String pattern)
		{
			if(pattern == null)
			{
				_removeAttribute(Pattern.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Pattern.ATTRIBUTE_NAME, pattern);
			}
		}
		public default String getPattern()
		{
			String attribute = getAttribute(Pattern.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String pattern)
		{
			return Map.entry(Pattern.ATTRIBUTE_NAME, pattern);
		}
	}
	

	public interface PlaceHolder
	{
		public static final String ATTRIBUTE_NAME = "placeholder";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setPlaceHolder(String placeholder)
		{
			if(placeholder == null)
			{
				_removeAttribute(PlaceHolder.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(PlaceHolder.ATTRIBUTE_NAME, placeholder);
			}
		}
		public default String getPlaceHolder()
		{
			String attribute = getAttribute(PlaceHolder.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String placeholder)
		{
			return Map.entry(PlaceHolder.ATTRIBUTE_NAME, placeholder);
		}
	}
	

	public interface SpellCheck
	{
		public static final String ATTRIBUTE_NAME = "spellcheck";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setSpellCheck(String spellcheck)
		{
			if(spellcheck == null)
			{
				_removeAttribute(SpellCheck.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(SpellCheck.ATTRIBUTE_NAME, spellcheck);
			}
		}
		public default String getSpellCheck()
		{
			String attribute = getAttribute(SpellCheck.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String spellcheck)
		{
			return Map.entry(SpellCheck.ATTRIBUTE_NAME, spellcheck);
		}
	}
	

	public interface Required
	{
		public static final String ATTRIBUTE_NAME = "required";
		public static final Class<Boolean> ATTRIBUTE_TYPE = Boolean.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setRequired(Boolean required)
		{
			if(!required)
			{
				_removeAttribute(Required.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Required.ATTRIBUTE_NAME, "");
			}
		}
		public default Boolean getRequired()
		{
			String attribute = getAttribute(Required.ATTRIBUTE_NAME);
			if (attribute == null || Boolean.valueOf(attribute) == false)
			{
				return false;
			}
			return true;
		}

		public static Map.Entry<String, Boolean> makeAttribute(Boolean required)
		{
			return Map.entry(Required.ATTRIBUTE_NAME, required);
		}
	}
	

	public interface AutoFocus
	{
		public static final String ATTRIBUTE_NAME = "autofocus";
		public static final Class<Boolean> ATTRIBUTE_TYPE = Boolean.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setAutoFocus(Boolean autofocus)
		{
			if(!autofocus)
			{
				_removeAttribute(AutoFocus.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(AutoFocus.ATTRIBUTE_NAME, "");
			}
		}
		public default Boolean getAutoFocus()
		{
			String attribute = getAttribute(AutoFocus.ATTRIBUTE_NAME);
			if (attribute == null || Boolean.valueOf(attribute) == false)
			{
				return false;
			}
			return true;
		}

		public static Map.Entry<String, Boolean> makeAttribute(Boolean autofocus)
		{
			return Map.entry(AutoFocus.ATTRIBUTE_NAME, autofocus);
		}
	}
	

	public interface Disabled
	{
		public static final String ATTRIBUTE_NAME = "disabled";
		public static final Class<Boolean> ATTRIBUTE_TYPE = Boolean.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setDisabled(Boolean disabled)
		{
			if(!disabled)
			{
				_removeAttribute(Disabled.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Disabled.ATTRIBUTE_NAME, "");
			}
		}
		public default Boolean getDisabled()
		{
			String attribute = getAttribute(Disabled.ATTRIBUTE_NAME);
			if (attribute == null || Boolean.valueOf(attribute) == false)
			{
				return false;
			}
			return true;
		}

		public static Map.Entry<String, Boolean> makeAttribute(Boolean disabled)
		{
			return Map.entry(Disabled.ATTRIBUTE_NAME, disabled);
		}
	}
	

	public interface AutoComplete
	{
		public static final String ATTRIBUTE_NAME = "autocomplete";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setAutoComplete(String autocomplete)
		{
			if(autocomplete == null)
			{
				_removeAttribute(AutoComplete.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(AutoComplete.ATTRIBUTE_NAME, autocomplete);
			}
		}
		public default String getAutoComplete()
		{
			String attribute = getAttribute(AutoComplete.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String autocomplete)
		{
			return Map.entry(AutoComplete.ATTRIBUTE_NAME, autocomplete);
		}
	}
	

	public interface Form
	{
		public static final String ATTRIBUTE_NAME = "form";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setForm(String form)
		{
			if(form == null)
			{
				_removeAttribute(Form.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Form.ATTRIBUTE_NAME, form);
			}
		}
		public default String getForm()
		{
			String attribute = getAttribute(Form.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String form)
		{
			return Map.entry(Form.ATTRIBUTE_NAME, form);
		}
	}
	

	public interface List
	{
		public static final String ATTRIBUTE_NAME = "list";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setList(String list)
		{
			if(list == null)
			{
				_removeAttribute(List.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(List.ATTRIBUTE_NAME, list);
			}
		}
		public default String getList()
		{
			String attribute = getAttribute(List.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String list)
		{
			return Map.entry(List.ATTRIBUTE_NAME, list);
		}
	}
	

	public interface Name
	{
		public static final String ATTRIBUTE_NAME = "name";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setName(String name)
		{
			if(name == null)
			{
				_removeAttribute(Name.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Name.ATTRIBUTE_NAME, name);
			}
		}
		public default String getName()
		{
			String attribute = getAttribute(Name.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String name)
		{
			return Map.entry(Name.ATTRIBUTE_NAME, name);
		}
	}
	

	public interface ReadOnly
	{
		public static final String ATTRIBUTE_NAME = "readonly";
		public static final Class<Boolean> ATTRIBUTE_TYPE = Boolean.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setReadOnly(Boolean readonly)
		{
			if(!readonly)
			{
				_removeAttribute(ReadOnly.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(ReadOnly.ATTRIBUTE_NAME, "");
			}
		}
		public default Boolean getReadOnly()
		{
			String attribute = getAttribute(ReadOnly.ATTRIBUTE_NAME);
			if (attribute == null || Boolean.valueOf(attribute) == false)
			{
				return false;
			}
			return true;
		}

		public static Map.Entry<String, Boolean> makeAttribute(Boolean readonly)
		{
			return Map.entry(ReadOnly.ATTRIBUTE_NAME, readonly);
		}
	}
	

	public interface TabIndex
	{
		public static final String ATTRIBUTE_NAME = "tabindex";
		public static final Class<Integer> ATTRIBUTE_TYPE = Integer.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setTabIndex(Integer tabindex)
		{
			if(tabindex == null)
			{
				_removeAttribute(TabIndex.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(TabIndex.ATTRIBUTE_NAME, String.valueOf(tabindex));
			}
		}
		public default Integer getTabIndex()
		{
			String attribute = getAttribute(TabIndex.ATTRIBUTE_NAME);
			if (attribute == null || Integer.valueOf(attribute) == -1)
			{
				return -1;
			}
			return Integer.valueOf(attribute);
		}

		public static Map.Entry<String, Integer> makeAttribute(Integer tabindex)
		{
			return Map.entry(TabIndex.ATTRIBUTE_NAME, tabindex);
		}
	}
	

	public interface Value
	{
		public static final String ATTRIBUTE_NAME = "value";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setValue(String value)
		{
			if(value == null)
			{
				_removeAttribute(Value.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Value.ATTRIBUTE_NAME, value);
			}
		}
		public default String getValue()
		{
			String attribute = getAttribute(Value.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String value)
		{
			return Map.entry(Value.ATTRIBUTE_NAME, value);
		}
	}
	

	public interface Accept
	{
		public static final String ATTRIBUTE_NAME = "accept";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setAccept(String accept)
		{
			if(accept == null)
			{
				_removeAttribute(Accept.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Accept.ATTRIBUTE_NAME, accept);
			}
		}
		public default String getAccept()
		{
			String attribute = getAttribute(Accept.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String accept)
		{
			return Map.entry(Accept.ATTRIBUTE_NAME, accept);
		}
	}
	

	public interface Capture
	{
		public static final String ATTRIBUTE_NAME = "capture";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setCapture(String capture)
		{
			if(capture == null)
			{
				_removeAttribute(Capture.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Capture.ATTRIBUTE_NAME, capture);
			}
		}
		public default String getCapture()
		{
			String attribute = getAttribute(Capture.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String capture)
		{
			return Map.entry(Capture.ATTRIBUTE_NAME, capture);
		}
	}
	

	public interface AcceptCharset
	{
		public static final String ATTRIBUTE_NAME = "accept-charset";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setAcceptCharset(String acceptcharset)
		{
			if(acceptcharset == null)
			{
				_removeAttribute(AcceptCharset.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(AcceptCharset.ATTRIBUTE_NAME, acceptcharset);
			}
		}
		public default String getAcceptCharset()
		{
			String attribute = getAttribute(AcceptCharset.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String acceptcharset)
		{
			return Map.entry(AcceptCharset.ATTRIBUTE_NAME, acceptcharset);
		}
	}
	

	public interface Action
	{
		public static final String ATTRIBUTE_NAME = "action";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setAction(String action)
		{
			if(action == null)
			{
				_removeAttribute(Action.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Action.ATTRIBUTE_NAME, action);
			}
		}
		public default String getAction()
		{
			String attribute = getAttribute(Action.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String action)
		{
			return Map.entry(Action.ATTRIBUTE_NAME, action);
		}
	}
	

	public interface AutoCapitalize
	{
		public static final String ATTRIBUTE_NAME = "autocapitalize";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setAutoCapitalize(String autocapitalize)
		{
			if(autocapitalize == null)
			{
				_removeAttribute(AutoCapitalize.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(AutoCapitalize.ATTRIBUTE_NAME, autocapitalize);
			}
		}
		public default String getAutoCapitalize()
		{
			String attribute = getAttribute(AutoCapitalize.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String autocapitalize)
		{
			return Map.entry(AutoCapitalize.ATTRIBUTE_NAME, autocapitalize);
		}
	}
	

	public interface Enctype
	{
		public static final String ATTRIBUTE_NAME = "enctype";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setEnctype(String enctype)
		{
			if(enctype == null)
			{
				_removeAttribute(Enctype.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Enctype.ATTRIBUTE_NAME, enctype);
			}
		}
		public default String getEnctype()
		{
			String attribute = getAttribute(Enctype.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String enctype)
		{
			return Map.entry(Enctype.ATTRIBUTE_NAME, enctype);
		}
	}
	

	public interface Method
	{
		public static final String ATTRIBUTE_NAME = "method";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setMethod(String method)
		{
			if(method == null)
			{
				_removeAttribute(Method.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Method.ATTRIBUTE_NAME, method);
			}
		}
		public default String getMethod()
		{
			String attribute = getAttribute(Method.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String method)
		{
			return Map.entry(Method.ATTRIBUTE_NAME, method);
		}
	}
	

	public interface NoValidate
	{
		public static final String ATTRIBUTE_NAME = "novalidate";
		public static final Class<Boolean> ATTRIBUTE_TYPE = Boolean.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setNoValidate(Boolean novalidate)
		{
			if(!novalidate)
			{
				_removeAttribute(NoValidate.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(NoValidate.ATTRIBUTE_NAME, "");
			}
		}
		public default Boolean getNoValidate()
		{
			String attribute = getAttribute(NoValidate.ATTRIBUTE_NAME);
			if (attribute == null || Boolean.valueOf(attribute) == false)
			{
				return false;
			}
			return true;
		}

		public static Map.Entry<String, Boolean> makeAttribute(Boolean novalidate)
		{
			return Map.entry(NoValidate.ATTRIBUTE_NAME, novalidate);
		}
	}
	

	public interface Target
	{
		public static final String ATTRIBUTE_NAME = "target";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setTarget(String target)
		{
			if(target == null)
			{
				_removeAttribute(Target.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Target.ATTRIBUTE_NAME, target);
			}
		}
		public default String getTarget()
		{
			String attribute = getAttribute(Target.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String target)
		{
			return Map.entry(Target.ATTRIBUTE_NAME, target);
		}
	}
	

	public interface Alt
	{
		public static final String ATTRIBUTE_NAME = "alt";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setAlt(String alt)
		{
			if(alt == null)
			{
				_removeAttribute(Alt.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Alt.ATTRIBUTE_NAME, alt);
			}
		}
		public default String getAlt()
		{
			String attribute = getAttribute(Alt.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String alt)
		{
			return Map.entry(Alt.ATTRIBUTE_NAME, alt);
		}
	}
	

	public interface FormAction
	{
		public static final String ATTRIBUTE_NAME = "formaction";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setFormAction(String formaction)
		{
			if(formaction == null)
			{
				_removeAttribute(FormAction.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(FormAction.ATTRIBUTE_NAME, formaction);
			}
		}
		public default String getFormAction()
		{
			String attribute = getAttribute(FormAction.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String formaction)
		{
			return Map.entry(FormAction.ATTRIBUTE_NAME, formaction);
		}
	}
	

	public interface FormEnctype
	{
		public static final String ATTRIBUTE_NAME = "formenctype";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setFormEnctype(String formenctype)
		{
			if(formenctype == null)
			{
				_removeAttribute(FormEnctype.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(FormEnctype.ATTRIBUTE_NAME, formenctype);
			}
		}
		public default String getFormEnctype()
		{
			String attribute = getAttribute(FormEnctype.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String formenctype)
		{
			return Map.entry(FormEnctype.ATTRIBUTE_NAME, formenctype);
		}
	}
	

	public interface FormMethod
	{
		public static final String ATTRIBUTE_NAME = "formmethod";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setFormMethod(String formmethod)
		{
			if(formmethod == null)
			{
				_removeAttribute(FormMethod.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(FormMethod.ATTRIBUTE_NAME, formmethod);
			}
		}
		public default String getFormMethod()
		{
			String attribute = getAttribute(FormMethod.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String formmethod)
		{
			return Map.entry(FormMethod.ATTRIBUTE_NAME, formmethod);
		}
	}
	

	public interface FormTarget
	{
		public static final String ATTRIBUTE_NAME = "formtarget";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setFormTarget(String formtarget)
		{
			if(formtarget == null)
			{
				_removeAttribute(FormTarget.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(FormTarget.ATTRIBUTE_NAME, formtarget);
			}
		}
		public default String getFormTarget()
		{
			String attribute = getAttribute(FormTarget.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String formtarget)
		{
			return Map.entry(FormTarget.ATTRIBUTE_NAME, formtarget);
		}
	}
	

	public interface FormNoValidate
	{
		public static final String ATTRIBUTE_NAME = "formnovalidate";
		public static final Class<Boolean> ATTRIBUTE_TYPE = Boolean.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setFormNoValidate(Boolean formnovalidate)
		{
			if(!formnovalidate)
			{
				_removeAttribute(FormNoValidate.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(FormNoValidate.ATTRIBUTE_NAME, "");
			}
		}
		public default Boolean getFormNoValidate()
		{
			String attribute = getAttribute(FormNoValidate.ATTRIBUTE_NAME);
			if (attribute == null || Boolean.valueOf(attribute) == false)
			{
				return false;
			}
			return true;
		}

		public static Map.Entry<String, Boolean> makeAttribute(Boolean formnovalidate)
		{
			return Map.entry(FormNoValidate.ATTRIBUTE_NAME, formnovalidate);
		}
	}
	

	public interface Height
	{
		public static final String ATTRIBUTE_NAME = "height";
		public static final Class<Integer> ATTRIBUTE_TYPE = Integer.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setHeight(Integer height)
		{
			if(height == null)
			{
				_removeAttribute(Height.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Height.ATTRIBUTE_NAME, String.valueOf(height));
			}
		}
		public default Integer getHeight()
		{
			String attribute = getAttribute(Height.ATTRIBUTE_NAME);
			if (attribute == null || Integer.valueOf(attribute) == -1)
			{
				return -1;
			}
			return Integer.valueOf(attribute);
		}

		public static Map.Entry<String, Integer> makeAttribute(Integer height)
		{
			return Map.entry(Height.ATTRIBUTE_NAME, height);
		}
	}
	

	public interface Width
	{
		public static final String ATTRIBUTE_NAME = "width";
		public static final Class<Integer> ATTRIBUTE_TYPE = Integer.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setWidth(Integer width)
		{
			if(width == null)
			{
				_removeAttribute(Width.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Width.ATTRIBUTE_NAME, String.valueOf(width));
			}
		}
		public default Integer getWidth()
		{
			String attribute = getAttribute(Width.ATTRIBUTE_NAME);
			if (attribute == null || Integer.valueOf(attribute) == -1)
			{
				return -1;
			}
			return Integer.valueOf(attribute);
		}

		public static Map.Entry<String, Integer> makeAttribute(Integer width)
		{
			return Map.entry(Width.ATTRIBUTE_NAME, width);
		}
	}
	

	public interface Src
	{
		public static final String ATTRIBUTE_NAME = "src";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setSrc(String src)
		{
			if(src == null)
			{
				_removeAttribute(Src.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Src.ATTRIBUTE_NAME, src);
			}
		}
		public default String getSrc()
		{
			String attribute = getAttribute(Src.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String src)
		{
			return Map.entry(Src.ATTRIBUTE_NAME, src);
		}
	}
	

	public interface Max
	{
		public static final String ATTRIBUTE_NAME = "max";
		public static final Class<Double> ATTRIBUTE_TYPE = Double.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setMax(Double max)
		{
			if(max == null)
			{
				_removeAttribute(Max.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Max.ATTRIBUTE_NAME, String.valueOf(max));
			}
		}
		public default Double getMax()
		{
			String attribute = getAttribute(Max.ATTRIBUTE_NAME);
			if (attribute == null || Double.valueOf(attribute) == Double.MAX_VALUE)
			{
				return Double.MAX_VALUE;
			}
			return Double.valueOf(attribute);
		}

		public static Map.Entry<String, Double> makeAttribute(Double max)
		{
			return Map.entry(Max.ATTRIBUTE_NAME, max);
		}
	}
	

	public interface Min
	{
		public static final String ATTRIBUTE_NAME = "min";
		public static final Class<Double> ATTRIBUTE_TYPE = Double.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setMin(Double min)
		{
			if(min == null)
			{
				_removeAttribute(Min.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Min.ATTRIBUTE_NAME, String.valueOf(min));
			}
		}
		public default Double getMin()
		{
			String attribute = getAttribute(Min.ATTRIBUTE_NAME);
			if (attribute == null || Double.valueOf(attribute) == Double.MAX_VALUE)
			{
				return Double.MAX_VALUE;
			}
			return Double.valueOf(attribute);
		}

		public static Map.Entry<String, Double> makeAttribute(Double min)
		{
			return Map.entry(Min.ATTRIBUTE_NAME, min);
		}
	}
	

	public interface Step
	{
		public static final String ATTRIBUTE_NAME = "step";
		public static final Class<Double> ATTRIBUTE_TYPE = Double.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setStep(Double step)
		{
			if(step == null)
			{
				_removeAttribute(Step.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Step.ATTRIBUTE_NAME, String.valueOf(step));
			}
		}
		public default Double getStep()
		{
			String attribute = getAttribute(Step.ATTRIBUTE_NAME);
			if (attribute == null || Double.valueOf(attribute) == -1d)
			{
				return -1d;
			}
			return Double.valueOf(attribute);
		}

		public static Map.Entry<String, Double> makeAttribute(Double step)
		{
			return Map.entry(Step.ATTRIBUTE_NAME, step);
		}
	}
	

	public interface OnClick
	{
		public static final String ATTRIBUTE_NAME = "onclick";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnClick(String onclick)
		{
			if(onclick == null)
			{
				_removeAttribute(OnClick.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnClick.ATTRIBUTE_NAME, onclick);
			}
		}
		public default String getOnClick()
		{
			String attribute = getAttribute(OnClick.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onclick)
		{
			return Map.entry(OnClick.ATTRIBUTE_NAME, onclick);
		}
	}
	

	public interface OnDblClick
	{
		public static final String ATTRIBUTE_NAME = "ondblclick";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnDblClick(String ondblclick)
		{
			if(ondblclick == null)
			{
				_removeAttribute(OnDblClick.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnDblClick.ATTRIBUTE_NAME, ondblclick);
			}
		}
		public default String getOnDblClick()
		{
			String attribute = getAttribute(OnDblClick.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String ondblclick)
		{
			return Map.entry(OnDblClick.ATTRIBUTE_NAME, ondblclick);
		}
	}
	

	public interface OnMouseDown
	{
		public static final String ATTRIBUTE_NAME = "onmousedown";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnMouseDown(String onmousedown)
		{
			if(onmousedown == null)
			{
				_removeAttribute(OnMouseDown.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnMouseDown.ATTRIBUTE_NAME, onmousedown);
			}
		}
		public default String getOnMouseDown()
		{
			String attribute = getAttribute(OnMouseDown.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onmousedown)
		{
			return Map.entry(OnMouseDown.ATTRIBUTE_NAME, onmousedown);
		}
	}
	

	public interface OnMouseUp
	{
		public static final String ATTRIBUTE_NAME = "onmouseup";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnMouseUp(String onmouseup)
		{
			if(onmouseup == null)
			{
				_removeAttribute(OnMouseUp.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnMouseUp.ATTRIBUTE_NAME, onmouseup);
			}
		}
		public default String getOnMouseUp()
		{
			String attribute = getAttribute(OnMouseUp.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onmouseup)
		{
			return Map.entry(OnMouseUp.ATTRIBUTE_NAME, onmouseup);
		}
	}
	

	public interface OnMouseOver
	{
		public static final String ATTRIBUTE_NAME = "onmouseover";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnMouseOver(String onmouseover)
		{
			if(onmouseover == null)
			{
				_removeAttribute(OnMouseOver.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnMouseOver.ATTRIBUTE_NAME, onmouseover);
			}
		}
		public default String getOnMouseOver()
		{
			String attribute = getAttribute(OnMouseOver.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onmouseover)
		{
			return Map.entry(OnMouseOver.ATTRIBUTE_NAME, onmouseover);
		}
	}
	

	public interface OnMouseMove
	{
		public static final String ATTRIBUTE_NAME = "onmousemove";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnMouseMove(String onmousemove)
		{
			if(onmousemove == null)
			{
				_removeAttribute(OnMouseMove.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnMouseMove.ATTRIBUTE_NAME, onmousemove);
			}
		}
		public default String getOnMouseMove()
		{
			String attribute = getAttribute(OnMouseMove.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onmousemove)
		{
			return Map.entry(OnMouseMove.ATTRIBUTE_NAME, onmousemove);
		}
	}
	

	public interface OnMouseOut
	{
		public static final String ATTRIBUTE_NAME = "onmouseout";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnMouseOut(String onmouseout)
		{
			if(onmouseout == null)
			{
				_removeAttribute(OnMouseOut.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnMouseOut.ATTRIBUTE_NAME, onmouseout);
			}
		}
		public default String getOnMouseOut()
		{
			String attribute = getAttribute(OnMouseOut.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onmouseout)
		{
			return Map.entry(OnMouseOut.ATTRIBUTE_NAME, onmouseout);
		}
	}
	

	public interface OnMouseEnter
	{
		public static final String ATTRIBUTE_NAME = "onmouseenter";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnMouseEnter(String onmouseenter)
		{
			if(onmouseenter == null)
			{
				_removeAttribute(OnMouseEnter.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnMouseEnter.ATTRIBUTE_NAME, onmouseenter);
			}
		}
		public default String getOnMouseEnter()
		{
			String attribute = getAttribute(OnMouseEnter.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onmouseenter)
		{
			return Map.entry(OnMouseEnter.ATTRIBUTE_NAME, onmouseenter);
		}
	}
	

	public interface OnMouseLeave
	{
		public static final String ATTRIBUTE_NAME = "onmouseleave";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnMouseLeave(String onmouseleave)
		{
			if(onmouseleave == null)
			{
				_removeAttribute(OnMouseLeave.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnMouseLeave.ATTRIBUTE_NAME, onmouseleave);
			}
		}
		public default String getOnMouseLeave()
		{
			String attribute = getAttribute(OnMouseLeave.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onmouseleave)
		{
			return Map.entry(OnMouseLeave.ATTRIBUTE_NAME, onmouseleave);
		}
	}
	

	public interface OnMouseWheel
	{
		public static final String ATTRIBUTE_NAME = "onmousewheel";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnMouseWheel(String onmousewheel)
		{
			if(onmousewheel == null)
			{
				_removeAttribute(OnMouseWheel.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnMouseWheel.ATTRIBUTE_NAME, onmousewheel);
			}
		}
		public default String getOnMouseWheel()
		{
			String attribute = getAttribute(OnMouseWheel.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onmousewheel)
		{
			return Map.entry(OnMouseWheel.ATTRIBUTE_NAME, onmousewheel);
		}
	}
	

	public interface OnKeyPress
	{
		public static final String ATTRIBUTE_NAME = "onkeypress";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnKeyPress(String onkeypress)
		{
			if(onkeypress == null)
			{
				_removeAttribute(OnKeyPress.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnKeyPress.ATTRIBUTE_NAME, onkeypress);
			}
		}
		public default String getOnKeyPress()
		{
			String attribute = getAttribute(OnKeyPress.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onkeypress)
		{
			return Map.entry(OnKeyPress.ATTRIBUTE_NAME, onkeypress);
		}
	}
	

	public interface OnKeyDown
	{
		public static final String ATTRIBUTE_NAME = "onkeydown";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnKeyDown(String onkeydown)
		{
			if(onkeydown == null)
			{
				_removeAttribute(OnKeyDown.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnKeyDown.ATTRIBUTE_NAME, onkeydown);
			}
		}
		public default String getOnKeyDown()
		{
			String attribute = getAttribute(OnKeyDown.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onkeydown)
		{
			return Map.entry(OnKeyDown.ATTRIBUTE_NAME, onkeydown);
		}
	}
	

	public interface OnKeyUp
	{
		public static final String ATTRIBUTE_NAME = "onkeyup";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnKeyUp(String onkeyup)
		{
			if(onkeyup == null)
			{
				_removeAttribute(OnKeyUp.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnKeyUp.ATTRIBUTE_NAME, onkeyup);
			}
		}
		public default String getOnKeyUp()
		{
			String attribute = getAttribute(OnKeyUp.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onkeyup)
		{
			return Map.entry(OnKeyUp.ATTRIBUTE_NAME, onkeyup);
		}
	}
	

	public interface Style
	{
		public static final String ATTRIBUTE_NAME = "style";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setStyle(String style)
		{
			if(style == null)
			{
				_removeAttribute(Style.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Style.ATTRIBUTE_NAME, style);
			}
		}
		public default String getStyle()
		{
			String attribute = getAttribute(Style.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String style)
		{
			return Map.entry(Style.ATTRIBUTE_NAME, style);
		}
	}
	

	public interface Title
	{
		public static final String ATTRIBUTE_NAME = "title";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setTitle(String title)
		{
			if(title == null)
			{
				_removeAttribute(Title.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Title.ATTRIBUTE_NAME, title);
			}
		}
		public default String getTitle()
		{
			String attribute = getAttribute(Title.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String title)
		{
			return Map.entry(Title.ATTRIBUTE_NAME, title);
		}
	}
	

	public interface Href
	{
		public static final String ATTRIBUTE_NAME = "href";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setHref(String href)
		{
			if(href == null)
			{
				_removeAttribute(Href.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Href.ATTRIBUTE_NAME, href);
			}
		}
		public default String getHref()
		{
			String attribute = getAttribute(Href.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String href)
		{
			return Map.entry(Href.ATTRIBUTE_NAME, href);
		}
	}
	

	public interface Async
	{
		public static final String ATTRIBUTE_NAME = "async";
		public static final Class<Boolean> ATTRIBUTE_TYPE = Boolean.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setAsync(Boolean async)
		{
			if(!async)
			{
				_removeAttribute(Async.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Async.ATTRIBUTE_NAME, "");
			}
		}
		public default Boolean getAsync()
		{
			String attribute = getAttribute(Async.ATTRIBUTE_NAME);
			if (attribute == null || Boolean.valueOf(attribute) == false)
			{
				return false;
			}
			return true;
		}

		public static Map.Entry<String, Boolean> makeAttribute(Boolean async)
		{
			return Map.entry(Async.ATTRIBUTE_NAME, async);
		}
	}
	

	public interface CrossOrigin
	{
		public static final String ATTRIBUTE_NAME = "crossorigin";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setCrossOrigin(String crossorigin)
		{
			if(crossorigin == null)
			{
				_removeAttribute(CrossOrigin.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(CrossOrigin.ATTRIBUTE_NAME, crossorigin);
			}
		}
		public default String getCrossOrigin()
		{
			String attribute = getAttribute(CrossOrigin.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String crossorigin)
		{
			return Map.entry(CrossOrigin.ATTRIBUTE_NAME, crossorigin);
		}
	}
	

	public interface Defer
	{
		public static final String ATTRIBUTE_NAME = "defer";
		public static final Class<Boolean> ATTRIBUTE_TYPE = Boolean.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setDefer(Boolean defer)
		{
			if(!defer)
			{
				_removeAttribute(Defer.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Defer.ATTRIBUTE_NAME, "");
			}
		}
		public default Boolean getDefer()
		{
			String attribute = getAttribute(Defer.ATTRIBUTE_NAME);
			if (attribute == null || Boolean.valueOf(attribute) == false)
			{
				return false;
			}
			return true;
		}

		public static Map.Entry<String, Boolean> makeAttribute(Boolean defer)
		{
			return Map.entry(Defer.ATTRIBUTE_NAME, defer);
		}
	}
	

	public interface Integrity
	{
		public static final String ATTRIBUTE_NAME = "integrity";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setIntegrity(String integrity)
		{
			if(integrity == null)
			{
				_removeAttribute(Integrity.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Integrity.ATTRIBUTE_NAME, integrity);
			}
		}
		public default String getIntegrity()
		{
			String attribute = getAttribute(Integrity.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String integrity)
		{
			return Map.entry(Integrity.ATTRIBUTE_NAME, integrity);
		}
	}
	

	public interface NoModule
	{
		public static final String ATTRIBUTE_NAME = "nomodule";
		public static final Class<Boolean> ATTRIBUTE_TYPE = Boolean.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setNoModule(Boolean nomodule)
		{
			if(!nomodule)
			{
				_removeAttribute(NoModule.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(NoModule.ATTRIBUTE_NAME, "");
			}
		}
		public default Boolean getNoModule()
		{
			String attribute = getAttribute(NoModule.ATTRIBUTE_NAME);
			if (attribute == null || Boolean.valueOf(attribute) == false)
			{
				return false;
			}
			return true;
		}

		public static Map.Entry<String, Boolean> makeAttribute(Boolean nomodule)
		{
			return Map.entry(NoModule.ATTRIBUTE_NAME, nomodule);
		}
	}
	

	public interface Nonce
	{
		public static final String ATTRIBUTE_NAME = "nonce";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setNonce(String nonce)
		{
			if(nonce == null)
			{
				_removeAttribute(Nonce.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Nonce.ATTRIBUTE_NAME, nonce);
			}
		}
		public default String getNonce()
		{
			String attribute = getAttribute(Nonce.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String nonce)
		{
			return Map.entry(Nonce.ATTRIBUTE_NAME, nonce);
		}
	}
	

	public interface ReferrerPolicy
	{
		public static final String ATTRIBUTE_NAME = "referrerpolicy";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setReferrerPolicy(String referrerpolicy)
		{
			if(referrerpolicy == null)
			{
				_removeAttribute(ReferrerPolicy.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(ReferrerPolicy.ATTRIBUTE_NAME, referrerpolicy);
			}
		}
		public default String getReferrerPolicy()
		{
			String attribute = getAttribute(ReferrerPolicy.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String referrerpolicy)
		{
			return Map.entry(ReferrerPolicy.ATTRIBUTE_NAME, referrerpolicy);
		}
	}
	

	public interface Type
	{
		public static final String ATTRIBUTE_NAME = "type";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setType(String type)
		{
			if(type == null)
			{
				_removeAttribute(Type.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Type.ATTRIBUTE_NAME, type);
			}
		}
		public default String getType()
		{
			String attribute = getAttribute(Type.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String type)
		{
			return Map.entry(Type.ATTRIBUTE_NAME, type);
		}
	}
	

	public interface As
	{
		public static final String ATTRIBUTE_NAME = "as";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setAs(String as)
		{
			if(as == null)
			{
				_removeAttribute(As.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(As.ATTRIBUTE_NAME, as);
			}
		}
		public default String getAs()
		{
			String attribute = getAttribute(As.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String as)
		{
			return Map.entry(As.ATTRIBUTE_NAME, as);
		}
	}
	

	public interface HrefLang
	{
		public static final String ATTRIBUTE_NAME = "hreflang";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setHrefLang(String hreflang)
		{
			if(hreflang == null)
			{
				_removeAttribute(HrefLang.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(HrefLang.ATTRIBUTE_NAME, hreflang);
			}
		}
		public default String getHrefLang()
		{
			String attribute = getAttribute(HrefLang.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String hreflang)
		{
			return Map.entry(HrefLang.ATTRIBUTE_NAME, hreflang);
		}
	}
	

	public interface Importance
	{
		public static final String ATTRIBUTE_NAME = "importance";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setImportance(String importance)
		{
			if(importance == null)
			{
				_removeAttribute(Importance.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Importance.ATTRIBUTE_NAME, importance);
			}
		}
		public default String getImportance()
		{
			String attribute = getAttribute(Importance.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String importance)
		{
			return Map.entry(Importance.ATTRIBUTE_NAME, importance);
		}
	}
	

	public interface Media
	{
		public static final String ATTRIBUTE_NAME = "media";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setMedia(String media)
		{
			if(media == null)
			{
				_removeAttribute(Media.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Media.ATTRIBUTE_NAME, media);
			}
		}
		public default String getMedia()
		{
			String attribute = getAttribute(Media.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String media)
		{
			return Map.entry(Media.ATTRIBUTE_NAME, media);
		}
	}
	

	public interface Rel
	{
		public static final String ATTRIBUTE_NAME = "rel";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setRel(String rel)
		{
			if(rel == null)
			{
				_removeAttribute(Rel.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Rel.ATTRIBUTE_NAME, rel);
			}
		}
		public default String getRel()
		{
			String attribute = getAttribute(Rel.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String rel)
		{
			return Map.entry(Rel.ATTRIBUTE_NAME, rel);
		}
	}
	

	public interface Sizes
	{
		public static final String ATTRIBUTE_NAME = "sizes";
		public static final Class<Double> ATTRIBUTE_TYPE = Double.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setSizes(Double sizes)
		{
			if(sizes == null)
			{
				_removeAttribute(Sizes.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Sizes.ATTRIBUTE_NAME, String.valueOf(sizes));
			}
		}
		public default Double getSizes()
		{
			String attribute = getAttribute(Sizes.ATTRIBUTE_NAME);
			if (attribute == null || Double.valueOf(attribute) == Double.MAX_VALUE)
			{
				return Double.MAX_VALUE;
			}
			return Double.valueOf(attribute);
		}

		public static Map.Entry<String, Double> makeAttribute(Double sizes)
		{
			return Map.entry(Sizes.ATTRIBUTE_NAME, sizes);
		}
	}
	

	public interface Cols
	{
		public static final String ATTRIBUTE_NAME = "cols";
		public static final Class<Integer> ATTRIBUTE_TYPE = Integer.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setCols(Integer cols)
		{
			if(cols == null)
			{
				_removeAttribute(Cols.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Cols.ATTRIBUTE_NAME, String.valueOf(cols));
			}
		}
		public default Integer getCols()
		{
			String attribute = getAttribute(Cols.ATTRIBUTE_NAME);
			if (attribute == null || Integer.valueOf(attribute) == -1)
			{
				return -1;
			}
			return Integer.valueOf(attribute);
		}

		public static Map.Entry<String, Integer> makeAttribute(Integer cols)
		{
			return Map.entry(Cols.ATTRIBUTE_NAME, cols);
		}
	}
	

	public interface Rows
	{
		public static final String ATTRIBUTE_NAME = "rows";
		public static final Class<Integer> ATTRIBUTE_TYPE = Integer.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setRows(Integer rows)
		{
			if(rows == null)
			{
				_removeAttribute(Rows.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Rows.ATTRIBUTE_NAME, String.valueOf(rows));
			}
		}
		public default Integer getRows()
		{
			String attribute = getAttribute(Rows.ATTRIBUTE_NAME);
			if (attribute == null || Integer.valueOf(attribute) == -1)
			{
				return -1;
			}
			return Integer.valueOf(attribute);
		}

		public static Map.Entry<String, Integer> makeAttribute(Integer rows)
		{
			return Map.entry(Rows.ATTRIBUTE_NAME, rows);
		}
	}
	

	public interface Wrap
	{
		public static final String ATTRIBUTE_NAME = "wrap";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setWrap(String wrap)
		{
			if(wrap == null)
			{
				_removeAttribute(Wrap.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Wrap.ATTRIBUTE_NAME, wrap);
			}
		}
		public default String getWrap()
		{
			String attribute = getAttribute(Wrap.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String wrap)
		{
			return Map.entry(Wrap.ATTRIBUTE_NAME, wrap);
		}
	}
	

	public interface Hidden
	{
		public static final String ATTRIBUTE_NAME = "hidden";
		public static final Class<Boolean> ATTRIBUTE_TYPE = Boolean.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setHidden(Boolean hidden)
		{
			if(!hidden)
			{
				_removeAttribute(Hidden.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Hidden.ATTRIBUTE_NAME, "");
			}
		}
		public default Boolean getHidden()
		{
			String attribute = getAttribute(Hidden.ATTRIBUTE_NAME);
			if (attribute == null || Boolean.valueOf(attribute) == false)
			{
				return false;
			}
			return true;
		}

		public static Map.Entry<String, Boolean> makeAttribute(Boolean hidden)
		{
			return Map.entry(Hidden.ATTRIBUTE_NAME, hidden);
		}
	}
	

	public interface OnAfterPrint
	{
		public static final String ATTRIBUTE_NAME = "onafterprint";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnAfterPrint(String onafterprint)
		{
			if(onafterprint == null)
			{
				_removeAttribute(OnAfterPrint.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnAfterPrint.ATTRIBUTE_NAME, onafterprint);
			}
		}
		public default String getOnAfterPrint()
		{
			String attribute = getAttribute(OnAfterPrint.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onafterprint)
		{
			return Map.entry(OnAfterPrint.ATTRIBUTE_NAME, onafterprint);
		}
	}
	

	public interface OnBeforePrint
	{
		public static final String ATTRIBUTE_NAME = "onbeforeprint";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnBeforePrint(String onbeforeprint)
		{
			if(onbeforeprint == null)
			{
				_removeAttribute(OnBeforePrint.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnBeforePrint.ATTRIBUTE_NAME, onbeforeprint);
			}
		}
		public default String getOnBeforePrint()
		{
			String attribute = getAttribute(OnBeforePrint.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onbeforeprint)
		{
			return Map.entry(OnBeforePrint.ATTRIBUTE_NAME, onbeforeprint);
		}
	}
	

	public interface OnBeforeUnload
	{
		public static final String ATTRIBUTE_NAME = "onbeforeunload";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnBeforeUnload(String onbeforeunload)
		{
			if(onbeforeunload == null)
			{
				_removeAttribute(OnBeforeUnload.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnBeforeUnload.ATTRIBUTE_NAME, onbeforeunload);
			}
		}
		public default String getOnBeforeUnload()
		{
			String attribute = getAttribute(OnBeforeUnload.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onbeforeunload)
		{
			return Map.entry(OnBeforeUnload.ATTRIBUTE_NAME, onbeforeunload);
		}
	}
	

	public interface OnBlur
	{
		public static final String ATTRIBUTE_NAME = "onblur";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnBlur(String onblur)
		{
			if(onblur == null)
			{
				_removeAttribute(OnBlur.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnBlur.ATTRIBUTE_NAME, onblur);
			}
		}
		public default String getOnBlur()
		{
			String attribute = getAttribute(OnBlur.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onblur)
		{
			return Map.entry(OnBlur.ATTRIBUTE_NAME, onblur);
		}
	}
	

	public interface OnError
	{
		public static final String ATTRIBUTE_NAME = "onerror";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnError(String onerror)
		{
			if(onerror == null)
			{
				_removeAttribute(OnError.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnError.ATTRIBUTE_NAME, onerror);
			}
		}
		public default String getOnError()
		{
			String attribute = getAttribute(OnError.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onerror)
		{
			return Map.entry(OnError.ATTRIBUTE_NAME, onerror);
		}
	}
	

	public interface OnFocus
	{
		public static final String ATTRIBUTE_NAME = "onfocus";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnFocus(String onfocus)
		{
			if(onfocus == null)
			{
				_removeAttribute(OnFocus.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnFocus.ATTRIBUTE_NAME, onfocus);
			}
		}
		public default String getOnFocus()
		{
			String attribute = getAttribute(OnFocus.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onfocus)
		{
			return Map.entry(OnFocus.ATTRIBUTE_NAME, onfocus);
		}
	}
	

	public interface OnHashChange
	{
		public static final String ATTRIBUTE_NAME = "onhashchange";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnHashChange(String onhashchange)
		{
			if(onhashchange == null)
			{
				_removeAttribute(OnHashChange.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnHashChange.ATTRIBUTE_NAME, onhashchange);
			}
		}
		public default String getOnHashChange()
		{
			String attribute = getAttribute(OnHashChange.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onhashchange)
		{
			return Map.entry(OnHashChange.ATTRIBUTE_NAME, onhashchange);
		}
	}
	

	public interface OnLoad
	{
		public static final String ATTRIBUTE_NAME = "onload";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnLoad(String onload)
		{
			if(onload == null)
			{
				_removeAttribute(OnLoad.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnLoad.ATTRIBUTE_NAME, onload);
			}
		}
		public default String getOnLoad()
		{
			String attribute = getAttribute(OnLoad.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onload)
		{
			return Map.entry(OnLoad.ATTRIBUTE_NAME, onload);
		}
	}
	

	public interface OnMessage
	{
		public static final String ATTRIBUTE_NAME = "onmessage";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnMessage(String onmessage)
		{
			if(onmessage == null)
			{
				_removeAttribute(OnMessage.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnMessage.ATTRIBUTE_NAME, onmessage);
			}
		}
		public default String getOnMessage()
		{
			String attribute = getAttribute(OnMessage.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onmessage)
		{
			return Map.entry(OnMessage.ATTRIBUTE_NAME, onmessage);
		}
	}
	

	public interface OnOffline
	{
		public static final String ATTRIBUTE_NAME = "onoffline";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnOffline(String onoffline)
		{
			if(onoffline == null)
			{
				_removeAttribute(OnOffline.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnOffline.ATTRIBUTE_NAME, onoffline);
			}
		}
		public default String getOnOffline()
		{
			String attribute = getAttribute(OnOffline.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onoffline)
		{
			return Map.entry(OnOffline.ATTRIBUTE_NAME, onoffline);
		}
	}
	

	public interface OnOnline
	{
		public static final String ATTRIBUTE_NAME = "ononline";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnOnline(String ononline)
		{
			if(ononline == null)
			{
				_removeAttribute(OnOnline.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnOnline.ATTRIBUTE_NAME, ononline);
			}
		}
		public default String getOnOnline()
		{
			String attribute = getAttribute(OnOnline.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String ononline)
		{
			return Map.entry(OnOnline.ATTRIBUTE_NAME, ononline);
		}
	}
	

	public interface OnPopState
	{
		public static final String ATTRIBUTE_NAME = "onpopstate";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnPopState(String onpopstate)
		{
			if(onpopstate == null)
			{
				_removeAttribute(OnPopState.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnPopState.ATTRIBUTE_NAME, onpopstate);
			}
		}
		public default String getOnPopState()
		{
			String attribute = getAttribute(OnPopState.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onpopstate)
		{
			return Map.entry(OnPopState.ATTRIBUTE_NAME, onpopstate);
		}
	}
	

	public interface OnRedo
	{
		public static final String ATTRIBUTE_NAME = "onredo";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnRedo(String onredo)
		{
			if(onredo == null)
			{
				_removeAttribute(OnRedo.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnRedo.ATTRIBUTE_NAME, onredo);
			}
		}
		public default String getOnRedo()
		{
			String attribute = getAttribute(OnRedo.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onredo)
		{
			return Map.entry(OnRedo.ATTRIBUTE_NAME, onredo);
		}
	}
	

	public interface OnResize
	{
		public static final String ATTRIBUTE_NAME = "onresize";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnResize(String onresize)
		{
			if(onresize == null)
			{
				_removeAttribute(OnResize.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnResize.ATTRIBUTE_NAME, onresize);
			}
		}
		public default String getOnResize()
		{
			String attribute = getAttribute(OnResize.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onresize)
		{
			return Map.entry(OnResize.ATTRIBUTE_NAME, onresize);
		}
	}
	

	public interface OnStorage
	{
		public static final String ATTRIBUTE_NAME = "onstorage";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnStorage(String onstorage)
		{
			if(onstorage == null)
			{
				_removeAttribute(OnStorage.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnStorage.ATTRIBUTE_NAME, onstorage);
			}
		}
		public default String getOnStorage()
		{
			String attribute = getAttribute(OnStorage.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onstorage)
		{
			return Map.entry(OnStorage.ATTRIBUTE_NAME, onstorage);
		}
	}
	

	public interface OnUndo
	{
		public static final String ATTRIBUTE_NAME = "onundo";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnUndo(String onundo)
		{
			if(onundo == null)
			{
				_removeAttribute(OnUndo.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnUndo.ATTRIBUTE_NAME, onundo);
			}
		}
		public default String getOnUndo()
		{
			String attribute = getAttribute(OnUndo.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onundo)
		{
			return Map.entry(OnUndo.ATTRIBUTE_NAME, onundo);
		}
	}
	

	public interface OnUnload
	{
		public static final String ATTRIBUTE_NAME = "onunload";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnUnload(String onunload)
		{
			if(onunload == null)
			{
				_removeAttribute(OnUnload.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnUnload.ATTRIBUTE_NAME, onunload);
			}
		}
		public default String getOnUnload()
		{
			String attribute = getAttribute(OnUnload.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onunload)
		{
			return Map.entry(OnUnload.ATTRIBUTE_NAME, onunload);
		}
	}
	

	public interface Lang
	{
		public static final String ATTRIBUTE_NAME = "lang";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setLang(String lang)
		{
			if(lang == null)
			{
				_removeAttribute(Lang.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Lang.ATTRIBUTE_NAME, lang);
			}
		}
		public default String getLang()
		{
			String attribute = getAttribute(Lang.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String lang)
		{
			return Map.entry(Lang.ATTRIBUTE_NAME, lang);
		}
	}
	

	public interface OnAbort
	{
		public static final String ATTRIBUTE_NAME = "onabort";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnAbort(String onabort)
		{
			if(onabort == null)
			{
				_removeAttribute(OnAbort.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnAbort.ATTRIBUTE_NAME, onabort);
			}
		}
		public default String getOnAbort()
		{
			String attribute = getAttribute(OnAbort.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onabort)
		{
			return Map.entry(OnAbort.ATTRIBUTE_NAME, onabort);
		}
	}
	

	public interface OnAutoComplete
	{
		public static final String ATTRIBUTE_NAME = "onautocomplete";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnAutoComplete(String onautocomplete)
		{
			if(onautocomplete == null)
			{
				_removeAttribute(OnAutoComplete.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnAutoComplete.ATTRIBUTE_NAME, onautocomplete);
			}
		}
		public default String getOnAutoComplete()
		{
			String attribute = getAttribute(OnAutoComplete.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onautocomplete)
		{
			return Map.entry(OnAutoComplete.ATTRIBUTE_NAME, onautocomplete);
		}
	}
	

	public interface OnAutoCompleteError
	{
		public static final String ATTRIBUTE_NAME = "onautocompleteerror";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnAutoCompleteError(String onautocompleteerror)
		{
			if(onautocompleteerror == null)
			{
				_removeAttribute(OnAutoCompleteError.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnAutoCompleteError.ATTRIBUTE_NAME, onautocompleteerror);
			}
		}
		public default String getOnAutoCompleteError()
		{
			String attribute = getAttribute(OnAutoCompleteError.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onautocompleteerror)
		{
			return Map.entry(OnAutoCompleteError.ATTRIBUTE_NAME, onautocompleteerror);
		}
	}
	

	public interface OnCancel
	{
		public static final String ATTRIBUTE_NAME = "oncancel";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnCancel(String oncancel)
		{
			if(oncancel == null)
			{
				_removeAttribute(OnCancel.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnCancel.ATTRIBUTE_NAME, oncancel);
			}
		}
		public default String getOnCancel()
		{
			String attribute = getAttribute(OnCancel.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String oncancel)
		{
			return Map.entry(OnCancel.ATTRIBUTE_NAME, oncancel);
		}
	}
	

	public interface OnCanPlay
	{
		public static final String ATTRIBUTE_NAME = "oncanplay";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnCanPlay(String oncanplay)
		{
			if(oncanplay == null)
			{
				_removeAttribute(OnCanPlay.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnCanPlay.ATTRIBUTE_NAME, oncanplay);
			}
		}
		public default String getOnCanPlay()
		{
			String attribute = getAttribute(OnCanPlay.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String oncanplay)
		{
			return Map.entry(OnCanPlay.ATTRIBUTE_NAME, oncanplay);
		}
	}
	

	public interface OnCanPlayThrough
	{
		public static final String ATTRIBUTE_NAME = "oncanplaythrough";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnCanPlayThrough(String oncanplaythrough)
		{
			if(oncanplaythrough == null)
			{
				_removeAttribute(OnCanPlayThrough.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnCanPlayThrough.ATTRIBUTE_NAME, oncanplaythrough);
			}
		}
		public default String getOnCanPlayThrough()
		{
			String attribute = getAttribute(OnCanPlayThrough.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String oncanplaythrough)
		{
			return Map.entry(OnCanPlayThrough.ATTRIBUTE_NAME, oncanplaythrough);
		}
	}
	

	public interface OnClose
	{
		public static final String ATTRIBUTE_NAME = "onclose";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnClose(String onclose)
		{
			if(onclose == null)
			{
				_removeAttribute(OnClose.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnClose.ATTRIBUTE_NAME, onclose);
			}
		}
		public default String getOnClose()
		{
			String attribute = getAttribute(OnClose.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onclose)
		{
			return Map.entry(OnClose.ATTRIBUTE_NAME, onclose);
		}
	}
	

	public interface OnContextMenu
	{
		public static final String ATTRIBUTE_NAME = "oncontextmenu";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnContextMenu(String oncontextmenu)
		{
			if(oncontextmenu == null)
			{
				_removeAttribute(OnContextMenu.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnContextMenu.ATTRIBUTE_NAME, oncontextmenu);
			}
		}
		public default String getOnContextMenu()
		{
			String attribute = getAttribute(OnContextMenu.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String oncontextmenu)
		{
			return Map.entry(OnContextMenu.ATTRIBUTE_NAME, oncontextmenu);
		}
	}
	

	public interface OnCueChange
	{
		public static final String ATTRIBUTE_NAME = "oncuechange";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnCueChange(String oncuechange)
		{
			if(oncuechange == null)
			{
				_removeAttribute(OnCueChange.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnCueChange.ATTRIBUTE_NAME, oncuechange);
			}
		}
		public default String getOnCueChange()
		{
			String attribute = getAttribute(OnCueChange.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String oncuechange)
		{
			return Map.entry(OnCueChange.ATTRIBUTE_NAME, oncuechange);
		}
	}
	

	public interface OnDrag
	{
		public static final String ATTRIBUTE_NAME = "ondrag";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnDrag(String ondrag)
		{
			if(ondrag == null)
			{
				_removeAttribute(OnDrag.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnDrag.ATTRIBUTE_NAME, ondrag);
			}
		}
		public default String getOnDrag()
		{
			String attribute = getAttribute(OnDrag.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String ondrag)
		{
			return Map.entry(OnDrag.ATTRIBUTE_NAME, ondrag);
		}
	}
	

	public interface OnDragEnd
	{
		public static final String ATTRIBUTE_NAME = "ondragend";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnDragEnd(String ondragend)
		{
			if(ondragend == null)
			{
				_removeAttribute(OnDragEnd.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnDragEnd.ATTRIBUTE_NAME, ondragend);
			}
		}
		public default String getOnDragEnd()
		{
			String attribute = getAttribute(OnDragEnd.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String ondragend)
		{
			return Map.entry(OnDragEnd.ATTRIBUTE_NAME, ondragend);
		}
	}
	

	public interface OnDragEnter
	{
		public static final String ATTRIBUTE_NAME = "ondragenter";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnDragEnter(String ondragenter)
		{
			if(ondragenter == null)
			{
				_removeAttribute(OnDragEnter.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnDragEnter.ATTRIBUTE_NAME, ondragenter);
			}
		}
		public default String getOnDragEnter()
		{
			String attribute = getAttribute(OnDragEnter.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String ondragenter)
		{
			return Map.entry(OnDragEnter.ATTRIBUTE_NAME, ondragenter);
		}
	}
	

	public interface OnDragExit
	{
		public static final String ATTRIBUTE_NAME = "ondragexit";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnDragExit(String ondragexit)
		{
			if(ondragexit == null)
			{
				_removeAttribute(OnDragExit.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnDragExit.ATTRIBUTE_NAME, ondragexit);
			}
		}
		public default String getOnDragExit()
		{
			String attribute = getAttribute(OnDragExit.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String ondragexit)
		{
			return Map.entry(OnDragExit.ATTRIBUTE_NAME, ondragexit);
		}
	}
	

	public interface OnDragLeave
	{
		public static final String ATTRIBUTE_NAME = "ondragleave";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnDragLeave(String ondragleave)
		{
			if(ondragleave == null)
			{
				_removeAttribute(OnDragLeave.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnDragLeave.ATTRIBUTE_NAME, ondragleave);
			}
		}
		public default String getOnDragLeave()
		{
			String attribute = getAttribute(OnDragLeave.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String ondragleave)
		{
			return Map.entry(OnDragLeave.ATTRIBUTE_NAME, ondragleave);
		}
	}
	

	public interface OnDragOver
	{
		public static final String ATTRIBUTE_NAME = "ondragover";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnDragOver(String ondragover)
		{
			if(ondragover == null)
			{
				_removeAttribute(OnDragOver.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnDragOver.ATTRIBUTE_NAME, ondragover);
			}
		}
		public default String getOnDragOver()
		{
			String attribute = getAttribute(OnDragOver.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String ondragover)
		{
			return Map.entry(OnDragOver.ATTRIBUTE_NAME, ondragover);
		}
	}
	

	public interface OnDragStart
	{
		public static final String ATTRIBUTE_NAME = "ondragstart";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnDragStart(String ondragstart)
		{
			if(ondragstart == null)
			{
				_removeAttribute(OnDragStart.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnDragStart.ATTRIBUTE_NAME, ondragstart);
			}
		}
		public default String getOnDragStart()
		{
			String attribute = getAttribute(OnDragStart.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String ondragstart)
		{
			return Map.entry(OnDragStart.ATTRIBUTE_NAME, ondragstart);
		}
	}
	

	public interface OnDrop
	{
		public static final String ATTRIBUTE_NAME = "ondrop";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnDrop(String ondrop)
		{
			if(ondrop == null)
			{
				_removeAttribute(OnDrop.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnDrop.ATTRIBUTE_NAME, ondrop);
			}
		}
		public default String getOnDrop()
		{
			String attribute = getAttribute(OnDrop.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String ondrop)
		{
			return Map.entry(OnDrop.ATTRIBUTE_NAME, ondrop);
		}
	}
	

	public interface OnChange
	{
		public static final String ATTRIBUTE_NAME = "onchange";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnChange(String onchange)
		{
			if(onchange == null)
			{
				_removeAttribute(OnChange.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnChange.ATTRIBUTE_NAME, onchange);
			}
		}
		public default String getOnChange()
		{
			String attribute = getAttribute(OnChange.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onchange)
		{
			return Map.entry(OnChange.ATTRIBUTE_NAME, onchange);
		}
	}
	

	public interface OnDurationChange
	{
		public static final String ATTRIBUTE_NAME = "ondurationchange";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnDurationChange(String ondurationchange)
		{
			if(ondurationchange == null)
			{
				_removeAttribute(OnDurationChange.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnDurationChange.ATTRIBUTE_NAME, ondurationchange);
			}
		}
		public default String getOnDurationChange()
		{
			String attribute = getAttribute(OnDurationChange.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String ondurationchange)
		{
			return Map.entry(OnDurationChange.ATTRIBUTE_NAME, ondurationchange);
		}
	}
	

	public interface OnEmptied
	{
		public static final String ATTRIBUTE_NAME = "onemptied";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnEmptied(String onemptied)
		{
			if(onemptied == null)
			{
				_removeAttribute(OnEmptied.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnEmptied.ATTRIBUTE_NAME, onemptied);
			}
		}
		public default String getOnEmptied()
		{
			String attribute = getAttribute(OnEmptied.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onemptied)
		{
			return Map.entry(OnEmptied.ATTRIBUTE_NAME, onemptied);
		}
	}
	

	public interface OnEnded
	{
		public static final String ATTRIBUTE_NAME = "onended";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnEnded(String onended)
		{
			if(onended == null)
			{
				_removeAttribute(OnEnded.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnEnded.ATTRIBUTE_NAME, onended);
			}
		}
		public default String getOnEnded()
		{
			String attribute = getAttribute(OnEnded.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onended)
		{
			return Map.entry(OnEnded.ATTRIBUTE_NAME, onended);
		}
	}
	

	public interface OnInput
	{
		public static final String ATTRIBUTE_NAME = "oninput";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnInput(String oninput)
		{
			if(oninput == null)
			{
				_removeAttribute(OnInput.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnInput.ATTRIBUTE_NAME, oninput);
			}
		}
		public default String getOnInput()
		{
			String attribute = getAttribute(OnInput.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String oninput)
		{
			return Map.entry(OnInput.ATTRIBUTE_NAME, oninput);
		}
	}
	

	public interface OnInvalid
	{
		public static final String ATTRIBUTE_NAME = "oninvalid";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnInvalid(String oninvalid)
		{
			if(oninvalid == null)
			{
				_removeAttribute(OnInvalid.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnInvalid.ATTRIBUTE_NAME, oninvalid);
			}
		}
		public default String getOnInvalid()
		{
			String attribute = getAttribute(OnInvalid.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String oninvalid)
		{
			return Map.entry(OnInvalid.ATTRIBUTE_NAME, oninvalid);
		}
	}
	

	public interface OnLoadedData
	{
		public static final String ATTRIBUTE_NAME = "onloadeddata";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnLoadedData(String onloadeddata)
		{
			if(onloadeddata == null)
			{
				_removeAttribute(OnLoadedData.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnLoadedData.ATTRIBUTE_NAME, onloadeddata);
			}
		}
		public default String getOnLoadedData()
		{
			String attribute = getAttribute(OnLoadedData.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onloadeddata)
		{
			return Map.entry(OnLoadedData.ATTRIBUTE_NAME, onloadeddata);
		}
	}
	

	public interface OnLoadedMetadata
	{
		public static final String ATTRIBUTE_NAME = "onloadedmetadata";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnLoadedMetadata(String onloadedmetadata)
		{
			if(onloadedmetadata == null)
			{
				_removeAttribute(OnLoadedMetadata.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnLoadedMetadata.ATTRIBUTE_NAME, onloadedmetadata);
			}
		}
		public default String getOnLoadedMetadata()
		{
			String attribute = getAttribute(OnLoadedMetadata.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onloadedmetadata)
		{
			return Map.entry(OnLoadedMetadata.ATTRIBUTE_NAME, onloadedmetadata);
		}
	}
	

	public interface OnLoadStart
	{
		public static final String ATTRIBUTE_NAME = "onloadstart";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnLoadStart(String onloadstart)
		{
			if(onloadstart == null)
			{
				_removeAttribute(OnLoadStart.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnLoadStart.ATTRIBUTE_NAME, onloadstart);
			}
		}
		public default String getOnLoadStart()
		{
			String attribute = getAttribute(OnLoadStart.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onloadstart)
		{
			return Map.entry(OnLoadStart.ATTRIBUTE_NAME, onloadstart);
		}
	}
	

	public interface OnPause
	{
		public static final String ATTRIBUTE_NAME = "onpause";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnPause(String onpause)
		{
			if(onpause == null)
			{
				_removeAttribute(OnPause.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnPause.ATTRIBUTE_NAME, onpause);
			}
		}
		public default String getOnPause()
		{
			String attribute = getAttribute(OnPause.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onpause)
		{
			return Map.entry(OnPause.ATTRIBUTE_NAME, onpause);
		}
	}
	

	public interface OnPlay
	{
		public static final String ATTRIBUTE_NAME = "onplay";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnPlay(String onplay)
		{
			if(onplay == null)
			{
				_removeAttribute(OnPlay.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnPlay.ATTRIBUTE_NAME, onplay);
			}
		}
		public default String getOnPlay()
		{
			String attribute = getAttribute(OnPlay.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onplay)
		{
			return Map.entry(OnPlay.ATTRIBUTE_NAME, onplay);
		}
	}
	

	public interface OnPlaying
	{
		public static final String ATTRIBUTE_NAME = "onplaying";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnPlaying(String onplaying)
		{
			if(onplaying == null)
			{
				_removeAttribute(OnPlaying.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnPlaying.ATTRIBUTE_NAME, onplaying);
			}
		}
		public default String getOnPlaying()
		{
			String attribute = getAttribute(OnPlaying.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onplaying)
		{
			return Map.entry(OnPlaying.ATTRIBUTE_NAME, onplaying);
		}
	}
	

	public interface OnProgress
	{
		public static final String ATTRIBUTE_NAME = "onprogress";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnProgress(String onprogress)
		{
			if(onprogress == null)
			{
				_removeAttribute(OnProgress.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnProgress.ATTRIBUTE_NAME, onprogress);
			}
		}
		public default String getOnProgress()
		{
			String attribute = getAttribute(OnProgress.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onprogress)
		{
			return Map.entry(OnProgress.ATTRIBUTE_NAME, onprogress);
		}
	}
	

	public interface OnRateChange
	{
		public static final String ATTRIBUTE_NAME = "onratechange";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnRateChange(String onratechange)
		{
			if(onratechange == null)
			{
				_removeAttribute(OnRateChange.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnRateChange.ATTRIBUTE_NAME, onratechange);
			}
		}
		public default String getOnRateChange()
		{
			String attribute = getAttribute(OnRateChange.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onratechange)
		{
			return Map.entry(OnRateChange.ATTRIBUTE_NAME, onratechange);
		}
	}
	

	public interface OnReset
	{
		public static final String ATTRIBUTE_NAME = "onreset";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnReset(String onreset)
		{
			if(onreset == null)
			{
				_removeAttribute(OnReset.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnReset.ATTRIBUTE_NAME, onreset);
			}
		}
		public default String getOnReset()
		{
			String attribute = getAttribute(OnReset.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onreset)
		{
			return Map.entry(OnReset.ATTRIBUTE_NAME, onreset);
		}
	}
	

	public interface OnScroll
	{
		public static final String ATTRIBUTE_NAME = "onscroll";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnScroll(String onscroll)
		{
			if(onscroll == null)
			{
				_removeAttribute(OnScroll.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnScroll.ATTRIBUTE_NAME, onscroll);
			}
		}
		public default String getOnScroll()
		{
			String attribute = getAttribute(OnScroll.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onscroll)
		{
			return Map.entry(OnScroll.ATTRIBUTE_NAME, onscroll);
		}
	}
	

	public interface OnSeeked
	{
		public static final String ATTRIBUTE_NAME = "onseeked";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnSeeked(String onseeked)
		{
			if(onseeked == null)
			{
				_removeAttribute(OnSeeked.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnSeeked.ATTRIBUTE_NAME, onseeked);
			}
		}
		public default String getOnSeeked()
		{
			String attribute = getAttribute(OnSeeked.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onseeked)
		{
			return Map.entry(OnSeeked.ATTRIBUTE_NAME, onseeked);
		}
	}
	

	public interface OnSeeking
	{
		public static final String ATTRIBUTE_NAME = "onseeking";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnSeeking(String onseeking)
		{
			if(onseeking == null)
			{
				_removeAttribute(OnSeeking.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnSeeking.ATTRIBUTE_NAME, onseeking);
			}
		}
		public default String getOnSeeking()
		{
			String attribute = getAttribute(OnSeeking.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onseeking)
		{
			return Map.entry(OnSeeking.ATTRIBUTE_NAME, onseeking);
		}
	}
	

	public interface OnSelect
	{
		public static final String ATTRIBUTE_NAME = "onselect";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnSelect(String onselect)
		{
			if(onselect == null)
			{
				_removeAttribute(OnSelect.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnSelect.ATTRIBUTE_NAME, onselect);
			}
		}
		public default String getOnSelect()
		{
			String attribute = getAttribute(OnSelect.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onselect)
		{
			return Map.entry(OnSelect.ATTRIBUTE_NAME, onselect);
		}
	}
	

	public interface OnShow
	{
		public static final String ATTRIBUTE_NAME = "onshow";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnShow(String onshow)
		{
			if(onshow == null)
			{
				_removeAttribute(OnShow.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnShow.ATTRIBUTE_NAME, onshow);
			}
		}
		public default String getOnShow()
		{
			String attribute = getAttribute(OnShow.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onshow)
		{
			return Map.entry(OnShow.ATTRIBUTE_NAME, onshow);
		}
	}
	

	public interface OnSort
	{
		public static final String ATTRIBUTE_NAME = "onsort";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnSort(String onsort)
		{
			if(onsort == null)
			{
				_removeAttribute(OnSort.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnSort.ATTRIBUTE_NAME, onsort);
			}
		}
		public default String getOnSort()
		{
			String attribute = getAttribute(OnSort.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onsort)
		{
			return Map.entry(OnSort.ATTRIBUTE_NAME, onsort);
		}
	}
	

	public interface OnStalled
	{
		public static final String ATTRIBUTE_NAME = "onstalled";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnStalled(String onstalled)
		{
			if(onstalled == null)
			{
				_removeAttribute(OnStalled.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnStalled.ATTRIBUTE_NAME, onstalled);
			}
		}
		public default String getOnStalled()
		{
			String attribute = getAttribute(OnStalled.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onstalled)
		{
			return Map.entry(OnStalled.ATTRIBUTE_NAME, onstalled);
		}
	}
	

	public interface OnSubmit
	{
		public static final String ATTRIBUTE_NAME = "onsubmit";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnSubmit(String onsubmit)
		{
			if(onsubmit == null)
			{
				_removeAttribute(OnSubmit.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnSubmit.ATTRIBUTE_NAME, onsubmit);
			}
		}
		public default String getOnSubmit()
		{
			String attribute = getAttribute(OnSubmit.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onsubmit)
		{
			return Map.entry(OnSubmit.ATTRIBUTE_NAME, onsubmit);
		}
	}
	

	public interface OnSuspend
	{
		public static final String ATTRIBUTE_NAME = "onsuspend";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnSuspend(String onsuspend)
		{
			if(onsuspend == null)
			{
				_removeAttribute(OnSuspend.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnSuspend.ATTRIBUTE_NAME, onsuspend);
			}
		}
		public default String getOnSuspend()
		{
			String attribute = getAttribute(OnSuspend.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onsuspend)
		{
			return Map.entry(OnSuspend.ATTRIBUTE_NAME, onsuspend);
		}
	}
	

	public interface OnTimeUpdate
	{
		public static final String ATTRIBUTE_NAME = "ontimeupdate";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnTimeUpdate(String ontimeupdate)
		{
			if(ontimeupdate == null)
			{
				_removeAttribute(OnTimeUpdate.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnTimeUpdate.ATTRIBUTE_NAME, ontimeupdate);
			}
		}
		public default String getOnTimeUpdate()
		{
			String attribute = getAttribute(OnTimeUpdate.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String ontimeupdate)
		{
			return Map.entry(OnTimeUpdate.ATTRIBUTE_NAME, ontimeupdate);
		}
	}
	

	public interface OnToggle
	{
		public static final String ATTRIBUTE_NAME = "ontoggle";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnToggle(String ontoggle)
		{
			if(ontoggle == null)
			{
				_removeAttribute(OnToggle.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnToggle.ATTRIBUTE_NAME, ontoggle);
			}
		}
		public default String getOnToggle()
		{
			String attribute = getAttribute(OnToggle.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String ontoggle)
		{
			return Map.entry(OnToggle.ATTRIBUTE_NAME, ontoggle);
		}
	}
	

	public interface OnVolumeChange
	{
		public static final String ATTRIBUTE_NAME = "onvolumechange";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnVolumeChange(String onvolumechange)
		{
			if(onvolumechange == null)
			{
				_removeAttribute(OnVolumeChange.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnVolumeChange.ATTRIBUTE_NAME, onvolumechange);
			}
		}
		public default String getOnVolumeChange()
		{
			String attribute = getAttribute(OnVolumeChange.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onvolumechange)
		{
			return Map.entry(OnVolumeChange.ATTRIBUTE_NAME, onvolumechange);
		}
	}
	

	public interface OnWaiting
	{
		public static final String ATTRIBUTE_NAME = "onwaiting";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setOnWaiting(String onwaiting)
		{
			if(onwaiting == null)
			{
				_removeAttribute(OnWaiting.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(OnWaiting.ATTRIBUTE_NAME, onwaiting);
			}
		}
		public default String getOnWaiting()
		{
			String attribute = getAttribute(OnWaiting.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String onwaiting)
		{
			return Map.entry(OnWaiting.ATTRIBUTE_NAME, onwaiting);
		}
	}
	

	public interface AccessKey
	{
		public static final String ATTRIBUTE_NAME = "accesskey";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setAccessKey(String accesskey)
		{
			if(accesskey == null)
			{
				_removeAttribute(AccessKey.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(AccessKey.ATTRIBUTE_NAME, accesskey);
			}
		}
		public default String getAccessKey()
		{
			String attribute = getAttribute(AccessKey.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String accesskey)
		{
			return Map.entry(AccessKey.ATTRIBUTE_NAME, accesskey);
		}
	}
	

	public interface ContentEditable
	{
		public static final String ATTRIBUTE_NAME = "contenteditable";
		public static final Class<Boolean> ATTRIBUTE_TYPE = Boolean.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setContentEditable(Boolean contenteditable)
		{
			if(contenteditable == null)
			{
				_removeAttribute(ContentEditable.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(ContentEditable.ATTRIBUTE_NAME, String.valueOf(contenteditable));
			}
		}
		public default Boolean getContentEditable()
		{
			String attribute = getAttribute(ContentEditable.ATTRIBUTE_NAME);
			if (attribute == null || Boolean.valueOf(attribute) == null)
			{
				return null;
			}
			return Boolean.valueOf(attribute);
		}

		public static Map.Entry<String, Boolean> makeAttribute(Boolean contenteditable)
		{
			return Map.entry(ContentEditable.ATTRIBUTE_NAME, contenteditable);
		}
	}
	

	public interface Dir
	{
		public static final String ATTRIBUTE_NAME = "dir";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setDir(String dir)
		{
			if(dir == null)
			{
				_removeAttribute(Dir.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Dir.ATTRIBUTE_NAME, dir);
			}
		}
		public default String getDir()
		{
			String attribute = getAttribute(Dir.ATTRIBUTE_NAME);
			if (attribute == null || String.valueOf(attribute) == null)
			{
				return null;
			}
			return attribute;
		}

		public static Map.Entry<String, String> makeAttribute(String dir)
		{
			return Map.entry(Dir.ATTRIBUTE_NAME, dir);
		}
	}
	

	public interface Draggable
	{
		public static final String ATTRIBUTE_NAME = "draggable";
		public static final Class<Boolean> ATTRIBUTE_TYPE = Boolean.class;
		public void _removeAttribute(String name);
		public void _setAttribute(String name, String e);
		public String getAttribute(String name);
		public default void setDraggable(Boolean draggable)
		{
			if(!draggable)
			{
				_removeAttribute(Draggable.ATTRIBUTE_NAME);
			}
			else
			{
				_setAttribute(Draggable.ATTRIBUTE_NAME, "");
			}
		}
		public default Boolean getDraggable()
		{
			String attribute = getAttribute(Draggable.ATTRIBUTE_NAME);
			if (attribute == null || Boolean.valueOf(attribute) == false)
			{
				return false;
			}
			return true;
		}

		public static Map.Entry<String, Boolean> makeAttribute(Boolean draggable)
		{
			return Map.entry(Draggable.ATTRIBUTE_NAME, draggable);
		}
	}
	

}
