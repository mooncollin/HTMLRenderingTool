package attributes;

import java.util.Map;

public class Attributes
{
	public static final String GET_ENTRY_NAME = "getEntry";
	

	public interface ID
	{
		public static final String ATTRIBUTE_NAME = "id";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setID(String e);
		public String getID();

		public static Map.Entry<String, Attribute<String>> getEntry(ID e)
		{
			return Map.entry(ID.ATTRIBUTE_NAME, new Attribute<String>(ID.ATTRIBUTE_TYPE, e::setID, null, null));
		}
	}
	

	public interface Checked
	{
		public static final String ATTRIBUTE_NAME = "checked";
		public static final Class<Boolean> ATTRIBUTE_TYPE = Boolean.class;
		public void setChecked(boolean e);
		public boolean getChecked();

		public static Map.Entry<String, Attribute<Boolean>> getEntry(Checked e)
		{
			return Map.entry(Checked.ATTRIBUTE_NAME, new Attribute<Boolean>(Checked.ATTRIBUTE_TYPE, e::setChecked, true, false));
		}
	}
	

	public interface Multiple
	{
		public static final String ATTRIBUTE_NAME = "multiple";
		public static final Class<Boolean> ATTRIBUTE_TYPE = Boolean.class;
		public void setMultiple(boolean e);
		public boolean getMultiple();

		public static Map.Entry<String, Attribute<Boolean>> getEntry(Multiple e)
		{
			return Map.entry(Multiple.ATTRIBUTE_NAME, new Attribute<Boolean>(Multiple.ATTRIBUTE_TYPE, e::setMultiple, true, false));
		}
	}
	

	public interface MinLength
	{
		public static final String ATTRIBUTE_NAME = "minlength";
		public static final Class<Integer> ATTRIBUTE_TYPE = Integer.class;
		public void setMinLength(int e);
		public int getMinLength();

		public static Map.Entry<String, Attribute<Integer>> getEntry(MinLength e)
		{
			return Map.entry(MinLength.ATTRIBUTE_NAME, new Attribute<Integer>(MinLength.ATTRIBUTE_TYPE, e::setMinLength, null, -1));
		}
	}
	

	public interface MaxLength
	{
		public static final String ATTRIBUTE_NAME = "maxlength";
		public static final Class<Integer> ATTRIBUTE_TYPE = Integer.class;
		public void setMaxLength(int e);
		public int getMaxLength();

		public static Map.Entry<String, Attribute<Integer>> getEntry(MaxLength e)
		{
			return Map.entry(MaxLength.ATTRIBUTE_NAME, new Attribute<Integer>(MaxLength.ATTRIBUTE_TYPE, e::setMaxLength, null, -1));
		}
	}
	

	public interface Size
	{
		public static final String ATTRIBUTE_NAME = "size";
		public static final Class<Integer> ATTRIBUTE_TYPE = Integer.class;
		public void setSize(int e);
		public int getSize();

		public static Map.Entry<String, Attribute<Integer>> getEntry(Size e)
		{
			return Map.entry(Size.ATTRIBUTE_NAME, new Attribute<Integer>(Size.ATTRIBUTE_TYPE, e::setSize, null, -1));
		}
	}
	

	public interface Pattern
	{
		public static final String ATTRIBUTE_NAME = "pattern";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setPattern(String e);
		public String getPattern();

		public static Map.Entry<String, Attribute<String>> getEntry(Pattern e)
		{
			return Map.entry(Pattern.ATTRIBUTE_NAME, new Attribute<String>(Pattern.ATTRIBUTE_TYPE, e::setPattern, null, null));
		}
	}
	

	public interface PlaceHolder
	{
		public static final String ATTRIBUTE_NAME = "placeholder";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setPlaceHolder(String e);
		public String getPlaceHolder();

		public static Map.Entry<String, Attribute<String>> getEntry(PlaceHolder e)
		{
			return Map.entry(PlaceHolder.ATTRIBUTE_NAME, new Attribute<String>(PlaceHolder.ATTRIBUTE_TYPE, e::setPlaceHolder, null, null));
		}
	}
	

