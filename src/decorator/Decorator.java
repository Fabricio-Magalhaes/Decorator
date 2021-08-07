package decorator;

/**
 *
 * @author Usuario
 */
public class Decorator {

    public static void main(String[] args) {
       // Assinatura assinatura1 = new Pacote_1(new AssinautraBase());
        //assinatura1.montar();
        
        //Assinatura assinaturaBasica = new AssinautraBase();
        //assinaturaBasica.montar();
        
        Assinatura assinatura2 = new Pacote_2(new Pacote_3(new AssinautraBase()));
        assinatura2.montar();
    }
    
}
