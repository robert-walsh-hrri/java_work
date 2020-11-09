package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetStuff {

    public static void main(String[] args) {
        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();

        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));
        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));

        Set<String> intersection = new HashSet<>(divine);
        intersection.removeAll(nature);
        for (String s : intersection) {
            System.out.println(s);
        }

    }


}
