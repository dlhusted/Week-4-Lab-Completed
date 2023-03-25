package labPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week4StringBuilderListSetMapLab {
  
  

  public static void main(String[] args) {

 // 1. Why would we use a StringBuilder instead of a String?
    
          //CONCATINATION OF MULTIPLE STRINGS DOENSN'T EVER ACTUALLY CHANGE THE VALUE OF THE ORIGINAL STRING UNLESS YOU REASSIGN IT TO THE VARIABLE
          //STRINGS ARE IMMUTABLE, ANY TIME YOU CHANGE A VARIABLE, IT DOESN'T GET RID OF THE ORIGINAL STRING IN MEMORY SO IT CAN TAKE UP SPACE (MEMORY LEAK)
          //ONLY USE STRINGS WHEN THE VALUE IS NOT GOING TO NEED TO CHANGE A LOT
    
          //STRINGBUILDERS ARE MUTABLE AND YOU CAN ADD OR REMOVE ELEMENTS FROM IT
          //WHEN YOU APPEND TO THE STRINGBUILDER YOU ARE AFFECTING THE ORIGINAL VARIABLE IN MEMORY AND NOT CLONING A BUNCH OF THEM
          //LESS MEMORY USED FOR CHANGING VARIABLES/ELEMENTS
    
          //SO YOU WOULD USE A STRINGBUILDER INSTEAD OF A STRING WHEN YOU PLAN TO MANIPULATE THE STRING AND ADD TO IT MULTIPLE TIMES
    
    //      a. Instantiate a new StringBuilder
       StringBuilder newBuilder = new StringBuilder("Strings galour ");
       System.out.println("1. a) " + newBuilder);
    
    
    //      b. Append the characters 0 through 9 to it separated by dashes
       
       for(int i = 0; i <=9; i++) {
         newBuilder.append(i);
         if(i!=9) {                                 //basically says that "until i == 9, add a dash after the element. once it is 9 stop
           newBuilder.append(" - ");
         }
       }

       System.out.println("1. b) " + newBuilder);
       
    //              Note:  make sure no dash appears at the end of the StringBuilder

    
    // 2. List of String:
    //      a. Create a list of Strings 
    //      b. Add 5 Strings to it, each with a different length
        List<String> newStringsList = new ArrayList<>();
        newStringsList.add("Oh");
        newStringsList.add("hey");
        newStringsList.add("I didn't");
        newStringsList.add("see you there");
        newStringsList.add("fren");
        System.out.println("2) " + newStringsList);
    
    // 3. Write and test a method that takes a list of strings 
    //          and returns the shortest string
       String shortestStr = shortestString(newStringsList);
       System.out.println("3) The Shortest String is: " + shortestStr);
        
    
    // 4. Write and test a method that takes a list of strings 
    //          and returns the list with the first and last element switched      
//       System.out.println("4) String List with First and Last elements swapped: " + switchFirstAndLast(newStringsList));
    
    // 5. Write and test a method that takes a list of strings 
    //          and returns a string with all the list elements concatenated to each other,
    //          separated by a comma
       System.out.println("5) The concatenated String List is: " + concatenateStringList(newStringsList));
    
    // 6. Write and test a method that takes a list of strings and a string 
    //          and returns a new list with all strings from the original list
    //          containing the second string parameter (i.e. like a search method)
       String searchTerm = "Hey";
       System.out.println("6) Search Results: " + searchListOfStrings(newStringsList, searchTerm));
       
    
    // 7. Write and test a method that takes a list of integers 
    //          and returns a List<List<Integer>> with the following conditions specified
    //          for the return value:
    //      a. The first List in the returned value contains any number from the input list 
    //          that is divisible by 2
    //      b. The second List contains values from the input list that are divisible by 3
    //      c. The third containing values divisible by 5, and 
    //      d. The fourth all numbers from the input List not divisible by 2, 3, or 5
       
       //******figured this one out here:     https://stackoverflow.com/questions/53721163/return-a-listlistinteger 
       
       List<Integer> integerListNew = new ArrayList<>();
       integerListNew.add(1);
       integerListNew.add(56);
       integerListNew.add(84);
       integerListNew.add(195);
       integerListNew.add(845);
       integerListNew.add(58);
       integerListNew.add(518);
       integerListNew.add(585);
       integerListNew.add(26);
       integerListNew.add(2);
       integerListNew.add(7);
       integerListNew.add(41);
       integerListNew.add(73);
       integerListNew.add(60);
       integerListNew.add(90);
       integerListNew.add(55);
       
       multiplesOfTwoThreeFive(integerListNew);
       System.out.println("7) This is 4 Lists of Integers Divisible by 2, 3, 5, or none: " + multiplesOfTwoThreeFive(integerListNew));
       
 
    // 8. Write and test a method that takes a list of strings 
    //          and returns a list of integers that contains the length of each string
       List<String> catStringsList = new ArrayList<>();
       catStringsList.add("Mr.");
       catStringsList.add("Beanie");
       catStringsList.add("Is");
       catStringsList.add("My");
       catStringsList.add("Cat");
       catStringsList.add("And");
       catStringsList.add("Pippy's");
       catStringsList.add("His");
       catStringsList.add("Little");
       catStringsList.add("Sister");
       
       stringsToInts(catStringsList);
       System.out.println("8) Strings to Integer List: " + stringsToInts(catStringsList));
    
    // 9. Create a set of strings and add 5 values
       Set<String> newStringSet = new HashSet<String>();
       newStringSet.add("Toodle");
       newStringSet.add("and");
       newStringSet.add("Baby");
       newStringSet.add("Cat");
       newStringSet.add("Besties");
       
    
    // 10. Write and test a method that takes a set of strings and a character 
    //          and returns a set of strings consisting of all the strings in the
    //          input set that start with the character parameter.
      char userChar = 't';
      startsWithChar(newStringSet, userChar);
      System.out.println("10) StringSet of Strings that start with given character: " + startsWithChar(newStringSet, userChar));

    
    // 11. Write and test a method that takes a set of strings 
    //          and returns a list of the same strings
      setToList(newStringSet);
      System.out.println("11) Takes a Set of String and returns List of String: " + setToList(newStringSet));
    

    // 12. Write and test a method that takes a set of integers 
    //          and returns a new set of integers containing only even numbers 
    //          from the original set
      Set<Integer> integerSet = new HashSet<Integer>();
      integerSet.add(5);
      integerSet.add(10);
      integerSet.add(11);
      integerSet.add(25);
      integerSet.add(558);
      integerSet.add(12);
      integerSet.add(59);
      integerSet.add(481);
      integerSet.add(2);
      evenIntegerSet(integerSet);
      
      System.out.println("12) New Set of Integers with only even numbers: " + evenIntegerSet(integerSet));
    
    // 13. Create a map of string and string and add 3 items to it where the key of each
    //          is a word and the value is the definition of the word
      Map<String, String> dictionary = new HashMap <String, String>();
      dictionary.put("Feline", "a cat! aka. a carnivorous, floofy, cute, sassy animal. Large and Small variations.");
      dictionary.put("Canine", "an omnivorous, furry, cuddly, goofy animal. Large and Small breeds.");
      dictionary.put("Ghost", "a highly debated transparent energy field that some thing to be people who've passed.");
      

    
    // 14. Write and test a method that takes a Map<String, String> and a string 
    //          and returns the value for a key in the map that matches the
    //          string parameter (i.e. like a language dictionary lookup)
      String userSearch = "canine";
      dictionarySearch(dictionary, userSearch);
      System.out.println("14) DictionaryMap practice searching for " + " '" + userSearch + "' is: " + dictionarySearch(dictionary, userSearch));
    
    // 15. Write and test a method that takes a List<String> 
    //          and returns a Map<Character, Integer> containing a count of 
    //          all the strings that start with a given character
      char givenChar = 'i';
      List<String> finalStringList = new ArrayList<>();
      finalStringList.add("Tiny");
      finalStringList.add("Little");
      finalStringList.add("Mushrooms");
      finalStringList.add("In");
      finalStringList.add("a");
      finalStringList.add("Forest");
      finalStringList.add("Wilderness");
      finalStringList.add("I loved it");
      
      howManyChars(finalStringList, givenChar);
      System.out.println("15) How many times does '" + givenChar + "' appear in the list? " + howManyChars(finalStringList, givenChar));
      

}


// Method 15:
public static Map<Character, Integer> howManyChars(List<String> strList, char userChar){
  Map<Character, Integer> thisManyChars = new HashMap<>();                      //creates new Map
  String charToString = String.valueOf(userChar);                               //converts the given char to a String
  int counter = 0;                                                              //defines a counter
    for(int i = 0; i < strList.size(); i++) {                                   //iterates through the list of string
    if(strList.get(i).toLowerCase().startsWith(charToString.toLowerCase())){    //if the String at index "i" (when lowercase) starts with the given char (when lowercase)
      counter++;                                                                // add one to the counter
      thisManyChars.put(userChar, counter);                                     //once all are checked, add the given char and the counter showing how many times it found the given char
    }
  }
    return thisManyChars;                                                       //return the new map showing the given char as the key and how many times it appears as the value
}


// Method 14:
public static String dictionarySearch(Map<String, String> strMap, String keySearch) {
for(Map.Entry<String,String> key : strMap.entrySet()) {                       // iterates through each key. "Map.Entry" represents a key-value pair in a map
  if(key.getKey().toLowerCase().equals(keySearch.toLowerCase())) {            //checks if the lowercase version of the current "entry" matches the lowercase version of the search word
    return key.getValue();                                                    //if it does match, return the value associated with the key that matches the search entry above
    }
  }
  return "Please enter a valid Search Word: ";                                // return this if nothing matches         
}


// Method 12:
public static Set<Integer> evenIntegerSet(Set<Integer> intSet){
  Set<Integer> evenIntegers = new HashSet<Integer>();                   //create new Set of int
  for(int num : intSet) {                                               //interate through given Set
    if(num % 2 == 0) {                                                  //check if even number (divisible by 2)
      evenIntegers.add(num);                                            //if they are even, add the to the new Set
    }
  }
  return evenIntegers;                                                  //return the new Set
}


// Method 11:
public static List<String> setToList(Set<String> strSet){               
  List<String> newListOfString = new ArrayList<>();                     //create new List of String
  for(String str: strSet) {                                             //for each string in the set of strings
    newListOfString.add(str);                                           // add to the new list of strings
  }
  return newListOfString;                                               //return the new list of string (unordered)
}


// Method 10: 
public static Set<String> startsWithChar(Set<String> strSet, char userChar){
  Set<String> newStringSet = new HashSet<String>();                     //creates new Set of String
  String userString = String.valueOf(userChar);                         //converts the given char to a String
  for(String str : strSet) {                                            //iterates through given Set of String
    if(str.toLowerCase().startsWith(userString.toLowerCase())) {        //converts everything to lowercase and checks if the String starts with the given char
      newStringSet.add(str);                                            //if it does start with the given char, adds it to the new Set of Strings
    }
  }
  return newStringSet;                                                  //returns the new String Set with all the Strings that start with the given char
}



// Method 8:
public static List<Integer> stringsToInts(List<String> strList){
  List<Integer> stringToIntegerList = new ArrayList<>();                //creates new list of integers
  for (int i = 0; i < strList.size(); i++) {                            //iterates through the given list of string
      int strLength = strList.get(i).length();                          //defines new variable for the length of each string
        stringToIntegerList.add(strLength);                             //adds the new integer to the new list
  }
  return stringToIntegerList;                                           //returns the new list
}


// Method 7:
public static List<List<Integer>> multiplesOfTwoThreeFive(List<Integer> intList){
  List<List<Integer>> resultListList = new ArrayList<>();               //defines a new list of lists of integers
  resultListList.add(new ArrayList<Integer>());                         //adds 4 new lists of integers to the main list
  resultListList.add(new ArrayList<Integer>());
  resultListList.add(new ArrayList<Integer>());
  resultListList.add(new ArrayList<Integer>());
  for (int integer : intList) {                                         //for each integer in the given list of integers
    if (integer % 2 == 0) {                                             //if the integer is divisible by 2 (even)
      List<Integer> resultListInner1 = resultListList.get(0);           // names the first inner list and adds the even numbers to it
      resultListInner1.add(integer);
    }
    else if(integer % 3 == 0) {                                         //repeats the above for divisible by 3
      List<Integer> resultListInner2 = resultListList.get(1);           //names the second inner list and adds those integers to it
      resultListInner2.add(integer);
    }
    else if(integer % 5 == 0) {                                         //repeats for divisible by 5
      List<Integer> resultListInner3 = resultListList.get(2);           //names the third inner list and adds the ints to it
      resultListInner3.add(integer);
    }
    else {                                                              //all other integers that dont fit any of the above
      List<Integer> resultListInner4 = resultListList.get(3);           //names the forth inner list and adds the remaining ints to it
      resultListInner4.add(integer);                                            
    }
    
  }
  return resultListList;                                                //returns the main list of lists of integers (all 4 new lists)
}

// Method 6:
//public static List<String> searchListOfStrings(List<String> strList, String searchStr){
//  List<String> resultList = new ArrayList<String>();
//  for(String str : strList) {
//    if(searchStr == str) {
//      resultList.add(searchStr);
//      }
//  }
//  return resultList;
//}
  
  public static List<String> searchListOfStrings(List<String> strList, String searchStr){
    List<String> resultList = new ArrayList<String>();
    for(String str : strList) {
        if(searchStr.equalsIgnoreCase(str)) {                   //this code checks if the values are the same regardless of capital or lowercase letters. 
          resultList.add(str);                                     // if you use (searchStr.toLowerCase() == str.toLowerCase()) it would not work because
      }                                                             // == checks to see if the variable is the same in MEMORY, not whether the actual values are equal.
    }
    return resultList;
  }


// Method 5:
public static String concatenateStringList(List<String> strList) {
  StringBuilder strListToBuilder = new StringBuilder();
  for(int i = 0; i<=strList.size()-1; i++) {
    strListToBuilder.append(strList.get(i));
    if(i != strList.size()-1) {                         //this code makes it so there only a comma after each element before the final element. no extra comma at the end
      strListToBuilder.append(", ");
    }
  }
  return strListToBuilder.toString();
}


// Method 4: there must be a shorter way to do this, but this is what came out of my brain...
public static List<String> switchFirstAndLast(List<String> strList){
  String firstElement = strList.get(0);
  String lastElement = strList.get(strList.size()-1);
  strList.remove(0);
  strList.remove(strList.size()-1);
  strList.add(strList.size(), firstElement); //confused why this one doesnt need a -1 after getting the length of the string list...
  strList.add(0, lastElement);
  return strList;
}


// Method 3:
 public static String shortestString(List<String> strList) {
   if(strList.isEmpty()) {
     System.out.println("This List of String is Empty.");     //added this check after researching and seeing that an error would be thrown if the list happens to be empty
   }
   String shortest = strList.get(0);
     for(String str : strList) {
       if(str.length() < shortest.length()) {
         shortest = str;
       }
     }
    return shortest;
 }
    
    
    
  

}
