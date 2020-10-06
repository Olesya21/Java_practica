package zadanie_2;

public class Head {
    private int eyes;
    private int mouth;
    private int hair;
    Head(int e,int m)
    {
        this.eyes = e;
        this.mouth = m;
    }

    public void setEyes(int e) {
        this.eyes = e;
    }

    public int getEyes() {
        return eyes;
    }

    public void eyes()
    {
        System.out.println("Cмотреть");
    }



    public void setMouth(int m) {
        this.mouth = m;
    }

    public int getMouth() {
        return mouth;
    }

    public void mouth()
    {
        System.out.println("Разговаривать");
    }

}
