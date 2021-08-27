package day48_Racap.SportTask;

public class Basketball extends Sport{

    public Basketball(int numberOfPlayers, int numberOfRefre, String rules) {
        super(numberOfPlayers, numberOfRefre, rules);
    }

    @Override
    public void play() {
        System.out.println("Is playing basketball");
    }


}
