package tags;

import java.util.Map;

import html.CompoundElement;
import html.Element;

public class Nav extends CompoundElement
{
	public static final String TAG = "nav";

	public Nav()
	{
		this(null, null);
	}
	
	public Nav(String data)
	{
		this(data, null);
	}
	
	public Nav(Map<String, Object> attributes)
	{
		this(null, attributes);
	}
	
	public Nav(String data, Map<String, Object> attributes)
	{
		super(TAG, data, attributes);
	}

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
	
	@Override
	public Nav addElements(Element... elements)
	{
		super.addElements(elements);
		return this;
	}
	
	@Override
	public Nav addClasses(String... classes)
	{
		super.addClasses(classes);
		return this;
	}
}
