public class calculateFactorial extends operationType{
   private long result=1;
   private int n;

    public void setN(int n) {
        this.n = n;
    }

    public calculateFactorial(){
       super("Factorial");
   }
    public void calcFact(){
        if (n==0 || n==1){
           result =1;
        }

        for(int i=1;i<=n;i++){
            result *=i;
        }

    }
    public long getResult() {
        return result;
    }
}
