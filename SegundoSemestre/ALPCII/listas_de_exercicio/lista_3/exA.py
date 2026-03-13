contatos = []

#Adicionando contato
def adicionar_contato(lista, nome):
    if not nome.strip():
        print("ERRO: o nome não pode ser vazio.")
        return
    lista.append(nome)
    print(f"Contato '{nome}' adicionado com sucesso!")

#Removemdo contato
def remover_contato(lista, nome):
    try:
        lista.remove(nome)
        print(f"Contato '{nome}' removido com sucesso!")
    except ValueError:
        print(f"ERRO: '{nome}' não encontrado na lista.")

#Buscando contato
def buscar_contato(lista, nome):
    try:
        posicao = contatos.index(nome)
        print(f"O contato '{nome}' está na posição {posicao + 1}")
    except ValueError:
        print(f"ERRO: '{nome}' não encontado na lista.")

#Mostrando contatos
def mostrar_contatos(lista):
    print("===CONTATOS===")
    for i, nome in enumerate(lista):
        print(f"{i + 1} - {nome}")

#Mostrando menu
def menu():
    print("===MENU===")
    print("""[1] - Adicionar Contato
[2] - Remover Contato
[3] - Buscar Contato
[4] - Mostrar Contatos
[5] - Sair
""")
    
    while True:
        try:
            esc = int(input("Escolha uma opção: "))
        except ValueError:
            print("ERRO: Opção inválida. Digite um número válido.")
            continue

        if esc == 1:
            nome = input("Nome: ")
            adicionar_contato(contatos, nome)

        elif esc == 2:
            nome = input("Contato que deseja remover: ")
            remover_contato(contatos, nome)

        elif esc == 3:
            nome = input("Insira o nome do contato que você está procurando: ")
            buscar_contato(contatos, nome)

        elif esc == 4:
            mostrar_contatos(contatos)

        elif esc == 5:
            break

        else:
            print("Opção inválida! Digite um número entre 1 e 5.")

    print("Fim de programa.")

#Programa Principal
menu()
