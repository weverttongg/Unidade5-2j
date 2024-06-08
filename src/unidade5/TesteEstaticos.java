
package unidade5;

//e uma classe que recebe ou mostra valor na tela
import javax.swing.JOptionPane;


public class TesteEstaticos {
    public static void main(String[] args) {
        
        
        
        Aluno a = new Aluno();
         a.nome = "Sara";
         
        //coletando informaçoes com JoptionPane
        a.nome = JOptionPane.showInputDialog("Digite o nome do aluno A:");
  
         Aluno b = new Aluno();
          b.nome = "Jose";
          
         //coletando informaçoes com JoptionPane
        b.nome = JOptionPane.showInputDialog("Digite o nome do aluno B:");
        
        //mostrando informações tipo "System.out" mas com JoptinPane
         JOptionPane.showMessageDialog(null, "A: " + a.nome + "\nB: " + b.nome);
        
         
         //mostrando usando o System.Out
           System.out.print("Quantidade: ");
         System.out.println(Aluno.quantidade);
         System.out.println("----------------");
         
         for ( int i = 0; i < 6; i++) {
             
             //metodo Statico Match
    long numero = Math.round(Math.random() * 60);
    System.out.print(" | " + numero);
    }
         System.out.println(" | ");
         
         
        //OBS: POREM O "JoptionPane" so lê valor em String por isso devemos
        //converte-lo usando o ex abaixo
        
        //Convertendo de string para Double
        double salario = Double.parseDouble(
         JOptionPane.showInputDialog("Digite o Salario:"));
  
        double salarioLiquido = salario - ( salario * 11 / 100 );
        
        JOptionPane.showMessageDialog(null, 
        "Salario Bruto: R$ " + salario + "\n" +
        "Salario Liquido: R$" + salarioLiquido);
        
        
        
        //Convertendo de String para Int
        int anoNascimento = Integer.parseInt(
        JOptionPane.showInputDialog("Digite o ano de nascimento"));
        
        int idade = 2024 - anoNascimento;
        JOptionPane.showMessageDialog(null,
                "Voce nasceu em " + anoNascimento + " e por isso tem " +
                        idade + " anos");
        
        
      
       
    }
   
}
