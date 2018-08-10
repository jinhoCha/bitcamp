package study.jsp.mysite.model;

public class BbsComment {
	private int id;
	private String name;
	private String password;
	private String email;
	private String content;
	private String regDate;
	private String editDate;
	private String ipAddress;
	private int memberId;
	private int bbsDocumentId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getEditDate() {
		return editDate;
	}

	public void setEditDate(String editDate) {
		this.editDate = editDate;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public int getBbsDocumentId() {
		return bbsDocumentId;
	}

	public void setBbsDocumentId(int bbsDocumentId) {
		this.bbsDocumentId = bbsDocumentId;
	}

	@Override
	public String toString() {
		return "BbsComment [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", content="
				+ content + ", regDate=" + regDate + ", editDate=" + editDate + ", ipAddress=" + ipAddress
				+ ", memberId=" + memberId + ", bbsDocumentId=" + bbsDocumentId + "]";
	}

}
