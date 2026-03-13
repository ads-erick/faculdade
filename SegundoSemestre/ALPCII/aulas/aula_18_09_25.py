class Pessoa():
    def __init__(self, nome, idade, email, celular):
        self.__nome = nome
        self.__idade = idade
        self.__email = email
        self.__celular = celular

    @property
    def nome(self):
        return self.__nome
    
    @nome.setter
    def nome(self, novo_nome):
        self.__nome = novo_nome
    
    @property
    def idade(self):
        return self.__idade
    
    @idade.setter
    def idade(self, nova_idade):
        if nova_idade < 0:
            print("Idade não pode ser negativa.")
        else:
            self.__idade = nova_idade

    @property
    def email(self):
        return self.__email
    
    @email.setter
    def email(self, novo_email):
        self.__email = novo_email

    @property
    def celular(self):
        return self.__celular
    
    @celular.setter
    def celular(self, novo_celular):
        self.__celular = novo_celular

    def exibir_dados(self):
        print("Exibindo os dados da pessoa")
        print(f"Nome: {self.__nome}")
        print(f"Idade: {self.__idade}")
        print(f"e-mail: {self.__email}")
        print(f"celular: {self.__celular}")

nome = input("Digite o nome da pessoa: ")
idade = int(input("Digite a idade da pessoa: "))
email = input("Digite o e-mail da pessoa: ")
celular = input("Digite o nr do celular da pessoa: ")

# Criando o objeto pessoal
pessoa1 = Pessoa(nome, idade, email, celular)
pessoa1.nome = nome
pessoa1.idade = idade
pessoa1.exibir_dados()