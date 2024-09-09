package fint_interview_programs;

import java.util.*;

public class ProgramString {
	
	static void listPrint() {
		
		List<String> messageReversed = Arrays.asList("You?", "Are", "How", "Hello");
		
		ArrayList<String> al=new ArrayList<String>();
//		al.add(messageReversed.get(3));
//		al.add(messageReversed.get(2));
//		al.add(messageReversed.get(1));
//		al.add(messageReversed.get(0));
		
						
		for(int i=messageReversed.size()-1;i>=0;i--) {
			al.add(messageReversed.get(i));
		}
		
		al.forEach(x->System.out.print(x+" "));
		
	}
	
	public static void main(String[] args) {
		
		listPrint();
		
		//Using HashMap
		
//		String sentence="I'm trying to make a program on word count";
//		
//		String[] words=sentence.split(" ");
//		
//		HashMap<String,Integer> hm=new HashMap<String,Integer>();
//		
//		//int count=0;
//		for(String word:words) {			
//			if(sentence.contains(word)) {
//				int j=hm.get(word);
//				hm.put(word, ++j);
//			}else {
//				hm.put(word, 1);
//			}
//		}
//		
//		for(Map.Entry<String, Integer> map:hm) {
//			
//			System.out.println("");
//		}
				
	}

}
