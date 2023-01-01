package ModificadoresEstaticos;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Honda Civic", 200);
        Carro c3 = new Carro("Gol", 150);

        //Ao setar um novo valor para um modificador estático, esse valor passará para todos os objetos da classe.
       Carro.setVelLim(300);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

    }
}
