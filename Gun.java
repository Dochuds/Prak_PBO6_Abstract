public class Gun extends Weapon{
    
    public int bullets;
    
    public Gun(){
        
    }
    
    public Gun(int bullets){
        this.bullets = bullets;
    }
    
    @Override
    public void attack(){
        System.out.println("Menembak peluru");
        System.out.println("Sisa peluru: "+--bullets);
        super.info();
    }
}
