package Quiz.step1;
class M{
    This1 this1 = null;
    public M(This1 this1) {
        System.out.println("M1"+this.this1 + "지역"+this1);
        this.this1 = this1;
        System.out.println("M2"+this.this1 + "지역"+this1);
    }
}
public class This1 {
    M m = new M(this);

    public static void main(String[] args) {
        This1 t1 = new This1();
        System.out.println("main1"+t1);
        t1 = new This1();
        System.out.println("main2"+t1);
    }
}
