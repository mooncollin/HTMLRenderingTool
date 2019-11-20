package tags;

import html.CompoundElement;

public class Table extends CompoundElement
{
	public static final String TAG = "table";

	public Table()
	{
		this(null);
	}
	
	public Table(String data)
	{
		super(TAG, data);
	}

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
}
