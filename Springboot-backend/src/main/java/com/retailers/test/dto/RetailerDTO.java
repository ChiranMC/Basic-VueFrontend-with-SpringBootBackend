package com.retailers.test.dto;


public class RetailerDTO {
    private int id;
    private String Nic_no;
    private String first_name;
    private String second_name;
    private String address;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setNic_no(String nic_no) {
        Nic_no = nic_no;
    }
    public String getNic_no() {
        return Nic_no;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getFirst_name() {
        return first_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }
    public String getSecond_name() {
        return second_name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
}
