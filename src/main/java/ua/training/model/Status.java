package ua.training.model;

public enum Status {
	   WAITING_FOR_CONFIRMATION(true), WAITING_FOR_PAYMENT(true), PAID(true), CANCELED(false), IN_PROCESS(true), DONE(false);

    Status(boolean isActive){
        this.isActive = isActive;
    }
    private boolean isActive;

    public boolean isActive() {
        return isActive;
    }
}
