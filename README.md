# Price Tags - Exercício de Herança e Polimorfismo em Java

## Descrição
Aplicação Java que simula uma lista de produtos, podendo ser:
- **Comuns**
- **Usados** (com data de fabricação)
- **Importados** (com taxa de importação)

Cada produto possui um método `priceTag()` que exibe as informações de forma personalizada, aproveitando os conceitos de **herança** e **polimorfismo**.

## Funcionalidades
- Entrada de dados via console:
  - Tipo do produto (comum, usado, importado)
  - Nome
  - Preço
  - Data de fabricação (se usado)
  - Taxa de importação (se importado)
- Exibição da lista de produtos com `priceTag()` sobrescrito em cada classe.

## Tecnologias
- Java
- Programação orientada a objetos
- API `java.time` para manipulação de datas

## Estrutura
- `Product` (classe base)
- `UsedProduct` (subclasse com `LocalDate`)
- `ImportedProduct` (subclasse com taxa adicional)
- `Program` (classe principal com lógica de entrada e saída

*Exercício baseado no curso do professor Nelio Alves.
