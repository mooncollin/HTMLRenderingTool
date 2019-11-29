package tags;

import html.CompoundElement;
import html.Element;

import java.util.Collections;
import java.util.Map;

import attributes.Attributes;

public class Script extends CompoundElement
		implements Attributes.Async, Attributes.CrossOrigin, Attributes.Defer, Attributes.Integrity,
		Attributes.NoModule, Attributes.Nonce, Attributes.ReferrerPolicy, Attributes.Src, Attributes.Type
{
	public static final String TAG = "script";

    public Script()
    {
        this(null, Collections.emptyMap());
    }

    public Script(String data)
    {
        this(data, Collections.emptyMap());
    }

    public Script(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public Script(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    @SafeVarargs
    public Script(String data, Map.Entry<String, ?>... entries)
    {
        this(data, Map.ofEntries(entries));
    }

    public Script(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }  

    @Override
    public void setTag(String tag)
    {
        throw new UnsupportedOperationException("Cannot change tag");
    }

    @Override
    public Script addElements(Element... elements)
    {
        super.addElements(elements);
        return this;
    }

    @Override
    public Script addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}
