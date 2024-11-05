package BuilderDesignPattern.Problem4;

public class Client {
    public static void main(String[] args) {
        WorkFlow mywork = new WorkFlow.WorkFlowBuilder("Invoice Processing","vivek")
                                        .setDescription("Handles all incoming invoices above $1000")
                                        .setSteps(new Step.stepBuilder("Verify Invoice","Check Database",1)
                                                            .setCondition("If amount > $1000")
                                                            .build())
                                        .build();

        System.out.println(mywork);
    }
}
