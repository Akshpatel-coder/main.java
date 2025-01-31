public class stringsss {

    public static void main(String args) {

        //concatenation
        String firstName = "Tony";
        String lastName =  "stark";
        String fullName =  firstName + "@" + lastName;
        System.out.println(fullName.length());
        
        for(int i=0; i<fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }
}
