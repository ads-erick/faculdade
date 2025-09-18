# 9) F.U.P que informe a idade de uma pessoa e classifique-a como
# criança (0-12), adolescente (13-17) ou adulto (18+).

idade = int(input("Digite sua idade: "))

if idade >=0 and idade <=12:
    print("Criança")
elif idade >=13 and idade <=17:
    print("Adolescente")
elif idade >=18:
    print("Adulto")
else:
    print("Idade inválida.")