	public interface SpellCheck
	{
		public static final String ATTRIBUTE_NAME = "spellcheck";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setSpellCheck(String e);
		public String getSpellCheck();

		public static Map.Entry<String, Attribute<String>> getEntry(SpellCheck e)
		{
			return Map.entry(SpellCheck.ATTRIBUTE_NAME, new Attribute<String>(SpellCheck.ATTRIBUTE_TYPE, e::setSpellCheck, null, null));
		}
	}
	

	public interface Required
	{
		public static final String ATTRIBUTE_NAME = "required";
		public static final Class<Boolean> ATTRIBUTE_TYPE = Boolean.class;
		public void setRequired(boolean e);
		public boolean getRequired();

		public static Map.Entry<String, Attribute<Boolean>> getEntry(Required e)
		{
			return Map.entry(Required.ATTRIBUTE_NAME, new Attribute<Boolean>(Required.ATTRIBUTE_TYPE, e::setRequired, true, false));
		}
	}
	

	public interface AutoFocus
	{
		public static final String ATTRIBUTE_NAME = "autofocus";
		public static final Class<Boolean> ATTRIBUTE_TYPE = Boolean.class;
		public void setAutoFocus(boolean e);
		public boolean getAutoFocus();

		public static Map.Entry<String, Attribute<Boolean>> getEntry(AutoFocus e)
		{
			return Map.entry(AutoFocus.ATTRIBUTE_NAME, new Attribute<Boolean>(AutoFocus.ATTRIBUTE_TYPE, e::setAutoFocus, true, false));
		}
	}
	

	public interface Disabled
	{
		public static final String ATTRIBUTE_NAME = "disabled";
		public static final Class<Boolean> ATTRIBUTE_TYPE = Boolean.class;
		public void setDisabled(boolean e);
		public boolean getDisabled();

		public static Map.Entry<String, Attribute<Boolean>> getEntry(Disabled e)
		{
			return Map.entry(Disabled.ATTRIBUTE_NAME, new Attribute<Boolean>(Disabled.ATTRIBUTE_TYPE, e::setDisabled, true, false));
		}
	}
	

	public interface AutoComplete
	{
		public static final String ATTRIBUTE_NAME = "autocomplete";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setAutoComplete(String e);
		public String getAutoComplete();

		public static Map.Entry<String, Attribute<String>> getEntry(AutoComplete e)
		{
			return Map.entry(AutoComplete.ATTRIBUTE_NAME, new Attribute<String>(AutoComplete.ATTRIBUTE_TYPE, e::setAutoComplete, null, null));
		}
	}
	

	public interface Form
	{
		public static final String ATTRIBUTE_NAME = "form";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setForm(String e);
		public String getForm();

		public static Map.Entry<String, Attribute<String>> getEntry(Form e)
		{
			return Map.entry(Form.ATTRIBUTE_NAME, new Attribute<String>(Form.ATTRIBUTE_TYPE, e::setForm, null, null));
		}
	}
	

	public interface List
	{
		public static final String ATTRIBUTE_NAME = "list";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setList(String e);
		public String getList();

		public static Map.Entry<String, Attribute<String>> getEntry(List e)
		{
			return Map.entry(List.ATTRIBUTE_NAME, new Attribute<String>(List.ATTRIBUTE_TYPE, e::setList, null, null));
		}
	}
	

	public interface Name
	{
		public static final String ATTRIBUTE_NAME = "name";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setName(String e);
		public String getName();

		public static Map.Entry<String, Attribute<String>> getEntry(Name e)
		{
			return Map.entry(Name.ATTRIBUTE_NAME, new Attribute<String>(Name.ATTRIBUTE_TYPE, e::setName, null, null));
		}
	}
	

	public interface ReadOnly
	{
		public static final String ATTRIBUTE_NAME = "readonly";
		public static final Class<Boolean> ATTRIBUTE_TYPE = Boolean.class;
		public void setReadOnly(boolean e);
		public boolean getReadOnly();

		public static Map.Entry<String, Attribute<Boolean>> getEntry(ReadOnly e)
		{
			return Map.entry(ReadOnly.ATTRIBUTE_NAME, new Attribute<Boolean>(ReadOnly.ATTRIBUTE_TYPE, e::setReadOnly, true, false));
		}
	}
	

