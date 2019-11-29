package tags;

import java.util.Collections;
import java.util.Map;

import html.CompoundElement;
import html.Element;

public class Select extends CompoundElement
{
	public static final String TAG = "select";

    public Select()
    {
        this(null, Collections.emptyMap());
    }

    public Select(String data)
    {
        this(data, Collections.emptyMap());
    }

    public Select(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public Select(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    @SafeVarargs
    public Select(String data, Map.Entry<String, ?>... entries)
    {
        this(data, Map.ofEntries(entries));
    }

    public Select(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }  

    @Override
    public void setTag(String tag)
    {
        throw new UnsupportedOperationException("Cannot change tag");
    }

    @Override
    public Select addElements(Element... elements)
    {
        super.addElements(elements);
        return this;
    }

    @Override
    public Select addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}
