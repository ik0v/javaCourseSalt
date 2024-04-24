package chapter12.gradebook;

import java.util.HashMap;
import java.util.Map;

/*
 --- Optional exercise for chapter 12 ---
 Given two Maps of test scores, update the students grade only if they did better
 on the makeup exam. Then print the final grades.

 Class TestResults with two methods, getOriginalGrades() and getMakeUpGrades is provided.
*/

public class Grades {
    public static void main(String[] args) {
        var grades = getGrades();
        grades.forEach(
                (k, v) -> System.out.println("Name: " + k + ", grade: " + v)
        );
    }

    public static Map<String, Integer> getGrades() {
        var answer = new HashMap<String, Integer>();

        var originalGrades = TestResults.getOriginalGrades();
        var makeUpGrades = TestResults.getMakeUpGrades();

        for (var entry: originalGrades.entrySet()) {
            int originalGrade = entry.getValue();
            int makeUpGrade = makeUpGrades.get(entry.getKey());
            answer.put(entry.getKey(), Math.max(originalGrade, makeUpGrade));
        }

        return answer;
    }

}
