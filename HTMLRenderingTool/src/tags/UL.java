package tags;

import java.util.Map;

import html.CompoundElement;
import html.Element;

public class UL extends CompoundElement
{
	public static final String TAG = "ul";
	
	public UL()
	{
		this(null, null);
	}
	
	public UL(String data)
	{
		this(data, null);
	}
	
	public UL(Map<String, Object> attributes)
	{
		this(null, attributes);
	}
	
	public UL(String data, Map<String, Object> attributes)
	{
		super(TAG, data, attributes);
	}
	
	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
	
	@Override
    public UL addElements(Element... elements)
    {
        super.addElements(elements);
        return this;
    }

    @Override
    public UL addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}
