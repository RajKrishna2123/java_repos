package com;
  
public class Base {
  
int a = 5;
  
protected int a = 6;
  
                }
  
package com1;
  
import com.*;
  
               public class Child extends Base  {
  
                    public static void main(String[] args) {
  
 Base f = new Child(); 
  
 System.out.print(" " + f.a);
  
System.out.print(" " + f.b);
  
}
              }