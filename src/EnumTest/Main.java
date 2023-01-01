package EnumTest;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Tereza",TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO,100);
        Cliente c2 = new Cliente("Carrefour",TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO,100);


        System.out.println(c1.toString());
        System.out.println(c2.toString());



    }
}
