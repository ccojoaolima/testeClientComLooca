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

/**
 *
 * @author João Henrique
 */
public class Componente {
  private Double usoCpuAtual = 0.0;
  private Double usoDiscoAtual = 0.0;
  private Double usoRamAtual = 0.0;  
  
     
  private Double maiorUsoCpu = 0.0;
  String txtMaiorUsoCpu;
  String txtMenorUsoCpu;
  private Double menorUsoCpu = 0.0;
  private Double maiorUsoDisco = 0.0;
  private Double menorUsoDisco = 0.0;
  private Double maiorUsoRam = 0.0;
  private Double menorUsoRam = 0.0;
  
  private Looca looca1 = new Looca();
  
  /*ArrayList <Integer> historicoValoresProc  = new ArrayList();
  ArrayList <Integer> historicoValoresDisk = new ArrayList();
  ArrayList <Integer> historicoValoresMem = new ArrayList();*/
   
  public Componente() {
        this.usoCpuAtual = usoCpuAtual;
        this.usoDiscoAtual = usoDiscoAtual;
        this.usoRamAtual = usoRamAtual;
    }
    
    public Double getUsoCpuAtual(){
     usoCpuAtual = looca1.getProcessador().getUso();  
     // usoCpuAtual = ThreadLocalRandom.current().nextDouble(0.0, 101.0)
    return this.usoCpuAtual;
    
    }
    public Double getUsoDiscoAtual(){
    DiscosGroup discos1 = looca1.getGrupoDeDiscos();
    List<Disco> listaDiscos1 = discos1.getDiscos();
    for (Disco disco : listaDiscos1) {
    usoDiscoAtual = disco.getEscritas().doubleValue();
    }
    return this.usoDiscoAtual;
        
    }
    public Double getUsoRamAtual(){
    usoRamAtual = looca1.getMemoria().getEmUso().doubleValue();
    return this.usoRamAtual;
    }
    
    public Double getMenorUsoCpu(){
    if(usoCpuAtual == 0.0){
    menorUsoCpu = getUsoCpuAtual();
    }else if(usoCpuAtual < menorUsoCpu){
    menorUsoCpu = this.usoCpuAtual;
    }
    return this.menorUsoCpu;
    }
    
    public Double getMaiorUsoCpu(){
    if(usoCpuAtual == 0.0){
    maiorUsoCpu = getUsoCpuAtual();
    }else if(usoCpuAtual > maiorUsoCpu){
    maiorUsoCpu = usoCpuAtual;           
    }
    return this.maiorUsoCpu;
    }
    
    public Double getMenorUsoRam(){
    if(usoRamAtual == 0.0){
    menorUsoRam = getMenorUsoRam();
    }else if(usoRamAtual < menorUsoRam){
    menorUsoRam = usoRamAtual;
    } 
    return this.menorUsoRam;
    }
    
    public Double getMaiorUsoRam(){
    if(usoRamAtual == 0.0){
    maiorUsoCpu = getUsoRamAtual();
    }else if(usoRamAtual < menorUsoRam){
    menorUsoRam = usoRamAtual;
    } 
    return this.menorUsoRam;
    }
    
    public Double getMaiorUsoDisco(){
    if(usoDiscoAtual == 0.0){
    maiorUsoDisco = getUsoRamAtual();
    }else if(usoDiscoAtual > maiorUsoDisco){
       maiorUsoDisco = usoDiscoAtual;           
    }   
    return this.maiorUsoDisco;
    }
    
    public Double getMenorUsoDisco(){
    if(usoDiscoAtual == 0.0){
    menorUsoDisco = getMenorUsoDisco();
    }else if(usoDiscoAtual < menorUsoDisco){
    menorUsoDisco = usoDiscoAtual;
    } 
    return this.menorUsoDisco;
    }

   
  
  }
  
    
    
    
    
 
  
  
  
    


