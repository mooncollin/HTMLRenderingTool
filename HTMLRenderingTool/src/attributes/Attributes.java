package attributes;

import java.util.Map;

public class Attributes
{
	public static final String GET_ENTRY_NAME = "getEntry";
	

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

		public static Map.Entry<String, Attribute<String>> getEntry(ID e)
		{
			return Map.entry(ID.ATTRIBUTE_NAME, new Attribute<String>(ID.ATTRIBUTE_TYPE, e::setID, null, null));
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

		public static Map.Entry<String, Attribute<Boolean>> getEntry(Checked e)
		{
			return Map.entry(Checked.ATTRIBUTE_NAME, new Attribute<Boolean>(Checked.ATTRIBUTE_TYPE, e::setChecked, true, false));
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

		public static Map.Entry<String, Attribute<Boolean>> getEntry(Multiple e)
		{
			return Map.entry(Multiple.ATTRIBUTE_NAME, new Attribute<Boolean>(Multiple.ATTRIBUTE_TYPE, e::setMultiple, true, false));
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

		public static Map.Entry<String, Attribute<Integer>> getEntry(MinLength e)
		{
			return Map.entry(MinLength.ATTRIBUTE_NAME, new Attribute<Integer>(MinLength.ATTRIBUTE_TYPE, e::setMinLength, null, -1));
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

		public static Map.Entry<String, Attribute<Integer>> getEntry(MaxLength e)
		{
			return Map.entry(MaxLength.ATTRIBUTE_NAME, new Attribute<Integer>(MaxLength.ATTRIBUTE_TYPE, e::setMaxLength, null, -1));
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

		public static Map.Entry<String, Attribute<Integer>> getEntry(Size e)
		{
			return Map.entry(Size.ATTRIBUTE_NAME, new Attribute<Integer>(Size.ATTRIBUTE_TYPE, e::setSize, null, -1));
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

		public static Map.Entry<String, Attribute<String>> getEntry(Pattern e)
		{
			return Map.entry(Pattern.ATTRIBUTE_NAME, new Attribute<String>(Pattern.ATTRIBUTE_TYPE, e::setPattern, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(PlaceHolder e)
		{
			return Map.entry(PlaceHolder.ATTRIBUTE_NAME, new Attribute<String>(PlaceHolder.ATTRIBUTE_TYPE, e::setPlaceHolder, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(SpellCheck e)
		{
			return Map.entry(SpellCheck.ATTRIBUTE_NAME, new Attribute<String>(SpellCheck.ATTRIBUTE_TYPE, e::setSpellCheck, null, null));
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

		public static Map.Entry<String, Attribute<Boolean>> getEntry(Required e)
		{
			return Map.entry(Required.ATTRIBUTE_NAME, new Attribute<Boolean>(Required.ATTRIBUTE_TYPE, e::setRequired, true, false));
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

		public static Map.Entry<String, Attribute<Boolean>> getEntry(AutoFocus e)
		{
			return Map.entry(AutoFocus.ATTRIBUTE_NAME, new Attribute<Boolean>(AutoFocus.ATTRIBUTE_TYPE, e::setAutoFocus, true, false));
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

		public static Map.Entry<String, Attribute<Boolean>> getEntry(Disabled e)
		{
			return Map.entry(Disabled.ATTRIBUTE_NAME, new Attribute<Boolean>(Disabled.ATTRIBUTE_TYPE, e::setDisabled, true, false));
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

		public static Map.Entry<String, Attribute<String>> getEntry(AutoComplete e)
		{
			return Map.entry(AutoComplete.ATTRIBUTE_NAME, new Attribute<String>(AutoComplete.ATTRIBUTE_TYPE, e::setAutoComplete, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(Form e)
		{
			return Map.entry(Form.ATTRIBUTE_NAME, new Attribute<String>(Form.ATTRIBUTE_TYPE, e::setForm, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(List e)
		{
			return Map.entry(List.ATTRIBUTE_NAME, new Attribute<String>(List.ATTRIBUTE_TYPE, e::setList, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(Name e)
		{
			return Map.entry(Name.ATTRIBUTE_NAME, new Attribute<String>(Name.ATTRIBUTE_TYPE, e::setName, null, null));
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

		public static Map.Entry<String, Attribute<Boolean>> getEntry(ReadOnly e)
		{
			return Map.entry(ReadOnly.ATTRIBUTE_NAME, new Attribute<Boolean>(ReadOnly.ATTRIBUTE_TYPE, e::setReadOnly, true, false));
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

		public static Map.Entry<String, Attribute<Integer>> getEntry(TabIndex e)
		{
			return Map.entry(TabIndex.ATTRIBUTE_NAME, new Attribute<Integer>(TabIndex.ATTRIBUTE_TYPE, e::setTabIndex, null, -1));
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

		public static Map.Entry<String, Attribute<String>> getEntry(Value e)
		{
			return Map.entry(Value.ATTRIBUTE_NAME, new Attribute<String>(Value.ATTRIBUTE_TYPE, e::setValue, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(Accept e)
		{
			return Map.entry(Accept.ATTRIBUTE_NAME, new Attribute<String>(Accept.ATTRIBUTE_TYPE, e::setAccept, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(Capture e)
		{
			return Map.entry(Capture.ATTRIBUTE_NAME, new Attribute<String>(Capture.ATTRIBUTE_TYPE, e::setCapture, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(AcceptCharset e)
		{
			return Map.entry(AcceptCharset.ATTRIBUTE_NAME, new Attribute<String>(AcceptCharset.ATTRIBUTE_TYPE, e::setAcceptCharset, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(Action e)
		{
			return Map.entry(Action.ATTRIBUTE_NAME, new Attribute<String>(Action.ATTRIBUTE_TYPE, e::setAction, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(AutoCapitalize e)
		{
			return Map.entry(AutoCapitalize.ATTRIBUTE_NAME, new Attribute<String>(AutoCapitalize.ATTRIBUTE_TYPE, e::setAutoCapitalize, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(Enctype e)
		{
			return Map.entry(Enctype.ATTRIBUTE_NAME, new Attribute<String>(Enctype.ATTRIBUTE_TYPE, e::setEnctype, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(Method e)
		{
			return Map.entry(Method.ATTRIBUTE_NAME, new Attribute<String>(Method.ATTRIBUTE_TYPE, e::setMethod, null, null));
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

		public static Map.Entry<String, Attribute<Boolean>> getEntry(NoValidate e)
		{
			return Map.entry(NoValidate.ATTRIBUTE_NAME, new Attribute<Boolean>(NoValidate.ATTRIBUTE_TYPE, e::setNoValidate, true, false));
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

		public static Map.Entry<String, Attribute<String>> getEntry(Target e)
		{
			return Map.entry(Target.ATTRIBUTE_NAME, new Attribute<String>(Target.ATTRIBUTE_TYPE, e::setTarget, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(Alt e)
		{
			return Map.entry(Alt.ATTRIBUTE_NAME, new Attribute<String>(Alt.ATTRIBUTE_TYPE, e::setAlt, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(FormAction e)
		{
			return Map.entry(FormAction.ATTRIBUTE_NAME, new Attribute<String>(FormAction.ATTRIBUTE_TYPE, e::setFormAction, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(FormEnctype e)
		{
			return Map.entry(FormEnctype.ATTRIBUTE_NAME, new Attribute<String>(FormEnctype.ATTRIBUTE_TYPE, e::setFormEnctype, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(FormMethod e)
		{
			return Map.entry(FormMethod.ATTRIBUTE_NAME, new Attribute<String>(FormMethod.ATTRIBUTE_TYPE, e::setFormMethod, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(FormTarget e)
		{
			return Map.entry(FormTarget.ATTRIBUTE_NAME, new Attribute<String>(FormTarget.ATTRIBUTE_TYPE, e::setFormTarget, null, null));
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

		public static Map.Entry<String, Attribute<Boolean>> getEntry(FormNoValidate e)
		{
			return Map.entry(FormNoValidate.ATTRIBUTE_NAME, new Attribute<Boolean>(FormNoValidate.ATTRIBUTE_TYPE, e::setFormNoValidate, true, false));
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

		public static Map.Entry<String, Attribute<Integer>> getEntry(Height e)
		{
			return Map.entry(Height.ATTRIBUTE_NAME, new Attribute<Integer>(Height.ATTRIBUTE_TYPE, e::setHeight, null, -1));
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

		public static Map.Entry<String, Attribute<Integer>> getEntry(Width e)
		{
			return Map.entry(Width.ATTRIBUTE_NAME, new Attribute<Integer>(Width.ATTRIBUTE_TYPE, e::setWidth, null, -1));
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

		public static Map.Entry<String, Attribute<String>> getEntry(Src e)
		{
			return Map.entry(Src.ATTRIBUTE_NAME, new Attribute<String>(Src.ATTRIBUTE_TYPE, e::setSrc, null, null));
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

		public static Map.Entry<String, Attribute<Double>> getEntry(Max e)
		{
			return Map.entry(Max.ATTRIBUTE_NAME, new Attribute<Double>(Max.ATTRIBUTE_TYPE, e::setMax, null, Double.MAX_VALUE));
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

		public static Map.Entry<String, Attribute<Double>> getEntry(Min e)
		{
			return Map.entry(Min.ATTRIBUTE_NAME, new Attribute<Double>(Min.ATTRIBUTE_TYPE, e::setMin, null, Double.MAX_VALUE));
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

		public static Map.Entry<String, Attribute<Double>> getEntry(Step e)
		{
			return Map.entry(Step.ATTRIBUTE_NAME, new Attribute<Double>(Step.ATTRIBUTE_TYPE, e::setStep, null, -1d));
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

		public static Map.Entry<String, Attribute<String>> getEntry(OnClick e)
		{
			return Map.entry(OnClick.ATTRIBUTE_NAME, new Attribute<String>(OnClick.ATTRIBUTE_TYPE, e::setOnClick, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(OnDblClick e)
		{
			return Map.entry(OnDblClick.ATTRIBUTE_NAME, new Attribute<String>(OnDblClick.ATTRIBUTE_TYPE, e::setOnDblClick, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(OnMouseDown e)
		{
			return Map.entry(OnMouseDown.ATTRIBUTE_NAME, new Attribute<String>(OnMouseDown.ATTRIBUTE_TYPE, e::setOnMouseDown, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(OnMouseUp e)
		{
			return Map.entry(OnMouseUp.ATTRIBUTE_NAME, new Attribute<String>(OnMouseUp.ATTRIBUTE_TYPE, e::setOnMouseUp, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(OnMouseOver e)
		{
			return Map.entry(OnMouseOver.ATTRIBUTE_NAME, new Attribute<String>(OnMouseOver.ATTRIBUTE_TYPE, e::setOnMouseOver, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(OnMouseMove e)
		{
			return Map.entry(OnMouseMove.ATTRIBUTE_NAME, new Attribute<String>(OnMouseMove.ATTRIBUTE_TYPE, e::setOnMouseMove, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(OnMouseOut e)
		{
			return Map.entry(OnMouseOut.ATTRIBUTE_NAME, new Attribute<String>(OnMouseOut.ATTRIBUTE_TYPE, e::setOnMouseOut, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(OnKeyPress e)
		{
			return Map.entry(OnKeyPress.ATTRIBUTE_NAME, new Attribute<String>(OnKeyPress.ATTRIBUTE_TYPE, e::setOnKeyPress, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(OnKeyDown e)
		{
			return Map.entry(OnKeyDown.ATTRIBUTE_NAME, new Attribute<String>(OnKeyDown.ATTRIBUTE_TYPE, e::setOnKeyDown, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(OnKeyUp e)
		{
			return Map.entry(OnKeyUp.ATTRIBUTE_NAME, new Attribute<String>(OnKeyUp.ATTRIBUTE_TYPE, e::setOnKeyUp, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(Style e)
		{
			return Map.entry(Style.ATTRIBUTE_NAME, new Attribute<String>(Style.ATTRIBUTE_TYPE, e::setStyle, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(Title e)
		{
			return Map.entry(Title.ATTRIBUTE_NAME, new Attribute<String>(Title.ATTRIBUTE_TYPE, e::setTitle, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(Href e)
		{
			return Map.entry(Href.ATTRIBUTE_NAME, new Attribute<String>(Href.ATTRIBUTE_TYPE, e::setHref, null, null));
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

		public static Map.Entry<String, Attribute<Boolean>> getEntry(Async e)
		{
			return Map.entry(Async.ATTRIBUTE_NAME, new Attribute<Boolean>(Async.ATTRIBUTE_TYPE, e::setAsync, true, false));
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

		public static Map.Entry<String, Attribute<String>> getEntry(CrossOrigin e)
		{
			return Map.entry(CrossOrigin.ATTRIBUTE_NAME, new Attribute<String>(CrossOrigin.ATTRIBUTE_TYPE, e::setCrossOrigin, null, null));
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

		public static Map.Entry<String, Attribute<Boolean>> getEntry(Defer e)
		{
			return Map.entry(Defer.ATTRIBUTE_NAME, new Attribute<Boolean>(Defer.ATTRIBUTE_TYPE, e::setDefer, true, false));
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

		public static Map.Entry<String, Attribute<String>> getEntry(Integrity e)
		{
			return Map.entry(Integrity.ATTRIBUTE_NAME, new Attribute<String>(Integrity.ATTRIBUTE_TYPE, e::setIntegrity, null, null));
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

		public static Map.Entry<String, Attribute<Boolean>> getEntry(NoModule e)
		{
			return Map.entry(NoModule.ATTRIBUTE_NAME, new Attribute<Boolean>(NoModule.ATTRIBUTE_TYPE, e::setNoModule, true, false));
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

		public static Map.Entry<String, Attribute<String>> getEntry(Nonce e)
		{
			return Map.entry(Nonce.ATTRIBUTE_NAME, new Attribute<String>(Nonce.ATTRIBUTE_TYPE, e::setNonce, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(ReferrerPolicy e)
		{
			return Map.entry(ReferrerPolicy.ATTRIBUTE_NAME, new Attribute<String>(ReferrerPolicy.ATTRIBUTE_TYPE, e::setReferrerPolicy, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(Type e)
		{
			return Map.entry(Type.ATTRIBUTE_NAME, new Attribute<String>(Type.ATTRIBUTE_TYPE, e::setType, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(As e)
		{
			return Map.entry(As.ATTRIBUTE_NAME, new Attribute<String>(As.ATTRIBUTE_TYPE, e::setAs, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(HrefLang e)
		{
			return Map.entry(HrefLang.ATTRIBUTE_NAME, new Attribute<String>(HrefLang.ATTRIBUTE_TYPE, e::setHrefLang, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(Importance e)
		{
			return Map.entry(Importance.ATTRIBUTE_NAME, new Attribute<String>(Importance.ATTRIBUTE_TYPE, e::setImportance, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(Media e)
		{
			return Map.entry(Media.ATTRIBUTE_NAME, new Attribute<String>(Media.ATTRIBUTE_TYPE, e::setMedia, null, null));
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

		public static Map.Entry<String, Attribute<String>> getEntry(Rel e)
		{
			return Map.entry(Rel.ATTRIBUTE_NAME, new Attribute<String>(Rel.ATTRIBUTE_TYPE, e::setRel, null, null));
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

		public static Map.Entry<String, Attribute<Double>> getEntry(Sizes e)
		{
			return Map.entry(Sizes.ATTRIBUTE_NAME, new Attribute<Double>(Sizes.ATTRIBUTE_TYPE, e::setSizes, null, Double.MAX_VALUE));
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

		public static Map.Entry<String, Attribute<Integer>> getEntry(Cols e)
		{
			return Map.entry(Cols.ATTRIBUTE_NAME, new Attribute<Integer>(Cols.ATTRIBUTE_TYPE, e::setCols, null, -1));
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

		public static Map.Entry<String, Attribute<Integer>> getEntry(Rows e)
		{
			return Map.entry(Rows.ATTRIBUTE_NAME, new Attribute<Integer>(Rows.ATTRIBUTE_TYPE, e::setRows, null, -1));
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

		public static Map.Entry<String, Attribute<String>> getEntry(Wrap e)
		{
			return Map.entry(Wrap.ATTRIBUTE_NAME, new Attribute<String>(Wrap.ATTRIBUTE_TYPE, e::setWrap, null, null));
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

		public static Map.Entry<String, Attribute<Boolean>> getEntry(Hidden e)
		{
			return Map.entry(Hidden.ATTRIBUTE_NAME, new Attribute<Boolean>(Hidden.ATTRIBUTE_TYPE, e::setHidden, true, false));
		}
	}
}
