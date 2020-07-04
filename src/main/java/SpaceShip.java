import java.util.Random;

public class SpaceShip {
    private String model;
    private String captain;
    private Integer id;
    private Integer fuel;

    private static int coolnumber = 100;

    static {
        System.out.println("Static init block 1");
        coolnumber = 20;
    }



    {
        System.out.println("The first initiliazation block");
        model = "Not set";
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "model='" + model + '\'' +
                ", captain='" + captain + '\'' +
                ", id=" + id +
                ", fuel=" + fuel +
                '}' + " coolnumber = " + coolnumber;
    }

    public SpaceShip() {
        System.out.println("This is a constructor with no arguments");
    }

    public SpaceShip(String model, String captain) {
        this.model = model;
        this.captain = captain;
    }

    public SpaceShip(String model, String captain, Integer id, Integer fuel) {
        this.model = model;
        this.captain = captain;
        this.id = id;
        this.fuel = fuel;
    }
    static {
        System.out.println("Static init block 2");
        coolnumber = 42;
    }
    public String getModel() {
        return model;
    }

    public String getCaptain() {
        return captain;
    }

    public Integer getId() {
        return id;
    }

    public Integer getFuel() {
        return fuel;
    }

    {
        System.out.println("The 2nd initiliazation block");
        id = new Random().nextInt();
        fuel = 50;
    }

}
