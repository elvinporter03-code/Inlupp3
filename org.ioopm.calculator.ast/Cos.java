public class Cos extends Unary{
    private float a;

    public Cos(float a){
        this.a = a;
    }

    public float instance(){
        return Math.cos(a);
    }
}