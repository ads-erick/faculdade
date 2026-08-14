package br.edu.univille.poo.persistence;

import br.edu.univille.poo.entity.Pessoa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// DAO -> Geralmente é um para cada tabela
public class PessoaDAO extends BaseDAO {

    // Design Pattern -> Optional
    // Optional é classe para evitar retornar objeto nulo
    public Optional<Pessoa> findById(int id){
        String sql = "select id, nome,sobrenome,idade from pessoa where id = ?";
        try(Connection con = con();
            PreparedStatement pre = con.prepareStatement(sql)){
            pre.setInt(1,id);
            ResultSet rs = pre.executeQuery();
            if(rs.next()){
                String nome = rs.getString("nome");
                String sobrenome = rs.getString("sobrenome");
                int idade = rs.getInt("idade");
                // Passo os valores que venho do banco de dados
                // para o objeto java
                Pessoa pessoa = new Pessoa(id,nome,sobrenome,idade);
                // adiciona o objeto na lista
                return Optional.of(pessoa);
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar a pessoa pelo id:"+id);
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public List<Pessoa> findAllIdadeGreatherThan17(){
        List<Pessoa> lista = new ArrayList<>();
        String sql = "select id, nome,sobrenome,idade from pessoa where idade > ?";
        try(Connection con = con();
            PreparedStatement pre = con.prepareStatement(sql)){
            pre.setInt(1,17);
            ResultSet rs = pre.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String sobrenome = rs.getString("sobrenome");
                int idade = rs.getInt("idade");
                // Passo os valores que venho do banco de dados
                // para o objeto java
                Pessoa pessoa = new Pessoa(id,nome,sobrenome,idade);
                // adiciona o objeto na lista
                lista.add(pessoa);
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar todas as pessoas de maior de idade.");
            e.printStackTrace();
        }
        return lista;
    }

    public List<Pessoa> findAll(){
        List<Pessoa> lista = new ArrayList<>();
        String sql = "select id, nome,sobrenome,idade from pessoa order by nome";
        try(Connection con = con();
            PreparedStatement pre = con.prepareStatement(sql)){
            ResultSet rs = pre.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String sobrenome = rs.getString("sobrenome");
                int idade = rs.getInt("idade");
                // Passo os valores que venho do banco de dados
                // para o objeto java
                Pessoa pessoa = new Pessoa(id,nome,sobrenome,idade);
                // adiciona o objeto na lista
                lista.add(pessoa);
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar todas as pessoas.");
            e.printStackTrace();
        }
        return lista;
    }

    public void insert(Pessoa p){
        String sql = "insert into pessoa(nome,sobrenome,idade) values(?,?,?);";
        // try-with-resources -> fecha os recursos abertos
        // automaticamente
        // Design Pattern : Autocloseable
        try(Connection con = con();
            PreparedStatement pre = con.prepareStatement(sql)){
            pre.setString(1,p.getNome());
            pre.setString(2,p.getSobrenome());
            pre.setInt(3,p.getIdade());
            pre.execute();
        } catch (Exception e) {
            System.out.println("Erro ao inserir pessoa.");
            e.printStackTrace();
        }
    }

    public void deleteById(int id){
        String sql = "delete from pessoa where id = ?;";
        // try-with-resources -> fecha os recursos abertos
        // automaticamente
        // Design Pattern : Autocloseable
        try(Connection con = con();
            PreparedStatement pre = con.prepareStatement(sql)){
            pre.setInt(1,id);
            pre.execute();
        } catch (Exception e) {
            System.out.println("Erro ao deletar pessoa com o id:"+id);
            e.printStackTrace();
        }
    }

}
