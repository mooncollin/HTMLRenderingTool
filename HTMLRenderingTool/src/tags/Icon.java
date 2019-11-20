package tags;

import html.CompoundElement;
import html.Element;

public class Icon extends CompoundElement
{
	public static final String TAG = "i";

	public Icon()
	{
		this(null);
	}
	
	public Icon(String data)
	{
		super(TAG, data);
	}

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
	
	@Override
	public Icon addElements(Element... elements)
	{
		super.addElements(elements);
		return this;
	}
	
	@Override
	public Icon addClasses(String... classes)
	{
		super.addClasses(classes);
		return this;
	}
}
