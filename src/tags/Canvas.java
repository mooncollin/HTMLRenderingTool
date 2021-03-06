package tags;

import java.util.Collections;
import java.util.Map;

import html.CompoundElement;
import html.Element;
import attributes.Attributes;

public class Canvas extends CompoundElement
	implements Attributes.Width, Attributes.Height
{
	public static final String TAG = "canvas";

    public Canvas()
    {
        this(null, Collections.emptyMap());
    }

    public Canvas(String data)
    {
        this(data, Collections.emptyMap());
    }

    public Canvas(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public Canvas(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    public Canvas(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }

    @SafeVarargs
    public Canvas(String data, Map.Entry<String, ?>... entries)
    {
        super(TAG, data, Map.ofEntries(entries));
    }

    @Override
    public void setTag(String tag)
    {
        throw new UnsupportedOperationException("Cannot change tag");
    }

    @Override
    public Canvas addElements(Element... elements)
    {
        super.addElements(elements);
        return this;
    }

    @Override
    public Canvas addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}
