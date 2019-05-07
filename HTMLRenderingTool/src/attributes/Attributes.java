package attributes;

import java.util.Map;

public class Attributes
{
	public static Map.Entry<String, Attribute<String>> id(ID e)
	{
		return Map.entry("id", new Attribute<String>(String.class, e::setID, null, null));
	}
	
	public static Map.Entry<String, Attribute<Boolean>> checked(Checked e)
	{
		return Map.entry("checked", new Attribute<Boolean>(Boolean.class, e::setChecked, true, false));
	}
	
	public static Map.Entry<String, Attribute<Boolean>> multiple(Multiple e)
	{
		return Map.entry("multiple", new Attribute<Boolean>(Boolean.class, e::setMultiple, true, false));
	}
	
	public static Map.Entry<String, Attribute<Integer>> minlength(MinLength e)
	{
		return Map.entry("minlength", new Attribute<Integer>(Integer.class, e::setMinLength, null, -1));
	}
	
	public static Map.Entry<String, Attribute<Integer>> maxlength(MaxLength e)
	{
		return Map.entry("minlength", new Attribute<Integer>(Integer.class, e::setMaxLength, null, -1));
	}
	
	public static Map.Entry<String, Attribute<Integer>> size(Size e)
	{
		return Map.entry("minlength", new Attribute<Integer>(Integer.class, e::setSize, null, -1));
	}
	
	public static Map.Entry<String, Attribute<String>> pattern(Pattern e)
	{
		return Map.entry("pattern", new Attribute<String>(String.class, e::setPattern, null, null));
	}
	
	public static Map.Entry<String, Attribute<String>> placeholder(PlaceHolder e)
	{
		return Map.entry("placeholder", new Attribute<String>(String.class, e::setPlaceHolder, null, null));
	}
	
	public static Map.Entry<String, Attribute<String>> spellcheck(SpellCheck e)
	{
		return Map.entry("spellcheck", new Attribute<String>(String.class, e::setSpellCheck, null, null));
	}
	
	public static Map.Entry<String, Attribute<Boolean>> required(Required e)
	{
		return Map.entry("required", new Attribute<Boolean>(Boolean.class, e::setRequired, true, false));
	}
	
	public static Map.Entry<String, Attribute<Boolean>> autofocus(AutoFocus e)
	{
		return Map.entry("autofocus", new Attribute<Boolean>(Boolean.class, e::setAutoFocus, true, false));
	}
	
	public static Map.Entry<String, Attribute<Boolean>> disabled(Disabled e)
	{
		return Map.entry("disabled", new Attribute<Boolean>(Boolean.class, e::setDisabled, true, false));
	}
	
	public static Map.Entry<String, Attribute<String>> autocomplete(AutoComplete e)
	{
		return Map.entry("autocomplete", new Attribute<String>(String.class, e::setAutoComplete, null, null));
	}
	
	public static Map.Entry<String, Attribute<String>> form(Form e)
	{
		return Map.entry("form", new Attribute<String>(String.class, e::setForm, null, null));
	}
	
	public static Map.Entry<String, Attribute<String>> list(List e)
	{
		return Map.entry("list", new Attribute<String>(String.class, e::setList, null, null));
	}
	
	public static Map.Entry<String, Attribute<String>> name(Name e)
	{
		return Map.entry("name", new Attribute<String>(String.class, e::setName, null, null));
	}
	
	public static Map.Entry<String, Attribute<Boolean>> readonly(ReadOnly e)
	{
		return Map.entry("readonly", new Attribute<Boolean>(Boolean.class, e::setReadOnly, true, false));
	}
	
	public static Map.Entry<String, Attribute<Integer>> tabindex(TabIndex e)
	{
		return Map.entry("tabindex", new Attribute<Integer>(Integer.class, e::setTabIndex, null, -1));
	}
	
	public static Map.Entry<String, Attribute<String>> value(Value e)
	{
		return Map.entry("value", new Attribute<String>(String.class, e::setValue, null, null));
	}
	
