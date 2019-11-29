package tags;

import java.util.Collections;
import java.util.Map;

import html.CompoundElement;
import html.Element;

public class TableData extends CompoundElement
{
	public static final String TAG = "td";

    public TableData()
    {
        this(null, Collections.emptyMap());
    }

    public TableData(String data)
    {
        this(data, Collections.emptyMap());
    }

    public TableData(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public TableData(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    @SafeVarargs
    public TableData(String data, Map.Entry<String, ?>... entries)
    {
        this(data, Map.ofEntries(entries));
    }

    public TableData(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }  

    @Override
    public void setTag(String tag)
    {
        throw new UnsupportedOperationException("Cannot change tag");
    }

    @Override
    public TableData addElements(Element... elements)
    {
        super.addElements(elements);
        return this;
    }

    @Override
    public TableData addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}
