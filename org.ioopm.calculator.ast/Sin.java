public class Sin extends Unary{
    private float a;

    public Sin(float a){
        this.a = a;
    }

    public float instance(){
        return Math.sin(a);
    }
}