package controller;

import models.Componente;

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
    private Double porcentagemUsoRam = 0.0;
    
    

    private Double usoMaxCpu;
    private Double usoMaxRam;
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

    public Double getUsoAtualDisco() {
        return componente1.getUsoDiscoAtual();
    }

    public Double getUsoAtualRam() {
        return componente1.getUsoRamAtual();
    }
    
    public Double getUsoMaxCpu(){
    return componente1.getMaiorUsoCpu();
    }
    public Double getUsoMinCpu(){
    return componente1.getMenorUsoCpu();
    }
    public Double getUsoMaxDisco(){
    return componente1.getMaiorUsoDisco();
    }
    public Double getUsoMinDisco(){
    return componente1.getMenorUsoDisco();
    }
    public Double getUsoMaxRam(){
    return componente1.getMaiorUsoRam();
    }
    public Double getUsoMinRam(){
    return componente1.getMenorUsoRam();
    }
    
    public Double getPorcentagemUsoRam(){
    return componente1.getPorcentagemUsoRam();
    }
    
    public Double getPorcentagemUsoDisco(){
    return componente1.getPorcentagemUsoDisco();
    }
    
    public String getNivelDeAlertaCpu(){
    if(usoAtualCpu > 70){
    return "Extremo";
    }else if(usoAtualCpu >= 50 && usoAtualCpu <= 69){
    return "Moderado";
    }else{
    return "Estável";
    }}
    
    public String getNivelDeAlertaDisco(){
    if(usoAtualDisco > 70){
    return "Extremo";
    }else if(usoAtualDisco >= 50 && usoAtualDisco <= 69){
    return "Moderado";
    }else{
    return "Estável";
    }}
    
    public String getNivelDeAlertaRam(){
    if(usoAtualRam > 70){
    return "Extremo";
    }else if(usoAtualRam >= 50 && usoAtualCpu <= 69){
    return "Moderado";
    }else{
    return "Estável";
    }}
    
    
    
    
    }

