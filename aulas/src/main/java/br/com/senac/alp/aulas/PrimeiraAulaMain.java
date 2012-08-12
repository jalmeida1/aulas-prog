package br.com.senac.alp.aulas;
import br.com.senac.alp.aulas.PrimeiraAula;


public class PrimeiraAulaMain {
	
	double[] valores;		
	double esperado ;
	double resultado;
	int comparacao ;
	
	public PrimeiraAulaMain() {
		this.valores = null;		
		this.esperado = 0.0;
		this.resultado = 0.0;
		this.comparacao = 0;
	}
	
	public void setValores(int i) {
		
		this.valores = new double[i];
	}
    
	
	public void setEsperado(double esperado) {
		this.esperado = esperado;
	}
	
	public double getEsperado() {
		return this.esperado;
	}
	
	public void setResultado(double[] resultado) {
	
		PrimeiraAula p1 = new PrimeiraAula();
		this.resultado = p1.somaTotal(resultado);
	}
	
	public double getResultado() {
		return this.resultado;
	}
	
	public void Comparacao() {
		
		comparacao = Double.compare(resultado, esperado);
		
		if (comparacao == 0) {
			System.out.println("Test aprovado");
			
		} else {
			System.out.println("Test Não aprovado");
			System.out.println("Valor Esperado : " + this.getEsperado());
			System.out.println("Resultado : " + this.getResultado());
		}
	}
	
   public static void main(String args[]) {
	   
	PrimeiraAulaMain pa ;
	System.out.println("Iniciando testes ") ;
	
	// test 1
	
	System.out.println("test Soma Resultado Argumento Nulo");
	pa = new PrimeiraAulaMain();
	pa.setEsperado(Double.NaN);
	pa.setResultado(pa.valores);  
	pa.Comparacao();
   
   
   // test 2 
	

	System.out.println("test Soma Resultado Argumento Vazio");
	pa = new PrimeiraAulaMain();
	pa.setValores(1);
	pa.valores[0] = Math.random();
	pa.setEsperado(pa.valores[0]);
	pa.setResultado(pa.valores);  
	pa.Comparacao();
   
	
	// test 3
	
	System.out.println("test Soma Resultado Argumento Array Unitario");
	pa = new PrimeiraAulaMain();
	pa.setValores(1);
	pa.valores[0] = Math.random();
	pa.setEsperado(pa.valores[0]);
	pa.setResultado(pa.valores);  
	pa.Comparacao();
   
	
	
	// test 4
	
		System.out.println("test Soma Resultado Argumento Array");
		pa = new PrimeiraAulaMain();
		pa.setValores(10);
		double somaEsperado = 0.0;
		for (int i = 0; i < pa.valores.length; i++) {
			double val = Math.random();
			pa.valores[i] = val;
			somaEsperado += val;
		}
	    pa.setEsperado(somaEsperado + 1);
		pa.setResultado(pa.valores);  
		pa.Comparacao();
   }   
   
   
}
