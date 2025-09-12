public class Door {
    public Door() {}
    public void knock() {
        System.out.println("Who's there?");
    }

    public static void main(String[] main) {
        Door alexander = new Door();

        alexander.knock();
        alexander.knock();
    }
}


