package tags;

import html.CompoundElement;
import html.Element;

import java.util.Collections;
import java.util.Map;

import attributes.Attributes;

public class TextArea extends CompoundElement implements Attributes.AutoCapitalize, Attributes.AutoComplete,
		Attributes.AutoFocus, Attributes.Cols, Attributes.Disabled, Attributes.Form, Attributes.MaxLength,
		Attributes.MinLength, Attributes.Name, Attributes.PlaceHolder, Attributes.ReadOnly, Attributes.Required,
		Attributes.Rows, Attributes.SpellCheck, Attributes.Wrap
{
	public static final String TAG = "textarea";

    public TextArea()
    {
        this(null, Collections.emptyMap());
    }

    public TextArea(String data)
    {
        this(data, Collections.emptyMap());
    }

    public TextArea(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public TextArea(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    @SafeVarargs
    public TextArea(String data, Map.Entry<String, ?>... entries)
    {
        this(data, Map.ofEntries(entries));
    }

    public TextArea(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }  

    @Override
    public void setTag(String tag)
    {
        throw new UnsupportedOperationException("Cannot change tag");
    }

    @Override
    public TextArea addElements(Element... elements)
    {
        super.addElements(elements);
        return this;
    }

    @Override
    public TextArea addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}
