package com.api.models.request;

public class UpdateProfileReq {
	
	private String firstname;
	private String lastname;
	private String email;
	private String mobilenum;
	
	
	public UpdateProfileReq(String firstname, String lastname, String email, String mobilenum) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.mobilenum = mobilenum;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobilenum() {
		return mobilenum;
	}


	public void setMobilenum(String mobilenum) {
		this.mobilenum = mobilenum;
	}


	@Override
	public String toString() {
		return "UpdateProfileReq [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", mobilenum=" + mobilenum + "]";
	}
	
	public static class Builder{
		
		private String firstname;
		private String lastname;
		private String email;
		private String mobilenum;
		
		public Builder firstname(String firstname) {
			this.firstname = firstname;
			return this;
		}
		
		public Builder lastname(String lastname) {
			this.lastname = lastname;
			return this;
		}
		
		public Builder email(String email) {
			this.email = email;
			return this;
		}
		
		public Builder mobilenum(String mobilenum) {
			this.mobilenum = mobilenum;
			return this;
		}
		
		public UpdateProfileReq build() {
			UpdateProfileReq updateReq = new UpdateProfileReq(firstname, lastname, email, mobilenum);
			return updateReq;
		}
	}
}
