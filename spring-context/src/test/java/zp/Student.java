package zp;

import org.springframework.beans.factory.BeanNameAware;

public class Student implements BeanNameAware {
	private String name = "zptest";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("beanName : " + name);
	}
}
