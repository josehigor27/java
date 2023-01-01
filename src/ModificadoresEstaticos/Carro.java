package ModificadoresEstaticos;

public class Carro {
    private String name;
    private double velMax;
    //Modificador estático fixa o parametro para todos os objetos instanciados desta classe. O valor estático passar um valor da classe e não do objeto.
    private static double velLim = 250;

    /*
    * Ordem de execução:
    * 0 - Bloco de inicialização estático é executado quando a JVM carregar a classe.
    * 1 - Alocado espaço em memória para o objeto
    * 2 - Cada atributo de classe é criado e inicializado com valores defaults ou valores informados.
    * 3 - Bloco de inicialização é executado
    * 4 - Construtor é executado
    * */


    static {
        System.out.println("Teste: Dentro do bloco de inicialização estático");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }

    public Carro(String name, double velMax) {
        this.name = name;
        this.velMax = velMax;
    }
    public Carro(){

    }
    public double getVelMax() {
        return velMax;
    }

    public void setVelMax(double velMax) {
        this.velMax = velMax;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // no metodo setter estático, em vez de usar o this para fazer a referencia, se usa a classe
    public static void setVelLim(double velLim){
        Carro.velLim = velLim;
    }

    public static double getVelLim() {
        return Carro.velLim;
    }

    @Override
    public String toString() {
        return "Nome do carro: " + this.name + "| Velocidade Máxima: " + this.velMax + "| Velocidade Limite: " + velLim;
    }
}
