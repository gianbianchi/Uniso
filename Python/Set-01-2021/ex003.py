import math

print(" CÁLCULO DE RAÍZ QUADRADA")
n = float(input("Digite o número: "))

if (n >= 0):
    print("Raiz quadrada de {} é".format(n),math.sqrt(n))
else:
    print("Valor inválido")
