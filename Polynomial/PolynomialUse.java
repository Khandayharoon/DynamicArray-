package ClassesAndObjects.Polynomial;

public class PolynomialUse {

	public static void main(String[] args) {

		Polynomial pol = new Polynomial();
		Polynomial pol2 = new Polynomial();
		pol.setCoffecient(3, 45);
		pol.setCoffecient(8, 99);
		pol2.setCoffecient(3, 12);
		pol2.setCoffecient(8, 4);

		System.out.println(pol.size());
		System.out.println(pol.isEmpty());
		
		System.out.println("Polynomial First");
		pol.print();
		
		System.out.println("Polynomial Second");
		pol2.print();
		
		
		System.out.println("Polynomials after addition");
		pol.add(pol2);
		pol.print();
	}

}
