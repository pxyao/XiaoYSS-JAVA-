package per.shey.xiaoyss.pojo;

import java.io.Serializable;
import java.util.Date;

public class Users implements Serializable{
	public long Id;
	public String UserName;
	public String PassWord;
	public String Phone;
	public String Email;
	public int LoginCount;
	public Date CreationTime;
	public Date LastLoginTime;
	public int UserStatus;
	public int IsActive;
	public long ServerId;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getLoginCount() {
		return LoginCount;
	}
	public void setLoginCount(int loginCount) {
		LoginCount = loginCount;
	}
	public Date getCreationTime() {
		return CreationTime;
	}
	public void setCreationTime(Date creationTime) {
		CreationTime = creationTime;
	}
	public Date getLastLoginTime() {
		return LastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		LastLoginTime = lastLoginTime;
	}
	public int getUserStatus() {
		return UserStatus;
	}
	public void setUserStatus(int userStatus) {
		UserStatus = userStatus;
	}
	public int getIsActive() {
		return IsActive;
	}
	public void setIsActive(int isActive) {
		IsActive = isActive;
	}
	public long getServerId() {
		return ServerId;
	}
	public void setServerId(long serverId) {
		ServerId = serverId;
	}
	public Users() {
		super();
	}
	
}
