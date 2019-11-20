package tags;

import html.CompoundElement;

public class TableData extends CompoundElement
{
	public static final String TAG = "td";

	public TableData()
	{
		this(null);
	}
	
	public TableData(String data)
	{
		super(TAG, data);
	}

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
}
