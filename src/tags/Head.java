package tags;

import java.util.Collections;
import java.util.Map;

import html.CompoundElement;
import html.Element;

/**
 * This class represents a head element with extra functionality.
 * @author colli
 *
 */
public class Head extends CompoundElement
{
	public static final String TAG = "head";

    public Head()
    {
        this(null, Collections.emptyMap());
    }

    public Head(String data)
    {
        this(data, Collections.emptyMap());
    }

    public Head(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public Head(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    @SafeVarargs
    public Head(String data, Map.Entry<String, ?>... entries)
    {
        this(data, Map.ofEntries(entries));
    }

    public Head(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
        addElement(new Title());
		addElement(new Meta().setAttribute("charset", "UTF-8"));
    }  

    @Override
    public void setTag(String tag)
    {
        throw new UnsupportedOperationException("Cannot change tag");
    }

    @Override
    public Head addElements(Element... elements)
    {
        super.addElements(elements);
        return this;
    }

    @Override
    public Head addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
	
	/**
	 * Adds a script tag into the head with the given source.
	 * @param src the source path of the script
	 */
	public void addScript(String src)
	{
		var script = new Script();
		script.setSrc(src);
		addElement(script);
	}
	
	/**
	 * Adds a stylesheet into the head with the given source.
	 * @param sheet the source path of the stylesheet
	 */
	public void addStylesheet(String sheet)
	{
		var link = new Link();
		link.setRel("stylesheet");
		link.setType("text/css");
		link.setHref(sheet);
		addElement(link);
	}
}
