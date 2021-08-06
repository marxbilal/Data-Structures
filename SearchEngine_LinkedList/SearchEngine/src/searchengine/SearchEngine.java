
package searchengine;

/**
 *
 * @author Bilawal Aka Bilal
 */
public class SearchEngine {

    public static void main(String arg[]){
    Engine o = new Engine();

        o.insert("Asia", "Wiki.com");
        o.insert("Asia", "Iba.edu.pk");
        o.insert("Asia", "ibm.com");
        o.insert("Karachi", "lums.com");
        o.insert("Karachi", "Iba.com");
        o.insert("Karachi", "Yahoo.com");
        o.insert("Admission", "nust.edu.pk");
        o.insert("Admission", "Wikipedia.com");
        o.insert("Admission", "Yahoo.com");
        o.delete("Karachi");
         System.out.println(o);
         o.search("Asia");
        
//        updtaeEngine s = new updtaeEngine();
//		s.insert("Facebook", "www.facebook.com");
//		s.insert("Facebook", "www.iba.edu.pk");
//		s.insert("Facebook", "www.lims.com");
//		s.insert("Asia", "www.google.com");
//                s.insert("Asia", "www.ibm.com");
//                s.insert("Admission", "nust.edu.pk");
//                s.insert("Admission", "Wikipedia.com");
//                s.insert("Admission", "Yahoo.com");
//                 
//                 s.delete("Asia");
//                 System.out.println(s);
//                 s.search("facebbok");
//                 s.search("Asia");
                 
                
    }
}
