package day41CustomClass_Constructor.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO, BA, SM;

    public ArrayList<Tester> testers ;
    public ArrayList<Developer> devops;

    public ScrumTeam(String PO, String BA, String SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        testers = new ArrayList<>();
        devops = new ArrayList<>();
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", testers=" + testers.size() +
                ", devops=" + devops.size() +
                '}';
    }

    public void hireTester(Tester tester){
        testers.add(tester);
    }
    public void hireTester(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }
    public  void hireTester(ArrayList<Tester> testers){
        this.testers.addAll(testers);
    }

    public void hireDeveloper(Developer developer){
        devops.add(developer);
    }

    public void hireDeveloper(Developer[] developers){
        this.devops.addAll(Arrays.asList(developers));
    }
    public void removeTester(int id){
        testers.removeIf( p -> p.id==id);

    }


}
