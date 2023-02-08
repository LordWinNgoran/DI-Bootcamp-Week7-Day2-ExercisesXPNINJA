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

public class Main {

	public static void main(String[] args) {
        Player player = new Player("Sachin", 40, "Cricket");

        System.out.println(" Player's Name : " + player.getName());
        System.out.println("Player's Age : " + player.getAge());
        System.out.println(" Player's GameType : " + player.getGameType());

    }

}
