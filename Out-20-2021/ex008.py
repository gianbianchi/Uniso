#Desenvolva um gerador de tabuada

n = int(input("Tabuada de que número? "))

i = 0
while i < 10:
    print("{} X {} = {}".format(n, i + 1, (n*(i + 1))))
    i = i + 1
    