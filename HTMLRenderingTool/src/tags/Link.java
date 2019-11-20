package tags;

import html.Element;
import attributes.Attributes;

public class Link extends Element implements Attributes.As, Attributes.CrossOrigin, Attributes.Href,
		Attributes.HrefLang, Attributes.Importance, Attributes.Integrity, Attributes.Media, Attributes.ReferrerPolicy,
		Attributes.Rel, Attributes.Sizes, Attributes.Type
{
	public static final String TAG = "link";

	private String as;
	private String crossorigin;
	private String href;
	private String hreflang;
	private String importance;
	private String integrity;
	private String media;
	private String referrerpolicy;
	private String rel;
	private double sizes;
	private String type;

	public Link()
	{
		super(TAG);
	}

	@Override
	public void setTag(String tag)
	{
		throw new UnsupportedOperationException("Cannot change tag");
	}

	public void setAs(String in)
	{
		this.as = in;
		if (this.as == null)
		{
			_removeAttribute("as");
		}
		else
		{
			_setAttribute("as", this.as);
		}
	}

	public String getAs()
	{
		return as;
	}

	public void setCrossOrigin(String in)
	{
		this.crossorigin = in;
		if (this.crossorigin == null)
		{
			_removeAttribute("crossorigin");
		}
		else
		{
			_setAttribute("crossorigin", this.crossorigin);
		}
	}

	public String getCrossOrigin()
	{
		return crossorigin;
	}

	public void setHref(String in)
	{
		this.href = in;
		if (this.href == null)
		{
			_removeAttribute("href");
		}
		else
		{
			_setAttribute("href", this.href);
		}
	}

	public String getHref()
	{
		return href;
	}

	public void setHrefLang(String in)
	{
		this.hreflang = in;
		if (this.hreflang == null)
		{
			_removeAttribute("hreflang");
		}
		else
		{
			_setAttribute("hreflang", this.hreflang);
		}
	}

	public String getHrefLang()
	{
		return hreflang;
	}

	public void setImportance(String in)
	{
		this.importance = in;
		if (this.importance == null)
		{
			_removeAttribute("importance");
		}
		else
		{
			_setAttribute("importance", this.importance);
		}
	}

	public String getImportance()
	{
		return importance;
	}

	public void setIntegrity(String in)
	{
		this.integrity = in;
		if (this.integrity == null)
		{
			_removeAttribute("integrity");
		}
		else
		{
			_setAttribute("integrity", this.integrity);
		}
	}

	public String getIntegrity()
	{
		return integrity;
	}

	public void setMedia(String in)
	{
		this.media = in;
		if (this.media == null)
		{
			_removeAttribute("media");
		}
		else
		{
			_setAttribute("media", this.media);
		}
	}

	public String getMedia()
	{
		return media;
	}

	public void setReferrerPolicy(String in)
	{
		this.referrerpolicy = in;
		if (this.referrerpolicy == null)
		{
			_removeAttribute("referrerpolicy");
		}
		else
		{
			_setAttribute("referrerpolicy", this.referrerpolicy);
		}
	}

	public String getReferrerPolicy()
	{
		return referrerpolicy;
	}

	public void setRel(String in)
	{
		this.rel = in;
		if (this.rel == null)
		{
			_removeAttribute("rel");
		}
		else
		{
			_setAttribute("rel", this.rel);
		}
	}

	public String getRel()
	{
		return rel;
	}

	public void setSizes(double in)
	{
		this.sizes = in < 0 ? -1 : in;
		if (this.sizes < 0)
		{
			_removeAttribute("sizes");
		}
		else
		{
			_setAttribute("sizes", String.valueOf(this.sizes));
		}
	}

	public double getSizes()
	{
		return sizes;
	}

	public void setType(String in)
	{
		this.type = in;
		if (this.type == null)
		{
			_removeAttribute("type");
		}
		else
		{
			_setAttribute("type", this.type);
		}
	}

	public String getType()
	{
		return type;
	}
}
