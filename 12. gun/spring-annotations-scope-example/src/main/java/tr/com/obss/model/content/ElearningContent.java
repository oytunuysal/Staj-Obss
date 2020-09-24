package tr.com.obss.model.content;

public class ElearningContent extends Content {

	public ElearningContent(long id) {
		this.id = id;
	}

	@Override
	public long calculateSuccess() {
		System.out.println("ElearningContent calculateSuccess()");
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
