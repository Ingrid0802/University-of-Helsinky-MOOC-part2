
public class Program {

    public static void main(String[] args) {
        
        int[][] matrix = {
                {0, 5, 0},
                {3, 0, 7}
        };
        System.out.println(arrayAsString(matrix));
    }
    
     public static String arrayAsString(int[][] array){
        StringBuilder stringBuilder = new StringBuilder();
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                stringBuilder.append(array[row][col]);
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}