	public interface TabIndex
	{
		public static final String ATTRIBUTE_NAME = "tabindex";
		public static final Class<Integer> ATTRIBUTE_TYPE = Integer.class;
		public void setTabIndex(int e);
		public int getTabIndex();

		public static Map.Entry<String, Attribute<Integer>> getEntry(TabIndex e)
		{
			return Map.entry(TabIndex.ATTRIBUTE_NAME, new Attribute<Integer>(TabIndex.ATTRIBUTE_TYPE, e::setTabIndex, null, -1));
		}
	}
	

	public interface Value
	{
		public static final String ATTRIBUTE_NAME = "value";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setValue(String e);
		public String getValue();

		public static Map.Entry<String, Attribute<String>> getEntry(Value e)
		{
			return Map.entry(Value.ATTRIBUTE_NAME, new Attribute<String>(Value.ATTRIBUTE_TYPE, e::setValue, null, null));
		}
	}
	

	public interface Accept
	{
		public static final String ATTRIBUTE_NAME = "accept";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setAccept(String e);
		public String getAccept();

		public static Map.Entry<String, Attribute<String>> getEntry(Accept e)
		{
			return Map.entry(Accept.ATTRIBUTE_NAME, new Attribute<String>(Accept.ATTRIBUTE_TYPE, e::setAccept, null, null));
		}
	}
	

	public interface Capture
	{
		public static final String ATTRIBUTE_NAME = "capture";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setCapture(String e);
		public String getCapture();

		public static Map.Entry<String, Attribute<String>> getEntry(Capture e)
		{
			return Map.entry(Capture.ATTRIBUTE_NAME, new Attribute<String>(Capture.ATTRIBUTE_TYPE, e::setCapture, null, null));
		}
	}
	

	public interface AcceptCharset
	{
		public static final String ATTRIBUTE_NAME = "accept-charset";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setAcceptCharset(String e);
		public String getAcceptCharset();

		public static Map.Entry<String, Attribute<String>> getEntry(AcceptCharset e)
		{
			return Map.entry(AcceptCharset.ATTRIBUTE_NAME, new Attribute<String>(AcceptCharset.ATTRIBUTE_TYPE, e::setAcceptCharset, null, null));
		}
	}
	

	public interface Action
	{
		public static final String ATTRIBUTE_NAME = "action";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setAction(String e);
		public String getAction();

		public static Map.Entry<String, Attribute<String>> getEntry(Action e)
		{
			return Map.entry(Action.ATTRIBUTE_NAME, new Attribute<String>(Action.ATTRIBUTE_TYPE, e::setAction, null, null));
		}
	}
	

	public interface AutoCapitalize
	{
		public static final String ATTRIBUTE_NAME = "autocapitalize";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setAutoCapitalize(String e);
		public String getAutoCapitalize();

		public static Map.Entry<String, Attribute<String>> getEntry(AutoCapitalize e)
		{
			return Map.entry(AutoCapitalize.ATTRIBUTE_NAME, new Attribute<String>(AutoCapitalize.ATTRIBUTE_TYPE, e::setAutoCapitalize, null, null));
		}
	}
	

	public interface Enctype
	{
		public static final String ATTRIBUTE_NAME = "enctype";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setEnctype(String e);
		public String getEnctype();

		public static Map.Entry<String, Attribute<String>> getEntry(Enctype e)
		{
			return Map.entry(Enctype.ATTRIBUTE_NAME, new Attribute<String>(Enctype.ATTRIBUTE_TYPE, e::setEnctype, null, null));
		}
	}
	

	public interface Method
	{
		public static final String ATTRIBUTE_NAME = "method";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setMethod(String e);
		public String getMethod();

		public static Map.Entry<String, Attribute<String>> getEntry(Method e)
		{
			return Map.entry(Method.ATTRIBUTE_NAME, new Attribute<String>(Method.ATTRIBUTE_TYPE, e::setMethod, null, null));
		}
	}
	

	public interface NoValidate
	{
		public static final String ATTRIBUTE_NAME = "novalidate";
		public static final Class<Boolean> ATTRIBUTE_TYPE = Boolean.class;
		public void setNoValidate(boolean e);
		public boolean getNoValidate();

