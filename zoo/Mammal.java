package zoo;

public class Mammal extends Animal{
    private String furColor;

    public Mammal(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
    public void eat(){
        System.out.println("The mammal is eating its favorite food");
    }
}
