package day48_Racap.SportTask;

public class Baseball extends Sport{

    public Baseball(int numberOfPlayers, int numberOfRefre, String rules) {
        super(numberOfPlayers, numberOfRefre, rules);
    }

    @Override
    public void play() {
        System.out.println("Is playing baseball");
    }
}
