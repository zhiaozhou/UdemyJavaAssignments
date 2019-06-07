package com.zhiao;

public class Main {

    public static void main(String[] args) {
        bankAccount zhiao = new bankAccount(12345,888888,"Zhiao Zhou",
                "zhiaozhou@nyu.edu",18917630007L);
//        zhiao.setAccountNumber(12345678);
//        zhiao.setBalance(8888888);
//        zhiao.setCustomerName("Zhiao Zhou");
//        zhiao.setEmail("zhiaozhou@nyu.edu");
//        zhiao.setPhoneNumber(18917630007L);

        System.out.println(zhiao.getCustomerName() + "'s Account Number is " + zhiao.getAccountNumber());
        System.out.println(zhiao.getCustomerName() + "'s Balance is " + zhiao.getBalance());
        System.out.println(zhiao.getCustomerName() + "'s Email is " + zhiao.getEmail());
        System.out.println(zhiao.getCustomerName() + "'s Phone Number is " + zhiao.getPhoneNumber());

        zhiao.deposit(88888);
        zhiao.withdraw(13431);

    }

}
