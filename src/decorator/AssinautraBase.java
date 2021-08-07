package decorator;

/**
 *
 * @author Usuario
 */
public class AssinautraBase implements Assinatura{

    @Override
    public void montar() {
        System.out.println("Assinatura Base assistir videos num unico dispositivo R$:9,99");
    }
    
}
