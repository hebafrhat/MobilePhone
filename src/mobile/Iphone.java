package mobile;

public class Iphone extends MobilePhone{
    protected String ios_version;

    public Iphone(String color, double size, String ios_version) {
        super(color, size);
        this.ios_version = ios_version;
    }

    public void printios_version(){
        System.out.println("the ios version is "+ios_version);
    }

    public String get() {
        return ios_version;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "ios_version='" + ios_version + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
