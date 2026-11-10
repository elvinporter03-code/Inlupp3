public class Exp extends Unary{
    private float a;

    public Exp(float a){
        this.a = a;
    }

    public float instance(){
        return Math.pow(a);
    }
}