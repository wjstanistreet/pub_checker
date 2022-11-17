import java.util.ArrayList;

public class Guest {

    private String name;
    private int age;
    private double wallet;
    private int sobriety;
    private boolean banned;

    public Guest(String name, int age, double wallet,  int sobriety){
        this.name = name;
        this.age = age;
        this.wallet = wallet;
        this.sobriety = sobriety;
        this.banned = false;
    }

    // getters and setters
    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWallet() {
        return this.wallet;
    }

    public void setWallet(double wallet){
        this.wallet = wallet;
    }

    public int getSobriety(){
        return this.sobriety;
    }

    public void setSobriety(int sobriety){
        this.sobriety = sobriety;
    }

    public boolean getBanned(){
        return this.banned;
    }

    public void setBanned(boolean banned){
        this.banned = banned;
    }
}
