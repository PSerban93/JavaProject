package AnimalRescue;

import AnimalRescue.Animals.*;
import AnimalRescue.Humans.Boy;
import AnimalRescue.Humans.Girl;
import AnimalRescue.Humans.Veterinary;

public class AppMain {


    public static void main(String[] args) {

        FrenchBulldog ares = new FrenchBulldog();
        ares.setName("Ares");
       // ares.setBreed("French bulldog");
        ares.setColor("Grey");
        ares.setAge(1.6F);
        ares.setHealth(10);
        ares.setHungry((byte) 1);
        ares.setMood((byte) 10);
        ares.setWeight(12.9F);
        ares.setHeightInCm(35.3F);

        System.out.println("Name: " + ares.getName());
        //System.out.println("Breed: " + ares.getBreed());
        System.out.println("Color: " + ares.getColor());
        System.out.println("Age: " + ares.getAge() + " years");
        System.out.println("Health: " + ares.getHealth());
        System.out.println("Hungry: " + ares.getHungry());
        System.out.println("Mood: " + ares.getMood());
        System.out.println("Weight: " + ares.getWeight() + " Kg");
        System.out.println("Height: " + ares.getHeightInCm() + " cm");

        ares.eat();
        ares.sleep();
        ares.speak();
        ares.play();

        FrenchBulldogFood aresfood = new FrenchBulldogFood();

        aresfood.setFoodname("D&D ");
        System.out.println("\nFood Name: " + aresfood.getFoodname());
        aresfood.setPrice("250 Lei");
        System.out.println("Price: " + aresfood.getPrice());
        aresfood.setQuantity("5 kg");
        System.out.println("Quantity: " + aresfood.getQuantity());
        aresfood.setStock("In Stock");
        System.out.println(aresfood.getStock());

        DogRecreationalActivity aresrecactivity = new DogRecreationalActivity();
        aresrecactivity.setRecreationalname("Running");
        System.out.println("\nRecreational Activity: " + aresrecactivity.getRecreationalname());

        Girl aresadopt = new Girl();
        aresadopt.setAdoptionName("Ana");
        aresadopt.setAmountofmoney(300);
        System.out.println("\nAdoption Person Name: " + aresadopt.getAdoptionName());
        System.out.println("Amount of Money: " + aresadopt.getAmountofmoney() + "Lei");

        Veterinary aresvet = new Veterinary();
        aresvet.setVetname("Mihai");
        aresvet.setVetspecialization("Cardiologie");
        System.out.println("\nVeterinary Name: " + aresvet.getVetname());
        System.out.println("Veterinary Specialization: " + aresvet.getVetspecialization());


        Labrador rex = new Labrador();
        rex.setName("Rex");
        //rex.setBreed("Labrador");
        rex.setColor("Gold");
        rex.setAge(2F);
        rex.setHealth(10);
        rex.setHungry((byte) 3);
        rex.setMood((byte)10);
        rex.setWeight(16.4F);
        rex.setHeightInCm(55);

        System.out.println("\nName:" + rex.getName());
        //System.out.println("Breed:" + rex.getBreed());
        System.out.println("Color:" + rex.getColor());
        System.out.println("Age:" + rex.getAge());
        System.out.println("Health:" + rex.getHealth());
        System.out.println("Hungry:" + rex.getHungry());
        System.out.println("Mood:" + rex.getMood());
        System.out.println("Weight: " + rex.getWeight() + " Kg");
        System.out.println("Height: " + rex.getHeightInCm() + " cm");

        rex.speak();

        LabradorFood rexfood = new LabradorFood();
        rexfood.setFoodname("Royal Canin");
        System.out.println("\nFood Name: " + rexfood.getFoodname());
        rexfood.setPrice("150 Lei");
        System.out.println("Price: " + rexfood.getPrice());
        rexfood.setQuantity("2.5 kg");
        System.out.println("Quantity: " + rexfood.getQuantity());
        rexfood.setStock("In Stock");
        System.out.println(rexfood.getStock());

        DogRecreationalActivity rexrecactivity = new DogRecreationalActivity();
        rexrecactivity.setRecreationalname("Walking");
        System.out.println("\nRecreational Activity: " + rexrecactivity.getRecreationalname());

        Boy rexadopt = new Boy();
        rexadopt.setAdoptionName("Dan");
        rexadopt.setAmountofmoney(400);
        System.out.println("\nAdoption Person Name: " + rexadopt.getAdoptionName());
        System.out.println("Amount of Money: " + rexadopt.getAmountofmoney() + "Lei");

        Veterinary rexvet = new Veterinary();
        rexvet.setVetname("Vio");
        rexvet.setVetspecialization("Ortopedie");
        System.out.println("\nVeterinary Name: " + rexvet.getVetname() );
        System.out.println("Veterinary Specialization: " + rexvet.getVetspecialization());

        Persian blackie = new Persian();
        blackie.setName("Blackie");
        System.out.println("\nName:" + blackie.getName());
        blackie.speak();

        Persian freddie = new Persian();
        freddie.setName("Freddie");
        System.out.println("\nName:" + freddie.getName());
        freddie.speak();
    }
}
