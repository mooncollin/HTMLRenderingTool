package tags;

import java.util.Collections;
import java.util.Map;

import html.Element;

public class Meta extends Element
{
	public static final String TAG = "meta";
	
	public Meta()
    {
        this(null, Collections.emptyMap());
    }

    public Meta(String data)
    {
        this(data, Collections.emptyMap());
    }

    public Meta(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public Meta(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    @SafeVarargs
    public Meta(String data, Map.Entry<String, ?>... entries)
    {
        this(data, Map.ofEntries(entries));
    }

    public Meta(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }
	
	@Override
    public Meta addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}
