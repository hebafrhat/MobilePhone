package mobile;

public class MobilePhone {
    protected String color;
    protected double size;

    public MobilePhone(String color, double size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "mobile.MobilePhone{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }

    public void  PrintPhoneData(MobilePhone m){
    }
}
