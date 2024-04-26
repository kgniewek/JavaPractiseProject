package Clasess;

import com.sun.source.tree.Tree;

import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class CharactersHelper {
    private int calculateUniqueCharacters(String chain){
        Set<Character> setOfChain= new TreeSet<>();
        String newChain = chain.toLowerCase();
        char[] tab = newChain.toCharArray();
        for (int i = 0; i < tab.length ; i++) {
            setOfChain.add(tab[i]);
        }
        return setOfChain.size();
    }
    public void printStringInfo(String chain){
        System.out.println("Liczba znakow w podanym ciagu: "+chain.length());
        System.out.println("Liczba unikalnych znakow w podanym ciagu: "+calculateUniqueCharacters(chain));
    }
}
