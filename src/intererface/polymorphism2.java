package intererface;

interface MyCamera2 {
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
interface MyWifi2 {
    String[] getNetworks();
    void   connectToNetwork(String network);
}


class MyCellPhone2 {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall() {
        System.out.println("Connecting....");
    }
}

// Remove abstract modifier to make it instantiable
class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2 {
    public void takeSnap() {System.out.println("Taking snap");}
    public void recordVideo() { System.out.println("Taking a snap");}
    //   public void record4KVideo() {
    //      System.out.println("Taking a snap and recording in 4K");
    //  }
    public String[] getNetworks() {
        System.out.println("Getting List of Networks");
        String[] networkList = {"Aksh", "Arush", "Shrey"};
        return networkList;
    }
    public void connectToNetwork(String network) {System.out.println("Connecting to " + network); }
    public void sampleMeth(){
        System.out.println("meth");
    }
}

public class polymorphism2 {
    public static void main(String[] args) {
        MyCamera2 cam1 = new MySmartPhone2();
        cam1.record4KVideo();
      //  cam1.sampleMeth(); not allowed
        MySmartPhone2 s = new MySmartPhone2();
        s.sampleMeth();
        s.recordVideo();
        s.getNetworks();
        s.callNumber(549618948);
    }
}
