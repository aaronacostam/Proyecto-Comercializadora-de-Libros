package Comercializadora;

public class Main {
	 public static void main(String[] args) {
	        
	        Libros lbr1 = new Libros("THOR", 28);
		Libros lbr2 = new Libros("MOON", 24);
			
			CD CD1 = new CD("ONE", 15);
			CD CD2 = new CD("PUBLIC", 20);
	                
			System.out.println("SE DEBE CANCELAR POR EL LIBRO THOR :" + lbr1.getValor1() +  "$");
			System.out.println("EL LIBRO MOON CUESTA : " + lbr2.getValor1() +  "$"); 
			
			System.out.println("                                                 ");
			
			System.out.println("VALOR DEL CD DE  ES ONE ES: " + CD1.getValorcd1() +  "$");
	              
			System.out.println("VALOR DEL CD DE PUBLIC ES : "  + CD2.getValorcd1() +  "$");
		}

}
