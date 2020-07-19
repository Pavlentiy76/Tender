package com.pasha.crews.main;

import java.util.ArrayList;

import com.pasha.crews.ConstructionCrew1;
import com.pasha.crews.ConstructionCrew2;
import com.pasha.crews.ConstructionCrew3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> crew1 = new ArrayList<>();

        crew1.add("mason : " + TenderSkills.LAYING_MASONRY);
        crew1.add("welder : " + TenderSkills.WELD);
        crew1.add("locksmith : " + TenderSkills.BUILD);
        crew1.add("crane operator : " + TenderSkills.RAISE);
        crew1.add("concreter : " + TenderSkills.MAKING_CONCRETE);
        crew1.add("roofer : " + TenderSkills.MAKING_ROOF);
        crew1.add("installer : " + TenderSkills.MOUNT);
        crew1.add("foreman : " + TenderSkills.MANAGE);
        crew1.add("painter : " + TenderSkills.PAINT + TenderSkills.FINISHING_WORK);
        crew1.add("tiler : " + TenderSkills.LAYING_TILES);
        crew1.add("finisher : " + TenderSkills.FINISHING_WORK);
        crew1.add("watchman : " + TenderSkills.PROTECT);
        crew1.add("plumber : " + TenderSkills.PLUMBING_WORK + TenderSkills.FINISHING_WORK);

        Collections.sort(crew1);

        ArrayList<String> crew2 = new ArrayList<>();

        crew2.add("mason : " + TenderSkills.LAYING_MASONRY);
        //crew2.add("welder : " + TenderSkills.WELD);
        crew2.add("locksmith : " + TenderSkills.BUILD + TenderSkills.MAKING_CONCRETE);
        crew2.add("crane operator : " + TenderSkills.RAISE);
        crew2.add("concreter : " + TenderSkills.MAKING_CONCRETE);
        crew2.add("roofer : " + TenderSkills.MAKING_ROOF);
        crew2.add("installer : " + TenderSkills.MOUNT + TenderSkills.MOUNT);
        crew2.add("foreman : " + TenderSkills.MANAGE);
        crew2.add("painter : " + TenderSkills.PAINT);
        crew2.add("tiler : " + TenderSkills.LAYING_TILES + TenderSkills.FINISHING_WORK);
        crew2.add("finisher : " + TenderSkills.FINISHING_WORK);
        crew2.add("watchman : " + TenderSkills.PROTECT);
        crew2.add("plumber : " + TenderSkills.PLUMBING_WORK);

        Collections.sort(crew2);

        ArrayList<String> crew3 = new ArrayList<>();

        crew3.add("mason : " + TenderSkills.LAYING_MASONRY + TenderSkills.MAKING_CONCRETE);
        crew3.add("welder : " + TenderSkills.WELD);
        crew3.add("locksmith : " + TenderSkills.BUILD);
        crew3.add("crane operator : " + TenderSkills.RAISE);
        crew3.add("concreter : " + TenderSkills.MAKING_CONCRETE);
        crew3.add("roofer : " + TenderSkills.MAKING_ROOF);
        crew3.add("installer : " + TenderSkills.MOUNT);
        crew3.add("foreman : " + TenderSkills.MANAGE);
        crew3.add("painter : " + TenderSkills.PAINT);
        crew3.add("tiler : " + TenderSkills.LAYING_TILES);
        crew3.add("finisher : " + TenderSkills.FINISHING_WORK);
        crew3.add("watchman : " + TenderSkills.PROTECT);
        crew3.add("plumber : " + TenderSkills.PLUMBING_WORK);

        Collections.sort(crew3);

        ArrayList<String> tender = new ArrayList<>();

        tender.add("mason : " + TenderSkills.LAYING_MASONRY);
        tender.add("welder : " + TenderSkills.WELD);
        tender.add("locksmith : " + TenderSkills.BUILD);
        tender.add("crane operator : " + TenderSkills.RAISE);
        tender.add("concreter : " + TenderSkills.MAKING_CONCRETE);
        tender.add("roofer : " + TenderSkills.MAKING_ROOF);
        tender.add("installer : " + TenderSkills.MOUNT);
        tender.add("foreman : " + TenderSkills.MANAGE);
        tender.add("painter : " + TenderSkills.PAINT);
        tender.add("tiler : " + TenderSkills.LAYING_TILES);
        tender.add("finisher : " + TenderSkills.FINISHING_WORK);
        tender.add("watchman : " + TenderSkills.PROTECT);
        tender.add("plumber : " + TenderSkills.PLUMBING_WORK);

        Collections.sort(tender);

        ConstructionCrew1 constructionCrew1 = new ConstructionCrew1(crew1);
        ConstructionCrew2 constructionCrew2 = new ConstructionCrew2(crew2);
        ConstructionCrew3 constructionCrew3 = new ConstructionCrew3(crew3);

        ArrayList<Integer> crewPrices = new ArrayList<>();

        int count = 0;

        if (tender.size() <= crew1.size()) {
            for (int i = 0; i < tender.size(); i++) {
                if ((tender.get(i)).compareTo(crew1.get(i)) <= 0) {
                    count++;
                }
            }
        }
        if (count == tender.size()) {
            crewPrices.add(constructionCrew1.getPrice());
        }else System.out.println("Crew1 doesn't fit");

        count = 0;

        if (tender.size() <= crew2.size()) {
            for (int i = 0; i < tender.size(); i++) {
                if ((tender.get(i)).compareTo(crew2.get(i)) <= 0) {
                    count++;
                }
            }
        }
        if (count == tender.size()) {
            crewPrices.add(constructionCrew2.getPrice());
        }else System.out.println("Crew2 doesn't fit");


        count = 0;

        if (tender.size() <= crew3.size()) {
            for (int i = 0; i < tender.size(); i++) {
                if ((tender.get(i)).compareTo(crew3.get(i)) <= 0) {
                    count++;
                }
            }
        }
        if (count == tender.size()) {
            crewPrices.add(constructionCrew3.getPrice());
        }else System.out.println("Crew3 doesn't fit");

        System.out.println(crewPrices);

        System.out.println(Collections.min(crewPrices)  + " minimum price");
    }


}



