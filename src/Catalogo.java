public class Catalogo {
    private Item[] itens;

    public Catalogo() {
        itens = new Item[]{
            // as ervas coloquei aqui:
            new Item("Erva Verde", "Comum", "Nenhuma", true, 200),
            new Item("Erva Vermelha", "Comum", "Nenhuma", false, 150),
            new Item("Erva Mista (Verde+Vermelha)", "Incomum", "Nenhuma", true, 350),
            new Item("Erva Mista (Verde+Verde+Vermelha)", "Raro", "Nenhuma", true, 500),
            new Item("Spray de Primeiros Socorros", "Raro", "Nenhuma", true, 1000),

            // balas aqui:
            new Item("Municao de Pistola", "Comum", "Pistola", false, 100),
            new Item("Municao de Shotgun", "Incomum", "Shotgun", false, 250),
            new Item("Municao Magnum", "Raro", "Magnum", false, 800),
            new Item("Granada de Fragmentacao", "Raro", "Lancador de Granadas", false, 600),
            new Item("Municao Perfurante", "Incomum", "Rifle", false, 300),

            // as armas fica aqui:
            new Item("Red9", "Raro", "Pistola", false, 15000),
            new Item("Blacktail", "Incomum", "Pistola", false, 8000),
            new Item("Shotgun W-870", "Raro", "Shotgun", false, 20000),
            new Item("Striker", "Muito Raro", "Shotgun", false, 30000),
            new Item("S&W M29 (Magnum)", "Muito Raro", "Magnum", false, 40000),
            new Item("Rifle de Precisao", "Raro", "Rifle", false, 25000),
            new Item("Lanca-Granadas", "Muito Raro", "Lancador de Granadas", false, 35000),
            new Item("Faca de Combate", "Comum", "Nenhuma", false, 3000),

            // as chavitas aqui:
            new Item("Chave Dourada", "Muito Raro", "Nenhuma", false, 0),
            new Item("Pedra Vermelha (Filosofal)", "Lendario", "Nenhuma", false, 5000)
        };
    }

    public void listar() {
        System.out.println("===== CATALOGO DE ITENS =====");
        for (int i = 0; i < itens.length; i++) {
            System.out.println((i + 1) + ". " + itens[i]);
        }
    }

    public Item buscarPorNome(String nome) {
        for (Item item : itens) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                return new Item(item.getNome(), item.getRaridade(), item.getTipoMunicao(),
                        item.isItemDeCura(), item.getCustoPecetas());
            }
        }
        return null;
    }
}