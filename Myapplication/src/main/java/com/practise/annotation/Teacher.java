package com.practise.annotation;

public class Teacher {

	private int tid;
	private String tname;
	private String qualification;
	private String email;
	
	public Teacher() {
		super();
	}

	public Teacher(int tid, String tname, String qualification, String email) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.qualification = qualification;
		this.email = email;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
