package oop.classes;

import java.util.HashSet;
import java.util.Set;

public class Problem {
    //We are designing an application which
    //filters candidates for a job.

    //create a method which returns true if the
    //candidate has more than 6 years experience,
    //knows at least Java, Unix, Junit
    //has a EAD


    public static void main(String[] args) {

        Set<String> candidatesSkills = new HashSet<>();
        candidatesSkills.add("Java");
        candidatesSkills.add("C#");
        candidatesSkills.add("Junit");
        candidatesSkills.add("Cucumber");
        candidatesSkills.add("Unix");
        candidatesSkills.add("Selenium");
        boolean hasEAD = true;
        int yearsOfExperience = 7;

        System.out.println(isApproved(yearsOfExperience, candidatesSkills, hasEAD));
        Set<String> candidates2Skills = new HashSet<>();
        candidates2Skills.add("Python");
        candidates2Skills.add("C#");
        candidates2Skills.add("Junit");
        candidates2Skills.add("Cucumber");
        candidates2Skills.add("Unix");
        candidates2Skills.add("Selenium");
        boolean hasEAD1 = true;
        int yearsOfExperience2 = 7;
        System.out.println(isApproved(yearsOfExperience2, candidates2Skills, hasEAD1));

}

    public static boolean isApproved(int yearsOfExp, Set<String> skills, boolean hasEAD) {
        Set<String> reqSkills = new HashSet<>();
        reqSkills.add("Java");
        reqSkills.add("Unix");
        reqSkills.add("Junit");
        boolean hasSkills = skills.containsAll(reqSkills);
        return (hasSkills && yearsOfExp > 6 && hasEAD);
    }
}
