package tags;

import html.CompoundElement;

public class Span extends CompoundElement
{
	public static final String TAG = "span";

	public Span()
	{
		this(null);
	}
	
	public Span(String data)
	{
		super(TAG, data);
	}

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
}
