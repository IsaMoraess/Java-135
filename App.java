package atvd36;

public class App {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Pandora");
        // FUNÇÃO DO ANIMAL
        cachorro.comer(); 
        cachorro.beber();
        //FUNÇÃO DO CACHORRO
        cachorro.latir();
        cachorro.lamber();
        System.out.println("----------------------------------------");

        Gato gato = new Gato("Estelar");
        // FUNÇÃO DO ANIMAL
        gato.comer(); 
        gato.beber();
        //FUNÇÃO DO GATO
        gato.miar();
    }
}
