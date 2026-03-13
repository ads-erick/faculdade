produtos = []

#Adicionando produto
def adicionar_produto(lista, nome, preco):
    if not nome.strip():
        print("ERRO: o nome do produto não pode ser vazio.")
        return
    try:
        preco = float(preco)
    except ValueError:
        print("ERRO: preço inválido! Digite um número.")
        return
    
    id_produto = len(lista) + 1
    produto = {"id": id_produto, "nome": nome, "preco": preco}
    lista.append(produto)
    print(f"Produto '{nome}' adicionado com sucesso!")

#Mostrando produtos
def mostrar_produtos(lista):
    if not lista:
        print("ERRO: Nenhum produto cadastrado.")
        return
    else:
        print("===LISTA DE PRODUTOS===")
        for produto in lista:
            print(f"ID: {produto['id']}, Nome: {produto['nome']}, Preço: R${produto['preco']:.2f}")

#Alterando produtos
def alterar_produto(lista, id_produto, novo_nome, novo_preco):
    if not novo_nome.strip():
        print("ERRO: o nome do produto não pode ser vazio.")
        return
    try:
        novo_preco = float(novo_preco)
    except ValueError:
        print("ERRO: preço inválido! Digite um número.")
        return
    
    for produto in lista:
        if produto["id"] == id_produto:
            produto["nome"] = novo_nome
            produto["preco"] = novo_preco
            print(f"Produto ID {id_produto} alterado com sucesso!")
            return
    print(f"ERRO: Produto com ID {id_produto} não encontrado.")

#Mostrando menu
def menu():
    print("""[1] - Adicionar produto
[2] - Alterar produto
[3] - Mostrar produtos
[4] - Sair
""")
    
    while True:
        try:
            esc = int(input("Escolha uma opção: "))
        except ValueError:
            print("ERRO: Opção inválida. Digite um número válido.")
            continue

        if esc == 1:
            nome = str(input("Nome do produto: "))
            preco = input("Preço do produto: R$ ")
            adicionar_produto(produtos, nome, preco)

        elif esc == 2:
            try:
                id_produto = int(input("Digite o ID do produto a alterar: "))
            except ValueError:
                print("ERRO: ID inválido! Digite um número inteiro.")
                continue
            
            novo_nome = input("Digite o novo nome do produto: ")
            novo_preco = input("Digite o novo preço do produto: R$ ")
            alterar_produto(produtos, id_produto, novo_nome, novo_preco)

        elif esc == 3:
            mostrar_produtos(produtos)

        elif esc == 4:
            break

        else:
            print("Opção inválida! Digite um número entre 1 e 4.")

    print("Fim de programa.")
    
#Programa Principal
menu()
