package tags;

import html.CompoundElement;

public class TableRow extends CompoundElement
{
	public static final String TAG = "tr";

	public TableRow()
	{
		this(null);
	}
	
	public TableRow(String data)
	{
		super(TAG, data);
	}

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
}
