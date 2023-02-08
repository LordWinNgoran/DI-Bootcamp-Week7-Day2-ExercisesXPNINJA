//Exercise 2 : Exercise 2 : Encapsulation Player
/*
* @author: N'goran Kouadio Jean Cyrille
* 
* @description: create a class Player in which all the fields are declared as private.
* A constructor will be declared for initializing the parameters because we will not 
* declare the setter method in the class. So, you will use constructor to initialize 
* the value of variables.
* date: 07/02/2023
*/
package exercise2;

public class Player {
	private String name;
    private int age ;
    private String gameType ;

    public Player() {
    }
    public Player(String name, int age, String gameType) {
        this.name = name;
        this.age = age;
        this.gameType = gameType;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGameType() {
        return gameType;
    }
}
