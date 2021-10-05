/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscosGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author João Henrique
 */
public class Componente {
  private Double usoCpuAtual = 0.0;
  private Integer usoPorcentagemCpuAtual = 0;
  private Double usoDiscoAtual = 0.0;
  private Double usoRamAtual = 0.0;  
  
  private Double usoMaxRam = 0.0;

  private Double gigabytesDeEscrita = 0.0;
  private Double tamanhoDiscoBytes = 0.0;

  private Double porcentagemUsoRam = 0.0;
  private Double porcentagemUsoDisco = 0.0;
  
  private String listaDeDicas = "";
  private String identificadorDaCpu = "";
  private String identificadorDaMaquina = "";
  private Looca looca1 = new Looca();
  private BasicDataSource bd1 = new BasicDataSource();

  ArrayList <Integer> historicoValoresProc  = new ArrayList();
  //ArrayList <Integer> historicoValoresDisk = new ArrayList();
  //ArrayList <Integer> historicoValoresMem = new ArrayList();*/
   
  public Componente() {
    this.usoCpuAtual = usoCpuAtual;
    this.usoDiscoAtual = usoDiscoAtual;
    this.usoRamAtual = usoRamAtual;
        
    this.bd1 = new BasicDataSource();
    bd1.setDriverClassName("org.h2.Driver");
    bd1.setUrl("jdbc:h2:file:./meu_banco");
    bd1.setUsername("sa");
    bd1.setPassword("");
    }
    

    public BasicDataSource getBancoDeDados() {
        return bd1;
    }
    
  
    public Double getUsoCpuAtual(){
    usoCpuAtual = looca1.getProcessador().getUso();
    usoPorcentagemCpuAtual = usoCpuAtual.intValue();
    return this.usoPorcentagemCpuAtual.doubleValue();
    }
    
    public Double getUsoDiscoAtual(){
    DiscosGroup discos1 = looca1.getGrupoDeDiscos();
    List<Disco> listaDiscos1 = discos1.getDiscos();
    for (Disco disco : listaDiscos1) {
    /*
     tamanhoDisco               = 100%
     tamanhoDisco - getEscritas = x%
     tamanhoDisco * x = (tamanhoDisco - getEscritas) * 100;
     porcentagemUsoDisco = ((tamanhoDisco - getEscritas) * 100) / tamanhoDisco;
     */
    
     tamanhoDiscoBytes = ((disco.getTamanho().doubleValue()/1024)/1024)/1024;
     gigabytesDeEscrita = ((disco.getBytesDeEscritas().doubleValue()/1024)/1024)/1024;
     
     usoDiscoAtual = tamanhoDiscoBytes - gigabytesDeEscrita;
     porcentagemUsoDisco = (usoDiscoAtual * 100 )/ tamanhoDiscoBytes;
     
     /*System.out.println("Giga bytes de escrita: " + gigabytesDeEscrita);
     System.out.println("Tamanho disco " + tamanhoDiscoBytes);
     System.out.println("Uso DISCO ATUAL " + usoDiscoAtual);*/
     
    }
    return this.porcentagemUsoDisco; 
    } 
    
    public Double getUsoRamAtual(){
    usoRamAtual = looca1.getMemoria().getEmUso().doubleValue();
    looca1.getProcessador().getNome();
    return this.usoRamAtual;
    }

    
    public Double getUsoMaxRam(){
    usoMaxRam = looca1.getMemoria().getTotal().doubleValue();
    return  this.usoMaxRam;
    }
    
    public Double getPorcentagemUsoRam(){
    porcentagemUsoRam = (getUsoRamAtual() * 100) / getUsoMaxRam();
    return this.porcentagemUsoRam;
    }
    
     public String getNivelDeAlertaCpu(){
     
    System.out.println("Nivel de alerta Cpu" + usoCpuAtual);
    if(usoCpuAtual > 70.0){
    return "Extremo";
    }else if(usoCpuAtual >= 50 && usoCpuAtual <= 69){
    return "Moderado";
    }else{
    return "Estável";
    }
    
    }
    
    public String getNivelDeAlertaDisco(){
    System.out.println("Nivel de alerta disco" + usoDiscoAtual);
    if(usoDiscoAtual > 70.0){
    return "Extremo";
    }else if(usoDiscoAtual >= 50.0 && usoDiscoAtual <= 69.0){
    return "Moderado";
    }else{
    return "Estável";
    }}
    
    public String getNivelDeAlertaRam(){
    System.out.println("Nivel de alerta disco" + usoRamAtual);
    if(usoRamAtual > 70.0){
    return "Extremo";
    }else if(usoRamAtual >= 50.0 && usoRamAtual <= 69.0){
    return "Moderado";
    }else{
    return "Estável";
    }}
    
    /* public String subirDicas(){
     Double usoAtualCpu = getUsoCpuAtual();
     Double usoAtualRam = getUsoRamAtual();
     Double usoAtualDisco = getUsoDiscoAtual();
     if(usoAtualCpu > 10){
     return "Convem fechar alguns arquivos";
     }
     if(usoAtualRam > 10){
     return "Convem instalar mais RAM";
     }
     if(usoAtualDisco > 10){
     return"Convem instalar um SSD secundario";
     } else {
     return "";
     }*/

    public String getListaDeDicas() {
   
     if(usoCpuAtual > 70){
     listaDeDicas += "Nível alerta Extremo de CPU detectado!\n Convém conectar "
             + "servidor secundário\n ";
     }
     if(usoRamAtual > 70){
       listaDeDicas += "Nível alerta Extremo de RAM detectada!\n Convém conectar "
               + " mais memória na máquina!\n";
     }
     if(usoDiscoAtual > 70){
       listaDeDicas += "Nível alerta Extremo de Disco detectado!\n Convém instalar mais uma"
               + "unidade HDD ou SSD\n";
     } 
    return listaDeDicas;
    } 
    public String getIdentificadorDaCpu(){
    identificadorDaCpu = looca1.getProcessador().getNome(); 
    return identificadorDaCpu;
    }
    
    public String getIdentificacaoDaMaquina(){
    looca1.getSistema().getArquitetura();
    return identificadorDaMaquina;
    }
    
    
    
  }
  
    
    
    
    
 
  
  
  
    