		public static Map.Entry<String, Attribute<Boolean>> getEntry(NoValidate e)
		{
			return Map.entry(NoValidate.ATTRIBUTE_NAME, new Attribute<Boolean>(NoValidate.ATTRIBUTE_TYPE, e::setNoValidate, true, false));
		}
	}
	

	public interface Target
	{
		public static final String ATTRIBUTE_NAME = "target";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setTarget(String e);
		public String getTarget();

		public static Map.Entry<String, Attribute<String>> getEntry(Target e)
		{
			return Map.entry(Target.ATTRIBUTE_NAME, new Attribute<String>(Target.ATTRIBUTE_TYPE, e::setTarget, null, null));
		}
	}
	

	public interface Alt
	{
		public static final String ATTRIBUTE_NAME = "alt";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setAlt(String e);
		public String getAlt();

		public static Map.Entry<String, Attribute<String>> getEntry(Alt e)
		{
			return Map.entry(Alt.ATTRIBUTE_NAME, new Attribute<String>(Alt.ATTRIBUTE_TYPE, e::setAlt, null, null));
		}
	}
	

	public interface FormAction
	{
		public static final String ATTRIBUTE_NAME = "formaction";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setFormAction(String e);
		public String getFormAction();

		public static Map.Entry<String, Attribute<String>> getEntry(FormAction e)
		{
			return Map.entry(FormAction.ATTRIBUTE_NAME, new Attribute<String>(FormAction.ATTRIBUTE_TYPE, e::setFormAction, null, null));
		}
	}
	

	public interface FormEnctype
	{
		public static final String ATTRIBUTE_NAME = "formenctype";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setFormEnctype(String e);
		public String getFormEnctype();

		public static Map.Entry<String, Attribute<String>> getEntry(FormEnctype e)
		{
			return Map.entry(FormEnctype.ATTRIBUTE_NAME, new Attribute<String>(FormEnctype.ATTRIBUTE_TYPE, e::setFormEnctype, null, null));
		}
	}
	

	public interface FormMethod
	{
		public static final String ATTRIBUTE_NAME = "formmethod";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setFormMethod(String e);
		public String getFormMethod();

		public static Map.Entry<String, Attribute<String>> getEntry(FormMethod e)
		{
			return Map.entry(FormMethod.ATTRIBUTE_NAME, new Attribute<String>(FormMethod.ATTRIBUTE_TYPE, e::setFormMethod, null, null));
		}
	}
	

	public interface FormTarget
	{
		public static final String ATTRIBUTE_NAME = "formtarget";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setFormTarget(String e);
		public String getFormTarget();

		public static Map.Entry<String, Attribute<String>> getEntry(FormTarget e)
		{
			return Map.entry(FormTarget.ATTRIBUTE_NAME, new Attribute<String>(FormTarget.ATTRIBUTE_TYPE, e::setFormTarget, null, null));
		}
	}
	

	public interface FormNoValidate
	{
		public static final String ATTRIBUTE_NAME = "formnovalidate";
		public static final Class<Boolean> ATTRIBUTE_TYPE = Boolean.class;
		public void setFormNoValidate(boolean e);
		public boolean getFormNoValidate();

		public static Map.Entry<String, Attribute<Boolean>> getEntry(FormNoValidate e)
		{
			return Map.entry(FormNoValidate.ATTRIBUTE_NAME, new Attribute<Boolean>(FormNoValidate.ATTRIBUTE_TYPE, e::setFormNoValidate, true, false));
		}
	}
	

	public interface Height
	{
		public static final String ATTRIBUTE_NAME = "height";
		public static final Class<Integer> ATTRIBUTE_TYPE = Integer.class;
		public void setHeight(int e);
		public int getHeight();

		public static Map.Entry<String, Attribute<Integer>> getEntry(Height e)
		{
			return Map.entry(Height.ATTRIBUTE_NAME, new Attribute<Integer>(Height.ATTRIBUTE_TYPE, e::setHeight, null, -1));
		}
	}
	

