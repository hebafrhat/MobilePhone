package mobile;

public class Lumia extends MobilePhone{
    protected String ms_version;

    public Lumia(String color, double size, String ms_version) {
        super(color, size);
        this.ms_version = ms_version;
    }

    public void printms_version(){
        System.out.println("the ms version is "+ms_version);
    }

    public String get() {
        return ms_version;
    }

    @Override
    public String toString() {
        return "Lumia{" +
                "ms_version='" + ms_version + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
