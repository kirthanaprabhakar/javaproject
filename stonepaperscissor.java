import java.util.*;
import.java.io.*;
public class game
{
public static final string ROCK="ROCK";
publi static final string PAPER="PAPER";
public static final string SCISSORS="SCISSORS";

public static void main(String args[])
{
System.out.println("Enter your choice");
System.out.println("ROCK");
System.out.println("PAPER");
System.out.println("SCISSORS");
System.out.println();

String playerMove = getPlayerMove();
String computerMove = getComputerMove();

if(playerMove.equals(computerMove));
     System.out.println("TIE !!");
else if(playerMove.equals(Game.ROCK))
    System.out.println(computerMove.equals(Game.PAPER) ? "Computer Wins":"Player wins");
else if(playerMove.equals(Game.PAPER))
    System.out.println(computerMove.equals(Game.SCISSORS) ? "Computer Wins":"Player wins");
else
    System.out.println(computerMove.equals(Game.Rock) ? "Computer Wins":"Player wins"):
}
 public static String getComputerMove()
{
String computermove;
Random random=new Random();
int input=random.nextInt(3)+1;
if(input==1)
  computermove=Game.ROCK;
else if(input==2)
  computermove=Game.SCISSORS;
System.out.println("computer move is:"+computermove);
System.out.println();
return computermove;
}
public static String getplayerMove();
{
Scanner in=in.next();
  String playermove=input.toUpperCase();
  System.out.println("player move is:"+playerMove);
  return playermove;
}
}

