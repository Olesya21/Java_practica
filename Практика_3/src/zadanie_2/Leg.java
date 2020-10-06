package zadanie_2;

public class Leg {
    private int leg;

    Leg(int leg) { this.leg = leg; }

    public void setLeg(int l) {
        this.leg = l;
    }

    public int getLeg() {
        return leg;
    }
    public void right()
    {System.out.println("Согнуть правую ногу");}

    public void left()
    {System.out.println("Согнуть левую ногу");}
}
