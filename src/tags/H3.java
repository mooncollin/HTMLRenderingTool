package tags;

import java.util.Collections;
import java.util.Map;

import html.CompoundElement;
import html.Element;

public class H3 extends CompoundElement
{
    public static final String TAG = "h3";

    public H3()
    {
        this(null, Collections.emptyMap());
    }

    public H3(String data)
    {
        this(data, Collections.emptyMap());
    }

    public H3(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public H3(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    public H3(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }

    @SafeVarargs
    public H3(String data, Map.Entry<String, ?>... entries)
    {
        super(TAG, data, Map.ofEntries(entries));
    }

    @Override
    public void setTag(String tag)
    {
        throw new UnsupportedOperationException("Cannot change tag");
    }

    @Override
    public H3 addElements(Element... elements)
    {
        super.addElements(elements);
        return this;
    }

    @Override
    public H3 addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}


