#Faça um Programa que receba dois números inteiros e gere os números
#inteiros no intervalo compreendido por eles.
vetor = []
i = 1

n1 = int(input("Qual o primeiro valor inteiro? "))
n2 = int(input("Qual o segundo valor inteiro? "))

m = max(n1,n2)
mn = min(n1,n2)
mncopia = mn
intervalo = m - mn

mn = mn + 1
while i < intervalo:
    vetor.append(mn)
    i = i + 1
    mn = mn + 1

print("\nOs valores entre os números {} e {} são: ".format(mncopia, m))
print(vetor)
