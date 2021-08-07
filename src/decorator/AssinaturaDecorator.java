package decorator;

/**
 *
 * @author Usuario
 */
public class AssinaturaDecorator implements Assinatura{
    
    private Assinatura assinatura1;
    
    public AssinaturaDecorator(Assinatura assinatura){
        this.assinatura1 = assinatura;
    }

    @Override
    public void montar() {
        this.assinatura1.montar();
    }
    
}
