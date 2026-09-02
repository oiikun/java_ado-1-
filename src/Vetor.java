public class Vetor {
    private Item[] itens;
    private int contador;
    private final int CAPACIDADE = 10;

    public Vetor() {
        itens = new Item[CAPACIDADE];
        contador = 0;
    }

    public boolean estaCheio() {
        return contador == CAPACIDADE;
    }

    public boolean estaVazio() {
        return contador == 0;
    }

    // 
    public boolean incluir(Item novoItem) {
        int indice = buscarIndice(novoItem.getNome());
        if (indice != -1) {
            itens[indice].aumentarQuantidade(novoItem.getQuantidade());
            System.out.println("Item ja existia no bau. Quantidade atualizada para " + itens[indice].getQuantidade() + ".");
            return true;
        }

        if (estaCheio()) {
            System.out.println("O bau esta cheio! (capacidade maxima: " + CAPACIDADE + " itens)");
            return false;
        }

        itens[contador] = novoItem;
        contador++;
        System.out.println("Item adicionado ao bau com sucesso!");
        return true;
    }

    // para pesquisar os itenss
    public Item pesquisar(String nome) {
        int indice = buscarIndice(nome);
        if (indice == -1) {
            return null;
        }
        return itens[indice];
    }

    
    private int buscarIndice(String nome) {
        for (int i = 0; i < contador; i++) {
            if (itens[i].getNome().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return -1;
    }

    // o aletara 
    public boolean alterar(String nome, int novaQuantidade) {
        int indice = buscarIndice(nome);
        if (indice == -1) {
            System.out.println("Item nao encontrado no bau.");
            return false;
        }
        if (novaQuantidade <= 0) {
            System.out.println("Quantidade invalida. Use excluir() para remover o item.");
            return false;
        }
        itens[indice].setQuantidade(novaQuantidade);
        System.out.println("Quantidade atualizada com sucesso!");
        return true;
    }

    // aqui o excluir 
    public boolean excluir(String nome) {
        int indice = buscarIndice(nome);
        if (indice == -1) {
            System.out.println("Item nao encontrado no bau.");
            return false;
        }

        for (int i = indice; i < contador - 1; i++) {
            itens[i] = itens[i + 1];
        }
        itens[contador - 1] = null;
        contador--;
        System.out.println("Item removido do bau com sucesso!");
        return true;
    }

    public void listar() {
        if (estaVazio()) {
            System.out.println("O bau esta vazio.");
            return;
        }
        System.out.println("===== BAU DE ITENS (" + contador + "/" + CAPACIDADE + ") =====");
        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + ". " + itens[i]);
        }
    }
}