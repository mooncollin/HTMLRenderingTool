package attributes;

import java.util.function.Consumer;

public class Attribute<T>
{	
	Consumer<T> setterMethod;
	T defaultSet;
	T defaultRemove;
	Class<T> clazz;
	
	public Attribute(Class<T> clazz, Consumer<T> setter, T set, T remove)
	{
		setClazz(clazz);
		setSetterMethod(setter);
		setDefaultSet(set);
		setDefaultRemove(remove);
	}
	
	public Class<T> getClazz()
	{
		return clazz;
	}

	public Consumer<T> getSetterMethod()
	{
		return setterMethod;
	}

	public T getDefaultSet()
	{
		return defaultSet;
	}

	public T getDefaultRemove()
	{
		return defaultRemove;
	}

	public void setSetterMethod(Consumer<T> setterMethod)
	{
		this.setterMethod = setterMethod;
	}

	public void setDefaultSet(T defaultSet)
	{
		this.defaultSet = defaultSet;
	}

	public void setDefaultRemove(T defaultRemove)
	{
		this.defaultRemove = defaultRemove;
	}
	
	public void setClazz(Class<T> clazz)
	{
		this.clazz = clazz;
	}
	
	@SuppressWarnings("unchecked")
	public T convert(String original)
	{
		T value = (T) original;
		if(this.clazz.equals(Boolean.class))
		{
			value = (T) Boolean.valueOf(original);
		}
		else if(this.clazz.equals(Integer.class))
		{
			value = (T) Integer.valueOf(original);
		}
		else if(this.clazz.equals(Double.class))
		{
			value = (T) Double.valueOf(original);
		}
		
		return value;
	}
}
