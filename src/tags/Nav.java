package tags;

import java.util.Collections;
import java.util.Map;

import html.CompoundElement;
import html.Element;

public class Nav extends CompoundElement
{
	public static final String TAG = "nav";

    public Nav()
    {
        this(null, Collections.emptyMap());
    }

    public Nav(String data)
    {
        this(data, Collections.emptyMap());
    }

    public Nav(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public Nav(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    @SafeVarargs
    public Nav(String data, Map.Entry<String, ?>... entries)
    {
        this(data, Map.ofEntries(entries));
    }

    public Nav(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }  

    @Override
    public void setTag(String tag)
    {
        throw new UnsupportedOperationException("Cannot change tag");
    }

    @Override
    public Nav addElements(Element... elements)
    {
        super.addElements(elements);
        return this;
    }

    @Override
    public Nav addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}
