package Assignment;

public class MatrixMain {
	public static void main(String args[])
			{
		
		Matrix m=new Matrix(2,2);
		m.readValues();
		m.display();
		Matrix obj2 = new Matrix(m);
		Matrix obj3 = m.add(obj2);
		obj3.display();
			}

}
