package attributes;

import java.util.Map;

public class Attributes
{
	public interface ID
	{
		public void setID(String id);
		public String getID();
		
		public static Map.Entry<String, Attribute<String>> getEntry(ID e)
		{
			return Map.entry("id", new Attribute<String>(String.class, e::setID, null, null));
		}
	}
	
	public interface Checked
	{
		public void setChecked(boolean c);
		public boolean getChecked();
		
		public static Map.Entry<String, Attribute<Boolean>> getEntry(Checked e)
		{
			return Map.entry("checked", new Attribute<Boolean>(Boolean.class, e::setChecked, true, false));
		}
	}
	
	public interface Multiple
	{
		public void setMultiple(boolean m);
		public boolean getMultiple();
		
		public static Map.Entry<String, Attribute<Boolean>> getEntry(Multiple e)
		{
			return Map.entry("multiple", new Attribute<Boolean>(Boolean.class, e::setMultiple, true, false));
		}
	}
	
	public interface MinLength
	{
		public void setMinLength(int l);
		public int getMinLength();
		
		public static Map.Entry<String, Attribute<Integer>> getEntry(MinLength e)
		{
			return Map.entry("minlength", new Attribute<Integer>(Integer.class, e::setMinLength, null, -1));
		}
	}
	
	public interface MaxLength
	{
		public void setMaxLength(int l);
		public int getMaxLength();
		
		public static Map.Entry<String, Attribute<Integer>> getEntry(MaxLength e)
		{
			return Map.entry("minlength", new Attribute<Integer>(Integer.class, e::setMaxLength, null, -1));
		}
	}
	
	public interface Size
	{
		public void setSize(int s);
		public int getSize();
		
		public static Map.Entry<String, Attribute<Integer>> getEntry(Size e)
		{
			return Map.entry("minlength", new Attribute<Integer>(Integer.class, e::setSize, null, -1));
		}
	}
	
	public interface Pattern
	{
		public void setPattern(String p);
		public String getPattern();
		
		public static Map.Entry<String, Attribute<String>> getEntry(Pattern e)
		{
			return Map.entry("pattern", new Attribute<String>(String.class, e::setPattern, null, null));
		}
	}
	
	public interface PlaceHolder
	{
		public void setPlaceHolder(String p);
		public String getPlaceHolder();
		
		public static Map.Entry<String, Attribute<String>> getEntry(PlaceHolder e)
		{
			return Map.entry("placeholder", new Attribute<String>(String.class, e::setPlaceHolder, null, null));
		}
	}
	
	public interface SpellCheck
	{
		public void setSpellCheck(String s);
		public String getSpellCheck();
		
		public static Map.Entry<String, Attribute<String>> getEntry(SpellCheck e)
		{
			return Map.entry("spellcheck", new Attribute<String>(String.class, e::setSpellCheck, null, null));
		}
	}
	
	public interface Required
	{
		public void setRequired(boolean r);
		public boolean getRequired();
		
		public static Map.Entry<String, Attribute<Boolean>> getEntry(Required e)
		{
			return Map.entry("required", new Attribute<Boolean>(Boolean.class, e::setRequired, true, false));
		}
	}
	
	public interface AutoFocus
	{
		public void setAutoFocus(boolean a);
		public boolean getAutoFocus();
		
		public static Map.Entry<String, Attribute<Boolean>> getEntry(AutoFocus e)
		{
			return Map.entry("autofocus", new Attribute<Boolean>(Boolean.class, e::setAutoFocus, true, false));
		}
	}
	
	public interface Disabled
	{
		public void setDisabled(boolean d);
		public boolean getDisabled();
		
		public static Map.Entry<String, Attribute<Boolean>> getEntry(Disabled e)
		{
			return Map.entry("disabled", new Attribute<Boolean>(Boolean.class, e::setDisabled, true, false));
		}
	}
	
	public interface AutoComplete
	{
		public void setAutoComplete(String a);
		public String getAutoComplete();
		
		public static Map.Entry<String, Attribute<String>> getEntry(AutoComplete e)
		{
			return Map.entry("autocomplete", new Attribute<String>(String.class, e::setAutoComplete, null, null));
		}
	}
	
