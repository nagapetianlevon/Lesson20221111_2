package ru.myitschool.lesson20221111_2;

public class User {

    private String name;
    private long phone;

    {
        name = "Test";
        phone = 123456;
    }
    public User(){

    }
    public User(String name, long phone) {
        this.name = name;
        this.phone = phone;
    }
    public String getName(){
        return name;
    }

    public long getPhone() {
        return phone;
    }


}
