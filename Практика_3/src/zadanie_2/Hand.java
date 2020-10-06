package zadanie_2;

public class Hand {
    private int arm;

    Hand(int arm) { this.arm = arm; }

    public void setArm(int a) {
        this.arm = a;
    }

    public int getArm() {
        return arm;
    }
    public void right()
    {System.out.println("Согнуть правую руку");}

    public void left()
    {System.out.println("Согнуть левую руку");}
}
