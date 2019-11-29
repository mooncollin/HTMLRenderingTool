package tags;

import java.util.Collections;
import java.util.Map;

import html.CompoundElement;
import html.Element;
import attributes.Attributes;

public class Html extends CompoundElement
	implements Attributes.Lang
{
	public static final String TAG = "html";

    public Html()
    {
        this(null, Collections.emptyMap());
    }

    public Html(String data)
    {
        this(data, Collections.emptyMap());
    }

    public Html(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public Html(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    public Html(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }

    @SafeVarargs
    public Html(String data, Map.Entry<String, ?>... entries)
    {
        super(TAG, data, Map.ofEntries(entries));
    }

    @Override
    public void setTag(String tag)
    {
        throw new UnsupportedOperationException("Cannot change tag");
    }

    @Override
    public Html addElements(Element... elements)
    {
        super.addElements(elements);
        return this;
    }

    @Override
    public Html addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}
