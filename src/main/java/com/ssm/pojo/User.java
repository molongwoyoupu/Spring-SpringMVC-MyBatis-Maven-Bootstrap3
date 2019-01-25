package com.ssm.pojo;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * 用户实体类（表t_user）
 *
 */
public class User implements Serializable{

	private static final long serialVersionUID = 7973109369795671297L;
	
	private Long id;
	private String accountNum;
	private String nickName;
	private String realName;
	private String password;
	private String gender;
	private String age;
	private String email;
	private String mobilePhone;
	private String headPath;
	private Date createTime;
	private Date updateTime;
	private Boolean availability=true;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getHeadPath() {
		return headPath;
	}
	public void setHeadPath(String headPath) {
		this.headPath = headPath;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Boolean getAvailability() {
		return availability;
	}
	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", accountNum=" + accountNum + ", nickName=" + nickName + ", realName=" + realName
				+ ", password=" + password + ", gender=" + gender + ", age=" + age + ", email=" + email
				+ ", mobilePhone=" + mobilePhone + ", headPath=" + headPath + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", availability=" + availability + "]";
	}
	
}
