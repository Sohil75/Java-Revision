package MiniProject;

import java.util.Scanner;

public class StudentMarksReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Students: ");
        int numberOfStudent = sc.nextInt();
        System.out.println("Enter there marks: ");
       int[] marks = new int[numberOfStudent];

       for(int i = 0;i<marks.length;i++){
           marks[i] = sc.nextInt();
       }

        System.out.println("Highest Marks: "+findHighest(marks));
        System.out.println("Lowest Marks: "+ findLowestMarks(marks));
        System.out.println("Average Marks: "+calculateAverage(marks));
        System.out.println();
        System.out.println("Passed: " + countPassed(marks));
        System.out.println("failed: "+ countFailed(marks));
        System.out.println("Topper Marks: " + findHighest(marks));

    }

    static int findHighest(int[] marks){
        int highestMarks = Integer.MIN_VALUE;
        for(int i =0 ;i<marks.length;i++){
            if(marks[i]>highestMarks){
                highestMarks = marks[i];
            }
        }
        return highestMarks;
    }
    static int findLowestMarks(int[] marks){
        int lowestMarks = marks[0];
        for(int i =0;i<marks.length;i++){
            if(marks[i]<lowestMarks){
                lowestMarks = marks[i];
            }
        }
        return lowestMarks;
    }
    static double calculateAverage(int[] marks){
        int sum = 0;
        double averageMarks =0;
        if(sum == 0){
            averageMarks =0;
        }
        for (int i =0;i<marks.length;i++){
            sum += marks[i];
        }
        averageMarks = (double) sum/ marks.length;
        return averageMarks;
    }
    static int countPassed(int[] marks){
        int passed =0;
        for (int i =0; i<marks.length;i++){
            if(marks[i]>=50){
                passed++;
            }
        }
        return passed;
    }
    static int countFailed(int[] marks){
        int failed = 0;
        for (int i =0; i<marks.length;i++){
            if(marks[i]<50){
                failed++;
            }
        }
        return failed;
    }
}
