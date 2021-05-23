package service;

public class Student {
	private int studentId;
	private String studentNMame;
	private String studentPhone;
	private String studentCity;
	public Student() {
		super();
		
	}
	public Student( String studentNMame, String studentPhone, String studentCity) {
		super();
		
		this.studentNMame = studentNMame;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentNMame() {
		return studentNMame;
	}
	public void setStudentNMame(String studentNMame) {
		this.studentNMame = studentNMame;
	}
	public String getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentNMame=" + studentNMame + ", studentPhone=" + studentPhone
				+ ", studentCity=" + studentCity + "]";
	}

}
