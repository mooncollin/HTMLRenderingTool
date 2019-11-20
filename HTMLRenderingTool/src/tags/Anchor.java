package tags;

import java.util.Map;

import attributes.Attributes;
import attributes.Attributes.Href;
import attributes.Attributes.Target;
import html.CompoundElement;
import html.Element;

public class Anchor extends CompoundElement implements Attributes.Href, Attributes.Target
{
	public static final String TAG = "a";

	public Anchor()
	{
		this(null, null);
	}
	
	public Anchor(Map<String, Object> attributes)
	{
		this(null, attributes);
	}
	
	public Anchor(String data)
	{
		this(data, null);
	}
	
	public Anchor(String data, Map<String, Object> attributes)
	{
		super(TAG, data, attributes);
	}

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
	
	@Override
	public Anchor addElements(Element... elements)
	{
		super.addElements(elements);
		return this;
	}
	
	@Override
	public Anchor addClasses(String... classes)
	{
		super.addClasses(classes);
		return this;
	}

	public void setHref(String href)
	{
		if (href == null)
		{
			_removeAttribute(Href.ATTRIBUTE_NAME);
		}
		else
		{
			_setAttribute(Href.ATTRIBUTE_NAME, href);
		}
	}
	

	public String getHref()
	{
		return getAttribute(Href.ATTRIBUTE_NAME);
	}
	

	public void setTarget(String target)
	{
		if (target == null)
		{
			_removeAttribute(Target.ATTRIBUTE_NAME);
		}
		else
		{
			_setAttribute(Target.ATTRIBUTE_NAME, target);
		}
	}
	

	public String getTarget()
	{
		return getAttribute(Target.ATTRIBUTE_NAME);
	}
	

}
