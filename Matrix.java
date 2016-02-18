import java.util.Arrays;



class Matrix {
    private int rows;

    private int columns;

    private  int [][] matrix;


    public Matrix(int rows,int columns){
      this.rows=rows;
      this.columns=columns;
      this.matrix = new int[rows][columns];
    }

    public void fillMatrix(int value){
      for (int i=0;i<rows;i++) {
        Arrays.fill(matrix[i],value);
      }
    }

    public Matrix addMatrix(Matrix another){
      Matrix resultMatrix = new Matrix(this.rows,this.columns);
      for (int i=0;i<rows;i++){
        for (int j=0;j<columns ;j++) {
          int additionResult =  this.matrix[i][j]+ another.getElementAt(i,j);
          resultMatrix.insertAt(i,j,additionResult);
        }
      }
      return resultMatrix;
    }

    public int[][] getMatrix(){
      return matrix;
    }

    public void insertAt(int row,int columns,int element){
      matrix[row][columns] = element;
    }

    public int getElementAt (int row,int columns){
      return matrix[row][columns];
    }
 
    public void print(){
      for (int i=0;i<this.rows ; i++) {
        for (int j=0;j<this.columns ;j++) {
          System.out.println(this.matrix[i][j]);
        }
        System.out.println("\n");
      }
    }
}
