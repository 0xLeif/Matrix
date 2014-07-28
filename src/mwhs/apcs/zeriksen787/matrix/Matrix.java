package mwhs.apcs.zeriksen787.matrix;

public class Matrix implements IMatrix {

	private int[][] data;

	public Matrix(int numRows, int numCols) {
		data = new int[numRows][numCols];
	}

	// overloading 2 methods with the same name in the same class
	// only way is to have different number or different types of parameters

	// a class can implements multiple interfances
	public int getNumRows() {
		return data.length;
	}

	public int getNumCols() {
		return data[0].length;
	}

	public void set(int row, int col, int num) {
		data[row][col] = num;
	}

	public Matrix transpose() {
		Matrix temp = new Matrix(getNumCols(), getNumRows());
		for (int i = 0; i < getNumRows(); i++) {
			for (int j = 0; j < getNumCols(); j++) {
				temp.data[j][i] = data[i][j];
			}
		}
		return temp;
	}

	public Matrix multiply(int scaler) {
		Matrix temp = new Matrix(data.length, data[0].length);
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				int product = data[i][j] * scaler;
				temp.set(i, j, product);
			}
		}
		return temp;
	}

	public Matrix sum(Matrix m) throws UndefinedMatrixOperationException {
		Matrix temp = new Matrix(m.getNumRows(), m.getNumCols());
		if (data.length == m.getNumRows() && data[0].length == m.getNumCols()) {
			for (int i = 0; i < m.getNumRows(); i++) {
				for (int j = 0; j < m.getNumCols(); j++) {
					int sum = data[i][j] + m.get(i, j);
					temp.set(i, j, sum);
				}
			}
		}
		return temp;
	}

	public Matrix multiply(Matrix m) throws UndefinedMatrixOperationException {
		if (getNumCols() == m.getNumRows()) {
			Matrix temp = new Matrix(getNumRows(), m.getNumCols());
			for (int i = 0; i < temp.getNumRows(); i++) {
				for (int j = 0; j < temp.getNumCols(); j++) {
					for (int k = 0; k < getNumCols(); k++) {
						temp.data[i][j] += (data[i][k] * m.data[k][j]);
					}
				}
			}
			return temp;
		} else {
			throw new UndefinedMatrixOperationException(
					"Unable to multiply with current dimentions.");
		}
	}

	public int determinant() throws UndefinedMatrixOperationException{
		int sum = 0;
		int sign = 1;
		
		if(getNumRows() != getNumCols()){
			throw new UndefinedMatrixOperationException("Cannot calculate the determinant of a non-square matrix.");
		//Basecase
		}else if(getNumCols() == 1){
			sum = get(0,0);
		}else{
			for(int i = 0; i < getNumCols(); i++){
				Matrix temp = new Matrix(getNumRows()-1,getNumCols()-1);
				int rows = 0;
				int cols = 0;
				for(int w = 1; w < getNumCols(); w++){
					for(int r = 0; r <getNumCols(); r++){
						if(r !=i){
							temp.set(rows,cols,get(w,r));
							cols++;
							if(cols == getNumCols()-1){
								rows++;
								cols = 0;
							}
						}
					}
				}
				int determinat = get(0,i) * temp.determinant();
				sum += (sign * determinat);
				sign *=-1;
			}
		}
		//System.out.println(sum);
		return sum;
	}

	public String toString() {
		String summary = "";
		for (int i = 0; i < getNumRows(); i++) {
			for (int j = 0; j < getNumCols(); j++)
				summary += data[i][j] + " ";
			summary += "\n";
		}
		return summary;
	}

	public int get(int row, int col) {
		return data[row][col];
	}
}