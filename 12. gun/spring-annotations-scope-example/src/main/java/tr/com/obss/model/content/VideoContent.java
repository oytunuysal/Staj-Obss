package tr.com.obss.model.content;

public class VideoContent extends Content {
	
	public VideoContent(long id) {
		this.id = id;
	}

	@Override
	public long calculateSuccess() {
		System.out.println("VideoContent calculateSuccess()");
		return this.successRatio;
	}

	@Override
	public Content clone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getId() {
		return this.id;
	}

}
