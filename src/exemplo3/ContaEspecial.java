package exemplo3;

public class ContaEspecial extends Conta {
    private double limite;
    
    public ContaEspecial(int numero, String nomeTitular, double limite) {
        // Envia os atributos para o construtor da classe mãe
        super(numero, nomeTitular);
        this.limite = limite;
    }
    
    public double getLimite() {
    if(getSaldo() < 0) {
    
        return this.limite;
    } else {
            return limite;
        }
    }
    
    @Override
    public boolean sacar(double valor) {
        if (valor <= getSaldo() + limite) {
            depositar (-valor);
            return true;
        } else {
            return false;
        }
    }
    
    public void setLimite(double limite) {
        this.limite = limite;
    }
}
