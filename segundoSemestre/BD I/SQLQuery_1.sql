--> criar um banco de dados
CREATE DATABASE TURMAA

--> usar o banco
USE TURMAA

--> criar uma tabela
CREATE TABLE ALUNOS
(
  IDAluno int identity CONSTRAINT PK_ALUNO PRIMARY KEY, --> auto incremento
  NMAluno char(50)
)

--> insert
INSERT ALUNOS (NMAluno, DTNASC) VALUES ('Cauã Colarinho', '2010-01-01')

--> SELECT para visualizar
SELECT * FROM ALUNOS

--> alterar tabela em banco de dados
ALTER TABLE ALUNOS
    ADD DTNASC /new_column_name/ date /new_column_datatype/ NULL /new_column_nullability/
GO

--> update
UPDATE ALUNOS SET DTNASC = '2005-08-07'
WHERE NMAluno = 'Eduardo'

--> criar uma segunda tabela
CREATE TABLE TURMAS
(
    IDTurma int CONSTRAINT PK_TURMA PRIMARY KEY,
    NMTurma char(50),
    IDAluno int
)

--> relacionar com outra tabela
ALTER TABLE TURMAS ADD CONSTRAINT FK_TURMAS_ALUNO
FOREIGN KEY (IDAluno) REFERENCES ALUNOS(IDAluno)

SELECT * FROM ALUNOS
SELECT * FROM TURMAS

INSERT TURMAS (IDTurma, NMTurma, IDAluno) VALUES (1, 'Turma A', 1)

--> aula 2
--> SELECT COM JOIN
SELECT AL.NMAluno, TM.NMTurma, AL.IDAluno as 'ID do Aluno'
FROM ALUNOS as AL, TURMAS as TM
WHERE AL.IDAluno=TM.IDAluno

-- atualizando dados de alunos de determinada turma
UPDATE ALUNOS SET NMAluno = 'Eduardo W',
DTNASC = '2005-08-07'
FROM ALUNOS, TURMAS
WHERE NMTurma = 'Turma A'
AND ALUNOS.IDAluno=TURMAS.IDAluno

--> deletando dados da tabela ALUNO
DELETE FROM ALUNOS
FROM ALUNOS, TURMAS --> relacionamento 1/2
WHERE ALUNOS.IDAluno=TURMAS.IDAluno --> relacionamento 2/2
AND NMTurma = 'Turma A'

DELETE FROM ALUNOS WHERE IDAluno = 1
DELETE FROM TURMAS WHERE IDAlun = 1
