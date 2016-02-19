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

    public Matrix addMatrix(Matrix otherMatrix){
      if(isNotSameOrder(otherMatrix)){
        return new Matrix(0,0);
      }
      Matrix resultMatrix = new Matrix(this.rows,this.columns);
      for (int i=0;i<rows;i++){
        for (int j=0;j<columns ;j++) {
          int additionResult =  this.matrix[i][j]+ otherMatrix.matrix[i][j];
          resultMatrix.insertValueAt(i,j,additionResult);
        }
      }
      return resultMatrix;
    }
    private boolean isNotSameOrder(Matrix otherMatrix){
      return !((this.rows == otherMatrix.rows) && (this.columns == otherMatrix.columns));
    }


    private boolean isMultiplicable(Matrix otherMatrix){
      return this.rows == otherMatrix.columns;
    }


    public Matrix multiply(Matrix otherMatrix){
      Matrix resultMatrix = new Matrix(this.rows,otherMatrix.columns);
      int resultOfOneRowAndColumn = 0;
      for (int i=0;i<this.rows ;i++) {
        for (int k=0;k<otherMatrix.columns;k++) {
          for (int j=0;j<this.columns ;j++) {
            int multiplyResult = this.matrix[k][j]*otherMatrix.matrix[j][k];
            // System.out.print(multiplyResult+"--->");
            resultOfOneRowAndColumn+=multiplyResult;
          }
        // System.out.print(resultOfOneRowAndColumn+"<<<<-------");
        resultMatrix.matrix[i][k] = resultOfOneRowAndColumn;
        resultOfOneRowAndColumn=0;
        }
      }
      return resultMatrix;
    }

    public boolean isSameAs(Matrix otherMatrix){
      return Arrays.deepEquals(this.matrix,otherMatrix.matrix);
    }
    public boolean isValueAt(int row,int column,int value){
      return matrix[row][column] == value;
    }

    public void insertValueAt(int row,int columns,int element){
      matrix[row][columns] = element;
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
