inter0_25 = 0
inter26_50 = 0
inter51_75 = 0
inter76_100 = 0

n = 0

while n >= 0:
    n = int(input("Digite um número inteiro positivo: "))
    if (n >= 0 and n <= 25):
        inter0_25 += 1
    elif (n >= 26 and n <= 50):
        inter26_50 += 1
    elif (n >= 51 and n <= 75):
        inter51_75 += 1
    elif (n >= 76 and n <= 100):
        inter76_100 += 1
    else:
        print("\nNúmero fora do intervalo.\n")

print("A quantidade de números no intervalo [0-25]", inter0_25)
print("A quantidade de números no intervalo [26-50]", inter26_50)
print("A quantidade de números no intervalo [51-75]", inter51_75)
print("A quantidade de números no intervalo [76-100]", inter76_100)