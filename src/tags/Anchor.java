package tags;

import java.util.Collections;
import java.util.Map;

import attributes.Attributes;
import html.CompoundElement;
import html.Element;

public class Anchor extends CompoundElement implements Attributes.Href, Attributes.Target
{
	public static final String TAG = "a";

    public Anchor()
    {
        this(null, Collections.emptyMap());
    }

    public Anchor(String data)
    {
        this(data, Collections.emptyMap());
    }

    public Anchor(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public Anchor(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    public Anchor(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }

    @SafeVarargs
    public Anchor(String data, Map.Entry<String, ?>... entries)
    {
        super(TAG, data, Map.ofEntries(entries));
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
}
