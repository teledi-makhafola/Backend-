package com.sampleApp.crud.system.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
   private int id;
   private String name;
   private String lastname;
   private String email;
   private String department;
   private String contactNo;

   public Employee() {
   }

   public Employee(int id, String name, String lastname, String email, String department, String contactNo) {
    this.id = id;
    this.name = name;
    this.lastname = lastname;
    this.email = email;
    this.department = department;
    this.contactNo = contactNo;
   }
   @Id
   @GeneratedValue
   public int getId() {
    return id;
   }
   public void setId(int id) {
    this.id = id;
   }
   public String getName(){
    return name;
   }
   public void setName(String name){
    this.name = name;
   }
   public String getlastname(){
    return lastname;
   }
   public void setLastname(String lastname){
    this.lastname = lastname;
   }
   public String getemail(){
    return email;
   }
   public void setEmail(String email){
    this.email = email;
   }
   public String getDepartment(){
    return department;
   }
   public void setDepartment(String department){
    this.department = department;
   }
   public String getContactNo(){
    return contactNo;
   }
   public void setContactNo(String contactNo){
    this.contactNo = contactNo;
   }
}
