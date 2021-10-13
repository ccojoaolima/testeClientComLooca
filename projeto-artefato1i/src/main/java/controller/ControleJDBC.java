/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author João Henrique
 */
public class ControleJDBC {
    private ControleComponente controle1 = new ControleComponente();
    private BasicDataSource bd1 = new BasicDataSource();
     private JdbcTemplate jdbcTemplate = new JdbcTemplate(bd1);
  
     private Double usoCPU = 0.0;
    private Double usoDisco = 0.0;
    private Double usoRam = 0.0;
      
     
     
    public void inserirNoBd() throws ClassNotFoundException, SQLException{
        String sql;
        
        
        // Configuração dos parâmetros de conexão
        String server = "localhost";
        String port = "3306";               // Porta TCP padrão do MySQL
        String database = "paymoon";

        // Configuração dos parâmetros de autenticação
        String user = "root";
        String passwd = "mfwhore3150";

        try{
            String url = "jdbc:mysql://" + server + ":" + port + "/" + database;

            // Abre-se a conexão com o Banco de Dados
            Connection con = DriverManager.getConnection(url, user, passwd);

            // Cria-se Statement com base na conexão con
            Statement stmt = con.createStatement();

            // Exemplo: inserindo dados na tabela de filmes
            sql = "INSERT INTO monitoraMaquina (cpu, ram, disco)"
                    + "VALUES ("+controle1.getUsoAtualCpu()+","+controle1.getPorcentagemUsoRam()+ ","+controle1.getUsoAtualDisco()+" )";
            stmt.executeUpdate(sql);

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
   /*this.bd1 = new BasicDataSource();
   Class.forName("com.mysql.cj.jdbc.Driver");
   Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/paymoon","root","mfwhore3150");
    bd1.setDriverClassName("com.mysql.cj.jdbc.Driver");
    bd1.setUrl("jdbc:mysql://localhost:3306/paymoon");
    bd1.setUsername("root");
    bd1.setPassword("mfwhore3150");    
    
    usoCPU = controle1.getUsoAtualCpu();
    usoDisco = controle1.getUsoAtualDisco();
    usoRam = controle1.getUsoAtualRam();
    
    jdbcTemplate.update("insert into monitoraMaquina (cpu,ram,disco) values (37.0,2,2);");
    }*/
    
}
    
    
    
    
    
      

    
 
  
    
    
    
    
    
    
            
    
    
    

