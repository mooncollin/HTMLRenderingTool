package tags;

import java.util.Map;

import html.CompoundElement;

public class ListItem extends CompoundElement
{
	public static final String TAG = "li";

	public ListItem()
	{
		this(null, null);
	}
	
	public ListItem(String data)
	{
		this(data, null);
	}
	
	public ListItem(Map<String, Object> attributes)
	{
		this(null, attributes);
	}
	
	public ListItem(String data, Map<String, Object> attributes)
	{
		super(TAG, data, attributes);
	}

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
}
