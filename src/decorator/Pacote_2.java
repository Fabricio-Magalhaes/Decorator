package decorator;

/**
 *
 * @author Usuario
 */
public class Pacote_2 extends AssinaturaDecorator{

    public Pacote_2(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public void montar() {
        super.montar();
        System.out.println("Adicionando Frete Grátis em produtos R$:9,99");
    }
    
}
