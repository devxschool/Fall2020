package set;

import java.util.HashSet;
import java.util.Set;

public class RemoveAll {

    public static void main(String[] args) {

        Set<String> SDETCurriculum = new HashSet<>();
        SDETCurriculum.add("Java");
        SDETCurriculum.add("Unix");
        SDETCurriculum.add("Junit");
        SDETCurriculum.add("TestNG");
        SDETCurriculum.add("Cucumber");
        SDETCurriculum.add("Selenium");
        SDETCurriculum.add("DB");
        SDETCurriculum.add("RestAPI");
        SDETCurriculum.add("Jira");
        SDETCurriculum.add("Log4j");
        SDETCurriculum.add("Jenkins");
        SDETCurriculum.add("Git");


        Set<String> completedTools = new HashSet<>();
        completedTools.add("Unix");
        completedTools.add("Junit");

        SDETCurriculum.removeAll(completedTools);
        System.out.println(SDETCurriculum);
    }
}
