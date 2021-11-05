package AnimalRescue;

public class AppMain {


    public static void main(String[] args) {
        Dog ares = new Dog();
        ares.name = "Ares";
        ares.breed = "French bulldog";
        ares.color = "Grey";
        ares.age = 1.6F;
        ares.health = 10;
        ares.hungry = 1;
        ares.mood = 10;
        ares.weight = 12.9F;
        ares.heightInCm = 35;
        System.out.println("Name: " + ares.name);
        System.out.println("Breed: " + ares.breed);
        System.out.println("Age: " + ares.age + " years");
        System.out.println("Health: " + ares.health);
        System.out.println("Hungry: " + ares.hungry);
        System.out.println("Mood: " + ares.mood);
        System.out.println("Weight: " + ares.weight + " Kg");
        System.out.println("Height: " + ares.heightInCm + " cm");
        //System.out.println("Favorite Food: " + ares.favoritefood);//
        ares.eat();
        ares.sleep();
        ares.speak();
        ares.play();

        DogFood aresfood = new DogFood();

        aresfood.foodname = "D&D ";
        System.out.println("\nFood Name: " + aresfood.foodname);
        aresfood.price = "250 Lei";
        System.out.println("Price: " + aresfood.price);
        aresfood.quantity = "5 kg";
        System.out.println("Quantity: " + aresfood.quantity);
        aresfood.stock = "In Stock";
        System.out.println(aresfood.stock);

        RecreationalActivity aresrecactivity = new RecreationalActivity();
        aresrecactivity.recreationalname = "Running";
        System.out.println("\nRecreational Activity: " + aresrecactivity.recreationalname);

        Adoption aresadopt = new Adoption();
        aresadopt.adoptionName = "Ana";
        aresadopt.amountofmoney = 300;
        System.out.println("\nAdoption Person Name: " + aresadopt.adoptionName);
        System.out.println("Amount of Money: " + aresadopt.amountofmoney + "Lei");

        Veterinary aresvet = new Veterinary();
        aresvet.vetname = "Mihai";
        aresvet.vetspecialization = "Cardiologie";
        System.out.println("\nVeterinary Name: " + aresvet.vetname );
        System.out.println("Veterinary Specialization: " + aresvet.vetspecialization);


        Dog rex = new Dog();
        rex.name = "Rex";
        rex.breed = "Labrador";
        rex.age = 2;
        rex.health = 10;
        rex.hungry = 3;
        rex.mood = 10;
        rex.weight = 16.4F;
        rex.heightInCm = 55;

        System.out.println("\nName:" + rex.name);
        System.out.println("Breed:" + rex.breed);
        System.out.println("Age:" + rex.age);
        System.out.println("Health:" + rex.health);
        System.out.println("Hungry:" + rex.hungry);
        System.out.println("Mood:" + rex.mood);
        System.out.println("Mood: " + rex.mood);
        System.out.println("Weight: " + rex.weight + " Kg");
        System.out.println("Height: " + rex.heightInCm + " cm");

        DogFood rexfood = new DogFood();
        rexfood.foodname = "Royal Canin";
        System.out.println("\nFood Name: " + rexfood.foodname);
        rexfood.price = "150 Lei";
        System.out.println("Price: " + rexfood.price);
        rexfood.quantity = "2.5 kg";
        System.out.println("Quantity: " + rexfood.quantity);
        rexfood.stock = "In Stock";
        System.out.println(rexfood.stock);

        RecreationalActivity rexrecactivity = new RecreationalActivity();
        rexrecactivity.recreationalname = "Walking";
        System.out.println("\nRecreational Activity: " + rexrecactivity.recreationalname);

        Adoption rexadopt = new Adoption();
        rexadopt.adoptionName = "Dan";
        rexadopt.amountofmoney = 400;
        System.out.println("\nAdoption Person Name: " + rexadopt.adoptionName);
        System.out.println("Amount of Money: " + rexadopt.amountofmoney + "Lei");

        Veterinary rexvet = new Veterinary();
        rexvet.vetname = "Vio";
        rexvet.vetspecialization = "Ortopedie";
        System.out.println("\nVeterinary Name: " + rexvet.vetname );
        System.out.println("Veterinary Specialization: " + rexvet.vetspecialization);

        Dog blackie = new Dog();
        blackie.name = "Blackie";
        System.out.println("\nName:" + blackie.name);

        Dog freddie = new Dog();
        freddie.name = "Freddie";
        System.out.println("\nName:" + freddie.name);
    }
}
