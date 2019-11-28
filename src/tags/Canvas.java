package tags;

import html.CompoundElement;

public class Canvas extends CompoundElement
{
	public static final String TAG = "canvas";

	public Canvas()
	{
		this(null);
	}
	
	public Canvas(String data)
	{
		super(TAG, data);
	}

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
}