	public interface Width
	{
		public static final String ATTRIBUTE_NAME = "width";
		public static final Class<Integer> ATTRIBUTE_TYPE = Integer.class;
		public void setWidth(int e);
		public int getWidth();

		public static Map.Entry<String, Attribute<Integer>> getEntry(Width e)
		{
			return Map.entry(Width.ATTRIBUTE_NAME, new Attribute<Integer>(Width.ATTRIBUTE_TYPE, e::setWidth, null, -1));
		}
	}
	

	public interface Src
	{
		public static final String ATTRIBUTE_NAME = "src";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setSrc(String e);
		public String getSrc();

		public static Map.Entry<String, Attribute<String>> getEntry(Src e)
		{
			return Map.entry(Src.ATTRIBUTE_NAME, new Attribute<String>(Src.ATTRIBUTE_TYPE, e::setSrc, null, null));
		}
	}
	

	public interface Max
	{
		public static final String ATTRIBUTE_NAME = "max";
		public static final Class<Double> ATTRIBUTE_TYPE = Double.class;
		public void setMax(double e);
		public double getMax();

		public static Map.Entry<String, Attribute<Double>> getEntry(Max e)
		{
			return Map.entry(Max.ATTRIBUTE_NAME, new Attribute<Double>(Max.ATTRIBUTE_TYPE, e::setMax, null, Double.MAX_VALUE));
		}
	}
	

	public interface Min
	{
		public static final String ATTRIBUTE_NAME = "min";
		public static final Class<Double> ATTRIBUTE_TYPE = Double.class;
		public void setMin(double e);
		public double getMin();

		public static Map.Entry<String, Attribute<Double>> getEntry(Min e)
		{
			return Map.entry(Min.ATTRIBUTE_NAME, new Attribute<Double>(Min.ATTRIBUTE_TYPE, e::setMin, null, Double.MAX_VALUE));
		}
	}
	

	public interface Step
	{
		public static final String ATTRIBUTE_NAME = "step";
		public static final Class<Double> ATTRIBUTE_TYPE = Double.class;
		public void setStep(double e);
		public double getStep();

		public static Map.Entry<String, Attribute<Double>> getEntry(Step e)
		{
			return Map.entry(Step.ATTRIBUTE_NAME, new Attribute<Double>(Step.ATTRIBUTE_TYPE, e::setStep, null, -1d));
		}
	}
	

	public interface OnClick
	{
		public static final String ATTRIBUTE_NAME = "onclick";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setOnClick(String e);
		public String getOnClick();

		public static Map.Entry<String, Attribute<String>> getEntry(OnClick e)
		{
			return Map.entry(OnClick.ATTRIBUTE_NAME, new Attribute<String>(OnClick.ATTRIBUTE_TYPE, e::setOnClick, null, null));
		}
	}
	

	public interface OnDblClick
	{
		public static final String ATTRIBUTE_NAME = "ondblclick";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setOnDblClick(String e);
		public String getOnDblClick();

		public static Map.Entry<String, Attribute<String>> getEntry(OnDblClick e)
		{
			return Map.entry(OnDblClick.ATTRIBUTE_NAME, new Attribute<String>(OnDblClick.ATTRIBUTE_TYPE, e::setOnDblClick, null, null));
		}
	}
	

	public interface OnMouseDown
	{
		public static final String ATTRIBUTE_NAME = "onmousedown";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setOnMouseDown(String e);
		public String getOnMouseDown();

		public static Map.Entry<String, Attribute<String>> getEntry(OnMouseDown e)
		{
			return Map.entry(OnMouseDown.ATTRIBUTE_NAME, new Attribute<String>(OnMouseDown.ATTRIBUTE_TYPE, e::setOnMouseDown, null, null));
		}
	}
	

	public interface OnMouseUp
	{
		public static final String ATTRIBUTE_NAME = "onmouseup";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setOnMouseUp(String e);
		public String getOnMouseUp();

		public static Map.Entry<String, Attribute<String>> getEntry(OnMouseUp e)
		{
			return Map.entry(OnMouseUp.ATTRIBUTE_NAME, new Attribute<String>(OnMouseUp.ATTRIBUTE_TYPE, e::setOnMouseUp, null, null));
		}
	}
	

