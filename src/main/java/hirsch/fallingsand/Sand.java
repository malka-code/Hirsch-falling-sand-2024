package hirsch.fallingsand;

public class Sand {
    private int[][] field = new int[3][3];

    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                builder.append(field[y][x]);
            }
            builder.append("\n");
        }
        return builder.toString();

    }

    public int get(int x, int y){
        return field[y][x];
    }

    /**
     *
     * sets the value in field to be one
     */
    public void put(int x, int y){
        field[y][x] = 1;
    }

    public void fall() {
        // moves all sand down one square

    }
}
