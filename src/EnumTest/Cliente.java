package EnumTest;

public class Cliente {
    private String name;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;
    private double desconto;

    public Cliente(String name, TipoCliente tipoCliente, TipoPagamento tipoPagamento, double value) {
        this.name = name;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
        this.desconto = tipoPagamento.calcularDesconto(value);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", tipoCliente=" + tipoCliente.getNAME() +
                ", tipoPagamento=" + tipoPagamento +
                ", desconto=" + desconto +
                '}';
    }
}
