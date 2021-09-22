from math import sqrt

a = float(input("Digite o valor de a: "))
b = float(input("Digite o valor de b: "))
c = float(input("Digite o valor de c: "))

delta = (b**2) - 4*a*c
if delta < 0:
    print("Não existem raízes reais.")
else:
    x1 = (-b + (sqrt(delta)))/(2*a)
    x2 = (-b - (sqrt(delta)))/(2*a)

    if delta > 0:
      print("As raízes são x1 = {} e x2 = {}.".format(x1, x2))
    else:
       print("As raízes são iguais: {}".format(x1))
