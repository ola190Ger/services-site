package com.art.tbl.form;
/*
@author ArtemFrunze
@class ContractorForm
@date 15.09.2021
@time 19:40 
*/

public class ContractorForm {
    private String name;
    private String phone;
    private String birthday;
    private String description;

    public ContractorForm() {
    }

    public ContractorForm(String name, String phone, String birthday, String description) {
        this.name = name;
        this.phone = phone;
        this.birthday = birthday;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
