package com.pasha;

import java.util.ArrayList;
import java.util.Collections;

public class BrigadeChoice {

    ArrayList<Brigade> brigades;
    ArrayList contract;


    public static void choiceBrigade(ArrayList contract, ArrayList<Brigade> brigades) {

        ArrayList prices = new ArrayList();

        for (int i = 0; i < brigades.size(); i++) {

            if (contract.equals(brigades.get(i))) {

                prices.add(brigades.get(i).price());
            }
        }

        System.out.println(prices);
        //System.out.println(Collections.min(prices));
    }

}
