public class Item {
    private String nome;
    private String raridade;
    private String tipoMunicao;
    private boolean itemDeCura;
    private int custoPecetas;
    private int quantidade;

    public Item(String nome, String raridade, String tipoMunicao, boolean itemDeCura, int custoPecetas) {
        this.nome = nome;
        this.raridade = raridade;
        this.tipoMunicao = tipoMunicao;
        this.itemDeCura = itemDeCura;
        this.custoPecetas = custoPecetas;
        this.quantidade = 1;
    }

    public String getNome() { return nome; }
    public String getRaridade() { return raridade; }
    public String getTipoMunicao() { return tipoMunicao; }
    public boolean isItemDeCura() { return itemDeCura; }
    public int getCustoPecetas() { return custoPecetas; }
    public int getQuantidade() { return quantidade; }

    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public void aumentarQuantidade(int qtd) { this.quantidade += qtd; }

    @Override
    public String toString() {
        return String.format("%-28s | Raridade: %-10s | Munição: %-20s | Cura: %-3s | Pecetas: %-5d | Qtd: %d",
                nome, raridade, tipoMunicao, (itemDeCura ? "Sim" : "Não"), custoPecetas, quantidade);
    }
}