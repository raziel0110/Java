package com.sciit;

import java.util.logging.Logger;

public class Person {
    private static Logger LOGGER = Logger.getLogger(Person.class.getName());
    private String id;
    private String firstName;
    private String lastName;
    private String gender;
    private Integer yearBirth;

    public Person(String id, String firstName, String lastName,String gender, Integer yearBirth) throws ValidationException{
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        if(gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("f")){
            this.gender = gender;
        } else {
            throw new ValidationException("Gender not correct!");
        }
        this.yearBirth = yearBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Integer getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(Integer yearBirth) {
        this.yearBirth = yearBirth;
    }
}
