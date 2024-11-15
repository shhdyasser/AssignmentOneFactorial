public class operationType {
    private String opName;
    public operationType(String opName){
        this.opName = opName;
    }
    public void displayOp(){
        System.out.println("This Program Calculates: "+opName);
    }
}
