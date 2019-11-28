package tags;

import java.util.Collections;
import java.util.Map;

import attributes.Attributes.Disabled;
import attributes.Attributes.Type;
import html.CompoundElement;
import html.Element;

public class Button extends CompoundElement implements Disabled, Type
{
	public static final String TAG = "button";

    public Button()
    {
        this(null, Collections.emptyMap());
    }

    public Button(String data)
    {
        this(data, Collections.emptyMap());
    }

    public Button(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public Button(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    public Button(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }

    @SafeVarargs
    public Button(String data, Map.Entry<String, ?>... entries)
    {
        super(TAG, data, Map.ofEntries(entries));
    }

    @Override
    public void setTag(String tag)
    {
        throw new UnsupportedOperationException("Cannot change tag");
    }

    @Override
    public Button addElements(Element... elements)
    {
        super.addElements(elements);
        return this;
    }

    @Override
    public Button addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}
