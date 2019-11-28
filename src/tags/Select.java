package tags;

import java.util.Map;

import html.CompoundElement;

public class Select extends CompoundElement
{
	public static final String TAG = "Select";

	public Select()
	{
		this(null, null);
	}
	
	public Select(String data)
	{
		this(data, null);
	}
	
	public Select(Map<String, Object> attributes)
	{
		this(null, attributes);
	}
	
	public Select(String data, Map<String, Object> attributes)
	{
		super(TAG, data, attributes);
	}

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
}
