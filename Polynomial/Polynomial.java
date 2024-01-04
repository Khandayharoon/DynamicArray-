package ClassesAndObjects.Polynomial;

public class Polynomial {
	// Dynamic Array of Polynomial
	private int polynomial[];
	private int nextElementIndex;

	// Constructor of Polynomial 	
	public Polynomial() {
		polynomial = new int[6];
		nextElementIndex = 0;
	}

	// Return the Size of Polynomial Array 
	public int size() {
		return polynomial.length;
	}

	//Check is there any Coffecient in Polynomial 
	public boolean isEmpty() {
		return nextElementIndex == 0;
	}

	
	// Print the Coffienct with Degree "Remmmber Here Degree is the index of Polynomial Array"
	public void print() {
		for (int i = 0; i < this.polynomial.length; i++) {
			if (polynomial[i] == 0) {
				continue;
			}
			System.out.print(polynomial[i] + "X" + "^" + i + ", ");
		}
		System.out.println();
	}

	// Setting the Coffeciet at the index (which is also a Degree )
	public void setCoffecient(int degree, int coffecient) {
		if (degree >= polynomial.length) {
			doubleCapcity();
		}
		polynomial[degree] = coffecient;
		nextElementIndex++;
	}

	// Increasing the capcity if the Degree is greater then current Index
	private void doubleCapcity() {
		int temp[] = polynomial;
		polynomial = new int[2 * temp.length];
		for (int i = 0; i < temp.length; i++) {
			polynomial[i] = temp[i];
		}
	}

	// here adding two objects and  Storing that in the first Object
	public void add(Polynomial pol2) {
		int maxDegree = Math.max(this.polynomial.length, pol2.polynomial.length);

		for (int i = 0; i < maxDegree; i++) {

			int thisCoffecient = (i < this.polynomial.length) ? this.polynomial[i] : 0;
			int pol2Coffecient = (i < pol2.polynomial.length) ? pol2.polynomial[i] : 0;

			this.polynomial[i] = thisCoffecient + pol2Coffecient;
		}
	}
	
	//Here you goal is add two object of polynomial and Store them into new Object pol3

}
