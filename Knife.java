public class Knife extends Weapon {
    
    public String knifeEdge;
    
    public Knife(){
        
    }
    
    @Override
    public void attack(){
        System.out.println("Menyayat dan menusuk musuh");
        super.info();
    }

}
