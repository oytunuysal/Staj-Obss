package tr.com.obss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tr.com.obss.core.cache.IContentCache;
import tr.com.obss.model.content.VideoContent;
import tr.com.obss.service.IVideoService;

@Component
public class VideoServiceImpl implements IVideoService {

	@Autowired
	private IContentCache contentCache;

	// inject here
	public boolean createNewVideoContent(VideoContent videoContent) {

		return contentCache.addContent(videoContent);
	}

	public VideoContent deleteVideoContent(VideoContent videoContent) {

		return (VideoContent) contentCache.removeContent(videoContent);
	}

	public String getVideoUrl(long id) {

		return null;
	}

	public void updateCurrentTime(Long id, Long duration) {
		System.out.println("updateCurrentTime(Long id, Long duration)");

	}

	public IContentCache getContentCache() {

		return contentCache;
	}

}
