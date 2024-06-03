package ex_03_08.ex_03;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Beethoven", "São Bernardo");

        if (cachorro instanceof Cachorro) {
            Animal animalCachorro = (Animal) cachorro;
        }
    }
}
