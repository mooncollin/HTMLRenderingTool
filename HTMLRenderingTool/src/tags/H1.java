package tags;

import java.util.Map;

import html.CompoundElement;

public class H1 extends CompoundElement
{
	public static final String TAG = "h1";

	public H1()
	{
		this(null, null);
	}
	
	public H1(String data)
	{
		this(data, null);
	}
	
	public H1(Map<String, Object> attributes)
	{
		this(null, attributes);
	}
	
	public H1(String data, Map<String, Object> attributes)
	{
		super(TAG, data, attributes);
	}

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
}
