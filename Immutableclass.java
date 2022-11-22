// java program that uses immutable clases
package com.mycompany.immutableclass;
public class Immutableclass {
private final String coursename;
Immutableclass(final String coursename) {
this.coursename = coursename;
}
public final String getName() {
return coursename;
}
public static void main(String[] args) {
Immutableclass obj = new Immutableclass("Java Programming");
System.out.println(obj.getName());
}  
}
