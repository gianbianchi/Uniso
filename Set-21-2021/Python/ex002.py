# Calcular a média de 5 notas de um aluno
#    Exibir se ele está aprovado (media >= 6)
#    Se ele está em recuperação (3 >= media < 6)
#    Se ele está reprovado (media < 3)

i = 0
soma = 0

while i < 5:
    nota = float(input("Digite a {}° nota do aluno: ".format(i+1)))
    soma = soma + nota
    i = i + 1
media = soma / 5

if (media >= 6):
    print("\nAluno aprovado com media {}".format(media))
elif (media >= 3 and media < 6):
    print("\nAluno em recuperação com media {}".format(media))
else:
    print("\nAluno reprovado com media {}".format(media))
