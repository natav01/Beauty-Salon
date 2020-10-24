package ua.training.model.entity;
import java.math.BigDecimal;


public class Service extends Entity {
	
private String serviceName;
private int typeOfServiceId;
private BigDecimal price;
private int duration;
public String getServiceName() {
	return serviceName;
}
public void setServiceName(String serviceName) {
	this.serviceName = serviceName;
}
public int getTypeOfServiceId() {
	return typeOfServiceId;
}
public void setTypeOfServiceId(int typeOfServiceId) {
	this.typeOfServiceId = typeOfServiceId;
}
public BigDecimal getPrice() {
	return price;
}
public void setPrice(BigDecimal price) {
	this.price = price;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
private String nameOfType;
public String getNameOfType() {
	return nameOfType;
}
public void setNameOfType(String nameOfType) {
	this.nameOfType = nameOfType;
}
private String description;
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}


}
