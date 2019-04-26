public class GenerateRandom {
    private static int id;

    static {
        id = 0;
    }

    public static int generateNextID(){
        return id++;
    }
}
