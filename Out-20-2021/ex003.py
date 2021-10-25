#Faça um Programa que leia um vetor de números inteiros,
# mostre a soma, a multiplicação e os números.

vetor = []
i = 0
soma = 0
mult = 1

while i < 5:
    vetor.append(int(input("Qual o {}º valor? ".format(i+1))))
    i = i + 1

i = 0
while i < 5:
    mult = mult * vetor[i]
    soma = soma + vetor[i]
    i = i + 1
    
print("\nO vetor: {}".format(vetor))
print("Gera a soma: {}. e a multiplicação: {}".format(soma, mult))
