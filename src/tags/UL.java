package tags;

import java.util.Collections;
import java.util.Map;

import html.CompoundElement;
import html.Element;

public class UL extends CompoundElement
{
	public static final String TAG = "ul";

    public UL()
    {
        this(null, Collections.emptyMap());
    }

    public UL(String data)
    {
        this(data, Collections.emptyMap());
    }

    public UL(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public UL(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    @SafeVarargs
    public UL(String data, Map.Entry<String, ?>... entries)
    {
        this(data, Map.ofEntries(entries));
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
