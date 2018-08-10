package study.jsp.mysite.model;

import java.util.List;

public class BbsDocument {
	private int id;
	private String category;
	private String name;
	private String password;
	private String email;
	private String subject;
	private String content;
	private int hit;
	private String regDate;
	private String editDate;
	private String secret;
	private String ipAddress;
	private int memberId;

	// 하나의 게시물에 대한 첨부파일 목록
	private List<BbsFile> bbsFileList;

	// 하나의 게시물에 대한 이미지 파일 경로(갤러리용)
	private String imagePath;

	// LIMIT절에 사용할 조회 시작 위치
	private int limitStart;

	// LIMIT절에 사용할 한 페이지의 게시물 수
	private int listCount;

	// 신규글 판별 여부
	private String isNew;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
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

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
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

	public List<BbsFile> getBbsFileList() {
		return bbsFileList;
	}

	public void setBbsFileList(List<BbsFile> bbsFileList) {
		this.bbsFileList = bbsFileList;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public int getLimitStart() {
		return limitStart;
	}

	public void setLimitStart(int limitStart) {
		this.limitStart = limitStart;
	}

	public int getListCount() {
		return listCount;
	}

	public void setListCount(int listCount) {
		this.listCount = listCount;
	}

	public String getIsNew() {
		return isNew;
	}

	public void setIsNew(String isNew) {
		this.isNew = isNew;
	}

	@Override
	public String toString() {
		return "BbsDocument [id=" + id + ", category=" + category + ", name=" + name + ", password=" + password
				+ ", email=" + email + ", subject=" + subject + ", content=" + content + ", hit=" + hit + ", regDate="
				+ regDate + ", editDate=" + editDate + ", secret=" + secret + ", ipAddress=" + ipAddress + ", memberId="
				+ memberId + ", bbsFileList=" + bbsFileList + ", imagePath=" + imagePath + ", limitStart=" + limitStart
				+ ", listCount=" + listCount + ", isNew=" + isNew + "]";
	}

}
