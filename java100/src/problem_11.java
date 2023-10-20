import java.util.Arrays;
import java.util.Scanner;

public class problem_11
{

    public static  int[][] createMatrix(int row,int col)
    {
        int[][] matrix=new int[row][col];
        Scanner read=new Scanner(System.in);

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print("arr["+i+"]["+j+"] : ");
                matrix[i][j]=read.nextInt();
            }
        }

        return matrix;
    }


    public static int[][] addMatrix(int[][] mat1,int[][] mat2)
    {
        int[][] addMatrix=new int[mat1.length][mat1[0].length];


        for(int i=0;i<addMatrix[0].length;i++)
        {
            for(int j=0;j<addMatrix.length;j++)
            {
                addMatrix[i][j]=mat1[i][j]+mat2[i][j];
            }
        }

        return addMatrix;
    }


    public static int[][] transposeMatrix(int[][] arr)
    {
        int[][] transpose=new int[arr.length][arr[0].length];

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                transpose[j][i]=arr[i][j];
            }
        }

        return transpose;
    }
    public static void main(String[] args)
    {

        //System.out.println(Arrays.deepToString(createMatrix(2,2)));
        System.out.println(Arrays.deepToString(transposeMatrix(createMatrix(2,2))));
        //System.out.println(Arrays.deepToString(addMatrix(createMatrix(2,2),createMatrix(2,2))));

    }

}
