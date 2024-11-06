package BuilderDesignPattern.Problem5;                         

public class Stage {
    private final String stageName;
    private final String actionType;
    private final String parameter;
    private final int order;
    private final String condition;

    private Stage(StageBuilder builder){
        this.stageName=builder.stageName;
        this.actionType=builder.actionType;
        this.parameter=builder.parameter;
        this.order=builder.order;
        this.condition=builder.condition;
    }

    public String getStageName(){
        return stageName;
    }
    public String getActionType(){
        return actionType;
    }
    public String getParameter(){
        return parameter;
    }
    public int getOrder(){
        return order;
    }
    public String getCondition(){
        return condition;
    }

    public static class StageBuilder{
        private final String stageName;
        private final String actionType;
        private String parameter;
        private final int order;
        private String condition; 

        public StageBuilder(String stageName,String actiontype, int order){
            this.stageName=stageName;
            this.actionType=actiontype;
            this.order=order;
        }
        
        public StageBuilder setParameter(String parameter){
            this.parameter=parameter;
            return this;
        }
        public StageBuilder setCondition(String condition){
            this.condition=condition;
            return this;
        }
        public Stage build(){
            return new Stage(this);
        }    
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Stage ").append(order)
            .append(": ").append(stageName)
            .append(" - ").append("Action: ").append(actionType)
            .append(" - ").append("Parameters: ").append(parameter)
            .append(", Condition: ").append(condition);

        return sb.toString();
    }
}
