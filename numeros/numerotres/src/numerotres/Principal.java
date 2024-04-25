package numerotres;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Principal {
	
	  public static void main(String[] args) {
	        BigDecimal x = new BigDecimal("10.0");
	        BigDecimal y = new BigDecimal("3.0");
	        
	      //  System.out.println(x.divide(y)); 
	     // vai dar erro porque não vai ter resultado decimal representavel, devido a não ser uma divisão exata, por isso o bigdecimal não consegue decidir como fazer essa divisaão
	        //vc precisa dizer qual vai ser a forma de arrendodamento
	        
//	        BigDecimal z = x.divide(y, 4, RoundingMode.UP);  // 3.3334  arrendonda o ultima casa decimal
//	        BigDecimal z = x.divide(y, 4, RoundingMode.DOWN); 3.3333
	        BigDecimal z = x.divide(y, 4, RoundingMode.HALF_EVEN); //3.333
	       
	        //half even fica desse jeito
	        // 2.524 = 2.52
	        // 2.526 = 2.53
	        // 2.525 = 2.53
	        // 2.425 = 2.42
	        
	        
	        System.out.println(z);

}

	  
}