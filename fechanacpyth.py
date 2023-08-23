from datetime import datetime
from dateutil.relativedelta import relativedelta

FNS = input("ingrese su fecha de nacimiento en el formato (AAAA-MM-DD): ")
FN = datetime.strptime(FNS, "%Y-%m-%d").date()

FA = datetime.now().date()
P = relativedelta(FA, FN)
E = P.years

print("Su edad es:", E)
