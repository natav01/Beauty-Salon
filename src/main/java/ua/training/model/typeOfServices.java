package ua.training.model;

import ua.training.model.entity.Entity;

public class typeOfServices extends Entity {
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
