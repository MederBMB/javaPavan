//package naveenInterviewProgramms;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class DuplicateWordsInString {
//
//    // Hey java is java best language is java
//    // java : 3
//    // is : 2
//
//    public static void main(String[] args) {
//
//    }
//
//    public static void findDuplicateWords(String inputString){
//        //split:
//        String words[] = inputString.split(" ");
//
//        //create HashMap:
//        Map<String, Integer> wordCount = new HashMap<String ,Integer>();
//
//        //to check each word in given array:
//        for (String word:words){
//            //if word is present:
//            if (wordCount.containsKey(word)){
//                wordCount.put(word, wordCount.get(word)+1)
//            }else{
//                wordCount.put(word, 1);
//            }
//        }
//    }
//}
//
