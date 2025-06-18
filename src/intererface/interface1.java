package intererface;
interface MyCamera {
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4K...");
    }
}
interface MyWifi {
    String[] getNetworks();
    void connectToNetwork(String network);
}


class MyCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall() {
        System.out.println("Connecting....");
    }
}

// Remove abstract modifier to make it instantiable
class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera {
    public void takeSnap() {
        System.out.println("Taking snap");
    }
    public void recordVideo() {
        System.out.println("Taking a snap");
    }
    //   public void record4KVideo() {
    //      System.out.println("Taking a snap and recording in 4K");
    //  }
    public String[] getNetworks() {
        System.out.println("Getting List of Networks");
        String[] networkList = {"Aksh", "Arush", "Shrey"};
        return networkList;
    }
    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

public class interface1 {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        String[] ar = ms.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }
    }
}





