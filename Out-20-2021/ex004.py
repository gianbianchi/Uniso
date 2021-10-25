#Faça um Programa que leia 5 números e informe o maior.

maior = 0

i = 0
while i < 5:
    n = float(input("Digite um número: "))
    if(n > maior):
        maior = n
    i = i + 1
    
print("O maior número é {}".format(maior))
