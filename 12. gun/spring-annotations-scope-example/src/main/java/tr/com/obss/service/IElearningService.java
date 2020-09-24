package tr.com.obss.service;

import tr.com.obss.core.cache.IContentCache;
import tr.com.obss.model.content.ElearningContent;

public interface IElearningService {
	public boolean createNewElearningContent(ElearningContent videContent);

	public ElearningContent deleElearningContent(ElearningContent videContent);

	public String getElearningUrl(long id);

	public IContentCache getContentCache();
}
