package io.zipcoder.pets;

/**
 * Created by nurudeenlawal on 5/5/16.
 */
public class Pet {
    String name;
    public void speak(){
         System.out.println("Hey");
    }
    void setName(String petName){
        name = petName;
    }
    String getName(){
        return name;
    }

}
class Dog extends Pet{
    public void speak(){
        System.out.println("Woof Woof");
    }
}
class Cat extends Pet{
    public void speak(){
        System.out.println("Meow");
    }
}
class Dragon extends Pet{
    public void speak(){
        System.out.println("Rawr");
    }
}
class Turtle extends Pet{
    public void speak(){
        System.out.println("Derp");
    }
}
class Fish extends Pet{
    public void speak(){
        System.out.println("Bloop");
    }
}
