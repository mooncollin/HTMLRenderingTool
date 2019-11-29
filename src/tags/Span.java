package tags;

import java.util.Collections;
import java.util.Map;

import html.CompoundElement;
import html.Element;

public class Span extends CompoundElement
{
	public static final String TAG = "span";

    public Span()
    {
        this(null, Collections.emptyMap());
    }

    public Span(String data)
    {
        this(data, Collections.emptyMap());
    }

    public Span(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public Span(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    @SafeVarargs
    public Span(String data, Map.Entry<String, ?>... entries)
    {
        this(data, Map.ofEntries(entries));
    }

    public Span(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }  

    @Override
    public void setTag(String tag)
    {
        throw new UnsupportedOperationException("Cannot change tag");
    }

    @Override
    public Span addElements(Element... elements)
    {
        super.addElements(elements);
        return this;
    }

    @Override
    public Span addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}
