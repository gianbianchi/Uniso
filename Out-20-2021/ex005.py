#Faça um Programa que leia um vetor de 10 caracteres e diga
#quantas consoantes foram lidas. Imprima as consoantes.

vetor = []
vetorconsoante = []
vetorvogal = []

nConsoante = 0

i = 0
while i < 10:
    vetor.append(str(input("Digite um caractere: ")))
    
    if (vetor[i] in "aeiouAEIOU"):
        vetorvogal.append(vetor[i])
    else:
       vetorconsoante.append(vetor[i])
       nConsoante = nConsoante + 1
    i = i + 1

print("\nForam lidas {} consoantes:".format(nConsoante))
print(vetorconsoante)
