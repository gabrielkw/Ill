#Ill Interpreter

##Linguagem de Programação Ill
###Manual do programador
Ill é uma linguagem minimalista que usa apenas dois caracteres diferentes: I (i maiúsculo) e l
(L minúsculo).

A sua interpretação é baseada em um vetor unidimensional de números inteiros, um ponteiro
alterável para acessar os valores no vetor e um leitor de código que viaja de caractere em
caractere da esquerda para a direita.

No início de cada interpretação de código, o ponteiro está localizado na primeira célula do
vetor e todas as células do vetor possuem o valor 0.

###Esta linguagem possui apenas 8 comandos distintos:
● IIl ­ Move o ponteiro para a próxima célula do vetor.

● lII ­ Move o ponteiro para a célula anterior do vetor.

● llI ­ Adiciona um para o valor da célula apontada pelo ponteiro.

● Ill ­ Subtrai um para o valor da célula apontada pelo ponteiro.

● III ­ Imprime o caractere cujo código ASCII é representado pelo valor da célula
apontada pelo ponteiro.

● lll ­ Salva o valor ASCII do próximo caractere de entrada na célula apontada pelo
ponteiro.

● IlI ­ Se o valor da célula apontada pelo ponteiro é igual a zero, move o leitor de
código até o comando lIl correspondente.

● lIl ­ Se o valor da célula apontada pelo ponteiro é diferente a zero, move o leitor de
código até o comando IlI correspondente.

IlI e lIl possuem comandos correspondentes assim como parênteses normalmente
possuem em outras linguagens de programação como C. Cada IlI possui exatamente
um comando lIl correspondente e vice versa. O comando IlI vem antes do comando
lIl.

Todos os caracteres que não são I (i maiúsculo) ou l (L minúsculo) são ignorados, inclusive
novas linhas e espaços.

Os comandos são realizados a cada três caracteres válidos reconhecidos pelo leitor.
