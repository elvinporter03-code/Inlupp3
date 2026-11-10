public class Addition extends Binary{
    private float a;
    private float b;

    public Addition(float a, float b){
        this.a = a;
        this.b = b;
    }

    public float instance(){
        return a + b;
    }
}