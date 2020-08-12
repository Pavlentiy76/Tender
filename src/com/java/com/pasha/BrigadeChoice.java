package com.pasha;

import java.util.ArrayList;

public class BrigadeChoice {

    public static void choiceBrigade(ArrayList<Worker> contract, ArrayList<Brigade> brigades)
            throws IndexOutOfBoundsException {

        System.out.println("The right brigades: ");

        int count;

        ArrayList<Brigade> prices = new ArrayList<>();

        for (int i = 0; i < brigades.size(); i++) {

            count = 0;

            for (int j = 0; j < contract.size(); j++) {

                if (contract.size() > brigades.get(i).getWorkers().size()) {
                    continue;
                }

                if (contract.get(j).compareTo(brigades.get(i).getWorkers().get(j)) >= 0) {

                    count++;

                    if (count >= contract.size()) {

                        prices.add(brigades.get(i));
                        System.out.println(brigades.get(i).getName() + ": " + "cost " + brigades.get(i).price());
                    }

                }
            }
        }

        int index = cheapIndex(prices);

        System.out.println("The most cheap " + prices.get(index).getName() + " , it cost: " + prices.get(index).price());
    }

    private static int cheapIndex(ArrayList<Brigade> brigade){

        int min = brigade.get(0).price();
        int index = 0;

        for (int i = 0; i < brigade.size(); i++) {

            if (brigade.get(i).price() < min){

                min = brigade.get(i).price();
                index = i;
            }
        }
        return index;
    }

}
