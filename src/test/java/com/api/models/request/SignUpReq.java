package com.api.models.request;

public class SignUpReq {
	
	private String username;
	private String password;
	private String email;
	private String firstname;
	private String lastname;
	private String mobileNum;
	
	private SignUpReq(String username, String password, String email, String firstname, String lastname,
			String mobileNum) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobileNum = mobileNum;
		
	}

	@Override
	public String toString() {
		return "SignUpReq [username=" + username + ", password=" + password + ", email=" + email + ", firstname="
				+ firstname + ", lastname=" + lastname + ", mobileNum=" + mobileNum + "]";
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	
	public static class Builder{
		private String username;
		private String password;
		private String email;
		private String firstname;
		private String lastname;
		private String mobileNum;
		
		public Builder username(String username) {
			this.username = username;
			return this;
		}
		
		public Builder password(String password) {
			this.password = password;
			return this;
		}
		
		public Builder email(String email) {
			this.email = email;
			return this;
		}
		
		public Builder firstname(String firstname) {
			this.firstname = firstname;
			return this;
		}
		
		public Builder lastname(String lastname) {
			this.lastname = lastname;
			return this;
		}
		
		public Builder mobileNum(String mobileNum) {
			this.mobileNum = mobileNum;
			return this;
		}
		
		public SignUpReq build() {
			SignUpReq signupReq = new SignUpReq(username, password, email, firstname, lastname, mobileNum);
			return signupReq;
		}
		
	}
}
