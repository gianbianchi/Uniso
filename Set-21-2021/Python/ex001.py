# Programa para efetuar soma de idade de n alunos
# E a média das idades

nAlunos = int(input("Qual o número de alunos? "))
i = 0
soma = 0
while i < nAlunos:
    idade = int(input("Digite a idade do {}° aluno: ".format(i+1)))
    soma = soma + idade
    i = i + 1
print("\nA soma das idades é: {}".format(soma))
print("A média das idades é: {}".format(soma/nAlunos))
