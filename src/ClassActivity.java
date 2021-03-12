public class ClassActivity {
    public static void main(String[] args) {
        Television tv = new Television();
        System.out.println(tv.isOn());
        tv.powerSwitch();
        System.out.println(tv.isOn());
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();

        tv.decreaseVolume();
        tv.decreaseVolume();
        tv.decreaseVolume();
        tv.setChannel(5);
        tv.getChannel();
    }
}

class Television {
    // properties
    private boolean power = false;
    private int volume = 100;
    private String channel = "";
    private String[] channels = {"", "NBC", "FOX", "CNN", "ABC", "NETFLIX"};

    // methods
    public void getChannel() {
        System.out.println("The channel is: " + channel);
    }
    public void setChannel(int number) {
        if (channels.length > number && number >= 0) {
            channel = channels[number];
        }
    }

    public boolean isOn() { return power; }
    public void powerSwitch() { power = !power; }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
        System.out.println("The volume is " + volume);
    }
    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
        System.out.println("The volume is " + volume);
    }

}

