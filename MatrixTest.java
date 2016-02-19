
import org.junit.Assert.*;
import org.junit.Test;



public class MatrixTest {
  @Test
  public void createMatrixAndAssertTwoMatrix(){
    Matrix a = new Matrix(2,4);
    a.fillMatrix(5);
    Matrix b = new Matrix(2,4);
    b.fillMatrix(5);
    org.junit.Assert.assertTrue(a.isSameAs(b));
  }
  @Test
  public void insertValueAtSpecificPosition(){
    Matrix a = new Matrix(2,2);
    a.insertValueAt(0,0,3);
    a.insertValueAt(1,1,23);

    org.junit.Assert.assertTrue(a.isValueAt(0,0,3));
    org.junit.Assert.assertTrue(a.isValueAt(1,1,23));
  }
  @Test
  public void addTwoMatrixAndAssertResult(){
  	Matrix a = new Matrix(2,4);
    a.fillMatrix(5);
    Matrix b = new Matrix(2,4);
    b.fillMatrix(5);
    Matrix resultMatrix = a.addMatrix(b);
    Matrix expected = new Matrix(2,4);
    expected.fillMatrix(10);
    org.junit.Assert.assertTrue(expected.isSameAs(resultMatrix));
  }
  @Test
  public void returnEmptyMatrixThenAdditionIsNotPossible(){
  	Matrix a = new Matrix(2,2);
    a.fillMatrix(5);
    Matrix b = new Matrix(2,4);
    b.fillMatrix(5);
    Matrix resultMatrix = a.addMatrix(b);
    Matrix expected = new Matrix(0,0);
    org.junit.Assert.assertTrue(expected.isSameAs(resultMatrix));
  }

  @Test 
  public void multiplicationOfTwoMatrix3X2(){
  	Matrix a = new Matrix(2,3);
  	Matrix b = new Matrix(3,2);
  	a.fillMatrix(3);
  	b.fillMatrix(4);
  	Matrix result = a.multiply(b);
  	// result.print();

  }
  @Test 
  public void multiplicationOfTwoMatrix2X4(){
  	Matrix a = new Matrix(2,4);
  	Matrix b = new Matrix(4,2);
  	a.fillMatrix(3);
  	b.fillMatrix(4);
  	Matrix result = a.multiply(b);
  	result.print();

  }
}
