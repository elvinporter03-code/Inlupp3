public class Subtraction extends Binary{
    private float a;
    private float b;

    public Subtraction(float a, float b){
        this.a = a;
        this.b = b;
    }

    public float instance(){
        return a - b;
    }
}