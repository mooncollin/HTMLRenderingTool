package tags;

import java.util.Collections;
import java.util.Map;

import html.CompoundElement;
import html.Element;

public class Label extends CompoundElement
{
	public static final String TAG = "label";

    public Label()
    {
        this(null, Collections.emptyMap());
    }

    public Label(String data)
    {
        this(data, Collections.emptyMap());
    }

    public Label(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public Label(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    @SafeVarargs
    public Label(String data, Map.Entry<String, ?>... entries)
    {
        this(data, Map.ofEntries(entries));
    }

    public Label(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }  

    @Override
    public void setTag(String tag)
    {
        throw new UnsupportedOperationException("Cannot change tag");
    }

    @Override
    public Label addElements(Element... elements)
    {
        super.addElements(elements);
        return this;
    }

    @Override
    public Label addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}
