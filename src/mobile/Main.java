package mobile;

public class Main {
    public static void main(String[] args) {
        Android a = new Android("black", 8, "Galaxy");
        Iphone i = new Iphone("pink", 6, "Iphon");
        Lumia l = new Lumia("blue", 7, "LG");
        MobilePhone[] M = new MobilePhone[3];
        M[0] = a;
        M[1] = i;
        M[2] = l;
        for (int x = 0; x < M.length; x++) {
            System.out.println(M[x]);
        }

        for (int x = 0; x < M.length; x++){
            printos(M[x]);}

        for (int x = 0; x < M.length; x++){
            casting(M[x]);}

}

    public static void printos(MobilePhone M){
        if (M instanceof Android){
            ((Android) M).printandroid_os();}
        else if (M instanceof Iphone) {
            ((Iphone) M).printios_version();
        } else if (M instanceof Lumia) {
          ((Lumia) M).printms_version();
        }else System.err.println("Unknown");;
    }

    public static void casting(MobilePhone M){
        int f =(int) M.size;
        System.out.println(f);
        }
}
