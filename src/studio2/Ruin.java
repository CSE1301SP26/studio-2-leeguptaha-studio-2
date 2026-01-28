public class Ruin {

public static void main(String[] args) {
   
    System.out.println(Math.random());

int startAmount = 250;
int currentMoney = startAmount;
double winChance = 0.5;
int winLimit = 500;
int winCount = 0;
int loseCount = 0;
int totalSimulations = 1000;

for (int i=1;i<totalSimulations;i++) {
while (currentMoney < winLimit && currentMoney>0) {
    double randomNumber = Math.random();
    if (randomNumber <= winChance) {
        System.out.println("you lose");
        currentMoney--;
        loseCount++;
    }
 else {
        System.out.println("you win");
        currentMoney++;
        winCount++;
    }
}
System.out.println("Simulation " + i);
System.out.println("Number of plays: " + winCount + loseCount);

if (currentMoney==winLimit) {
    System.out.println("You have succeeded!");
}

else {
    System.out.println("You did not succeed!");
}
}
if (winChance == 0.5) {
    --(startAmount/winLimit);
}
else

}
}