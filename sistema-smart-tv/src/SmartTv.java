public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume(){
        //volume = volume + 1
        volume++;
    }
    
    public void diminuirVolume(){
        //volume = volume - 1
        volume--;
    }
    
    public void aumentarCanal(){
        //canal = canal + 1
        canal++;
    }
    
    public void diminuirCanal(){
        //canal = canal - 1
        canal--;
    }

    public void mudarCanal(int canal) {
        this.canal = canal;     
    }

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }    
}
