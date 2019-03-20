package animals;

public class dog {
    public String name;
    public String size;
    public int age;
    public String breed;

    public dog(String name, String size, int age, String breed) {
        this.name = name;
        this.size = size;
        this.age = age;
        this.breed = breed;
    }

    public String bark(String size) {
        String bark = " ";
        if (size.equalsIgnoreCase("small")) {
            bark = "yap yap yap";
        } else if (size.equalsIgnoreCase("medium")) {
            bark = "woof woof";
        } else {
            bark = "WOOF! WOOF!";
        }

        return bark;

    }

    public String play(String breed) {
        String playing = " ";
        if (size.equalsIgnoreCase("poodle")) {
            playing = "Oh Dear, I don't think so, no one could possibly engage in such activities.";
        } else if (size.equalsIgnoreCase("Labrador")) {
            playing = "Yeah, Yeah, Throw the ball!! please DO IT";
        } else if (breed.equalsIgnoreCase("border collie")) {
            playing = "Let us chase some stuff!";
        }
        return playing;
    }

    public String beHuman(String name, int age, String breed) {
        return "Hello Human, i'm" + name + " and I am a " + age + " year old " + breed + ", What breed are you?";
    }
}
