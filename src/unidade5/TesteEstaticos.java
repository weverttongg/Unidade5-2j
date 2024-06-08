
package unidade5;

public class TesteEstaticos {
    public static void main(String[] args) {
        
         Aluno a = new Aluno();
         a.nome = "Sara";
         Aluno b = new Aluno();
         b.nome = "Jose";
         
         System.out.print("Quantidade: ");
         System.out.println(Aluno.quantidade);
         System.out.println("----------------");
         
         for ( int i = 0; i < 6; i++) {
             
             //metodo Statico Match
    long numero = Math.round(Math.random() * 60);
    System.out.print(" | " + numero);
    }
         System.out.println(" | ");
    }
   
}
