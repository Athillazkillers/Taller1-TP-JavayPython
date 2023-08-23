numeros = []

NM1 = int(input("Ingrese el primer número: "))
numeros.append(NM1)

NM2 = int(input("Ingrese el segundo número: "))
numeros.append(NM2)

NM3 = int(input("Ingrese el tercer número: "))
numeros.append(NM3)

NM4 = int(input("Ingrese el cuarto número: "))
numeros.append(NM4)

numeros.sort()

print("Números ordenados de menor a mayor: ")
for numero in numeros:
    print(numero)
