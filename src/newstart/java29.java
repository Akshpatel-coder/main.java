package newstart;


public class java29 {


        // Function to calculate average of an array
        public static double calculateAverage(int[] marks) {
            int sum = 0;
            for (int mark : marks) {
                sum += mark;
            }
            return (double) sum / marks.length;
        }

        // Function to assign grade based on average
        public static String assignGrade(double average) {
            if (average >= 90) return "A";
            else if (average >= 80) return "B";
            else if (average >= 70) return "C";
            else if (average >= 60) return "D";
            else return "F";
        }

        public static void main(String[] args) {
            // Student marks
            int[] marks = {85, 78, 92, 67, 88};

            // Print marks
            System.out.println("Student Marks:");
            for (int i = 0; i < marks.length; i++) {
                System.out.println("Subject " + (i + 1) + ": " + marks[i]);
            }

            // Calculate and print average
            double average = calculateAverage(marks);
            System.out.println("Average: " + average);

            // Assign and print grade
            String grade = assignGrade(average);
            System.out.println("Grade: " + grade);
        }
    }

