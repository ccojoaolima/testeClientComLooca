package controller;

import models.Componente;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author João Henrique
 */
public class ControleComponente {
    Componente componente1 = new Componente();

    private Double usoAtualCpu = 0.0;
    private Double usoAtualDisco = 0.0;
    private Double usoAtualRam = 0.0;
    private String nivelDeAlerta;
    private String listaDeDicas;
    private Double porcentagemUsoRam = 0.0;
    
   
    
    /*public ControleComponente() {
    this.bd1 = new BasicDataSource();
    bd1.setDriverClassName("com.mysql.cj.jdbc.Driver");
    bd1.setUrl("jdbc:mysql://localhost:3306/paymoon");
    bd1.setUsername("root");
    bd1.setPassword("mfwhore3150");
    }

    public BasicDataSource getBancoDeDados() {
        return bd1;
    }
    
    /*
    usoMaxRam - 100%
    usoAtualCpu - X
    usoMaxRam * X = usoAtualCpu * 100
    private porcentagemUsoCpu = (usoAtualCpu * 100) / usoMaxRam
    */

    
    
    //logica barrinha
    //controle de dados
    //quem gera dados - model
  
    
    public Double getUsoAtualCpu() {
        return componente1.getUsoCpuAtual();
    }
    public Double getValorCpuArmazenado(){
        return componente1.getUsoCpuAtual();
    }

    public Double getUsoAtualDisco() {
        return componente1.getUsoDiscoAtual();
    }

    public Double getUsoAtualRam() {
        return componente1.getUsoRamAtual();
    }
    
    public Double getPorcentagemUsoRam(){
    return componente1.getPorcentagemUsoRam();
    }
    
    public String getNivelDeAlertaCpu(){
    return componente1.getNivelDeAlertaCpu();
    
    }
    
    public String getNivelDeAlertaDisco(){
    return componente1.getNivelDeAlertaDisco();
    }
    
    public String getNivelDeAlertaRam(){
    return componente1.getNivelDeAlertaRam();
    }
    

    public String getListaDeDicas(){
   return componente1.getListaDeDicas();
    }
    
    public String getIdentificadorDaCpu(){
    return componente1.getIdentificadorDaCpu();
    }
    
    public String getIdentificacaoMaquina(){
    return componente1.getIdentificacaoDaMaquina();
    }
    
    public String getDataDaCaptura(){
    return componente1.getDataDaLeitura();
    }
    
    public String getNomeDoDisco(){
    return componente1.getNomeDoDisco();
    }
    
    
   
    
    
    }
        
        
  
   
    
    
    
    

