package tr.tutorial.JSF_Tutorial;

import javax.faces.bean.ManagedProperty;

public class MessageBean {
	@ManagedProperty(value="#{HelloBean}")
	private HelloBean bean;

	public HelloBean getBean() {
		return bean;
	}

	public void setBean(HelloBean bean) {
		this.bean = bean;
	}
}
