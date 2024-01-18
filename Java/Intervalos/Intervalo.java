package intervalos;

public class Intervalo {

	private double minimo;
	private double maximo;
	
	// 1.a
	public Intervalo() {
		
	}
	
	// 1.b
	public Intervalo(double minimo, double maximo) {
		this.minimo = minimo;
		this.maximo = maximo;
	}
	
	// 1.c
	public Intervalo(double maximo) {
		this.minimo = 0;
		this.maximo = maximo;
	}
	
	// 1.d
	public Intervalo(Intervalo intervalo) {
		this.minimo = intervalo.minimo;
		this.maximo = intervalo.maximo;
	}	
	
	public double getMinimo() {
		return minimo;
	}
	public void setMinimo(double minimo) {
		this.minimo = minimo;
	}
	public double getMaximo() {
		return maximo;
	}
	public void setMaximo(double maximo) {
		this.maximo = maximo;
	}
	
	public String toString() {
		return "Intervalo [minimo=" + minimo + ", maximo=" + maximo + "]";
	}

	// a
	public boolean valido() {
		return( this.minimo < this.maximo);
	}
	
	// b
	public double longitud() {
		return(this.maximo - this.minimo);
	}
	
	// c
	public double puntoMedio() {
		return( (this.minimo + this.longitud()) / 2 );
	}
	
	// d
	public void desplazar(double addition) {
		this.minimo = this.minimo + addition;
		this.maximo = this.maximo + addition;
	}
	
	// e
	public Intervalo copia(Intervalo intervalo) {
		return(new Intervalo(intervalo.minimo, intervalo.maximo));
	}
	
	// f
	public boolean iguales(Intervalo intervalo) {
		return( (intervalo.minimo == this.minimo) && (intervalo.maximo == this.maximo) );
	}
	
	// g
	public boolean incluye(double value) {
		return( (value > this.maximo) && (value < this.minimo) );
	}
	
	// h
	public boolean incluye(Intervalo intervalo) {
		return( (this.minimo < intervalo.minimo) && (this.maximo > intervalo.maximo) );
	}
	
	// i
	public Intervalo[] troceado(int cantidadDivisiones) {
		
		// Define the size of the interval + 1 since 3 splits means 4 different intervals
	    Intervalo[] intervalos = new Intervalo[cantidadDivisiones];

	    // Set the size of each interval
	    double tamanoIntervalo = (this.maximo - this.minimo) / cantidadDivisiones;

	    double divisor = 1.0;

	    for (int i = 0; i < cantidadDivisiones; i++) {
	        
	        double nuevoMinimo = this.minimo + tamanoIntervalo * (i / divisor);
	        double nuevoMaximo = nuevoMinimo + tamanoIntervalo;

	        intervalos[i] = new Intervalo(nuevoMinimo, nuevoMaximo);

	        divisor++;
	    }

	    return intervalos;
	}

	
	// j
	public void escala(double multiplier) {
		this.minimo = this.minimo * multiplier;
		this.maximo = this.maximo * multiplier;
	}
	
	// k
	public Intervalo desplazado(double addition) {
		return(new Intervalo(this.minimo + addition, this.maximo + addition));
	}
	
	// l
	public Intervalo interseccion(Intervalo intervalo) {
	    double nuevoMinimo;
	    double nuevoMaximo;

	    if (this.minimo < intervalo.minimo) {
	        nuevoMinimo = intervalo.minimo;
	    } else {
	        nuevoMinimo = this.minimo;
	    }
	    
	    if (this.maximo < intervalo.maximo) {
	        nuevoMaximo = this.maximo;
	    } else {
	        nuevoMaximo = intervalo.maximo;
	    }

	    if (nuevoMinimo <= nuevoMaximo) {
	        return new Intervalo(nuevoMinimo, nuevoMaximo);
	    } else {
	        return null;
	    }
	}

	// m
	public Intervalo simetrico(Intervalo intervalo) {
		return( new Intervalo( (intervalo.maximo * -1) , intervalo.minimo));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
