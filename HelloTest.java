package main;

public class HelloTest {

	private String name;

	public HelloTest(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "HelloTest [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
