package com.stackroute.domain;

public class Actor {
    private String name;
    private String gender;
    private int age;

    public String getActName(){
        return name;
    }
    public void setName(String actName) {
        this.name = actName;
    }

    public  String getGender(){
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
    @Override
    public String toString(){
        return "Name is " + this.name + "\n" + "Gender is " + this.gender + "\n" +"Age is " + this.age;
    }
}
