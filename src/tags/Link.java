package tags;

import html.Element;

import java.util.Collections;
import java.util.Map;

import attributes.Attributes;

public class Link extends Element implements Attributes.As, Attributes.CrossOrigin, Attributes.Href,
		Attributes.HrefLang, Attributes.Importance, Attributes.Integrity, Attributes.Media, Attributes.ReferrerPolicy,
		Attributes.Rel, Attributes.Sizes, Attributes.Type
{
	public static final String TAG = "link";

	public Link()
    {
        this(null, Collections.emptyMap());
    }

    public Link(String data)
    {
        this(data, Collections.emptyMap());
    }

    public Link(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public Link(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    @SafeVarargs
    public Link(String data, Map.Entry<String, ?>... entries)
    {
        this(data, Map.ofEntries(entries));
    }

    public Link(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }  

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
	
	@Override
    public Link addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}
