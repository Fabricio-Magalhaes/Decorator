package decorator;

/**
 *
 * @author Usuario
 */
public class Pacote_4 extends AssinaturaDecorator{

    public Pacote_4(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public void montar() {
        super.montar();
        System.out.println("Adicionando Cartão de crédito Platinum R$:49,99");
    }
    
}
