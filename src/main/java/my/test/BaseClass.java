package my.test;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseClass {

	@Autowired
	private FieldClass baseFieldClass;

	public FieldClass getBaseFieldClass() {
		return baseFieldClass;
	}

	public void setBaseFieldClass(FieldClass fieldClass) {
		this.baseFieldClass = fieldClass;
	}
}
