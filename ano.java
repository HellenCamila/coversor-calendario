import java.util.Scanner;

class Calendario{
	
    public static void main (String args []){
   
		Scanner teclado = new Scanner(System.in);
	  
	   int ano;
	   int calendario;
	   
		System.out.println("que ano que vc deseja inserir?");
	   ano = teclado.nextInt();
		 
		 
	   System.out.println("digite 1- para converter em calendarioJudeu\n");
	   
	   System.out.println("digite 2 - para converter em calendarioIslamico\n");
		
			 calendario = teclado.nextInt();
		 
    switch (calendario) {
      case 1:
      System.out.printf("o calendarioJudeu é: %d", ano + 3760);
      break;

      case 2:
      System.out.printf("o calendarioIslamico é: %d", ano - 579 );
      break;
	  
	 default:
      System.out.printf("coloque uma opção que seja válida, pfvr ");
    }
      
    System.exit(0);
		
 
  }
}