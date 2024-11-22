package atvd36;
// Gato -> SUBCLASSE
//Animal -> SUPERCLASSE (classe = mãe, pai)

// ARQUIVO Q FALA FUNÇOES SO  CACHORRO
public class Cachorro extends Animal {
    // CONSTRUTOR
    public Cachorro(String nome){
        super(nome);
    }

    public void latir(){
        System.out.println(getNome() + " latiu ");
    }

    public void lamber(){
        System.out.println(getNome() + " lambeu ");
    }
}
