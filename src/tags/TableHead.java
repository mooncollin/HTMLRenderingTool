package tags;

import java.util.Collections;
import java.util.Map;

import html.CompoundElement;
import html.Element;

public class TableHead extends CompoundElement
{
	public static final String TAG = "th";

    public TableHead()
    {
        this(null, Collections.emptyMap());
    }

    public TableHead(String data)
    {
        this(data, Collections.emptyMap());
    }

    public TableHead(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public TableHead(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    @SafeVarargs
    public TableHead(String data, Map.Entry<String, ?>... entries)
    {
        this(data, Map.ofEntries(entries));
    }

    public TableHead(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }  

    @Override
    public void setTag(String tag)
    {
        throw new UnsupportedOperationException("Cannot change tag");
    }

    @Override
    public TableHead addElements(Element... elements)
    {
        super.addElements(elements);
        return this;
    }

    @Override
    public TableHead addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}
