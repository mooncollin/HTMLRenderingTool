package tags;

import java.util.Collections;
import java.util.Map;

import html.Element;

public class HR extends Element
{
	public static final String TAG = "hr";

	public HR()
    {
        this(null, Collections.emptyMap());
    }

    public HR(String data)
    {
        this(data, Collections.emptyMap());
    }

    public HR(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public HR(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    @SafeVarargs
    public HR(String data, Map.Entry<String, ?>... entries)
    {
        this(data, Map.ofEntries(entries));
    }

    public HR(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
	
	@Override
    public HR addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}