	public interface Form
	{
		public void setForm(String f);
		public String getForm();

		public static Map.Entry<String, Attribute<String>> getEntry(Form e)
		{
			return Map.entry("form", new Attribute<String>(String.class, e::setForm, null, null));
		}
	}
	
	public interface List
	{
		public void setList(String l);
		public String getList();
		
		public static Map.Entry<String, Attribute<String>> getEntry(List e)
		{
			return Map.entry("list", new Attribute<String>(String.class, e::setList, null, null));
		}
	}
	
	public interface Name
	{
		public void setName(String n);
		public String getName();
		
		public static Map.Entry<String, Attribute<String>> getEntry(Name e)
		{
			return Map.entry("name", new Attribute<String>(String.class, e::setName, null, null));
		}
	}
	
	public interface ReadOnly
	{
		public void setReadOnly(boolean r);
		public boolean getReadOnly();
		
		public static Map.Entry<String, Attribute<Boolean>> getEntry(ReadOnly e)
		{
			return Map.entry("readonly", new Attribute<Boolean>(Boolean.class, e::setReadOnly, true, false));
		}
	}
	
	public interface TabIndex
	{
		public void setTabIndex(int t);
		public int getTabIndex();
		
		public static Map.Entry<String, Attribute<Integer>> getEntry(TabIndex e)
		{
			return Map.entry("tabindex", new Attribute<Integer>(Integer.class, e::setTabIndex, null, -1));
		}
	}
	
	public interface Value
	{
		public void setValue(String v);
		public String getValue();
		
		public static Map.Entry<String, Attribute<String>> getEntry(Value e)
		{
			return Map.entry("value", new Attribute<String>(String.class, e::setValue, null, null));
		}
	}
	
	public interface Accept
	{
		public void setAccept(String a);
		public String getAccept();
		
		public static Map.Entry<String, Attribute<String>> getEntry(Accept e)
		{
			return Map.entry("accept", new Attribute<String>(String.class, e::setAccept, null, null));
		}
	}
	
	public interface Capture
	{
		public void setCapture(String cap);
		public String getCapture();
		
		public static Map.Entry<String, Attribute<String>> getEntry(Capture e)
		{
			return Map.entry("capture", new Attribute<String>(String.class, e::setCapture, null, null));
		}
	}
	
	public interface AcceptCharset
	{
		public void setAcceptCharset(String c);
		public String getAcceptCharset();
		
		public static Map.Entry<String, Attribute<String>> getEntry(AcceptCharset e)
		{
			return Map.entry("accept-charset", new Attribute<String>(String.class, e::setAcceptCharset, null, null));
		}
	}
	
	public interface Action
	{
		public void setAction(String a);
		public String getAction();
		
		public static Map.Entry<String, Attribute<String>> getEntry(Action e)
		{
			return Map.entry("action", new Attribute<String>(String.class, e::setAction, null, null));
		}
	}
	
	public interface AutoCapitalize
	{
		public void setAutoCapitalize(String a);
		public String getAutoCapitalize();
		
		public static Map.Entry<String, Attribute<String>> getEntry(AutoCapitalize e)
		{
			return Map.entry("autocapitalize", new Attribute<String>(String.class, e::setAutoCapitalize, null, null));
		}
	}
	
	public interface Enctype
	{
		public void setEnctype(String e);
		public String getEnctype();
		
		public static Map.Entry<String, Attribute<String>> getEntry(Enctype e)
		{
			return Map.entry("enctype", new Attribute<String>(String.class, e::setEnctype, null, null));
		}
	}
	
	public interface Method
	{
		public void setMethod(String m);
		public String getMethod();
		
		public static Map.Entry<String, Attribute<String>> getEntry(Method e)
		{
			return Map.entry("method", new Attribute<String>(String.class, e::setMethod, null, null));
		}
	}
	
	public interface NoValidate
	{
		public void setNoValidate(boolean n);
		public boolean getNoValidate();
		
