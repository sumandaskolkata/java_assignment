
import static org.junit.Assert.assertTrue;
import org.junit.Test;



public class MatrixTest {
  @Test
  public void createMatrixAndAssertTwoMatrix(){
    int [] data = {1,2,3,5,8,2,4,6,5};
    Matrix a = new Matrix(2,4,data);
    Matrix b = new Matrix(2,4,data);
    assertTrue(a.isSameAs(b));
  }
  @Test
  public void insertValueAtSpecificPosition(){
    int[] values = {3,2,23,4};
    Matrix a = new Matrix(2,2,values);
    assertTrue(a.isValueAt(0,0,3));
    assertTrue(a.isValueAt(1,0,23));
    assertTrue(a.isValueAt(1,1,4));
  }
  @Test
  public void addTwoMatrixAndAssertResult(){
    int[] data = {5,5,5,5,5,5,5,5};
  	Matrix a = new Matrix(2,4,data);
    Matrix b = new Matrix(2,4,data);
    Matrix resultMatrix = a.addMatrix(b);
    int[] resultValues = {10,10,10,10,10,10,10,10};
    Matrix expected = new Matrix(2,4,resultValues);
    assertTrue(expected.isSameAs(resultMatrix));
  }
  @Test
  public void returnEmptyMatrixWhenMatrixAreNotInSameOrder(){
    int[] dataOfA = {5,5,5,5};
  	Matrix a = new Matrix(2,2,dataOfA);

    int[] dataOfB = {5,5,5,5,5,5,5,5};
    Matrix b = new Matrix(2,4,dataOfB);

    Matrix resultMatrix = a.addMatrix(b);

    int[] resultValues = {};
    Matrix expected = new Matrix(0,0,resultValues);
    assertTrue(expected.isSameAs(resultMatrix));
  }

  @Test 
  public void multiplicationOfTwoMatrix3X2(){
    int[] dataOfA={3,3,3,3,3,3};
  	Matrix a = new Matrix(2,3,dataOfA);
    int[] dataOfB={4,4,4,4,4,4};
  	Matrix b = new Matrix(3,2,dataOfB);
    int[] dataOfC={36,36,36,36};
    Matrix c = new Matrix(2,2,dataOfC);
  	Matrix resultMatrix = a.multiply(b);
    assertTrue(resultMatrix.isSameAs(c));  	
  }
  @Test 
  public void multiplicationOfTwoMatrix2X4(){
    int[] data={2,2,2,2,2,2,2,2};
  	Matrix a = new Matrix(2,4,data);
  	Matrix b = new Matrix(4,2,data);
  	Matrix resultMatrix = a.multiply(b);
    int[] dataOfC = {16,16,16,16};
    Matrix c = new Matrix(2,2,dataOfC);
    assertTrue(resultMatrix.isSameAs(c));
  }
}
