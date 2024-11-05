package BuilderDesignPattern.Problem4;

import java.util.ArrayList;
import java.util.List;

public class WorkFlow {
    private final String WorkFlowName;
    private final String creator;
    private final String Description;
    private final List<Step>steps;

    private WorkFlow(WorkFlowBuilder builder){
        this.WorkFlowName=builder.WorkFlowName;
        this.creator=builder.creator;
        this.Description=builder.Description;
        this.steps=builder.steps;
    }

    public String getWorkFlowName(){
        return WorkFlowName;
    }
    public String getcreator(){
        return creator;
    }
    public String getDescription(){
        return Description;
    }
    public List<Step> getSteps(){
        return steps;
    }

    public static class WorkFlowBuilder{
    private final String WorkFlowName;
    private final String creator;
    private String Description;
    private List<Step>steps=new ArrayList<>();

    public WorkFlowBuilder(String WorkFlowName,String creator){
        this.WorkFlowName=WorkFlowName;
        this.creator=creator;
    }

    public WorkFlowBuilder setDescription(String description){
        this.Description=description;
        return this;
    }
    public WorkFlowBuilder setSteps(Step step){
        steps.add(step);
        return this;
    }
    public WorkFlow build(){
        return new WorkFlow(this);
    }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Workflow [Name=").append(WorkFlowName)
          .append(", Creator=").append(creator)
          .append(", Description=").append(Description)
          .append("]\n");

        for (Step step : steps) {
            sb.append(step).append("\n");
        }
        return sb.toString();
    }
}
