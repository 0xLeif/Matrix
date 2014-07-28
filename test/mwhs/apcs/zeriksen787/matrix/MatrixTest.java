package mwhs.apcs.zeriksen787.matrix;

public class MatrixTest {
	public static void main(String[] args) throws UndefinedMatrixOperationException {
		/*Adding test*/
//		System.out.println("Adding test");
//		Matrix m = new Matrix(2, 2);
//		Matrix u = new Matrix(2, 2);
//		
//		m.set(0,0,1);
//		u.set(0,1,23);
//		m.set(1,0,99);
//		u.set(1,0,2);
//		
//		System.out.println("Before");
//		System.out.println(u);
//		System.out.println(m);
//		
//		m.sum(u);
//		/*Multiplication scaler test*/
//		System.out.println("Multiplication scaler test");
//		Matrix n = new Matrix(3,3);
//		
//		n.set(0,0,0);
//		n.set(1,0,1);
//		n.set(2,0,2);
//		n.set(0,1,3);
//		n.set(1,1,4);
//		n.set(2,2,8);
//		n.set(1,2,7);
//		n.set(2,1,5);
//		n.set(0,2,6);
//		System.out.println("Before");
//		System.out.println(n);
		
		
		Matrix r = new Matrix(4,4);
		
		r.set(0,0,100);
		r.set(1,0,1);
		r.set(2,0,2);
		r.set(0,1,30);
		r.set(1,1,4);
		r.set(2,2,5);
		r.set(1,2,7);
		r.set(2,1,1);
		r.set(0,2,6);
		r.set(3,0,4);
		r.set(3,3,2);
		r.set(0,3,3);
		r.set(3,1,7);
		r.set(3,2,3);
		r.set(1,3,9);
		r.set(1,3,6);
		r.set(2,3,4);
		
		System.out.println("Before");
		System.out.println(r);
		
//		n.multiply(2);
//		/*Transpose matrix test*/
//		System.out.println("Transpose matrix test");
//		Matrix e = new Matrix(2, 4);
//		
//		e.set(0,1,6);
//		e.set(1,0,2);
//		e.set(1,2,5);
//		
//		System.out.println("Before");
//		System.out.println(e);
//		
//		e.transpose();
//		/*Multiplication matrix test*/
//		System.out.println("Multiplication matrix test");
//		Matrix w = new Matrix(1, 2);
//		Matrix t = new Matrix(2, 4);
//		
//		w.set(0,0,2);
//		t.set(0,1,6);
//		w.set(0,1,3);
//		t.set(1,0,2);
//		t.set(1,3,5);
//		
//		System.out.println("Before");
//		System.out.println(w);
//		System.out.println(t);
//		
//		w.multiply(t);
//		
//		System.out.println();
//		System.out.println();
//		
//		Matrix r = new Matrix(2,2);
//		r.set(0,0,-1);
//		r.set(0,1,3);
//		r.set(1,0,5);
//		r.set(1,1,1);
		
		System.out.println("Determinat...");
		r.determinant();
	} 
}
