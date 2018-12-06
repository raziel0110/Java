package com.sciit;

import org.jetbrains.annotations.Contract;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Main {
    private static Logger LOGGER = Logger.getLogger(Person.class.getName());

    public static void main(String[] args) {
        LOGGER.info("testing");
        addContact("1850227100161","Alban","Gabriel","m",1999);

    }

public static void addContact(String id,String firstName, String lastName,String gender,Integer yearOfBirth) {
    ArrayList<Person> list = new ArrayList<>();
    try{
        validatePerson(id,firstName,lastName,gender,yearOfBirth);
        Person pers = new Person(id,firstName,lastName,gender,yearOfBirth);
        list.add(pers);

    } catch(ValidationException e){
        LOGGER.info(e.getMessage());
    }


}


public static void validatePerson(String id, String firstName, String lastName,String gender, Integer yearOfBirth) throws ValidationException{
        if(id.length() == 0){
            throw new ValidationException("A person must have an id!");
        }
        else if(id.length() > 13 || id.length() < 13){
            throw new ValidationException("Id must be 13 characters long");

        } else if(gender == "m" && id.charAt(0) != 1){
            throw new ValidationException("Your id must begin with number 1!");
        } else if(gender == "f" && id.charAt(0) != 2){
            throw new ValidationException("Your id must begin with number 2!");
        }
//
//
        if(firstName.length() <= 0 || lastName.length() <= 0) {
            throw new ValidationException("First name and last name must be input!");

        }



        if(yearOfBirth < 1900) {
            throw new ValidationException("Birth year is not correct! the year you typed is less than 1900");
        } else if(yearOfBirth > 2018){
            throw new ValidationException("Birth year is not correct! The year you type is greater than 2018!");
    }


}

}
