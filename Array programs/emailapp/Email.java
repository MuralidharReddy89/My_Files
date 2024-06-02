package emailapp;

import java.util.Scanner;

public class Email {
    private String FirstName;
    private String LastName;
    private String password;
    private String deparment;
    private String email;
    private int mailboxCapacity=500;
    private int defaultPasswordLengh=10;
    private String alternateEmail;
    private String companySuffix=".com";
    // constructor to receive the first name and last name..
    public Email(String FirstName, String LastName){
        this.FirstName=FirstName;
        this.LastName=LastName;
        System.out.println("EMAIL CREATED:"+ this.FirstName+" "+this.LastName);
        // call method of setDepartment...
        this.deparment=setDepartment();
        System.out.println("department:"+this.deparment);
        // call a method of randompassword..
        this.password=randomPassword(defaultPasswordLengh);
        System.out.println("Your Password is: "+this.password);
        email=FirstName.toLowerCase()+""+LastName.toLowerCase()+"@gmail"+deparment+ companySuffix;
        System.out.println("Your email is: "+email);

    }
    // ask for the department
    private String setDepartment(){
        System.out.print("DEPARTMENT CODE\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
        Scanner sc=new Scanner(System.in);
        int depChoice=sc.nextInt();
        if(depChoice==1){ return "sales";}
        else if(depChoice==2){return "Devlopment";}
        else if(depChoice==3){return "Accounting";}
        else {return "";}

    }
    //Generate a random password..
    private String randomPassword(int length){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password=new char[length];
        for(int i=0;i<length;i++){
            int rand=(int) (Math.random() * passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }
    // set mailbox capacity;
    public void setnailboxCapacity(int capacity){
        this.mailboxCapacity=capacity;
    } 
    // set alternate mail..
    public void setAlternateEMail(String altEmail){
        this.alternateEmail=altEmail;
    }
    // change password
    public void changePassword(String password){
        this.password=password;
    } 
    public int  getMailboxCapacity(){return mailboxCapacity;}
    public String getAternateEmail(){return alternateEmail;}
    public String getPassword(){return password;}
    public String showInf(){
        return "DISPLAY NAME:" +FirstName+""+LastName+
                "\nCOMPANY EMAIL:"+email+
                "\nMAILBOX CAPACITY:"+mailboxCapacity+"mb";
    }
}