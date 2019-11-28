package tags;

import java.util.Collections;
import java.util.Map;

import html.CompoundElement;
import html.Element;

public class OL extends CompoundElement
{
    public static final String TAG = "ol";

    public OL()
    {
        this(null, Collections.emptyMap());
    }

    public OL(String data)
    {
        this(data, Collections.emptyMap());
    }

    public OL(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public OL(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    public OL(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }

    @SafeVarargs
    public OL(String data, Map.Entry<String, ?>... entries)
    {
        super(TAG, data, Map.ofEntries(entries));
    }

    @Override
    public void setTag(String tag)
    {
        throw new UnsupportedOperationException("Cannot change tag");
    }

    @Override
    public OL addElements(Element... elements)
    {
        super.addElements(elements);
        return this;
    }

    @Override
    public OL addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}
