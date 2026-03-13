# 7 – F.U.P para simular uma agenda com as operações de inclusão, alteração,
# exclusão, listar e sair. Dados que deverão ser cadastrados: Nome e telefone.
# Validar para que não existe mais de um telefone cadastrado na agenda.
# Validar para que o nome e o telefone são preenchidos pelo usuário antes de
# adicionar na agenda. Caso o telefone ou agenda não for preenchido deverá ser
# informado de campo vazio.
# Na exclusão deverá ser solicitado o nr do telefone. Caso não exista na agenda,
# deverá exibir mensagem para o usuário: Nr telefone não existente.

agenda = {}  

def mostrar_menu():
    print("\n===AGENDA===")
    print("[1] Incluir")
    print("[2] Alterar")
    print("[3] Excluir")
    print("[4] Listar")
    print("[5] Sair")

while True:
    mostrar_menu()
    opc = int(input("Escolha uma opção: "))

    if opc == 1:  
        nome = input("Digite o nome do contato: ").strip()
        telefone = input("Digite o telefone do contato: ").strip()

        if not nome or not telefone:
            print("Erro: Nome ou telefone não podem ficar vazios!")
        elif telefone in agenda:
            print("Erro: Este telefone já está cadastrado!")
        else:
            agenda[telefone] = nome
            print(f"Contato {nome} adicionado com sucesso!")

    elif opc == 2:  
        telefone = input("Digite o telefone que deseja alterar: ").strip()

        if telefone not in agenda:
            print("Erro: Telefone não encontrado!")
        else:
            novo_nome = input("Digite o novo nome para este telefone: ").strip()
            if not novo_nome:
                print("Erro: Nome não pode ficar vazio!")
            else:
                agenda[telefone] = novo_nome
                print(f"Contato atualizado com sucesso para: {novo_nome}")

    elif opc == 3:  
        telefone = input("Digite o telefone que deseja excluir: ").strip()
        if telefone not in agenda:
            print("Erro: Telefone não existente!")
        else:
            nome = agenda.pop(telefone)
            print(f"Contato {nome} excluído com sucesso!")

    elif opc == 4:  
        if not agenda:
            print("Agenda vazia.")
        else:
            print("\n=== Lista de contatos ===")
            for tel, nome in agenda.items():
                print(f"Telefone: {tel} | Nome: {nome}")

    elif opc == 5:  
        print("Encerrando...")
        break

    else:
        print("Opção inválida. Tente novamente.")