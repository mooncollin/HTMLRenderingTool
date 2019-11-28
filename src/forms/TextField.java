package forms;

import java.util.Collections;
import java.util.Map;

import attributes.Attributes;

/**
 * This class represents a text input.
 * @author colli
 *
 */
public class TextField extends Input implements Attributes.MinLength, 
	Attributes.MaxLength, Attributes.Size, Attributes.Pattern, Attributes.PlaceHolder, 
	Attributes.SpellCheck
{	
	public static final String TYPE = "text";

	public TextField()
    {
        this(null, Collections.emptyMap());
    }

    public TextField(String data)
    {
        this(data, Collections.emptyMap());
    }

    public TextField(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public TextField(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }
    
    @SafeVarargs
    public TextField(String data, Map.Entry<String, ?>... entries)
    {
    	this(data, Map.ofEntries(entries));
    }

    public TextField(String data, Map<String, Object> attributes)
    {
        super(data, attributes);
        setType(TYPE);
    }

    @Override
    public TextField addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
}
