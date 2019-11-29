package tags;

import java.util.Collections;
import java.util.Map;

import html.CompoundElement;
import html.Element;

public class TableHeader extends CompoundElement
{
	public static final String TAG = "thead";

    public TableHeader()
    {
        this(null, Collections.emptyMap());
    }

    public TableHeader(String data)
    {
        this(data, Collections.emptyMap());
    }

    public TableHeader(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public TableHeader(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    @SafeVarargs
    public TableHeader(String data, Map.Entry<String, ?>... entries)
    {
        this(data, Map.ofEntries(entries));
    }

    public TableHeader(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }  

    @Override
    public void setTag(String tag)
    {
        throw new UnsupportedOperationException("Cannot change tag");
    }

    @Override
    public TableHeader addElements(Element... elements)
    {
        super.addElements(elements);
        return this;
    }

    @Override
    public TableHeader addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}
