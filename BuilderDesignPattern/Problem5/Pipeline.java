package BuilderDesignPattern.Problem5;

import java.util.ArrayList;
import java.util.List;

public class Pipeline{
    private final String pipelineName;
    private final String creator;
    private final String description;
    private final List<Stage>stages;

    private Pipeline(PipelineBuilder builder){
        this.pipelineName=builder.pipelineName;
        this.creator=builder.creator;
        this.description=builder.description;
        this.stages=builder.stages;
    }

    public String getPipelineName(){
        return pipelineName;
    }

    public String getCreator(){
        return creator;
    }
    public String getDescription(){
        return description;
    }
    public List<Stage> getStages(){
        return stages;
    }
    
    public static class PipelineBuilder{
    private final String pipelineName;
    private final String creator;
    private String description;
    private List<Stage>stages=new ArrayList<>();

    public PipelineBuilder(String pipelineName,String creator){
        this.pipelineName=pipelineName;
        this.creator=creator;
    }

    public PipelineBuilder setDescription(String description){
        this.description=description;
        return this;
    }

    public PipelineBuilder addStage(Stage stage){
        stages.add(stage);
        return this;
    }

    public Pipeline build(){
        return new Pipeline(this);
    }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Pipeline [Name=").append(pipelineName)
            .append(", Creator=").append(creator)
            .append(", Description=").append(description)
            .append(".]\n");

        for(Stage stage: stages){
            sb.append(stage).append("\n");
        }

        return sb.toString();
    }
}