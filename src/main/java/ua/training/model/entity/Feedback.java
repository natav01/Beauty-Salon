package ua.training.model.entity;

public class Feedback extends Entity {
private int idRecords;
private String feedback;
public int getIdRecords() {
	return idRecords;
}
public void setIdRecords(int idRecords) {
	this.idRecords = idRecords;
}
public String getFeedback() {
	return feedback;
}
public void setFeedback(String feedback) {
	this.feedback = feedback;
}
}
