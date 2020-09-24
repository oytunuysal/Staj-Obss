package tr.com.obss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tr.com.obss.core.cache.IContentCache;
import tr.com.obss.model.content.ElearningContent;
import tr.com.obss.service.IElearningService;

//inject instance of ContentCache
@Component
public class ElearningServiceImpl implements IElearningService {

	@Autowired
	private IContentCache contentCache;

	public boolean createNewElearningContent(ElearningContent videoContent) {

		return contentCache.addContent(videoContent);
	}

	public ElearningContent deleElearningContent(ElearningContent videoContent) {
		return (ElearningContent) contentCache.removeContent(videoContent);
	}

	public String getElearningUrl(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public IContentCache getContentCache() {
		return contentCache;
	}

}
