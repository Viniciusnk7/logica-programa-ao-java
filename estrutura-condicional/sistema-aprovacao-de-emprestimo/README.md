🏦 Sistema de Aprovação de Empréstimo (Java)

Projeto em Java que simula um sistema simples de análise de crédito bancário, utilizando estrutura condicional (if/else) para decidir se um empréstimo será aprovado ou negado com base na renda do cliente.

🚀 Funcionalidades

Entrada de dados do cliente:
Nome
Renda mensal
Valor do empréstimo desejado
Quantidade de parcelas
Cálculo automático:
Valor da parcela mensal
Limite permitido (30% da renda)
Análise de crédito:
Aprova ou reprova o empréstimo com base na regra

🧠 Regra de negócio

O empréstimo só é aprovado se:

A parcela mensal for menor ou igual a 30% da renda mensal

📊 Exemplo de cálculo

Se o cliente tiver:

Renda: R$ 2000
Empréstimo: R$ 10000
Parcelas: 10

Então:

Parcela mensal:
10000 ÷ 10 = R$ 1000
Limite permitido:
2000 × 0.30 = R$ 600

Resultado:

❌ Reprovado (1000 > 600)

💻 Exemplo de execução

Digite o seu nome:
João

Quanto é a sua renda mensalmente:
2000

Qual o valor do empréstimo que você deseja:
10000

Digite a quantidade de parcelas:
10

APROVADO ou REPROVADO

Cliente: João
Renda: 2000.0
Empréstimo: 10000.0
Parcelas: 10

Parcela mensal: 1000.0
Limite permitido: 600.0

🛠️ Tecnologias utilizadas

Java
Scanner (entrada de dados)
Locale (formatação US)
Estruturas condicionais (if / else)

📚 Conceitos praticados

Variáveis
Operadores matemáticos
Estrutura condicional
Entrada e saída de dados
Lógica de programação
Simulação de sistema real

📂 Estrutura do projeto

SistemaDeAprovacaoDeEmprestimo/
│
├── src/
│   └── aplication/
│       └── SistemaDeAprovaçãoDeEmpréstimo.java
│
└── README.md

🎯 Objetivo

Este projeto foi desenvolvido para praticar lógica de programação em Java, simulando um sistema real de análise de crédito utilizado por bancos.