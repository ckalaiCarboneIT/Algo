package com.carbon;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MagicalStone {

    public static List<Integer> iterativeMagicStone(List<Integer> sortedInts) {
        if (CollectionUtils.isEmpty(sortedInts)) return new ArrayList<>();

        List<Integer> currentList = new ArrayList<>(sortedInts);
        List<Integer> merged;

        do {
            merged = merge(currentList);
            currentList = merged;
        } while (!notAnyDouble(merged));

        return merged;
    }

    public static List<Integer> recursifMagicStone(List<Integer> sortedInts) {
        if (CollectionUtils.isEmpty(sortedInts)) return new ArrayList<>();

        // Condition de sortie : Si aucune fusion n'a été faite ou si la taille de la liste reste identique (aucun doublon restant)
        if (notAnyDouble(sortedInts)) {
            return sortedInts;
        }
        List<Integer> merged = merge(sortedInts);
        // Recursion : Continuer la fusion tant que des doublons existent

        return recursifMagicStone(merged);
    }


    public static List<Integer> merge(List<Integer> sortedInts) {

        List<Integer> result = new ArrayList<>(sortedInts.size());
        int i = sortedInts.size() - 1;

        while (i > 0) {
            if (sortedInts.get(i).equals(sortedInts.get(i - 1))) {
                result.addFirst(sortedInts.get(i) + 1); // Ajout au début de la liste
                i -= 2; // Sauter la paire fusionnée
            } else {
                result.addFirst(sortedInts.get(i)); // Ajout au début de la liste
                i--;
            }
        }

        // On rajoute le premier élément s'il n'a pas été fusionné
        if (i == 0) {
            result.addFirst(sortedInts.get(i));
        }
        return result;
    }

    private static boolean notAnyDouble(List<Integer> sortedInts) {
        return new HashSet<>(sortedInts).size() == sortedInts.size();
    }

}
