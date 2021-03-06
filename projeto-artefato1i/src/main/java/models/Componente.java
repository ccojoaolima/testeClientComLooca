/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscosGroup;
import com.mycompany.projeto.artefato1i.ScreenRelatorio;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JLabel;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author João Henrique
 */
public class Componente {
  private Long usoDiscoLong;  
    
    
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
  private String dataDaLeitura = "";
  private String discoEmUsoLudico = "";
  private String nomeDoDisco = "";
  
  
  private Looca looca1 = new Looca();
  
 
  private Date data1 = new Date(); 

  List<Integer> relatorioValoresProc = new ArrayList<>();
  List<Double> relatorioValoresDisco = new ArrayList<>();
  List<Double> relatorioValoresRam = new ArrayList<>();
   
  ArrayList <Integer> historicoValoresProc  = new ArrayList();
  //ArrayList <Integer> historicoValoresDisk = new ArrayList();
  //ArrayList <Integer> historicoValoresMem = new ArrayList();*/
   
  public Componente() {
    this.usoCpuAtual = usoCpuAtual;
    this.usoDiscoAtual = usoDiscoAtual;
    this.usoRamAtual = usoRamAtual;
        
    }

    public Double getUsoCpuAtual(){
    usoCpuAtual = looca1.getProcessador().getUso();
    usoPorcentagemCpuAtual = usoCpuAtual.intValue();
    relatorioValoresProc.add(usoPorcentagemCpuAtual);
    return this.usoPorcentagemCpuAtual.doubleValue();
    }
    
    public Double getUsoDiscoAtual(){
    DiscosGroup discos1 = looca1.getGrupoDeDiscos();
    List<Disco> listaDiscos1 = discos1.getDiscos();
    
    usoDiscoLong = discos1.getVolumes().get(0).getDisponivel();
    
    for (Disco disco : listaDiscos1) {
   
     tamanhoDiscoBytes = ((disco.getTamanho().doubleValue()/1024)/1024)/1024;
     gigabytesDeEscrita = usoDiscoLong.doubleValue()/ 1000000000;
     
      /*
     tamanhoDisco               = 100%
     tamanhoDisco - getEscritas = x%
     tamanhoDisco * x = (tamanhoDisco - getEscritas) * 100;
     porcentagemUsoDisco = ((tamanhoDisco - getEscritas) * 100) / tamanhoDisco;
     */
     
     usoDiscoAtual = tamanhoDiscoBytes - gigabytesDeEscrita;
     porcentagemUsoDisco = (usoDiscoAtual * 100 )/ tamanhoDiscoBytes;
     relatorioValoresDisco.add(porcentagemUsoDisco);
     /*System.out.println("Giga bytes de escrita: " + gigabytesDeEscrita);
     System.out.println("Tamanho disco " + tamanhoDiscoBytes);
     System.out.println("Uso DISCO ATUAL " + usoDiscoAtual);*/
     
    }
    return this.porcentagemUsoDisco; 
    } 
    
    public Double getDiscoEmUsoAtual(){
        
    Integer testeDisco = 0;
        
    DiscosGroup discos1 = looca1.getGrupoDeDiscos();
    List<Disco> listaDiscos1 = discos1.getDiscos();
    for (Disco disco : listaDiscos1) {
 
     tamanhoDiscoBytes = ((disco.getTamanho().doubleValue()/1024)/1024)/1024;
     //gigabytesDeEscrita = (disco.getEscritas().doubleValue()/1024);
     
     //usoDiscoAtual = tamanhoDiscoBytes - gigabytesDeEscrita;
     //discoEmUsoLudico = String.format("%.2f", usoDiscoAtual);    
    }
    return this.tamanhoDiscoBytes; 
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
    relatorioValoresRam.add(porcentagemUsoRam);
    return this.porcentagemUsoRam;
    }
    
     public String getNivelDeAlertaCpu(){
     
   // System.out.println("Nivel de alerta Cpu" + usoCpuAtual);
    if(usoCpuAtual > 70.0){
    return "Extremo";
    }else if(usoCpuAtual >= 50 && usoCpuAtual <= 69){
    return "Moderado";
    }else{
    return "Estável";
    }
    
    }
    
    public String getNivelDeAlertaDisco(){
    // System.out.println("Nivel de alerta disco" + gigabytesDeEscrita);
    if(porcentagemUsoDisco > 70.0){
    return "Extremo";
    }else if(porcentagemUsoDisco >= 50.0 && porcentagemUsoDisco <= 69.0){
    return "Moderado";
    }else{
    return "Estável";
    }}
    
    public String getNivelDeAlertaRam(){
    //System.out.println("Nivel de alerta disco" + usoRamAtual);
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
    identificadorDaMaquina = looca1.getSistema().getSistemaOperacional();
    identificadorDaMaquina += looca1.getSistema().getFabricante();
    return identificadorDaMaquina;
    }
    
    public String getDataDaLeitura(){
    SimpleDateFormat formataData = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
   dataDaLeitura = formataData.format(data1);
    return dataDaLeitura;
    }
    
    public String getNomeDoDisco(){
    DiscosGroup discos1 = looca1.getGrupoDeDiscos();
    List<Disco> listaDiscos1 = discos1.getDiscos();
    for (Disco disco : listaDiscos1) {
    nomeDoDisco =  disco.getNome();

    }
    return this.nomeDoDisco; 
    }
  
    
    
    
    }
    
    
  
  
    
    
    
    
 
  
  
  
    


