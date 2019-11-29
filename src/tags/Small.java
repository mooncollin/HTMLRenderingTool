package tags;

import java.util.Collections;
import java.util.Map;

import html.CompoundElement;
import html.Element;

public class Small extends CompoundElement
{
	public static final String TAG = "small";

    public Small()
    {
        this(null, Collections.emptyMap());
    }

    public Small(String data)
    {
        this(data, Collections.emptyMap());
    }

    public Small(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public Small(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    @SafeVarargs
    public Small(String data, Map.Entry<String, ?>... entries)
    {
        this(data, Map.ofEntries(entries));
    }

    public Small(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }  

    @Override
    public void setTag(String tag)
    {
        throw new UnsupportedOperationException("Cannot change tag");
    }

    @Override
    public Small addElements(Element... elements)
    {
        super.addElements(elements);
        return this;
    }

    @Override
    public Small addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}
