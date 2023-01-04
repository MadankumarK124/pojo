package pojoCLassForSerilizationDeserilization;

public class Employee_details_1_int_array {
	//declaration
	String Ename;
	String Eid;
	String Email;
	int[] PhoneNo;
	String Address;
	//constructor
	public Employee_details_1_int_array(String ename, String eid, String email, int[] phoneNo, String address) {
		super();
		Ename = ename;
		Eid = eid;
		Email = email;
		PhoneNo = phoneNo;
		Address = address;
	}
	//constructor bcoz when parameterized constructor will not accept so we add default constructor
	public Employee_details_1_int_array()
	{
		
	}
	//gettersa and setter
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getEid() {
		return Eid;
	}
	public void setEid(String eid) {
		Eid = eid;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int[] getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(int[] phoneNo) {
		PhoneNo = phoneNo;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
}