	public interface OnMouseOver
	{
		public static final String ATTRIBUTE_NAME = "onmouseover";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setOnMouseOver(String e);
		public String getOnMouseOver();

		public static Map.Entry<String, Attribute<String>> getEntry(OnMouseOver e)
		{
			return Map.entry(OnMouseOver.ATTRIBUTE_NAME, new Attribute<String>(OnMouseOver.ATTRIBUTE_TYPE, e::setOnMouseOver, null, null));
		}
	}
	

	public interface OnMouseMove
	{
		public static final String ATTRIBUTE_NAME = "onmousemove";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setOnMouseMove(String e);
		public String getOnMouseMove();

		public static Map.Entry<String, Attribute<String>> getEntry(OnMouseMove e)
		{
			return Map.entry(OnMouseMove.ATTRIBUTE_NAME, new Attribute<String>(OnMouseMove.ATTRIBUTE_TYPE, e::setOnMouseMove, null, null));
		}
	}
	

	public interface OnMouseOut
	{
		public static final String ATTRIBUTE_NAME = "onmouseout";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setOnMouseOut(String e);
		public String getOnMouseOut();

		public static Map.Entry<String, Attribute<String>> getEntry(OnMouseOut e)
		{
			return Map.entry(OnMouseOut.ATTRIBUTE_NAME, new Attribute<String>(OnMouseOut.ATTRIBUTE_TYPE, e::setOnMouseOut, null, null));
		}
	}
	

	public interface OnKeyPress
	{
		public static final String ATTRIBUTE_NAME = "onkeypress";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setOnKeyPress(String e);
		public String getOnKeyPress();

		public static Map.Entry<String, Attribute<String>> getEntry(OnKeyPress e)
		{
			return Map.entry(OnKeyPress.ATTRIBUTE_NAME, new Attribute<String>(OnKeyPress.ATTRIBUTE_TYPE, e::setOnKeyPress, null, null));
		}
	}
	

	public interface OnKeyDown
	{
		public static final String ATTRIBUTE_NAME = "onkeydown";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setOnKeyDown(String e);
		public String getOnKeyDown();

		public static Map.Entry<String, Attribute<String>> getEntry(OnKeyDown e)
		{
			return Map.entry(OnKeyDown.ATTRIBUTE_NAME, new Attribute<String>(OnKeyDown.ATTRIBUTE_TYPE, e::setOnKeyDown, null, null));
		}
	}
	

	public interface OnKeyUp
	{
		public static final String ATTRIBUTE_NAME = "onkeyup";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setOnKeyUp(String e);
		public String getOnKeyUp();

		public static Map.Entry<String, Attribute<String>> getEntry(OnKeyUp e)
		{
			return Map.entry(OnKeyUp.ATTRIBUTE_NAME, new Attribute<String>(OnKeyUp.ATTRIBUTE_TYPE, e::setOnKeyUp, null, null));
		}
	}
	

	public interface Style
	{
		public static final String ATTRIBUTE_NAME = "style";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setStyle(String e);
		public String getStyle();

		public static Map.Entry<String, Attribute<String>> getEntry(Style e)
		{
			return Map.entry(Style.ATTRIBUTE_NAME, new Attribute<String>(Style.ATTRIBUTE_TYPE, e::setStyle, null, null));
		}
	}
	

	public interface Title
	{
		public static final String ATTRIBUTE_NAME = "title";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setTitle(String e);
		public String getTitle();

		public static Map.Entry<String, Attribute<String>> getEntry(Title e)
		{
			return Map.entry(Title.ATTRIBUTE_NAME, new Attribute<String>(Title.ATTRIBUTE_TYPE, e::setTitle, null, null));
		}
	}
	

	public interface Href
	{
		public static final String ATTRIBUTE_NAME = "href";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setHref(String e);
		public String getHref();

		public static Map.Entry<String, Attribute<String>> getEntry(Href e)
		{
			return Map.entry(Href.ATTRIBUTE_NAME, new Attribute<String>(Href.ATTRIBUTE_TYPE, e::setHref, null, null));
		}
	}
	

