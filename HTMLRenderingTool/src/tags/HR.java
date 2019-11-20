package tags;

import html.Element;

public class HR extends Element
{
	public static final String TAG = "hr";

	public HR()
	{
		this(null);
	}
	
	public HR(String data)
	{
		super(TAG, data);
	}

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
}
