package atvd36;
// Gato -> SUBCLASSE
//Animal -> SUPERCLASSE (classe = mãe, pai)

// ARQUIVO Q FALA FUNÇOES SO DE GATO
public class Gato extends Animal {
    // CONSTRUTOR
    public Gato(String nome){
        super(nome);
    }


    public void miar(){
        System.out.println(getNome() + " miou ");
    }
}
