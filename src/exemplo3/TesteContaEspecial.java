package exemplo3;

public class TesteContaEspecial {
    public static void main(String[] args) {
        ContaEspecial ce = new ContaEspecial(123, "Marcelo", 500);
        System.out.println(ce);
        System.out.println("Limite: R$ " + ce.getLimite());
    }
}
