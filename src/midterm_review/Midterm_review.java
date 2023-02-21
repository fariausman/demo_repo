/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midterm_review;
import java.util.*;

/**
 *
 * @author Fariausman
 */
public class Midterm_review {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        student s1=new student();
        student s2=new student();
        student s3=new student();
        student[] list=new student[3];
        // TODO code application logic here
       s1.setName("faria");
       s1.setAge(29);
       s1.setGrade(90);
       s2.setName("aira");
       s2.setAge(9);
       s2.setGrade(95);
       s3.setName("daanya");
       s3.setGrade(97);
       s3.setAge(10);
       list[0]=s1;
       list[1]=s2;
       list[2]=s3;
       for(int i=0; i<list.length; i++)
       {
          System.out.println("name is ="+list[i].getName()+ " ,age is = "+list[i].getAge()+"grade is"+list[i].getGrade());
       }
        System.out.println("we are learing fetch");
                System.out.println("we are learing pull");

        
    }
    
}
