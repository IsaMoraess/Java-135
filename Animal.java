package atvd36;

public class Animal {
    private String nome;

    // CONSTRUTOR
    public Animal(String nome) {
        this.nome = nome; //THIS. NOME E O NOME DA LINHA 4 NO ARQUIVO ANIMAL
    }

// ARQUIVO Q FALA FUNÇÕES DE ANIMAIS
    public void comer(){
        System.out.println(nome + " comeu ");
    }

    public void beber(){
        System.out.println(nome + " bebeu ");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
