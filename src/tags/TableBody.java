package tags;

import java.util.Collections;
import java.util.Map;

import html.CompoundElement;
import html.Element;

public class TableBody extends CompoundElement
{
	public static final String TAG = "tbody";

    public TableBody()
    {
        this(null, Collections.emptyMap());
    }

    public TableBody(String data)
    {
        this(data, Collections.emptyMap());
    }

    public TableBody(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public TableBody(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    @SafeVarargs
    public TableBody(String data, Map.Entry<String, ?>... entries)
    {
        this(data, Map.ofEntries(entries));
    }

    public TableBody(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }  

    @Override
    public void setTag(String tag)
    {
        throw new UnsupportedOperationException("Cannot change tag");
    }

    @Override
    public TableBody addElements(Element... elements)
    {
        super.addElements(elements);
        return this;
    }

    @Override
    public TableBody addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}
