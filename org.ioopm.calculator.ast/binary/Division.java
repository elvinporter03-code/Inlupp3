public class Division{
    private float a;
    private float b;

    public Division(float a, float b){
        this.a = a;
        this.b = b;
    }

    public float instance(){
        if(b == 0){
            System.out.println("DELA INTE MED NOLL, DITT SVAR ÄR BULLSHIT!");
            return 0;
        }
        return a / b;
    }
}