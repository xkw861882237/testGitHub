package com.test.pojo;

public class Students {

    private int id;
    private String sname;
    private int age;

    public Students() {
    }

    public Students(int id, String sname, int age) {
        this.id = id;
        this.sname = sname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                '}';
    }
}
