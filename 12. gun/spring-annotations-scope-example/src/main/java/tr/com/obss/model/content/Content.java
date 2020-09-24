package tr.com.obss.model.content;

import java.util.Date;

public abstract class Content implements Cloneable {
	protected long id = (long) Math.random() * 1000;
	protected String name;
	protected Date publishDate;
	protected Date endDate;
	protected long successRatio;

	public abstract long calculateSuccess();

	@Override
	public abstract Content clone();

	public abstract Long getId();

}
