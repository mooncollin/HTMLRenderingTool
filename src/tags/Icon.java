package tags;

import java.util.Collections;
import java.util.Map;

import html.CompoundElement;
import html.Element;

public class Icon extends CompoundElement
{
	public static final String TAG = "i";

    public Icon()
    {
        this(null, Collections.emptyMap());
    }

    public Icon(String data)
    {
        this(data, Collections.emptyMap());
    }

    public Icon(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public Icon(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    @SafeVarargs
    public Icon(String data, Map.Entry<String, ?>... entries)
    {
        this(data, Map.ofEntries(entries));
    }

    public Icon(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }  

    @Override
    public void setTag(String tag)
    {
        throw new UnsupportedOperationException("Cannot change tag");
    }

    @Override
    public Icon addElements(Element... elements)
    {
        super.addElements(elements);
        return this;
    }

    @Override
    public Icon addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}
