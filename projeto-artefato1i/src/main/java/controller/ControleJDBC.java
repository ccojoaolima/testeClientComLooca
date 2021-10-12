/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author João Henrique
 */
public class ControleJDBC {
    private ControleComponente controle1 = new ControleComponente();
    private BasicDataSource bd1 = new BasicDataSource();
     private JdbcTemplate jdbcTemplate;
  
     private Double usoCPU = 0.0;
    private Double usoDisco = 0.0;
    private Double usoRam = 0.0;
      
     
     
    public void inserirNoBd(){
        
   this.bd1 = new BasicDataSource();
    bd1.setDriverClassName("com.mysql.cj.jdbc.Driver");
    bd1.setUrl("jdbc:mysql://localhost:3306/paymoon");
    bd1.setUsername("root");
    bd1.setPassword("mfwhore3150");    
    
    
    
    
  
    usoCPU = controle1.getUsoAtualCpu();
    usoDisco = controle1.getUsoAtualDisco();
    usoRam = controle1.getUsoAtualRam();
    
    jdbcTemplate.update("INSERT INTO monitoraMaquina (cpu, ram, disco)"
                    + "VALUES ("+controle1.getUsoAtualCpu()+","+controle1.getPorcentagemUsoRam()+ ","+controle1.getUsoAtualDisco()+" )");
    }
    
}
    
    
    
    
    
      /*String sql;
        
        /*
         *	O driver JDBC do MySQL está disponível no seguinte endereço:
         *	http://dev.mysql.com/downloads/connector/j/5.0.html
         

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
    }*/

    
 
  
    
    
    
    
    
    
            
    
    
    

