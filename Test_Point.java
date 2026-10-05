public class Test_Point {
    public static void main(String[] args) {
        point p1 = new point(3, 5);
        point p2 = new point("a");
        point p3 = new point("b", 3, 5);
        p1.Affiche();
        p2.Affiche();
        p3.Affiche();
    }
}