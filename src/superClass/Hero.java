package superClass;

public class Hero extends Person{

    String superPower;
    public Hero(
            String name,
            int age,
            String superPower
    ){
        super(name, age);
        this.superPower= superPower;
    }

    public String toString(){
        return super.toString()+ this.superPower;
    }



}
