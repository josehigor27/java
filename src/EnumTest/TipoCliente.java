package EnumTest;

public enum TipoCliente {
    PESSOA_JURIDICA(1,"Pessoa Juridica"),
    PESSOA_FISICA(2, "Pessoa Fisica");

    public final int VALUE;
    public final String NAME;

    TipoCliente(int value, String name){
        this.VALUE = value;
        this.NAME = name;
    }

    public int getVALUE() {
        return VALUE;
    }

    public String getNAME() {
        return NAME;
    }
}
