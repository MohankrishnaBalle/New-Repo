package org.example;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.Month;

public class Extract {
    public static void main(String[] args) {
        Git obj = new Git(11, "Mohan",
                "mohan@gmail.com",
                LocalDate.of(2000, Month.MAY, 16));

        System.out.println(obj);
        exceptionMethod();

    }

    public static void exceptionMethod(){
        String email;
        try{
            email = String.valueOf(Integer.parseInt("Mohan"));
        }catch (NumberFormatException nfe){
            System.out.println("We got an exception");
        }
        finally {
            System.out.println(" This will override thee try and catch blocks");
        }
    }
}
