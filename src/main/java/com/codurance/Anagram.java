package com.codurance;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Anagram {

  public static void main(String[] args) {
    System.out.println(getWords().toString());
  }

  public static List<String> getWords() {
    ClassLoader classloader = Thread.currentThread().getContextClassLoader();
    InputStream is = classloader.getResourceAsStream("wordlist.txt");
    assert is != null;
    Scanner s = new Scanner(is);

    ArrayList<String> words = new ArrayList<>();

    while (s.hasNext()) {
      words.add(s.next());
    }

    return words;
  }

  public static List<String> candidateWords(String container){
    return getWords().stream().filter(w -> containsAllChars(container, w)).collect(Collectors.toList());
  }


  public static boolean containsAllChars(String container, String containee) {
    return stringToCharacterSet(container).containsAll(stringToCharacterSet(containee));
  }

  private static Set<Character> stringToCharacterSet(String s) {
    Set<Character> set = new HashSet<>();
    for (char c : s.toCharArray()){
      set.add(c);
    }
    return set;
  }

}
