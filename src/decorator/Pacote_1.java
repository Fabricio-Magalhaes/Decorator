package decorator;

/**
 *
 * @author Usuario
 */
public class Pacote_1 extends AssinaturaDecorator{

    public Pacote_1(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public void montar() {
        super.montar();
        System.out.println("Adicionar Assistir vídeos em vários dispositivos R$:19,99");
    }
    
}
