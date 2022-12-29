package tringle;

public class triangltext {
    public static void main(String[] args) {
        triangle T1 = new triangle(4, 6, 5, 5);
        equaleSides et1 = new equaleSides(6, 6, 5, 4);
        with90 w1 = new with90(4, 8, 7);

        System.out.println("the area of T1 is = "+T1.getarea());
        System.out.println("the area of et1 is = "+ et1.gethikafequal());
        System.out.println("the area of w1 is = "+w1.getAreaWith90());
        System.out.println("the hikaf of T1 is = "+T1.gethikaf());
        System.out.println("the hikaf of et1 is = "+et1.gethikaf());
        System.out.println("the hikaf of w1 is = "+w1.gethikaf());
    }
}