	public interface Async
	{
		public static final String ATTRIBUTE_NAME = "async";
		public static final Class<Boolean> ATTRIBUTE_TYPE = Boolean.class;
		public void setAsync(boolean e);
		public boolean getAsync();

		public static Map.Entry<String, Attribute<Boolean>> getEntry(Async e)
		{
			return Map.entry(Async.ATTRIBUTE_NAME, new Attribute<Boolean>(Async.ATTRIBUTE_TYPE, e::setAsync, true, false));
		}
	}
	

	public interface CrossOrigin
	{
		public static final String ATTRIBUTE_NAME = "crossorigin";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setCrossOrigin(String e);
		public String getCrossOrigin();

		public static Map.Entry<String, Attribute<String>> getEntry(CrossOrigin e)
		{
			return Map.entry(CrossOrigin.ATTRIBUTE_NAME, new Attribute<String>(CrossOrigin.ATTRIBUTE_TYPE, e::setCrossOrigin, null, null));
		}
	}
	

	public interface Defer
	{
		public static final String ATTRIBUTE_NAME = "defer";
		public static final Class<Boolean> ATTRIBUTE_TYPE = Boolean.class;
		public void setDefer(boolean e);
		public boolean getDefer();

		public static Map.Entry<String, Attribute<Boolean>> getEntry(Defer e)
		{
			return Map.entry(Defer.ATTRIBUTE_NAME, new Attribute<Boolean>(Defer.ATTRIBUTE_TYPE, e::setDefer, true, false));
		}
	}
	

	public interface Integrity
	{
		public static final String ATTRIBUTE_NAME = "integrity";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setIntegrity(String e);
		public String getIntegrity();

		public static Map.Entry<String, Attribute<String>> getEntry(Integrity e)
		{
			return Map.entry(Integrity.ATTRIBUTE_NAME, new Attribute<String>(Integrity.ATTRIBUTE_TYPE, e::setIntegrity, null, null));
		}
	}
	

	public interface NoModule
	{
		public static final String ATTRIBUTE_NAME = "nomodule";
		public static final Class<Boolean> ATTRIBUTE_TYPE = Boolean.class;
		public void setNoModule(boolean e);
		public boolean getNoModule();

		public static Map.Entry<String, Attribute<Boolean>> getEntry(NoModule e)
		{
			return Map.entry(NoModule.ATTRIBUTE_NAME, new Attribute<Boolean>(NoModule.ATTRIBUTE_TYPE, e::setNoModule, true, false));
		}
	}
	

	public interface Nonce
	{
		public static final String ATTRIBUTE_NAME = "nonce";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setNonce(String e);
		public String getNonce();

		public static Map.Entry<String, Attribute<String>> getEntry(Nonce e)
		{
			return Map.entry(Nonce.ATTRIBUTE_NAME, new Attribute<String>(Nonce.ATTRIBUTE_TYPE, e::setNonce, null, null));
		}
	}
	

	public interface ReferrerPolicy
	{
		public static final String ATTRIBUTE_NAME = "referrerpolicy";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setReferrerPolicy(String e);
		public String getReferrerPolicy();

		public static Map.Entry<String, Attribute<String>> getEntry(ReferrerPolicy e)
		{
			return Map.entry(ReferrerPolicy.ATTRIBUTE_NAME, new Attribute<String>(ReferrerPolicy.ATTRIBUTE_TYPE, e::setReferrerPolicy, null, null));
		}
	}
	

	public interface Type
	{
		public static final String ATTRIBUTE_NAME = "type";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setType(String e);
		public String getType();

		public static Map.Entry<String, Attribute<String>> getEntry(Type e)
		{
			return Map.entry(Type.ATTRIBUTE_NAME, new Attribute<String>(Type.ATTRIBUTE_TYPE, e::setType, null, null));
		}
	}
	

	public interface As
	{
		public static final String ATTRIBUTE_NAME = "as";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setAs(String e);
		public String getAs();

		public static Map.Entry<String, Attribute<String>> getEntry(As e)
		{
			return Map.entry(As.ATTRIBUTE_NAME, new Attribute<String>(As.ATTRIBUTE_TYPE, e::setAs, null, null));
		}
	}
	

