package ua.training.controller.model.entity;

import java.util.Date;

public class Record extends Entity{
private int userId;
private int serviceId;
private Date date;
private boolean status;
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
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
}
