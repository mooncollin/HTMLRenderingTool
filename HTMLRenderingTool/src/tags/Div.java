package tags;

import java.util.Map;

import html.CompoundElement;

public class Div extends CompoundElement
{
	public static final String TAG = "div";
	
	public Div()
	{
		this(null, null);
	}
	
	public Div(Map<String, Object> attributes)
	{
		this(null, attributes);
	}
	
	public Div(String data)
	{
		this(data, null);
	}
	
	public Div(String data, Map<String, Object> attributes)
	{
		super(TAG, data, attributes);
	}
	
	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
}
