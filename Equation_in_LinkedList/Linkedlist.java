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
public class Linkedlist {
    
    node head;
    public void insert(int coeff,int power)
    {
        node n=new node(coeff, power);
        node temp=head;
    
       if(head==null){
        head=n;
           
    }
    else{
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next=n;
       }
    }
    public void addition(Linkedlist p1,Linkedlist p2)
    {
        Linkedlist result=new Linkedlist();
        node temp1=p1.head;
        node temp2=p2.head;
        while(temp1!=null&&temp2!=null)
        {
            if(temp1.power==temp2.power)
            {
                result.insert(temp1.coeff+temp2.coeff,temp1.power);
                
                
            }
            else if(temp1.power>temp2.power)
            {
                result.insert(temp1.coeff,temp1.power);
                result.insert(temp2.coeff,temp2.power);
            }
            else if(temp2.power>temp1.power)
            {
                result.insert(temp2.coeff,temp2.power);
                result.insert(temp1.coeff,temp1.power);
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
          result.display();
        
        
    }
    public void display()
    {
        node temp=head;
        while(temp.next!=null)
        {
            System.out.print(temp.coeff+"X^"+temp.power+" + ");
            temp=temp.next;
        }
        if(temp.next==null)
            System.out.print(temp.coeff);
            System.out.println();
        
    }
}
