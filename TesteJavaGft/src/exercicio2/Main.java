package exercicio2;

public class Main {
    public static void main(String[] args) {
        SerVivo veg = new Vegetal();
        veg.getRespira();
        System.out.println(veg.getRespira());
        SerVivo ani = new Animal();
        ani.getRespira();
        System.out.println(ani.getRespira());
    }
}
