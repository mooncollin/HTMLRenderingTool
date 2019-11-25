package tags;

import java.util.Map;

import html.CompoundElement;

public class TableData extends CompoundElement
{
	public static final String TAG = "td";

	public TableData()
	{
		this(null, null);
	}
	
	public TableData(String data)
	{
		this(data, null);
	}
	
	public TableData(Map<String, Object> attributes)
	{
		this(null, attributes);
	}
	
	public TableData(String data, Map<String, Object> attributes)
	{
		super(TAG, data, attributes);
	}

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
}
