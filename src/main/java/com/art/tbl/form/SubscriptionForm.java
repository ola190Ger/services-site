package com.art.tbl.form;
/*
@author ArtemFrunze
@class SubscriptionForm
@date 14.09.2021
@time 21:00 
*/

import java.time.LocalDate;

public class SubscriptionForm {
    private String contractorId;
    private String startDate;
    private String endDate;
    private String description;

    public SubscriptionForm() {
    }

    public SubscriptionForm(String contractorId, String startDate, String endDate, String description) {
        this.contractorId = contractorId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }

    public String getContractorId() {
        return contractorId;
    }

    public void setContractorId(String contractorId) {
        this.contractorId = contractorId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
