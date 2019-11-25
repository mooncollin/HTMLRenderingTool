package forms;

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
        this(null, null);
    }

    public TextField(String data)
    {
        this(data, null);
    }

    public TextField(Map<String, Object> attributes)
    {
        this(null, attributes);
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
