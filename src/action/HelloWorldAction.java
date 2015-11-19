package action;

import com.opensymphony.xwork2.ActionSupport;

import bo.UserBo;

public class HelloWorldAction extends ActionSupport{
	public final static String MESSAGE = "Struts2 is up and running ...helloworld!";

	UserBo userBo = new UserBo();

	public String execute() throws Exception {
		userBo.setMessage(MESSAGE);
		return "SUCCESS";
	}
}
