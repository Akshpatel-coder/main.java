package intererface;
interface lamborghini {
    void sportscar();
    void suvs();

    private void followrule() {
        System.out.println("Do not overspeed");
    }

    default void emode() {
        System.out.println("emode activated"); // ✅ fixed: removed recursive call
    }
}

interface BMW {
    String[] motorsport();
    void sportssedan(BMW M4cs);
}

class Sports {
    void superfast(int speed) {
        System.out.println("Cracking" + speed);
    }

    void maintainspeed() {
        System.out.println("maintaining..");
    }
}

class Highspeed extends Sports implements BMW, lamborghini {

    public void sportscar() {
        System.out.println("Lamborghini Sportscar activated");
    }

    public void suvs() {
        System.out.println("Lamborghini SUV activated");
    }

    public String[] motorsport() {
        System.out.println("Bmw Motorspot make so loud cracking");
        System.out.println("Aksh , Arush , Shrey are passengers");
        return new String[] {"Aksh", "Arush", "Shrey"};
    }

    public void sportssedan(final BMW M4cs) {
        System.out.println("BMW  m4cs is very fast supercar");
    }
}

public class interface3 {
    public static void main(String[] args) {
        Highspeed hs = new Highspeed();
        hs.emode(); // ✅ will now work
        String[] ar = hs.motorsport();
        for (String item : ar) {
            System.out.println(item); // ✅ fixed: added body inside for-loop
        }
    }
}