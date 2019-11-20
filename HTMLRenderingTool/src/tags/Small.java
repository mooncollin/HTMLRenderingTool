package tags;

import java.util.Map;

import html.CompoundElement;

public class Small extends CompoundElement
{
	public static final String TAG = "small";

	public Small()
	{
		this(null, null);
	}
	
	public Small(String data)
	{
		this(data, null);
	}
	
	public Small(Map<String, Object> attributes)
	{
		this(null, attributes);
	}
	
	public Small(String data, Map<String, Object> attributes)
	{
		super(TAG, data, attributes);
	}

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
}
