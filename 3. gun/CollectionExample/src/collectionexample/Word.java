/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionexample;

/**
 *
 * @author Oytun
 */
public class Word implements Comparable<Word> {

    private final String word;

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return "Word{" + "word=" + word + '}';
    }

    @Override
    public int compareTo(Word o) {
        return this.word.compareTo(o.getWord());
    }

}
