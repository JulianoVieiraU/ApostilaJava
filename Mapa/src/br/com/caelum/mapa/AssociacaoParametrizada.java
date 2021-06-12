package br.com.caelum.mapa;

public class AssociacaoParametrizada<C, V> {
    private C chave;
    private V valor;

    public AssociacaoParametrizada(C chave, V valor){
        this.chave = chave;
        this.valor = valor;
    }

    public C getChave() {
        return this.chave;
    }

    public V getValor() {
        return this.valor;
    }

    @Override
    public String toString() {
        return "AssociacaoParametrizada{" +
                "chave=" + chave +
                ", valor=" + valor +
                '}';
    }
}
