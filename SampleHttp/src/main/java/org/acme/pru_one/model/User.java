package org.acme.pru_one.model;

public class User {
    private String name;   
    private boolean isStudent;
    private Integer age;
    
    public User(String name, boolean isStudent, Integer age) {
        this.name = name;
        this.isStudent = isStudent;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isStudent() {
        return isStudent;
    }
    public void setStudent(boolean isStudent) {
        this.isStudent = isStudent;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", isStudent=" + isStudent + ", age=" + age + "]";
    }
}
