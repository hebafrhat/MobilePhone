package mobile;

public class Android extends MobilePhone{
    protected String android_os;

    public Android(String color, double size, String android_os) {
        super(color, size);
        this.android_os = android_os;
    }

    public void printandroid_os(){
        System.out.println("the android OS is "+android_os);
    }

    public String get() {
        return android_os;
    }

    @Override
    public String toString() {
        return "Android{" +
                "android_os='" + android_os + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
