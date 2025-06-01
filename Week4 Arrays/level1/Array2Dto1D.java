import java.util.Scanner;
public class Array2Dto1D{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter row value:");
        int row=myObj.nextInt();                        //taking value for row
        System.out.println("Enter column value:");
        int column=myObj.nextInt();                     //taking value for column
        int num;
        int[][] array2d = new int[row][column];
        int[] array1d = new int[row*column];

        //initializing the array in 2d
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.println("Enter number for row="+i+"and column="+j);
                num=myObj.nextInt();
                array2d[i][j]=num;
            }
        }
        
        //conversion from 2d to 1d
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                array1d[i*j]=array2d[i][j];
            }
        }

        myObj.close();
    }
}