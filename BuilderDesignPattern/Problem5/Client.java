package BuilderDesignPattern.Problem5;

public class Client {
    public static void main(String[] args) {
        Pipeline  mypipe = new Pipeline.PipelineBuilder("Customer Data Pipeline","Data Engineering Team")
                                        .setDescription("Processes and transforms customer data from multiple sources.")
                                        .addStage(new Stage.StageBuilder("Data Ingestion","Extract",1)
                                                            .setParameter("source=CRM, format=JSON")
                                                            .setCondition("If data volume > 1000 records")
                                                            .build())
                                        .build();

        System.out.println(mypipe);
}
}
