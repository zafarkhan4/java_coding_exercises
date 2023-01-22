package com.techreturners.exercise005;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise005 {
    private final int ALPHABET_COUNT = 26;
    
    public boolean isPangram(String input) {
        
      if(input == null || input.isEmpty()) return false;
        
      String lowerCaseInput = input.toLowerCase();
  
      Stream<Character> filteredCharStream = lowerCaseInput.chars()
        .filter(character -> ((character >= 'a' && character <= 'z')))
        .mapToObj(character -> (char) character);

      Set<Character> uniqueCharacters = filteredCharStream.collect(Collectors.toSet());
      
      return uniqueCharacters.size() == ALPHABET_COUNT;
    }

}
