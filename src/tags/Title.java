package tags;

import java.util.Collections;
import java.util.Map;

import html.CompoundElement;
import html.Element;

public class Title extends CompoundElement
{
    public static final String TAG = "title";

    public Title()
    {
        this(null, Collections.emptyMap());
    }

    public Title(String data)
    {
        this(data, Collections.emptyMap());
    }

    public Title(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public Title(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    @SafeVarargs
    public Title(String data, Map.Entry<String, ?>... entries)
    {
        this(data, Map.ofEntries(entries));
    }

    public Title(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }  

    @Override
    public void setTag(String tag)
    {
        throw new UnsupportedOperationException("Cannot change tag");
    }

    @Override
    public Title addElements(Element... elements)
    {
        super.addElements(elements);
        return this;
    }

    @Override
    public Title addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}


