package attributes;

import java.util.Map;

public class Attributes
{
	public static final String GET_ENTRY_NAME = "getEntry";
	
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
			if (attribute == null)
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
}
