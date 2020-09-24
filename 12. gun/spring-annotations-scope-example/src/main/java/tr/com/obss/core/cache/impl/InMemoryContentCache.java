package tr.com.obss.core.cache.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import tr.com.obss.core.cache.IContentCache;
import tr.com.obss.model.content.Content;

@Component
//@Scope("prototype")
//@Scope("singleton")
public class InMemoryContentCache implements IContentCache {

	// Map
	Map<Long, Content> cache = new HashMap<Long, Content>();

	public Content getContent(Long id) {

		return cache.get(id);
	}

	public boolean addContent(Content content) {
		cache.put(content.getId(), content);
		return true;
	}

	public Content removeContent(Content content) {
		cache.remove(content.getId(), content);
		return content;
	}

	public void printCacheSize() {
		
		
		System.out.println("InMemoryContentCache printCacheSize()" + cache.toString());

	}

}
