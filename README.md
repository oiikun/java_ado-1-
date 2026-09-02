# Baú de Itens - Resident Evil (Java)

## O que é

Aplicação em Java feita para a atividade de faculdade sobre **Array e manipulação de dados** (Aula 02 e 03). Simula o clássico "Baú de Itens" (Item Box) da série Resident Evil, onde o jogador escolhe itens de um catálogo (armas, munições, itens de cura e itens-chave) e os guarda em um baú com capacidade limitada.

## O que faz

- Exibe um **catálogo** de itens do universo Resident Evil (raridade, munição usada, se cura ou não, custo em pecetas).
- Permite **incluir** itens do catálogo no baú, informando a quantidade.
- Permite **pesquisar**, **alterar** (quantidade) e **excluir** itens já armazenados no baú.
- O baú tem capacidade fixa de **10 itens**.

## Estrutura

- `Item.java` — classe que representa um item (dados e atributos).
- `Catalogo.java` — lista fixa de itens disponíveis para pegar.
- `Vetor.java` — classe responsável por manipular o array do baú (incluir, pesquisar, alterar, excluir).
- `App.java` — classe principal, com o menu de interação com o usuário.

## Por que foi feito

Requisito da atividade era usar **array puro** (sem ArrayList) para praticar manipulação manual de vetores em Java. Escolhi o tema Resident Evil como forma de deixar a prática mais divertida de implementar e testar.
