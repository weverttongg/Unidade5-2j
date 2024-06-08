
package unidade5;


public class Aluno {
     String nome;
     String curso;
     
     //o atributo no modo static, compartilha as informações com todos os objetos
    static int quantidade;
     
     public Aluno() {
     quantidade++;
     }

    @Override
    public String toString() {
        return "Nome: " + nome + " Curso: " + curso + " Quantidade: " + quantidade;
    }
     
     
}
