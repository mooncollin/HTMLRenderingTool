package tags;

import java.util.Collections;
import java.util.Map;

import html.CompoundElement;
import html.Element;

public class Div extends CompoundElement
{
	public static final String TAG = "div";

    public Div()
    {
        this(null, Collections.emptyMap());
    }

    public Div(String data)
    {
        this(data, Collections.emptyMap());
    }

    public Div(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public Div(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    public Div(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }

    @SafeVarargs
    public Div(String data, Map.Entry<String, ?>... entries)
    {
        super(TAG, data, Map.ofEntries(entries));
    }

    @Override
    public void setTag(String tag)
    {
        throw new UnsupportedOperationException("Cannot change tag");
    }

    @Override
    public Div addElements(Element... elements)
    {
        super.addElements(elements);
        return this;
    }

    @Override
    public Div addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}
