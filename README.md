# 🔧 Sistema Modular em Kotlin

Esse foi um pequeno projeto que fiz pra treinar funções em Kotlin, focando principalmente em funções de alta ordem, operadores como parâmetros, laços (`do-while`) e lógica de menu no terminal.

A ideia é simular um mini sistema interativo onde o usuário pode escolher opções como somar ou subtrair dois números, e o sistema responde com o resultado. Ele fica rodando até o usuário decidir sair.

## 🧠 O que eu pratiquei aqui:
- Funções com parâmetros e retornos
- Uso de funções como argumentos (ex: `::soma`, `::subtrair`)
- Controle de fluxo com `when` e `do-while`
- Função que retorna dois valores usando `Pair`
- Entrada de dados com `readln()` e `toIntOrNull()`

## 💻 Como usar
Roda direto no `main()`. O terminal vai exibir o menu e você escolhe o que fazer:

Digite 1 para SOMAR, 2 para SUBTRAIR e 0 para SAIR

Depois é só seguir as instruções e ver os resultados.

## 📦 Estrutura simples:
- `menu()` → mostra as opções
- `operar()` → aplica a operação escolhida
- `lerNumeros()` → lê os dois números do usuário
- `soma()` e `subtrair()` → as operações disponíveis

---

Projeto simples mas útil pra fixar esses conceitos. Código limpo, funcional e direto ao ponto.
