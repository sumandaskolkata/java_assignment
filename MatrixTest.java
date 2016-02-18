
import org.junit.Assert.*;
import org.junit.Test;



public class MatrixTest {
  @Test
  public void createArray(){
    Matrix a = new Matrix(2,4);
    a.fillMatrix(5);
    Matrix b = new Matrix(2,4);
    b.fillMatrix(5);
    org.junit.Assert.assertArrayEquals(a.getMatrix(),b.getMatrix());
  }
  @Test
  public void addMatrix(){
  	Matrix a = new Matrix(2,4);
    a.fillMatrix(5);
    Matrix b = new Matrix(2,4);
    b.fillMatrix(5);
    Matrix resultMatrix = a.addMatrix(b);
    Matrix expected = new Matrix(2,4);
    expected.fillMatrix(10);
    org.junit.Assert.assertArrayEquals(expected.getMatrix(),resultMatrix.getMatrix());
  }
}
