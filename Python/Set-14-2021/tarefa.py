n1 = int(input("Digite n1: "))
n2 = int(input("Digite n2: "))

if (n2 == 0):
    print("Não é possível dividir por zero.")

if (n1 % 3 == 0 and n1 % 5 == 0):
    print("O número n1 = {} é divisível por 3 e 5.".format(n1))
else:
    print("O número n1 = {} não é divisível por 3 e 5 ao mesmo tempo".format(n1))

if (n2 % 3 == 0 and n2 % 5 == 0):
    print("O número n2 = {} é divisível por 3 e 5.".format(n2))
else:
    print("O número n2 = {} não é divisível por 3 e 5 ao mesmo tempo".format(n2))

if (n1 > 0):
    print("O número n1 = {} é positivo".format(n1))
    if (n1 % 4 == 0):
        print("e divisível por 4")
elif (n1 < 0):
    print("O número n1 = {} é negativo".format(n1))
    if (n1 % 4 == 0):
        print("e divisível por 4")
else:
    print("O número n1 é zero.")

if (n2 > 0):
    print("O número n2 = {} é positivo".format(n2))
    if (n2 % 4 == 0):
        print("e divisível por 4")
elif (n2 < 0):
    print("O número n2 = {} é negativo".format(n2))
    if (n2 % 4 == 0):
        print("e divisível por 4")
else:
    print("O número n2 é zero.")