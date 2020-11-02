package ua.training.model.entity;

import java.util.Date;

public class Record extends Entity{
private int userId;
private int serviceId;
private Date date;

public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public int getServiceId() {
	return serviceId;
}
public void setServiceId(int serviceId) {
	this.serviceId = serviceId;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}

}
