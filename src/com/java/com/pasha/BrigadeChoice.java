package com.pasha;

import java.util.ArrayList;
import java.util.Collections;

public class BrigadeChoice {

    ArrayList<Brigade> brigades;
    ArrayList contract;


    public static void choiceBrigade(ArrayList<Worker> contract, ArrayList<ArrayList<Worker>> brigades)
            throws IndexOutOfBoundsException {

        System.out.println("The right brigades: ");

        int count;

        ArrayList prices = new ArrayList();

        for (int i = 0; i < brigades.size(); i++) {

            count = 0;

            for (int j = 0; j < contract.size(); j++) {

                if (contract.get(j).compareTo(brigades.get(i).get(j)) >= 0) {

                    count++;

                    if (count >= contract.size()) {
                        prices.add(brigades.get(i));
                        System.out.println("Success " + brigades.get(i));
                    }

                } else throw new IndexOutOfBoundsException();
            }
        }
        System.out.println(prices);
    }

}
