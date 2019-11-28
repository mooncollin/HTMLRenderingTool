package tags;

import html.CompoundElement;

public class TableHeader extends CompoundElement
{
	public static final String TAG = "thead";

	public TableHeader()
	{
		this(null);
	}
	
	public TableHeader(String data)
	{
		super(TAG, data);
	}

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
}
