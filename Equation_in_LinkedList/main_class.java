/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author BILAWAL ALI
 */
public class main_class {
     public static void main(String arg[])
    {
        Linkedlist p1=new Linkedlist();
         Linkedlist p2=new Linkedlist();
         Linkedlist result=new Linkedlist();
        p1.insert(3,4);
        p1.insert(4, 1);
        p1.insert(10, 0);
        p1.display();
        p2.insert(2, 4);
        p2.insert(-2, 1);
        p2.insert(4, 0);
        p2.display();
        System.out.print("\nAddtion: ");
        result.addition(p1, p2);
         
    }
    
    
}
