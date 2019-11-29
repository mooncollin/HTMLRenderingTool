package tags;

import java.util.Collections;
import java.util.Map;

import attributes.Attributes;
import html.CompoundElement;
import html.Element;

/**
 * This class represents a body element with extra functionality.
 * @author colli
 *
 */
public class Body extends CompoundElement
	implements Attributes.OnAfterPrint, Attributes.OnBeforePrint, Attributes.OnBeforeUnload,
			   Attributes.OnHashChange, Attributes.OnMessage, Attributes.OnOffline, Attributes.OnOnline,
			   Attributes.OnPopState, Attributes.OnRedo, Attributes.OnStorage, Attributes.OnUndo, 
			   Attributes.OnUnload
{	
	public static final String TAG = "body";

    public Body()
    {
        this(null, Collections.emptyMap());
    }

    public Body(String data)
    {
        this(data, Collections.emptyMap());
    }

    public Body(Map<String, Object> attributes)
    {
        this(null, attributes);
    }

    @SafeVarargs
    public Body(Map.Entry<String, ?>... entries)
    {
        this(null, entries);
    }

    public Body(String data, Map<String, Object> attributes)
    {
        super(TAG, data, attributes);
    }

    @SafeVarargs
    public Body(String data, Map.Entry<String, ?>... entries)
    {
        super(TAG, data, Map.ofEntries(entries));
    }

    @Override
    public void setTag(String tag)
    {
        throw new UnsupportedOperationException("Cannot change tag");
    }

    @Override
    public Body addElements(Element... elements)
    {
        super.addElements(elements);
        return this;
    }

    @Override
    public Body addClasses(String... classes)
    {
        super.addClasses(classes);
        return this;
    }
	
	/**
	 * Adds a script tag into the bottom of the body with the given source.
	 * @param src the source path of the script
	 */
	public void addScript(String src)
	{
		var script = new Script();
		script.setSrc(src);
		addEndElement(script);
	}
}
