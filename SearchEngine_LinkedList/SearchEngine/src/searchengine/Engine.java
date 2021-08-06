package searchengine;

/**
 *
 * @author Bilawal Aka Bilal
 */
public class Engine {
    word head;
    public void insert(String name, String url) {
            word n;
        if (head == null) {
             n = new  word(name);
            head = n;
            n = new  word(url);
            head.link = n;
        } else {
             word temp = head; 

            while (temp.next != null && !(temp.w.equals(name))) {
                temp = temp.next;
            }

            if (temp.w.equals(name)) {
                n = new  word(url);
                while (temp.link != null) {
                    temp = temp.link;
                }
                temp.link = n;
            } else {
                n = new  word(name);
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = n;
                n = new  word(url);
                temp.next.link = n;
            }
        }
    }

    public void search(String find) {
         word temp = head;

        while (temp.next != null) {
            if (temp.w.equals(find)) {
                break;
            }
            temp = temp.next;
        }

        if (temp.w.equals(find)) {
              System.out.print(" Urls in "+find+": ");
            while (temp.link != null) {
              
                System.out.print(temp.link.w+" , ");
                temp = temp.link;
            }
        } else {
            System.out.println("No data found");
        }
    }
   public void delete(String del)
    {
        word temp=head;
         word P=null;
         if(head==null)
       {
           return ;
       }
       else if(temp.w.equals(del))
        {
            head=temp.next;
        }
        
        else{
        while(temp!=null)
        {
            if(temp.w.endsWith(del))
            {
                P.next=temp.next;
            }
            P=temp;
            temp=temp.next;
        }
        
     }
    }
    public String toString() {
        String str="";
         word temp1 = head;
         word temp2 = head;
        while (temp1 != null) {
           str=str+ " " + temp1.w + "\n";
            while (temp2.link != null) {
                str=str+temp2.link.w+",";

                temp2 = temp2.link;
            }str=str+"\n";
            temp1 = temp1.next;
            temp2 = temp1;
        }
        return str;
    }

}
