# Java-TestUnitario

- __Projeto:__ Criar 4 aplicações distintas para aprimoramento do teste unitario.

### __Atividade Proposta__
~~~
1. Crie um programa que peça o nome, CPF e idade para um usuário.O CPF tem que ter 11 dígitos, o nome ser uma string e a idade um inteiro.Caso o usuário digite um cpf inválido, informar que aquele cpf é inválido.Caso informe um nome vazio, informar que o nome não pode ser vazio.Caso o usuário digite uma idade menor que zero ou maior que 120, informar idade inválida.
~~~
~~~
2. Escreva um algoritmo que leia dois números informados pelo usuário a partir do teclado e que apresente o resultado da média aritmética dos dois números informados.
~~~
~~~
3. Escreva um algoritmo que leia o preço de um produto a partir do teclado e apresente na tela o valor do produto acrescido de 10% de seu valor original.
~~~
~~~
4. Escreva um algoritmo que leia uma temperatura fornecida pelo usuário a partir do  teclado em graus Fahrenheit e a converta para o seu equivalente em graus centígrados. OBS.: °C = (°F − 32) / 1,8)
~~~
### __Ferramentas utilizadas:__
---
- Eclipse - para criação de toda o programação utilizando a linguagem Java.

- Visual Studio Code - para edição do README.

- JUnit - para criação dos testes unitários sobre cada cálculo.

- Git - para controle de cada etapa do processo.

- GitHub - para compartilhamento de todo projeto desenvolvido.   


### __Passo a passo__
---
1 - Criação do projeto Maven no ECLIPSE. Iniciando com a criação das classes para a primeira aplicação que será os dados de cadastro.

2 - Foi criado duas classes, a classe validação terá como objetivo validar os dados inseridos, enquanto a classe principal receberá esses dados já cadastrados.

3 - Foi utilizados os operadores try e catch para está auxiliando no tratamento de todas às exceções. 

4 - Foram criados métodos onde fosse possível ajustar os dados da maneira devida: 
- Nome não podendo ser vazio, e todas às letras maiusculas para melhor padronização.
- Cpf sendo aceito somente onde digitos, após o recebimento corretamente desse dado ele foi tratado para que fosse imprimido conforme o padrão de CPF.
- Idade somente aceita de 0 à 120 anos.

5 - Foram efetuados testes pelo Junit onde foi posível obter 63,6% de Coverage em toda aplicação, onde tivemos todos os métodos da classe Validacao cobertas, chegando a 88% de cobertura. 