package com.codurance;

import static com.codurance.Anagram.getWords;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileNotFoundException;
import org.junit.jupiter.api.Test;

public class AnagramShould {
  @Test
  void find_all_two_word_anagrams_of_a_word() throws FileNotFoundException {
    assertEquals("acrobat", getWords().get(0));
  }
}
