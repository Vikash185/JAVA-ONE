public class checkwitheSpace {
    public static void main(String[] args) {
        String name = "   computer   ";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                System.out.println("white space found at index" + i);
            } else {
                System.out.println("nothing found");
            }

        }
    }
}
