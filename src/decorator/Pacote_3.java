package decorator;

/**
 *
 * @author Usuario
 */
public class Pacote_3 extends AssinaturaDecorator{

    public Pacote_3(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public void montar() {
        super.montar();
        System.out.println("Adicionando Caixa surpresa com produtos relacionados a filmes e séries R$:29,99");
    }
    
}
