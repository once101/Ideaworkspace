package com.atguigu.java;

public class Test {
    public static void main(String[] args) {
        Account a1 = new Account();
        view v1 = new view(a1);
        view v2 = new view(a1);
    }
}

class Account{

}

class view{

    private Account account;
    public view(Account account){
        this.account = account;
    }
}
