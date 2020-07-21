package com.codurance;

import static com.codurance.Anagram.candidateWords;
import static com.codurance.Anagram.containsAllChars;
import static com.codurance.Anagram.getWords;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

public class AnagramShould {

  @Test
  void get_all_words_from_the_wordlist() {
    List<String> words = getWords();

    assertEquals("acrobat", words.get(0));
    assertEquals("yes", words.get(words.size() - 1));
  }

  @Test
  void returns_true_if_string_contains_all_letters_of_other_string() {
    String containee = "gent";
    String container = "documenting";

    assertTrue(containsAllChars(container, containee));
  }

  @Test
  void returns_list_of_words_that_contain_only_the_letters_of_given_word() {
    List<String> words = getWords();
    System.out.println(candidateWords("documenting").toString());
  }
}
