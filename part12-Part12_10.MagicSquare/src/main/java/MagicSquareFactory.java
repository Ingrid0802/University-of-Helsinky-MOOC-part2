
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
          int row = 0;
        int col = size / 2;
        square.placeValue(row, col, 1);
        for (int k = 2; k <= size * size; k++) {
            int currentRow = row;
            int currentColumn = col;
            row -= 1;
            col += 1;
            if (row < 0) {
                row = size - 1;
            }
            if (col > size - 1) {
                col = 0;
            }
            if (square.readValue(row, col) > 0) {
                row = currentRow + 1;
                col = currentColumn;
            }
            square.placeValue(row, col, k);
        }
        return square;
    }

}
