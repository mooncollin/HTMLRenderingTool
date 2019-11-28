package tags;

import html.Element;
import attributes.Attributes;

public class Link extends Element implements Attributes.As, Attributes.CrossOrigin, Attributes.Href,
		Attributes.HrefLang, Attributes.Importance, Attributes.Integrity, Attributes.Media, Attributes.ReferrerPolicy,
		Attributes.Rel, Attributes.Sizes, Attributes.Type
{
	public static final String TAG = "link";

	public Link()
	{
		super(TAG);
	}

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}
}
