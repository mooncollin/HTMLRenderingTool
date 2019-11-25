package forms;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import attributes.Attributes;

/**
 * This class represents a file input.
 * 
 * NOTE: This class currently does not parse files yet.
 * You will have to go through the request parameters for files
 * manually.
 * @author colli
 *
 */
public class File extends Input implements Attributes.Accept, Attributes.Capture, 
	Attributes.Multiple
{	
	/**
	 * The list of files to be populated when
	 * given the parameter map.
	 */
	private List<HTMLFile> files;
	
	/**
	 * Constructor. Creates an input of type "file".
	 */
	public File()
	{
		setType("file");
		files = new LinkedList<HTMLFile>();
	}
	
	/**
	 * Gets an unmodifiable list of files. This will only be
	 * populated when validated and valid information is passed.
	 * @return list of HTMLFiles
	 */
	public List<HTMLFile> getFiles()
	{
		return Collections.unmodifiableList(files);
	}
	
	@Override
	public File removeAttribute(String key)
	{
		if(key != null)
		{
			if(key.equals("files"))
			{
				throw new IllegalArgumentException("Cannot change attribute: files");
			}
		}
		
		super.removeAttribute(key);
		
		return this;
	}
	
	@Override
	public File setAttribute(String key, Object value)
	{
		if(key != null)
		{
			if(key.equals("files"))
			{
				throw new IllegalArgumentException("Cannot change attribute: files");
			}
		}
		
		super.setAttribute(key, value);
		
		return this;
	}
}
