package tags;

import java.util.Map;

import html.CompoundElement;
import html.Element;

public class LI extends CompoundElement
{
	public static final String TAG = "li";
		
	public LI()
	{
		this(null, null);
	}
	
	public LI(String data)
	{
		this(data, null);
	}
	
	public LI(Map<String, Object> attributes)
	{
		this(null, attributes);
	}
	
	public LI(String data, Map<String, Object> attributes)
	{
		super(TAG, data, attributes);
	}
	
	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
	
	@Override
    public LI addElements(Element... elements)
    {
        super.addElements(elements);
        return this;
    }

    @Override
    public LI addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}
