package ch07.sec05;

import java.util.Scanner;

public class Member {

   private String ssn;
   private String address;
   private int phoneNo;
   String defaultName;
   private String privateName;
   protected String protectedName;
   public  String name;
   public String publicName;



   Scanner sc = new Scanner(System.in);


   public Member() {
   }

   public Member(String name) {
      this.name = name;
   }

   public Member(String name, String ssn, String address, int phoneNo) {
      this.name = name;
      this.ssn = ssn;
      this.address = address;
      this.phoneNo = phoneNo;
   }

   void printInfo() {
      System.out.println("Member.printInfo");
   }

   public String getSsn() {
      return ssn;
   }

   public void setSsn(String ssn) {
      this.ssn = ssn;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public int getPhoneNo() {
      return phoneNo;
   }

   public void setPhoneNo(int phoneNo) {
      this.phoneNo = phoneNo;
   }
}