	public static Map.Entry<String, Attribute<String>> capture(Capture e)
	{
		return Map.entry("capture", new Attribute<String>(String.class, e::setCapture, null, null));
	}
	
	public static Map.Entry<String, Attribute<String>> accept(Accept e)
	{
		return Map.entry("accept", new Attribute<String>(String.class, e::setAccept, null, null));
	}
	
	public static Map.Entry<String, Attribute<String>> acceptCharset(AcceptCharset e)
	{
		return Map.entry("accept-charset", new Attribute<String>(String.class, e::setAcceptCharset, null, null));
	}
	
	public static Map.Entry<String, Attribute<String>> action(Action e)
	{
		return Map.entry("action", new Attribute<String>(String.class, e::setAction, null, null));
	}
	
	public static Map.Entry<String, Attribute<String>> autocapitalize(AutoCapitalize e)
	{
		return Map.entry("autocapitalize", new Attribute<String>(String.class, e::setAutoCapitalize, null, null));
	}
	
	public static Map.Entry<String, Attribute<String>> enctype(Enctype e)
	{
		return Map.entry("enctype", new Attribute<String>(String.class, e::setEnctype, null, null));
	}
	
	public static Map.Entry<String, Attribute<String>> method(Method e)
	{
		return Map.entry("method", new Attribute<String>(String.class, e::setMethod, null, null));
	}
	
	public static Map.Entry<String, Attribute<Boolean>> novalidate(NoValidate e)
	{
		return Map.entry("novalidate", new Attribute<Boolean>(Boolean.class, e::setNoValidate, true, false));
	}
	
	public static Map.Entry<String, Attribute<String>> target(Target e)
	{
		return Map.entry("target", new Attribute<String>(String.class, e::setTarget, null, null));
	}
	
	public static Map.Entry<String, Attribute<String>> alt(Alt e)
	{
		return Map.entry("alt", new Attribute<String>(String.class, e::setAlt, null, null));
	}
	
	public static Map.Entry<String, Attribute<String>> formaction(FormAction e)
	{
		return Map.entry("formaction", new Attribute<String>(String.class, e::setFormAction, null, null));
	}
	
	public static Map.Entry<String, Attribute<String>> formtarget(FormTarget e)
	{
		return Map.entry("formtarget", new Attribute<String>(String.class, e::setFormTarget, null, null));
	}
	
	public static Map.Entry<String, Attribute<String>> formenctype(FormEnctype e)
	{
		return Map.entry("formenctype", new Attribute<String>(String.class, e::setFormEnctype, null, null));
	}
	
	public static Map.Entry<String, Attribute<String>> formmethod(FormMethod e)
	{
		return Map.entry("formmethod", new Attribute<String>(String.class, e::setFormMethod, null, null));
	}
	
	public static Map.Entry<String, Attribute<Boolean>> formnovalidate(FormNoValidate e)
	{
		return Map.entry("formnovalidate", new Attribute<Boolean>(Boolean.class, e::setFormNoValidate, null, null));
	}
	
	public static Map.Entry<String, Attribute<Integer>> height(Height e)
	{
		return Map.entry("height", new Attribute<Integer>(Integer.class, e::setHeight, null, -1));
	}
	
	public static Map.Entry<String, Attribute<Integer>> width(Width e)
	{
		return Map.entry("width", new Attribute<Integer>(Integer.class, e::setWidth, null, -1));
	}
	
	public static Map.Entry<String, Attribute<String>> src(Src e)
	{
		return Map.entry("src", new Attribute<String>(String.class, e::setSrc, null, null));
	}
	
	public static Map.Entry<String, Attribute<Double>> max(Max e)
	{
		return Map.entry("max", new Attribute<Double>(Double.class, e::setMax, null, Double.MAX_VALUE));
	}
	
	public static Map.Entry<String, Attribute<Double>> min(Min e)
	{
		return Map.entry("min", new Attribute<Double>(Double.class, e::setMin, null,  Double.MIN_VALUE));
	}
	
	public static Map.Entry<String, Attribute<Double>> step(Step e)
	{
		return Map.entry("step", new Attribute<Double>(Double.class, e::setStep, null, -1d));
	}
	
