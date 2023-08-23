print("Introduzca su edad")
ED = int(input())
print("Introduzca su Estatura")
ES = float(input())
print("Introduzca su Peso")
PS = float(input())
IMC = PS /(ES*ES)
if ED<45 and IMC<22.0:
    print("Su IMC es de: "+str(IMC)+"Y es BAJO")
elif ED<45 and IMC>=22.0:
    print("Su IMC es de: "+str(IMC)+"Y es MEDIO")
elif ED>=45 and IMC<22.0:
    print("Su IMC es de: "+str(IMC)+"Y es MEDIO")
elif ED>=45 and IMC>=22.0:
    print("Su IMC es de: "+str(IMC)+"Y es ALTO")
