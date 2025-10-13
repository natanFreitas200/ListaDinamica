#  Lista Dinâmica (Dynamic Linked List)

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![License](https://img.shields.io/badge/license-MIT-blue.svg?style=for-the-badge)](LICENSE)

Uma implementação completa de **Lista Encadeada Dinâmica** em Java, com suporte a operações genéricas e uma versão ordenada automática.

## 📝 Descrição

Este projeto implementa estruturas de dados de lista encadeada (linked list) do zero, sem utilizar as coleções nativas do Java. Inclui duas implementações principais:

- **DinamicList<T>**: Lista encadeada genérica com operações completas
- **DinamicListOrder<T>**: Lista encadeada que mantém os elementos automaticamente ordenados

## 🚀 Funcionalidades

### DinamicList<T>

- ✅ Adicionar elementos no final (`add`)
- ✅ Adicionar em posição específica (`add(pos, element)`)
- ✅ Adicionar no início (`addFirst`)
- ✅ Adicionar no final (`addLast`)
- ✅ Remover por posição (`remove`)
- ✅ Remover primeiro elemento (`removeFirst`)
- ✅ Remover último elemento (`removeLast`)
- ✅ Obter elemento por índice (`get`)
- ✅ Modificar elemento (`set`)
- ✅ Verificar se contém elemento (`contains`)
- ✅ Buscar índice de elemento (`indexOf`)
- ✅ Obter tamanho da lista (`size`)
- ✅ Limpar lista (`clear`)
- ✅ Conversão para String (`toString`)

### DinamicListOrder<T>

- ✅ Inserção automática ordenada
- ✅ Suporte a elementos `Comparable`
- ✅ Todas as operações de leitura da `DinamicList`

## 🏗️ Estrutura do Projeto

```
ListaDinamica/
├── src/
│   ├── DinamicList.java        # Implementação da lista dinâmica
│   ├── DinamicListOrder.java   # Implementação da lista ordenada
│   ├── No.java                 # Classe nó (Node)
│   └── Main.java               # Exemplo de uso
├── README.md
└── ListaDinamica.iml
```

## 💻 Como Usar

### Exemplo Básico

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar uma lista dinâmica de inteiros
        DinamicList<Integer> list = new DinamicList<>();
        
        // Adicionar elementos
        list.add(5);
        list.add(9);
        list.add(65);
        list.add(12);
        list.add(23);
        
        // Exibir lista
        System.out.println(list); // Output: 5 9 65 12 23
        
        // Modificar elementos
        list.set(0, 40);
        list.set(4, 50);
        
        System.out.println(list); // Output: 40 9 65 12 50
    }
}
```

### Exemplo com Lista Ordenada

```java
DinamicListOrder<Integer> orderedList = new DinamicListOrder<>();

orderedList.add(50);
orderedList.add(10);
orderedList.add(30);
orderedList.add(20);

System.out.println(orderedList); // Output: 10 20 30 50 (automaticamente ordenado)
```

### Outras Operações

```java
DinamicList<String> list = new DinamicList<>();

// Adicionar no início e no final
list.addFirst("Primeiro");
list.addLast("Último");

// Inserir em posição específica
list.add(1, "Meio");

// Verificar existência
if (list.contains("Meio")) {
    System.out.println("Elemento encontrado!");
}

// Buscar índice
int index = list.indexOf("Último");
System.out.println("Índice: " + index);

// Obter tamanho
System.out.println("Tamanho: " + list.size());

// Remover elementos
list.removeFirst();
list.removeLast();
list.remove(0);

// Limpar lista
list.clear();
```

## 🔧 Compilação e Execução

### Compilar

```bash
javac src/*.java
```

### Executar

```bash
java -cp src Main
```

## 📊 Complexidade das Operações

| Operação | DinamicList | DinamicListOrder |
|----------|-------------|------------------|
| `add` (final) | O(1) | O(n) |
| `addFirst` | O(1) | - |
| `addLast` | O(1) | - |
| `add(pos, elem)` | O(n) | O(n) |
| `remove` | O(n) | O(n) |
| `get` | O(n) | O(n) |
| `set` | O(n) | O(n) |
| `contains` | O(n) | O(n) |
| `indexOf` | O(n) | O(n) |
| `size` | O(1) | O(1) |

## 🎯 Conceitos Implementados

- **Estrutura de Dados**: Lista Encadeada Simples
- **Generics em Java**: Uso de `<T>` para tipos genéricos
- **Encapsulamento**: Classe `No` protegida
- **Exceções**: `IndexOutOfBoundsException`, `NoSuchElementException`
- **Comparable Interface**: Para ordenação automática
- **StringBuilder**: Para otimização de strings

## 🧪 Tratamento de Erros

O projeto inclui validações robustas:

- Verificação de índices fora dos limites
- Tratamento de lista vazia em operações de remoção
- Validação de posições inválidas

## 🤝 Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para:

1. Fazer um fork do projeto
2. Criar uma branch para sua feature (`git checkout -b feature/NovaFuncionalidade`)
3. Commit suas mudanças (`git commit -m 'Adiciona nova funcionalidade'`)
4. Push para a branch (`git push origin feature/NovaFuncionalidade`)
5. Abrir um Pull Request

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes.

## 👤 Autor

**Bene** - [@devNatanfreitas](https://github.com/devNatanfreitas)

## 📚 Recursos Adicionais

- [Documentação Java](https://docs.oracle.com/en/java/)
- [Estruturas de Dados em Java](https://www.geeksforgeeks.org/data-structures/)
- [Linked Lists](https://www.geeksforgeeks.org/data-structures/linked-list/)

---

⭐ Se este projeto foi útil para você, considere dar uma estrela!

**Desenvolvido com ❤️ para aprendizado de estruturas de dados**