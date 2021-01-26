package oop.classes;

import java.util.ArrayList;
import java.util.List;

public class CandidateApproveService {
    //We are designing an application which
    //filters candidates for a job.

    //create a method which returns true if the
    //candidate has more than 6 years experience,
    //knows at least Java, Unix, Junit
    //has a EAD
    public static void main(String[] args) {
        Candidate c1 = new Candidate();
        c1.name = "John Doe";
        c1.yearsOfExperience = 10;
        c1.hasEad=false;

        System.out.println(isApproved(c1));

        Candidate c2 = new Candidate();
        c2.name = "Elon Musk";
        c2.yearsOfExperience = 15;
        c2.hasEad = true;

        System.out.println(isApproved(c2));

        List<Candidate> allCandidates = new ArrayList<>();
        allCandidates.add(c1);
        allCandidates.add(c2);
    }

    public static boolean isApproved(Candidate candidate) {
        return candidate.yearsOfExperience > 6 && candidate.hasEad;
    }
}
