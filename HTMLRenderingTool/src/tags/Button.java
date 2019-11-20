package tags;

import java.util.Map;

import attributes.Attributes.Disabled;
import attributes.Attributes.Type;
import html.CompoundElement;

public class Button extends CompoundElement implements Disabled, Type
{
	public static final String TAG = "button";

	public Button()
	{
		this(null, null);
	}
	
	public Button(String data)
	{
		this(data, null);
	}
	
	public Button(Map<String, Object> attributes)
	{
		this(null, attributes);
	}
	
	public Button(String data, Map<String, Object> attributes)
	{
		super(TAG, data, attributes);
	}

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
	
	public void setDisabled(boolean disabled)
	{
		if (!disabled)
		{
			_removeAttribute(Disabled.ATTRIBUTE_NAME);
		}
		else
		{
			_setAttribute(Disabled.ATTRIBUTE_NAME, "");
		}
	}
	

	public boolean getDisabled()
	{
		String attribute = getAttribute(Disabled.ATTRIBUTE_NAME);
		if (attribute == null)
		{
			return false;
		}
		return true;
	}
	
	public void setType(String type)
	{
		if (type == null)
		{
			_removeAttribute(Type.ATTRIBUTE_NAME);
		}
		else
		{
			_setAttribute(Type.ATTRIBUTE_NAME, type);
		}
	}
	

	public String getType()
	{
		return getAttribute(Type.ATTRIBUTE_NAME);
	}
}
