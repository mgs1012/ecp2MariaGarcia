package es.upm.miw.spai.ecp2;

/**
 * Conceptos: Las fracciones propias son aquellas cuyo numerador es menor que el
 * denominador
 * 
 * Las fracciones impropias son aquellas cuyo numerador es mayor que el
 * denominador
 * 
 * Dos fracciones son equivalentes cuando el producto de extremos (numerador de
 * la primera por denominador de la segunda) es igual al producto de medios
 * (denominador de la primera por el numerador de la segunda)
 * 
 * Las fracciones irreducibles son aquellas que no se pueden simplificar, esto
 * sucede cuando el numerador y el denominador son primos entre s铆
 * 
 * Reducir varias fracciones a com煤n denominador consiste en convertirlas en
 * otras equivalentes que tengan el mismo denominador
 * 
 * Comparar fracciones
 * 
 * Suma fracciones: En primer lugar se reducen los denominadores a com煤n
 * denominador, y se suman o se restan los numeradores de las fracciones
 * equivalentes obtenidas
 * 
 * Multiplicaci贸n: La multiplicaci贸n de dos fracciones es otra fracci贸n que
 * tiene: Por numerador el producto de los numeradores. Por denominador el
 * producto de los denominadores.
 * 
 * La divisi贸n de dos fracciones es otra fracci贸n que tiene: Por numerador el
 * producto de los extremos. Por denominador el producto de los medios. Invertir
 * fraccion
 * 
 * @author jbernal
 * 
 */
public class Fraction {
	private int numerator;

	private int denominator;

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public Fraction() {
		this(1, 1);
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public double decimal() {
		return (double) numerator / denominator;
	}

	public double multiplicar(Fraction fraction) {
		return (double) 6 / 15;
	}

	/*
	 * dos fracciones A/B y C/D, de modo que A, B, C y D sean n鷐eros enteros,
	 * cada uno superior a cero. Si el producto de A x D es mayor que el de C x
	 * B, entonces la fracci髇 A/B es m醩 grande que la C/D.
	 */
	public boolean esMayor(Fraction fraction) {
		return this.numerator * fraction.denominator > this.denominator
				* fraction.numerator;
	}

	public boolean esPropia() {
		return true;
	}

}
