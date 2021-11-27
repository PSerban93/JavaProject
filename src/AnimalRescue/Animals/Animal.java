package AnimalRescue.Animals;

public abstract class Animal {
    private String name;
    private String breed;
    private String color;
    private float age;
    private float health;
    private byte hungry;
    private byte mood;
    private float weight;
    private float heightInCm;
    private String favoritefood;
    private String favrecactivity;


    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    /*public String getBreed(){
        return breed;}
    public void setBreed(String breed) {
        this.breed = breed;}*/
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public float getAge(){
        return age;
    }
    public void setAge(float age){
        this.age = age;
    }
    public float getHealth(){
        return health;
    }
    public void setHealth(float health){
        this.health = health;
    }
    public byte getHungry(){
        return hungry;
    }
    public void setHungry(byte hungry){
        this.hungry = hungry;
    }
    public byte getMood(){
        return mood;
    }
    public void setMood(byte mood){
        this.mood = mood;
    }
    public float getWeight(){
        return weight;
    }
    public void setWeight(float weight){
        this.weight = weight;
    }
    public float getHeightInCm(){
        return heightInCm;
    }
    public void setHeightInCm(float heightInCm){
        this.heightInCm = heightInCm;
    }



    public static void main(String[] args) {
    }
    public abstract void eat();
    public abstract void sleep();
    public abstract void speak();


    public abstract void play();

    }



