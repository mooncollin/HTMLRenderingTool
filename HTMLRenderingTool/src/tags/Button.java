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
}
