
package searchengine;

/**
 *
 * @author Bilawal Aka Bilal
 */
public class updtaeEngine {
    Engine[] list;
	updtaeEngine()
	{
		list = new Engine[26];
		for(int i=0; i <26; i++)
		{
			list[i] = new Engine();;
		}
	}
	
	public void insert(String word, String url){
		
		int i =((int) (word.toUpperCase().charAt(0)))%65;
		list[i].insert(word, url);
	}
	
	public void search(String word){
		int i = ((int)  (word.toUpperCase().charAt(0)))%65;
		list[i].search(word);
	}
        public void delete(String word)
        {
            int i = ((int)  (word.toUpperCase().charAt(0)))%65;
		list[i].delete(word);
        }
        
	public String toString(){
            String str="";
            Engine[] temp=list;
            for(int i=0; i<temp.length; i++)
            {
                if(temp!=null){
               str=str+temp[i]+" ";}
               
            }
            return str;
        }
}
