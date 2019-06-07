package com.zhiao;

public class VipCustomer {
    private String name;
    private long creditLimit;
    private String email;

    public VipCustomer(String name, long creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer() {
        this("Unknown",12000L,"Unknown");
    }



    public String getName() {
        return name;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
