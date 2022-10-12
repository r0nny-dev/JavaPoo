package pokemonClass;
import java.util.ArrayList;

public class PokeDados {
    private String name;
    private String type1;
    private String type2;
    private int hp;
    private int attack;
    private int defense;
    private int special;
    private int speed;

    //constructor method. This method instance and feed the object.
    public PokeDados(String name,String type1,String type2,int hp,int attack,int defense,int special,int speed) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.special = special;
        this.speed = speed;
    }

    //constructor empty
    public PokeDados(){}

    //this method return a object with all attributes. 
    public ArrayList<String> getAllAttributes(){
       ArrayList<String> AllAttribute = new ArrayList<>();
        AllAttribute.add("Name: " + name);
        AllAttribute.add("Type: " + type1);
        AllAttribute.add("Type: " + type2);
        AllAttribute.add("HP: " + hp);
        AllAttribute.add("Attack: " + attack);
        AllAttribute.add("Defense: " + defense);
        AllAttribute.add("Special: " + special);
        AllAttribute.add("Speed: " + speed);
        
        return AllAttribute;
    }

    //Method Get
    public String getPokeName() {return name;}
    public String getPokeType1() {return type1;}
    public String getPokeType2() {return type2;}
    public int getHp() {return hp;}
    public int getAttack() {return attack;}
    public int getDefense() {return defense;}
    public int getSpecial() {return special;}
    public int getSpeed() {return speed;}

    //Method set
    public void setPokeName(String pokeName) {this.name = pokeName;}
    public void setPokeType(String pokeType) {this.type1 = pokeType;}
    public void setType2(String type2) {this.type2 = type2;}
    public void setHp(int hp) {this.hp = hp;}
    public void setAttack(int attack) {this.attack = attack;}
    public void setDefense(int defense) {this.defense = defense;}
    public void setSpecial(int special) {this.special = special;}
    public void setSpeed(int speed) {this.speed = speed;}
}
