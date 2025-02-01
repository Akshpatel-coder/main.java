package builderstring;

public class builderstring {
    public static <StringBuilder> void main(String args[]) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);



        sb.insert(2, 'n');
        System.out.println(sb);

        //delete the extra 'n'
        sb.delete(2,3);
        System.out.println(sb);

    }
}
