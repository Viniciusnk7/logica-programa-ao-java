⛽ Sistema de Escolha de Combustível (Java)

Projeto em Java que simula a escolha entre etanol e gasolina, utilizando uma regra de proporção para indicar qual combustível é mais vantajoso economicamente.

🚀 Funcionalidade

O sistema recebe:

Preço da gasolina
Preço do etanol

E retorna:

Qual combustível compensa mais

🧠 Regra de decisão

O programa utiliza a seguinte regra:

Se o preço do etanol for até 70% do preço da gasolina, então o etanol compensa
Caso contrário, a gasolina compensa

⚖️ Lógica aplicada
Calcula a proporção:
Etanol ÷ Gasolina
Compara com 0.70
Decide o melhor combustível

💻 Exemplo de execução

Digite o preço da Gasolina:
5.00

Digite o preço do Etanol:
3.00

etanol compensa

📊 Outro exemplo

Gasolina: 5.00  
Etanol: 4.00  

gasolina compensa

🛠️ Tecnologias utilizadas

Java
Scanner (entrada de dados)
Locale (formatação US)
Estruturas condicionais (if / else)

📚 Conceitos praticados

Variáveis
Operadores matemáticos
Estrutura condicional
Comparação de valores
Lógica de programação

🎯 Objetivo do projeto

Praticar estrutura condicional em Java, simulando uma situação real do dia a dia em postos de combustível.

📂 Estrutura do projeto

SistemaDeEscolhaDeCombustivel/
│
├── src/
│   └── aplication/
│       └── SistemaDeEscolhaDeCombustível.java
│
└── README.md