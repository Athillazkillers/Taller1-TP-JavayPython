DVD = int(input("Ingrese el dividiendo: "))
DVSR = int(input("Ingrese el divisor: "))
COCNT= DVD/DVSR
RSD = DVD%DVSR
if DVD&DVSR==0 :
    print("La division es EXACTA, el cociente de la división es {} y el residuo es {}".format(COCNT, RSD))
else:
    print("La division es INEXACTA, el cociente de la división es  {} y el residuo es {}".format(COCNT, RSD))