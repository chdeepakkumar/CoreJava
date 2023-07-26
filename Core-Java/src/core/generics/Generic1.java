package core.generics;

public class Generic1<T> {
	private T id;
	private Integer x;
	
	public T method1() {
		System.out.println(this.id);
		return id;
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

}
