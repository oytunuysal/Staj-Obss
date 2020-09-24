package tr.com.obss;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tr.com.obss.config.ScopeAppConfig;
import tr.com.obss.core.cache.impl.InMemoryContentCache;
import tr.com.obss.model.content.ElearningContent;
import tr.com.obss.model.content.VideoContent;
import tr.com.obss.service.IElearningService;
import tr.com.obss.service.IVideoService;

public class ScopeApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ScopeAppConfig.class);
		IElearningService elearningService = appContext.getBean(IElearningService.class);
		ElearningContent elearningContent = new ElearningContent(1); // id
		elearningService.createNewElearningContent(elearningContent);

		IVideoService videoService = appContext.getBean(IVideoService.class);
		VideoContent videoContent = new VideoContent(3);
		videoService.createNewVideoContent(videoContent);

		InMemoryContentCache contentCache = appContext.getBean(InMemoryContentCache.class);
		contentCache.printCacheSize();
		elearningService.getContentCache().printCacheSize();
		videoService.getContentCache().printCacheSize();
	}

}
