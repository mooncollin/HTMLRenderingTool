package tags;

import java.util.Map;

import html.CompoundElement;

public class Option extends CompoundElement
{
	public static final String TAG = "Option";

	public Option()
	{
		this(null, null);
	}
	
	public Option(String data)
	{
		this(data, null);
	}
	
	public Option(Map<String, Object> attributes)
	{
		this(null, attributes);
	}
	
	public Option(String data, Map<String, Object> attributes)
	{
		super(TAG, data, attributes);
	}

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
}
