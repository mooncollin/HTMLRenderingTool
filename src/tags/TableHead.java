package tags;

import java.util.Map;

import html.CompoundElement;

public class TableHead extends CompoundElement
{
	public static final String TAG = "th";

	public TableHead()
	{
		this(null, null);
	}
	
	public TableHead(Map<String, Object> attributes)
	{
		this(null, attributes);
	}
	
	public TableHead(String data)
	{
		this(data, null);
	}
	
	public TableHead(String data, Map<String, Object> attributes)
	{
		super(TAG, data, attributes);
	}

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
}