	public interface ID
	{
		public void setID(String id);
		public String getID();
	}
	
	public interface Checked
	{
		public void setChecked(boolean c);
		public boolean getChecked();
	}
	
	public interface Multiple
	{
		public void setMultiple(boolean m);
		public boolean getMultiple();
	}
	
	public interface MinLength
	{
		public void setMinLength(int l);
		public int getMinLength();
	}
	
	public interface MaxLength
	{
		public void setMaxLength(int l);
		public int getMaxLength();
	}
	
	public interface Size
	{
		public void setSize(int s);
		public int getSize();
	}
	
	public interface Pattern
	{
		public void setPattern(String p);
		public String getPattern();
	}
	
	public interface PlaceHolder
	{
		public void setPlaceHolder(String p);
		public String getPlaceHolder();
	}
	
	public interface SpellCheck
	{
		public void setSpellCheck(String s);
		public String getSpellCheck();
	}
	
	public interface Required
	{
		public void setRequired(boolean r);
		public boolean getRequired();
	}
	
	public interface AutoFocus
	{
		public void setAutoFocus(boolean a);
		public boolean getAutoFocus();
	}
	
	public interface Disabled
	{
		public void setDisabled(boolean d);
		public boolean getDisabled();
	}
	
	public interface AutoComplete
	{
		public void setAutoComplete(String a);
		public String getAutoComplete();
	}
	
	public interface Form
	{
		public void setForm(String f);
		public String getForm();
	}
	
	public interface List
	{
		public void setList(String l);
		public String getList();
	}
	
	public interface Name
	{
		public void setName(String n);
		public String getName();
	}
	
	public interface ReadOnly
	{
		public void setReadOnly(boolean r);
		public boolean getReadOnly();
	}
	
	public interface TabIndex
	{
		public void setTabIndex(int t);
		public int getTabIndex();
	}
	
	public interface Value
	{
		public void setValue(String v);
		public String getValue();
	}
	
	public interface Accept
	{
		public void setAccept(String a);
		public String getAccept();
	}
	
	public interface Capture
	{
		public void setCapture(String cap);
		public String getCapture();
	}
	
	public interface AcceptCharset
	{
		public void setAcceptCharset(String c);
		public String getAcceptCharset();
	}
	
	public interface Action
	{
		public void setAction(String a);
		public String getAction();
	}
	
	public interface AutoCapitalize
	{
		public void setAutoCapitalize(String a);
		public String getAutoCapitalize();
	}
	
	public interface Enctype
	{
		public void setEnctype(String e);
		public String getEnctype();
	}
	
	public interface Method
	{
		public void setMethod(String m);
		public String getMethod();
	}
	
	public interface NoValidate
	{
		public void setNoValidate(boolean n);
		public boolean getNoValidate();
	}
	
	public interface Target
	{
		public void setTarget(String t);
		public String getTarget();
	}
	
	public interface Alt
	{
		public void setAlt(String a);
		public String getAlt();
	}
	
	public interface FormAction
	{
		public void setFormAction(String f);
		public String getFormAction();
	}
	
	public interface FormEnctype
	{
		public void setFormEnctype(String f);
		public String getFormEnctype();
	}
	
	public interface FormMethod
	{
		public void setFormMethod(String f);
		public String getFormMethod();
	}
	
	public interface FormTarget
	{
		public void setFormTarget(String f);
		public String getFormTarget();
	}
	
	public interface FormNoValidate
	{
		public void setFormNoValidate(boolean f);
		public boolean getFormNoValidate();
	}
	
	public interface Height
	{
		public void setHeight(int h);
		public int getHeight();
	}
	
	public interface Width
	{
		public void setWidth(int w);
		public int getWidth();
	}
	
	public interface Src
	{
		public void setSrc(String s);
		public String getSrc();
	}
	
	public interface Max
	{
		public void setMax(double m);
		public double getMax();
	}
	
	public interface Min
	{
		public void setMin(double m);
		public double getMin();
	}
	
	public interface Step
	{
		public void setStep(double s);
		public double getStep();
	}
}
