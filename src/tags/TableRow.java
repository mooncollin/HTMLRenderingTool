package tags;

import java.util.Collections;
import java.util.Map;

import html.CompoundElement;
import html.Element;

public class TableRow extends CompoundElement
{
	public static final String TAG = "tr";

    public TableRow()
    {
        this(null, Collections.emptyMap());
    }

    public TableRow(String data)
    {
        this(data, Collections.emptyMap());
    }

    public TableRow(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public TableRow(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    @SafeVarargs
    public TableRow(String data, Map.Entry<String, ?>... entries)
    {
        this(data, Map.ofEntries(entries));
    }

    public TableRow(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }  

    @Override
    public void setTag(String tag)
    {
        throw new UnsupportedOperationException("Cannot change tag");
    }

    @Override
    public TableRow addElements(Element... elements)
    {
        super.addElements(elements);
        return this;
    }

    @Override
    public TableRow addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}
