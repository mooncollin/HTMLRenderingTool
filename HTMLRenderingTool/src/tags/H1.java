package tags;

import html.CompoundElement;

public class H1 extends CompoundElement
{
	public static final String TAG = "h1";

	public H1()
	{
		this(null);
	}
	
	public H1(String data)
	{
		super(TAG, data);
	}

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
}