		public static Map.Entry<String, Attribute<Boolean>> getEntry(NoValidate e)
		{
			return Map.entry("novalidate", new Attribute<Boolean>(Boolean.class, e::setNoValidate, true, false));
		}
	}
	
	public interface Target
	{
		public void setTarget(String t);
		public String getTarget();
		
		public static Map.Entry<String, Attribute<String>> getEntry(Target e)
		{
			return Map.entry("target", new Attribute<String>(String.class, e::setTarget, null, null));
		}
	}
	
	public interface Alt
	{
		public void setAlt(String a);
		public String getAlt();
		
		public static Map.Entry<String, Attribute<String>> getEntry(Alt e)
		{
			return Map.entry("alt", new Attribute<String>(String.class, e::setAlt, null, null));
		}
	}
	
	public interface FormAction
	{
		public void setFormAction(String f);
		public String getFormAction();
		
		public static Map.Entry<String, Attribute<String>> getEntry(FormAction e)
		{
			return Map.entry("formaction", new Attribute<String>(String.class, e::setFormAction, null, null));
		}
	}
	
	public interface FormEnctype
	{
		public void setFormEnctype(String f);
		public String getFormEnctype();
		
		public static Map.Entry<String, Attribute<String>> getEntry(FormEnctype e)
		{
			return Map.entry("formenctype", new Attribute<String>(String.class, e::setFormEnctype, null, null));
		}
	}
	
	public interface FormMethod
	{
		public void setFormMethod(String f);
		public String getFormMethod();
		
		public static Map.Entry<String, Attribute<String>> getEntry(FormMethod e)
		{
			return Map.entry("formmethod", new Attribute<String>(String.class, e::setFormMethod, null, null));
		}
	}
	
	public interface FormTarget
	{
		public void setFormTarget(String f);
		public String getFormTarget();
		
		public static Map.Entry<String, Attribute<String>> getEntry(FormTarget e)
		{
			return Map.entry("formtarget", new Attribute<String>(String.class, e::setFormTarget, null, null));
		}
	}
	
	public interface FormNoValidate
	{
		public void setFormNoValidate(boolean f);
		public boolean getFormNoValidate();
		
		public static Map.Entry<String, Attribute<Boolean>> getEntry(FormNoValidate e)
		{
			return Map.entry("formnovalidate", new Attribute<Boolean>(Boolean.class, e::setFormNoValidate, null, null));
		}
	}
	
	public interface Height
	{
		public void setHeight(int h);
		public int getHeight();
		
		public static Map.Entry<String, Attribute<Integer>> getEntry(Height e)
		{
			return Map.entry("height", new Attribute<Integer>(Integer.class, e::setHeight, null, -1));
		}
	}
	
	public interface Width
	{
		public void setWidth(int w);
		public int getWidth();
		
		public static Map.Entry<String, Attribute<Integer>> getEntry(Width e)
		{
			return Map.entry("width", new Attribute<Integer>(Integer.class, e::setWidth, null, -1));
		}
	}
	
	public interface Src
	{
		public void setSrc(String s);
		public String getSrc();
		
		public static Map.Entry<String, Attribute<String>> getEntry(Src e)
		{
			return Map.entry("src", new Attribute<String>(String.class, e::setSrc, null, null));
		}
	}
	
	public interface Max
	{
		public void setMax(double m);
		public double getMax();
		
		public static Map.Entry<String, Attribute<Double>> getEntry(Max e)
		{
			return Map.entry("max", new Attribute<Double>(Double.class, e::setMax, null, Double.MAX_VALUE));
		}
	}
	
	public interface Min
	{
		public void setMin(double m);
		public double getMin();
		
		public static Map.Entry<String, Attribute<Double>> getEntry(Min e)
		{
			return Map.entry("min", new Attribute<Double>(Double.class, e::setMin, null,  Double.MIN_VALUE));
		}
	}
	
	public interface Step
	{
		public void setStep(double s);
		public double getStep();
		
		public static Map.Entry<String, Attribute<Double>> getEntry(Step e)
		{
			return Map.entry("step", new Attribute<Double>(Double.class, e::setStep, null, -1d));
		}
	}
}
