#   Programa para N eleitores votarem em 3 candidatos.

nEleitores = int(input("Qual o número de eleitores? "))

i = 0
n1 = n2 = n3 = 0

while i < nEleitores:
    voto = int(input("Em qual candidato o {}° eleitor vota?\nDigite 1, 2 ou 3: ".format(i + 1)))
    
    if (voto == 1):
        n1 += 1
        i += 1
    elif (voto == 2):
        n2 += 1
        i += 1
    elif (voto == 3):
        n3 += 1
        i += 1
    else:
        print("\nValor inválido, por favor digite novamente.")

print("\nO primeiro candidato conseguiu {} votos".format(n1))
print("O segundo candidato conseguiu {} votos".format(n2))
print("O terceiro candidato conseguiu {} votos".format(n3))
