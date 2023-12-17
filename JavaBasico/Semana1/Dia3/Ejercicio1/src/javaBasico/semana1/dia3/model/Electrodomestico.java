package javaBasico.semana1.dia3.model;

public class Electrodomestico {
    private int cod;
    private String marca;
    private String modelo;
    private double consumo;
    private String color;
    
    public int getCod(){
        return cod;
    }
    public void setCod(){
        this.cod = cod;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(){
        this.marca = marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(){
        this.modelo = modelo;
    }
    public double getConsumo(){
        return consumo;
    }
    public void setConsumo(){
        this.modelo = modelo;
    }
    public String getColor(){
        return color;
    }
    public void setColor(){
        this.color = color;
    }
    
    public Electrodomestico(){
    
    }
    
    public Electrodomestico(int cod, String marca, String modelo, double consumo, String color){
        this.cod = cod;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.color = color;
    }
    
    public String toString(){
        return "Código: " + cod + "\nMarca: " + marca + "\nModelo: " + modelo + "\nConsumo: " + consumo + " kW" + "\nColor: " + color;
    }
    
    
    
    
}
