package access;

public class Speaker {
    private int volume ;

    Speaker(int volume){
        this.volume = volume;
    }
    
    
    void volumeUp(){
        if(this.volume>=100){
            System.out.println("Volume is at maximum level.");
        } else {
            this.volume += 10;
            System.out.println("Volume increased to: " + this.volume);
        }
    }

    void volumeDown(){
        if(this.volume<=0){
            System.out.println("Volume is at minimum level.");
        } else {
            this.volume -= 10;
            System.out.println("Volume decreased to: " + this.volume);
        }
    }

    void showVolume(){
        System.out.println("Current volume: " + this.volume);
    }



}
