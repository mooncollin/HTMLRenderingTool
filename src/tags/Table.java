package tags;

import java.util.Collections;
import java.util.Map;

import html.CompoundElement;
import html.Element;

public class Table extends CompoundElement
{
	public static final String TAG = "table";

    public Table()
    {
        this(null, Collections.emptyMap());
    }

    public Table(String data)
    {
        this(data, Collections.emptyMap());
    }

    public Table(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public Table(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    public Table(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }

    @SafeVarargs
    public Table(String data, Map.Entry<String, ?>... entries)
    {
        super(TAG, data, Map.ofEntries(entries));
    }

    @Override
    public void setTag(String tag)
    {
        throw new UnsupportedOperationException("Cannot change tag");
    }

    @Override
    public Table addElements(Element... elements)
    {
        super.addElements(elements);
        return this;
    }

    @Override
    public Table addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}
