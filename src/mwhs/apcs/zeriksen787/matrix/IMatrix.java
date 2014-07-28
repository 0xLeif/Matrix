package mwhs.apcs.zeriksen787.matrix;

public interface IMatrix {
	/**
	 * generates a string of the matrix in table form
	 * @return String of the matrix
	 */
	public String toString();
	
	public int get(int row, int col);
	
	/**
	 * @return number of rows
	 */
	public int getNumRows();
	
	/**
	 * @return number of columns
	 */
	public int getNumCols();
	
	/**
	 * Store a new number into the matrix, overwriting the previous value, the method will preform no action if the x,y is invaild
	 * @param row row of insertion point
	 * @param col column of insertion point
	 * @param num new number to store
	 */
	public void set(int row, int col, int num);
	
	/**
	 * create a new matrix that is that transposition of 
	 * this matrix
	 * @return new, transposed matrix
	 */
	public Matrix transpose();
	
	/**
	 * creates a new matrix that represents this matrix
	 * multiplied by the given scaler
	 * @param scaler Scaler by which to multiply matrix
	 * @return New matrix that was multiplied by the scaler
	 */
	public Matrix multiply(int scaler);
	
	/**
	 * creates a new matrix of the same demetions as this matrix
	 * @param m new matrix
	 * @return sum matrix
	 * @throws UndefinedMatrixOperationException custom exception if one matrix is not a square
	 * matrix or when the sum is undefined
	 */
	public Matrix sum(Matrix m) throws UndefinedMatrixOperationException;
	
	/**
	 * multiplys the current matrix with matrix m in that order
	 * [this] * [m]
	 * @param m matrix that will be multiplied with this matrix
	 * @return new matrix 
	 * @throws UndefinedMatrixOperationException when muliplication
	 * is undefined for [this] * [m]
	 */
	public Matrix multiply(Matrix m) throws UndefinedMatrixOperationException;
	
	/**
	 * calculates the derterminant of the matrix if it is square
	 * @return teh dereminant
	 * @throws UndefinedMatrixOperationException when the determinant is undefined
	 * (not square)
	 */
	public int determinant() throws UndefinedMatrixOperationException;
}
