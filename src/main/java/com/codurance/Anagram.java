package com.codurance;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Anagram {

  public static void main(String[] args) throws FileNotFoundException {
    getWords();
  }

  public static List<String> getWords() throws FileNotFoundException {
    ClassLoader classloader = Thread.currentThread().getContextClassLoader();
    InputStream is = classloader.getResourceAsStream("wordlist.txt");
    Scanner s = new Scanner(is);

    ArrayList<String> words = new ArrayList<>();

    while(s.hasNext()){
      words.add(s.next());
    }

    return words;
  }


}
