public class arrays6 {
        public static void main(String[] args) {
            String[] studentNames = {"Alice", "Bob", "Charlie", "David", "Eve"};
            int[] studentGrades = {85, 92, 78, 88, 95};

            // Print each student's name and grade
            for (int i = 0; i < studentNames.length; i++) {
                System.out.println(studentNames[i] + ": " + studentGrades[i]);
            }

            // Calculate the average grade
            int sum = 0;
            for (int grade : studentGrades) {
                sum += grade;
            }
            double average = (double) sum / studentGrades.length;
            System.out.println("Average grade: " + average);

            // Find the highest grade
            int highestGrade = 0; // Initialize to 0 (or the lowest possible grade if you know it)
            for (int grade : studentGrades) {
                if (grade > highestGrade) {
                    highestGrade = grade;
                }
            }
            System.out.println("Highest grade: " + highestGrade);


            //Find the student who got the highest grade
            String bestStudent = "";
            for(int i = 0; i < studentGrades.length; i++){
                if(studentGrades[i] == highestGrade){
                    bestStudent = studentNames[i];
                }
            }
            System.out.println("Best student: " + bestStudent);

        }
    }

