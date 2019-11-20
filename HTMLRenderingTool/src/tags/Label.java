package tags;

import java.util.Map;

import html.CompoundElement;

public class Label extends CompoundElement
{
	public static final String TAG = "Label";

	public Label()
	{
		this(null, null);
	}
	
	public Label(String data)
	{
		this(data, null);
	}
	
	public Label(Map<String, Object> attributes)
	{
		this(null, attributes);
	}
	
	public Label(String data, Map<String, Object> attributes)
	{
		super(TAG, data, attributes);
	}

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
}
