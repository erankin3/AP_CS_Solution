import java.util.ArrayList;

/**
 * 2016 Long Response 1a
 * @author PMiskew
 *
 */
//THEORY:  There is no extends explicitly stated so the implied super class is the Object class. 
public class RandomStringChooser {

	//CRITICAL:  MAKE FIELDS PRIVATE
	private ArrayList<String> list;
	
	//THEORY:  Remember that when a single constructor is written the default constructor no longer exists.
	public RandomStringChooser(String[] words) {
		//THEORY:  	There is no super command written in the constructor.  This means that a default super() is
		//			used here.  This isn't important to this question as the super class is Object
		//list = new ArrayList<String>();

		//TECHNIQUE:  You could use a for each loop here.  I tend not to.
		//THEORY:   for (<type> <name in loop>: <Structure to loops through>) {
		//
		//			}
		
		for (String a: words){
			list.add(a);
		}
		//*/
		/*
		for (int i = 0; i < words.length; i++){
			list.add(words[i]);
		}
		//*/
		
		
	}
	
	/**
	 * This function gets a random string from the list and returns it. 
	 * The string is removed from the list. 
	 * @return
	 */
	public String getNext() {
		
		
		if (list.size() == 0) {
			return "NONE";
		}
		
		//TECHNIQUE:  0 <= Math.random() < 1.  This means 0<= Math.random()*list.size() < list.size()
		//COMMMON MISTAKE:  (int)(Math.random())*list.size();
		//					When you cast Math.random first you always multiple list.size() by 0. 
		int i = (int)(Math.random()*list.size());
		
		//WORKS
		String s = list.get(i);
		list.remove(i);
		return s;
		
		//BETTER:  Remember that remove returns a copy of the removed object. 
		//return list.remove(i)
		
	}
	
	/**
	 * TEST CODE.  NOT PART OF QUESTIONS
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Test Code: Won't necessarily match sample output as question invovles randomness. 
		String[] wordArray = {"wheels","on","the","bus"};
		RandomStringChooser sChooser = new RandomStringChooser(wordArray);
		
		for (int k = 0; k < 6; k++) {
			System.out.println(sChooser.getNext() + " ");
		}
		
	}
	
}
