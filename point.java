public class point {
    private String Nom;
    private int abs;
    private int ord;

    public point() {
        this("", 0, 0);
    }

    public point(int abs, int ord) {
        this("", abs, ord);
    }

    public point(String Nom) {
        this(Nom, 0, 0);
    }

    public point(String Nom, int abs, int ord) {
        this.Nom = Nom;
        this.abs = abs;
        this.ord = ord;
    }

    public void Affiche() {
        System.out.println(Nom + "(" + abs + " , " + ord + " )");
    }

    public void affiche() {
        Affiche();
    }

    public void TranslHoriz(int a) {
        this.abs += a;
    }

    public void TranslVert(int a) {
        this.ord += a;
    }

    public void Translation(int a, int b) {
        this.abs += a;
        this.ord += b;
    }

    public boolean Coincide(point p) {
        return (this.abs == p.abs) && (this.ord == p.ord);
    }

    public String getNom() {
        return Nom;
    }

    public int getAbscisse() {
        return abs;
    }

    public int getOrdonnée() {
        return ord;
    }

    public void setNom(String ch) {
        this.Nom = ch;
    }

    public void setSetAbscisse(int a) {
        this.abs = a;
    }

    public void setAbscisse(int a) {
        this.abs = a;
    }

    public void setOrdonnée(int a) {
        this.ord = a;
    }
}