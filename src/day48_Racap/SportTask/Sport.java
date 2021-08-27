package day48_Racap.SportTask;

public class Sport {
    private int numberOfPlayers, numberOfRefre;
    private String rules;

    public Sport(int numberOfPlayers, int numberOfRefre, String rules) {
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfRefre = numberOfRefre;
        this.rules = rules;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfRefre() {
        return numberOfRefre;
    }

    public void setNumberOfRefre(int numberOfRefre) {
        this.numberOfRefre = numberOfRefre;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }


    public void play(){
        System.out.println(numberOfPlayers+" is playing");
    }

    @Override
    public String toString() {
        return "Sport{" +
                "numberOfPlayers=" + numberOfPlayers +
                ", numberOfRefre=" + numberOfRefre +
                ", rules='" + rules + '\'' +
                '}';
    }
}
