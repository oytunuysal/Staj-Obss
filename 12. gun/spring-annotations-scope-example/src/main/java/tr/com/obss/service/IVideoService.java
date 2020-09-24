package tr.com.obss.service;

import tr.com.obss.core.cache.IContentCache;
import tr.com.obss.model.content.VideoContent;

public interface IVideoService {
	public boolean createNewVideoContent(VideoContent videoContent);

	public VideoContent deleteVideoContent(VideoContent videoContent);

	public String getVideoUrl(long id);

	public void updateCurrentTime(Long id, Long duration);

	public IContentCache getContentCache();
}
