package tags;

import html.CompoundElement;
import attributes.Attributes;

public class Script extends CompoundElement
		implements Attributes.Async, Attributes.CrossOrigin, Attributes.Defer, Attributes.Integrity,
		Attributes.NoModule, Attributes.Nonce, Attributes.ReferrerPolicy, Attributes.Src, Attributes.Type
{
	public static final String TAG = "script";

	private boolean async;
	private String crossorigin;
	private boolean defer;
	private String integrity;
	private boolean nomodule;
	private String nonce;
	private String referrerpolicy;
	private String src;
	private String type;

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

	public void setAsync(boolean in)
	{
		this.async = in;
		if (!this.async)
		{
			_removeAttribute("async");
		}
		else
		{
			_setAttribute("async", "");
		}
	}

	public boolean getAsync()
	{
		return async;
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

	public void setDefer(boolean in)
	{
		this.defer = in;
		if (!this.defer)
		{
			_removeAttribute("defer");
		}
		else
		{
			_setAttribute("defer", "");
		}
	}

	public boolean getDefer()
	{
		return defer;
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

	public void setNoModule(boolean in)
	{
		this.nomodule = in;
		if (!this.nomodule)
		{
			_removeAttribute("nomodule");
		}
		else
		{
			_setAttribute("nomodule", "");
		}
	}

	public boolean getNoModule()
	{
		return nomodule;
	}

	public void setNonce(String in)
	{
		this.nonce = in;
		if (this.nonce == null)
		{
			_removeAttribute("nonce");
		}
		else
		{
			_setAttribute("nonce", this.nonce);
		}
	}

	public String getNonce()
	{
		return nonce;
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

	public void setSrc(String in)
	{
		this.src = in;
		if (this.src == null)
		{
			_removeAttribute("src");
		}
		else
		{
			_setAttribute("src", this.src);
		}
	}

	public String getSrc()
	{
		return src;
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
