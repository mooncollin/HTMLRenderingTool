package tags;

import html.CompoundElement;
import attributes.Attributes;

public class Script extends CompoundElement
		implements Attributes.Async, Attributes.CrossOrigin, Attributes.Defer, Attributes.Integrity,
		Attributes.NoModule, Attributes.Nonce, Attributes.ReferrerPolicy, Attributes.Src, Attributes.Type
{
	public static final String TAG = "script";

	public Script()
	{
		this(null);
	}
	
	public Script(String data)
	{
		super(TAG, data);
	}

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
}
