package intererface;
interface TVRemote {
    void powerOn();
    void powerOff();
    void changeChannel(int channel);
    void volumeUp();
    void volumeDown();
}

interface SmartTVRemote extends TVRemote {
    void openYouTube();
    void connectToWifi(String networkName);
}

class MySmartTV implements SmartTVRemote {
    public void powerOn() {
        System.out.println("TV is now ON");
    }

    public void powerOff() {
        System.out.println("TV is now OFF");
    }

    public void changeChannel(int channel) {
        System.out.println("Changing channel to: " + channel);
    }

    public void volumeUp() {
        System.out.println("Increasing volume");
    }

    public void volumeDown() {
        System.out.println("Decreasing volume");
    }

    public void openYouTube() {
        System.out.println("Opening YouTube app...");
    }

    public void connectToWifi(String networkName) {
        System.out.println("Connecting to Wi-Fi: " + networkName);
    }
}

public class practice3 {
    public static void main(String[] args) {
        MySmartTV tv = new MySmartTV();
        tv.powerOn();
        tv.changeChannel(5);
        tv.volumeUp();
        tv.openYouTube();
        tv.connectToWifi("Home_Network");
        tv.powerOff();
    }
}
