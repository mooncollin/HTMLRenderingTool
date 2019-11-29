package tags;

import java.util.Collections;
import java.util.Map;

import html.CompoundElement;
import html.Element;

public class Option extends CompoundElement
{
	public static final String TAG = "option";

    public Option()
    {
        this(null, Collections.emptyMap());
    }

    public Option(String data)
    {
        this(data, Collections.emptyMap());
    }

    public Option(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public Option(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    @SafeVarargs
    public Option(String data, Map.Entry<String, ?>... entries)
    {
        this(data, Map.ofEntries(entries));
    }

    public Option(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }  

    @Override
    public void setTag(String tag)
    {
        throw new UnsupportedOperationException("Cannot change tag");
    }

    @Override
    public Option addElements(Element... elements)
    {
        super.addElements(elements);
        return this;
    }

    @Override
    public Option addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}
