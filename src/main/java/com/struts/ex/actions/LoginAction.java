package com.struts.ex.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements ServletRequestAware, ServletResponseAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;

	HttpServletRequest request;
	HttpServletResponse response;

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() {

		System.out.println("Hello from LoginAction...");
		
		if(request.getMethod().equalsIgnoreCase("POST")) {
			System.out.println("POST = " + request.getMethod());
			return "success";
		}
		else {
//			response.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
			System.out.println("GET = " + request.getMethod());
			response.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
			return "failure";
		}
		
	}
}
