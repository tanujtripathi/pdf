package com.intel.pdf.model;

public class Health {
    private String healthStatus;

    public Health(){

    }
    public Health(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }
}
