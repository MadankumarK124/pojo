package practice_pro;

public class pojo_class_ {
	//declaration
	String ename;
	String eid;
	String[] email;
	int[] phoneno;
	String address;
	//initilations constructor
	public pojo_class_(String ename, String eid, String[] email, int[] phoneno, String address) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.email = email;
		this.phoneno = phoneno;
		this.address = address;
	}
	//add setters and getters
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String[] getEmail() {
		return email;
	}
	public void setEmail(String[] email) {
		this.email = email;
	}
	public int[] getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int[] phoneno) {
		this.phoneno = phoneno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
