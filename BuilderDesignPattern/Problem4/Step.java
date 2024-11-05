package BuilderDesignPattern.Problem4;

public class Step {
    private final String StepName;
    private final String Action;
    private final String Condition;
    private final int Order;

    private Step(stepBuilder builder){
        this.StepName=builder.StepName;
        this.Action=builder.Action;
        this.Condition=builder.Condition;
        this.Order=builder.Order;
    }

    public String getStepName(){
        return StepName;
    }
    public String getAction(){
        return Action;
    }
    public String Condition(){
        return Condition;
    }
    public int Order(){
        return Order;
    }

    public static class stepBuilder{
    private final String StepName;
    private final String Action;
    private final int Order;
    private  String Condition;

    public stepBuilder(String stepName,String Action,int order){
        this.StepName=stepName;
        this.Action=Action;
        this.Order=order;
    }
    public stepBuilder setCondition(String condition){
        this.Condition=condition;
        return this;
    }
    public Step build(){
        return new Step(this);
    }
}
    @Override
    public String toString() {
        return "Step " + Order + ": " + StepName + " - Action: " + Action + 
               (Condition != null ? " - Condition: " + Condition : "");
    }
}
