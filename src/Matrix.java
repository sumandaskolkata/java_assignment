import java.util.Arrays;



class Matrix {
    private int numerOfRow;

    private int numberOfColumn;

    private  int [][] matrix;


    public Matrix(int numerOfRow,int numberOfColumn,int[] values){
      this.numerOfRow=numerOfRow;
      this.numberOfColumn=numberOfColumn;
      this.matrix = new int[numerOfRow][numberOfColumn];
      initializeValue(values);
    }

    private void initializeValue(int[] values){
      int index = 0;
      for (int i =0;i<numerOfRow ;i++) {
        for (int j=0;j<numberOfColumn ;j++) {
          matrix[i][j]=values[index];
          index++;        
        }
      }
    }

    private boolean isNotSameOrder(Matrix otherMatrix){
      return !((this.numerOfRow == otherMatrix.numerOfRow) && (this.numberOfColumn == otherMatrix.numberOfColumn));
    }


    private boolean isMultiplicable(Matrix otherMatrix){
      return this.numerOfRow == otherMatrix.numberOfColumn;
    }

    public Matrix addMatrix(Matrix otherMatrix){
      int[] result = new int[this.numerOfRow*this.numberOfColumn];
      int index=0;
      if(isNotSameOrder(otherMatrix)){
        return new Matrix(0,0,result);
      }
      for (int i=0;i<numerOfRow;i++){
        for (int j=0;j<numberOfColumn ;j++) {
          int additionResult =  this.matrix[i][j]+ otherMatrix.matrix[i][j];
          result[index]=additionResult;
          index++;
        }
      }
      Matrix resultMatrix = new Matrix(this.numerOfRow,this.numberOfColumn,result);
      return resultMatrix;
    }

    public Matrix multiply(Matrix otherMatrix){
      int resultOfOneRowAndColumn = 0;int index=0;
      int[] result= new int[this.numerOfRow*otherMatrix.numberOfColumn];
      for (int i=0;i<this.numerOfRow ;i++) {
        for (int k=0;k<otherMatrix.numberOfColumn;k++) {
          for (int j=0;j<this.numberOfColumn ;j++) {
            int multiplyResult = this.matrix[k][j]*otherMatrix.matrix[j][k];
            resultOfOneRowAndColumn+=multiplyResult;
          }
        result[index] = resultOfOneRowAndColumn;
        index++;
        resultOfOneRowAndColumn=0;
        }
      }
      Matrix resultMatrix = new Matrix(this.numerOfRow,otherMatrix.numberOfColumn,result);
      return resultMatrix;
    }

    public boolean isSameAs(Matrix otherMatrix){
      return Arrays.deepEquals(this.matrix,otherMatrix.matrix);
    }
    public boolean isValueAt(int row,int column,int value){
      return matrix[row][column] == value;
    }

    private void insertValueAt(int row,int numberOfColumn,int element){
      matrix[row][numberOfColumn] = element;
    }

    public void print(){
      for (int i=0;i<this.numerOfRow ; i++) {
        for (int j=0;j<this.numberOfColumn ;j++) {
          System.out.println(this.matrix[i][j]);
        }
        System.out.println("\n");
      }
    }
}
