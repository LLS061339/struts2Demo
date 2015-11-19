package action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
	public final static String MESSAGE = "Struts2 is up and running ...helloworld!";
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String execute() throws Exception {
		setMessage(MESSAGE);
		return "success";
	}
}
