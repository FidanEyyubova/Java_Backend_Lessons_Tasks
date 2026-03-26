package Java_Arrays_Strings;

public class Task07MediumStudent3DAnalyzer {

    public static void main(String[] args) {
        int noOfStudents = 2;
        int noOfSubjects = 4;
        int noOfSemesters = 5;
        String[] subjectNames = {"Mathematics", "Physics", "Chemistry", "Computer Science"};

        int[][] student1Data = {
                {88, 76, 90, 82, 98},
                {82, 96, 92, 72, 99},
                {86, 66, 94, 93, 100},
                {85, 86, 97, 92, 97}
        };

        int[][] student2Data = {
                {78, 85, 70, 72, 88},
                {62, 92, 82, 91, 91},
                {76, 72, 93, 87, 82},
                {55, 83, 87, 71, 100}
        };

        int[][][] studentArray = new int[noOfStudents][noOfSubjects][noOfSemesters];
        studentArray[0] = student1Data;
        studentArray[1] = student2Data;

        printAllData(studentArray, subjectNames);
        computeAveragePerStudent(studentArray);
        computeBestSubjectPerStudent(studentArray, subjectNames);
    }

    public static void printAllData(int[][][] data, String[] subjectNames) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("Student " + (i + 1) + ":");
            for (int j = 0; j < data[i].length; j++) {
                String subject = (j < subjectNames.length) ? subjectNames[j] : "Subject " + j;
                System.out.print("  " + subject + ": ");
                for (int k = 0; k < data[i][j].length; k++) {
                    System.out.print(data[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void computeAveragePerStudent(int[][][] data) {
        for (int i = 0; i < data.length; i++) {
            int sum = 0;
            int count = 0;
            for (int j = 0; j < data[i].length; j++) {
                for (int k = 0; k < data[i][j].length; k++) {
                    sum += data[i][j][k];
                    count++;
                }
            }
            double avg = (double) sum / count;
            System.out.printf("Student %d average: %.2f\n", (i + 1), avg);
        }
    }

    public static void computeBestSubjectPerStudent(int[][][] data, String[] subjectNames) {
        for (int i = 0; i < data.length; i++) {
            int bestSubjectIndex = -1;
            double bestAvg = -1;

            for (int j = 0; j < data[i].length; j++) {
                int subjectSum = 0;
                for (int k = 0; k < data[i][j].length; k++) {
                    subjectSum += data[i][j][k];
                }
                double currentSubjectAvg = (double) subjectSum / data[i][j].length;

                if (currentSubjectAvg > bestAvg) {
                    bestAvg = currentSubjectAvg;
                    bestSubjectIndex = j;
                }
            }
            String subject = (bestSubjectIndex >= 0 && bestSubjectIndex < subjectNames.length)
                    ? subjectNames[bestSubjectIndex] : "Unknown";
            System.out.println("Student " + (i + 1) + " best subject: " + subject);
        }
    }
}