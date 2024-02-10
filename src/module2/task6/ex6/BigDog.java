package src.module2.task6.ex6;

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }


    @Override
    public void greets(){
        System.out.println("Woow");
    }
    @Override
    public void greets(Dog another){
        System.out.println("Wooooooow");
    }
    public void greets(BigDog another) {
        System.out.println("Woooooooooooooooow");
    }
}
