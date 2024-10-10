package com.example.answer.ex_ward_count;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ExWordCount {

	public static void main(String[] args) {
		String speech = "I am honored to be with you today at your commencement from "
				+ "one of the finest universities in the world. I never graduated from college. "
				+ "Truth be told, this is the closest I’ve ever gotten to a college graduation. "
				+ "Today I want to tell you three stories from my life. That’s it. No big deal. "
				+ "Just three stories. The first story is about connecting the dots. "
				+ "I dropped out of Reed College after the first 6 months, but then stayed around "
				+ "as a drop-in for another 18 months or so before I really quit. So why did I drop out?";
		
		
		speech = speech.replaceAll("\\.", "");
		speech = speech.replaceAll("\\,", "");
		speech = speech.replaceAll("\\?", "");
		speech = speech.replaceAll("\\'", "");
//		System.out.println(speech);
		
		String[] words = speech.split(" ");
		
		Map<String,Integer> hashMap = new HashMap<>();
		
		for(String word : words) {
			Integer count = hashMap.get(word);
			if (count == null) {
				// 始めて出てきた単語
				count = 1;
			} else {
				count++;
			}
			hashMap.put(word, count);
		}
        // List 生成 (ソート用)
        List<Entry<String,Integer>> entries =
              new ArrayList<Entry<String,Integer>>(hashMap.entrySet());
        Collections.sort(entries, new Comparator<Entry<String,Integer>>() {
 
            @Override
            public int compare(
                  Entry<String,Integer> entry1, Entry<String,Integer> entry2) {
                return ((Integer)entry2.getValue()).compareTo((Integer)entry1.getValue());
            }
        });
         
        for (Entry<String,Integer> s : entries) {
            System.out.println(s.getKey() + ":" + s.getValue());
        }
        
	}

}
