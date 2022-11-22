//Java program that uses mutable class
package com.mycompany.mutableclass;
public class Mutableclass {
        private String coursename;
          Mutableclass(String coursename) 
{
this.coursename = coursename;
}
public String getName() {
return coursename;
}
public void setName(String coursename) {
this.coursename = coursename;
}
public static void main(String[] args) {
Mutableclass obj = new Mutableclass("Java Programming");
System.out.println(obj.getName());
 
// update the name, this object is mutable
obj.setName("Java programming Diploma");
System.out.println(obj.getName());
 
    }
}
