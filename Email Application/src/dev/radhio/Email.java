package dev.radhio;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String departmentName;
    private int mailBoxCapacity = 500;
    private String password;
    private String emailAddress;
    private String alternativeEmailAddress;

    // constructor for using the firstName and lastName
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.printf("Email Created : " + this.firstName +" "+ this.lastName);

        // Call a method asking for the department - return the department
        this.departmentName = setDepartment();
        System.out.printf("Your Department is : " + this.departmentName);

        // Call a method that returns a random password
        this.password = setRandomPassword(8);
        System.out.printf("\nYour Password is : " + this.password);

        // Combine elements to generate email
        emailAddress = firstName.toLowerCase() + "."+lastName.toLowerCase()+"@"+ this.departmentName + ".company.com";
        System.out.println("\nYour email is = " + emailAddress);

    }

    // Ask for the department
    private String setDepartment(){
        System.out.println("Choose Your Department : \n 1 for Sales \n 2 for Development \n 3 for Accounting \n 0 for None \n Enter Your Department Code : ");
        Scanner userInput = new Scanner(System.in);
        int input = userInput.nextInt();
        String department = input == 1 ? "Sales": (input == 2 ? "Development" : (input == 3? "Accounting" : (input==0?"None":"Please Choose Valid Department")));
        return department;
    }

    // Generate a random password
    private String setRandomPassword(int length){
        String passwordSet = "ABCDEF012345789@?!";
        char[] password = new char[length];
        for (int i = 0; i<length; i++){
            int random = (int) (Math.random() * passwordSet.length());
            password[i]= passwordSet.charAt(random);
        }
        return String.valueOf(password);
    }

    // Set the mailBoxCapacity
    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }
    public void setMailBoxCapacity(int mailBoxCapacity) {
        this.mailBoxCapacity = mailBoxCapacity;
    }

    // Change the Password
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    // Set the alternateEmailAddress
    public String getAlternativeEmailAddress() {
        return alternativeEmailAddress;
    }
    public void setAlternativeEmailAddress(String alternativeEmailAddress) {
        this.alternativeEmailAddress = alternativeEmailAddress;
    }

    // Show Info Method
    public String showInfo(){
        System.out.println("\n Your Full Information");
        return "Department Name : " + this.departmentName;
    }
}
