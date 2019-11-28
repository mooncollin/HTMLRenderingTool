package tags;

import html.CompoundElement;

public class TableBody extends CompoundElement
{
	public static final String TAG = "tbody";

	public TableBody()
	{
		this(null);
	}
	
	public TableBody(String data)
	{
		super(TAG, data);
	}

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
}
