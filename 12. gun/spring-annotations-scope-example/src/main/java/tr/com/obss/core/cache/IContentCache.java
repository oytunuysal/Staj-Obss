package tr.com.obss.core.cache;

import tr.com.obss.model.content.Content;

public interface IContentCache {
	public Content getContent(Long id);

	public boolean addContent(Content content);

	public Content removeContent(Content content);

	public void printCacheSize();
}
