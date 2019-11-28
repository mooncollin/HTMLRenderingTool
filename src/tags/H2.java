package tags;

import html.CompoundElement;

public class H2 extends CompoundElement
{
	public static final String TAG = "h2";

	public H2()
	{
		this(null);
	}
	
	public H2(String data)
	{
		super(TAG, data);
	}

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
}
