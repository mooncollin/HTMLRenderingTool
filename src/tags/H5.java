package tags;

import java.util.Collections;
import java.util.Map;

import html.CompoundElement;
import html.Element;

public class H5 extends CompoundElement
{
    public static final String TAG = "h5";

    public H5()
    {
        this(null, Collections.emptyMap());
    }

    public H5(String data)
    {
        this(data, Collections.emptyMap());
    }

    public H5(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public H5(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    public H5(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }

    @SafeVarargs
    public H5(String data, Map.Entry<String, ?>... entries)
    {
        super(TAG, data, Map.ofEntries(entries));
    }

    @Override
    public void setTag(String tag)
    {
        throw new UnsupportedOperationException("Cannot change tag");
    }

    @Override
    public H5 addElements(Element... elements)
    {
        super.addElements(elements);
        return this;
    }

    @Override
    public H5 addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}


