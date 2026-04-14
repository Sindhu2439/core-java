class DynamoRunner {
    public static void main(String[] args) {
        Dynamo dynamo = new Dynamo();
        dynamo.save("ACDynamo");
        dynamo.save("DCDynamo");
        dynamo.save("TurboDynamo");
        dynamo.save("MiniDynamo");
        dynamo.save("HydroDynamo");
        dynamo.store("TurboDynamo");
        dynamo.store("SolarDynamo");
    }
}