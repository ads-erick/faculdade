# 8) F.U.P que Leia três números e exiba o maior.

num1 = int(input("Digite o 1° número: "))
num2 = int(input("Digite o 2° número: "))
num3 = int(input("Digite o 3° número: "))

if num1 > num2 and num1 > num3:
    print(f"{num1} é o maior destes três números.")
elif num2 > num1 and num2 > num3:
    print(f"{num2} é o maior destes três números.")
elif num3 > num1 and num3 > num2:
    print(f"{num3} é o maior destes três números.")
elif num1 == num2 == num3:
    print("Estes três números são iguais.")
