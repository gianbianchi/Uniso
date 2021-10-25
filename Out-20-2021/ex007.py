#Faça um Programa que imprima na tela os números ímpares entre 1 e 50.

vetor = []

i = 1
while i <= 50:
    if (i%2 == 1):
        vetor.append(i)
    i = i + 1

print("Os números ímpares de 1 a 50 são: ")
print(vetor)
