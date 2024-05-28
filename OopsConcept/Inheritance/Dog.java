class Animal {
    String name;
    int age;
    String species;

    Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public String getname() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getspecies() {
        return species;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setspecies(String species) {
        this.species = species;
    }
}

class Dog extends Animal {
    String breed;
    String color;

    Dog(String name, int age, String species, String breed, String color) {
        super(name, age, species);
        this.breed = breed;
        this.color = color;
    }

    public String getbreed() {
        return breed;
    }

    public String getcolor() {
        return color;
    }

    public void setbreed(String breed) {
        this.breed = breed;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public static void main(String s[]) {
        Dog obj = new Dog("bairav", 17, "indian hound", "rajapalayam dog", "white");
        System.out.println("Animal name is: " + obj.getname() + ", Animal age is: " + obj.getAge() + ", Animal species is: " + obj.getspecies() + ", Animal breed is: " + obj.getbreed()+ ", color : "+ obj.getcolor());
        
        obj.setname("yoga");
        obj.setAge(22);
        obj.setspecies("puppy");
        obj.setbreed("unwanted");
        obj.setcolor("black");
        
        System.out.println("Animal name is: " + obj.getname() + ", Animal age is: " + obj.getAge() + ", Animal species is: " + obj.getspecies() + ", Animal breed is: " + obj.getbreed()+ ", color : "+ obj.getcolor());
        
        
    }
}