	public interface HrefLang
	{
		public static final String ATTRIBUTE_NAME = "hreflang";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setHrefLang(String e);
		public String getHrefLang();

		public static Map.Entry<String, Attribute<String>> getEntry(HrefLang e)
		{
			return Map.entry(HrefLang.ATTRIBUTE_NAME, new Attribute<String>(HrefLang.ATTRIBUTE_TYPE, e::setHrefLang, null, null));
		}
	}
	

	public interface Importance
	{
		public static final String ATTRIBUTE_NAME = "importance";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setImportance(String e);
		public String getImportance();

		public static Map.Entry<String, Attribute<String>> getEntry(Importance e)
		{
			return Map.entry(Importance.ATTRIBUTE_NAME, new Attribute<String>(Importance.ATTRIBUTE_TYPE, e::setImportance, null, null));
		}
	}
	

	public interface Media
	{
		public static final String ATTRIBUTE_NAME = "media";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setMedia(String e);
		public String getMedia();

		public static Map.Entry<String, Attribute<String>> getEntry(Media e)
		{
			return Map.entry(Media.ATTRIBUTE_NAME, new Attribute<String>(Media.ATTRIBUTE_TYPE, e::setMedia, null, null));
		}
	}
	

	public interface Rel
	{
		public static final String ATTRIBUTE_NAME = "rel";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setRel(String e);
		public String getRel();

		public static Map.Entry<String, Attribute<String>> getEntry(Rel e)
		{
			return Map.entry(Rel.ATTRIBUTE_NAME, new Attribute<String>(Rel.ATTRIBUTE_TYPE, e::setRel, null, null));
		}
	}
	

	public interface Sizes
	{
		public static final String ATTRIBUTE_NAME = "sizes";
		public static final Class<Double> ATTRIBUTE_TYPE = Double.class;
		public void setSizes(double e);
		public double getSizes();

		public static Map.Entry<String, Attribute<Double>> getEntry(Sizes e)
		{
			return Map.entry(Sizes.ATTRIBUTE_NAME, new Attribute<Double>(Sizes.ATTRIBUTE_TYPE, e::setSizes, null, Double.MAX_VALUE));
		}
	}
	

	public interface Cols
	{
		public static final String ATTRIBUTE_NAME = "cols";
		public static final Class<Integer> ATTRIBUTE_TYPE = Integer.class;
		public void setCols(int e);
		public int getCols();

		public static Map.Entry<String, Attribute<Integer>> getEntry(Cols e)
		{
			return Map.entry(Cols.ATTRIBUTE_NAME, new Attribute<Integer>(Cols.ATTRIBUTE_TYPE, e::setCols, null, -1));
		}
	}
	

	public interface Rows
	{
		public static final String ATTRIBUTE_NAME = "rows";
		public static final Class<Integer> ATTRIBUTE_TYPE = Integer.class;
		public void setRows(int e);
		public int getRows();

		public static Map.Entry<String, Attribute<Integer>> getEntry(Rows e)
		{
			return Map.entry(Rows.ATTRIBUTE_NAME, new Attribute<Integer>(Rows.ATTRIBUTE_TYPE, e::setRows, null, -1));
		}
	}
	

	public interface Wrap
	{
		public static final String ATTRIBUTE_NAME = "wrap";
		public static final Class<String> ATTRIBUTE_TYPE = String.class;
		public void setWrap(String e);
		public String getWrap();

		public static Map.Entry<String, Attribute<String>> getEntry(Wrap e)
		{
			return Map.entry(Wrap.ATTRIBUTE_NAME, new Attribute<String>(Wrap.ATTRIBUTE_TYPE, e::setWrap, null, null));
		}
	}
	

	public interface Hidden
	{
		public static final String ATTRIBUTE_NAME = "hidden";
		public static final Class<Boolean> ATTRIBUTE_TYPE = Boolean.class;
		public void setHidden(boolean e);
		public boolean getHidden();

		public static Map.Entry<String, Attribute<Boolean>> getEntry(Hidden e)
		{
			return Map.entry(Hidden.ATTRIBUTE_NAME, new Attribute<Boolean>(Hidden.ATTRIBUTE_TYPE, e::setHidden, true, false));
		}
	}
	

}
