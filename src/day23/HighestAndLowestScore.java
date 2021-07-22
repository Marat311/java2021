package day23;

public class HighestAndLowestScore {
    public static void main(String[] args) {

        int[] scores = {85, 70, 95, 90, 100, 110, 55};
        //              0,  1,  2,  3,  4

        String[] names = {"Mike", "Adam", "Tonny", "John", "Ammy", "Ahmet", "Muhtar"};

        int maxScore = scores[0];
        String maxName= "";

        int minScore = scores[0];
        String minName = "";

        for (int i=0; i <= names.length-1; i++ ){
            String eachName = names[i]; // gets each names from the array names
            int eachScore = scores[i]; // gets each score from the array scores

            if(eachScore > maxScore ){ // used for comparing the scores to assign the maximum score to maxScore
                maxScore = eachScore;
                maxName = eachName;
            }

            if(eachScore < minScore){ // used for comparing the scores to assign the miximum score to minScore
                minScore = eachScore;
                minName = eachName;
            }
        }

        System.out.println(maxName +" : "+maxScore);
        System.out.println(minName+" : "+minScore);


        System.out.println("==================================");

        int[] scores2 = {85, 70, 95, 90, 100, 110, 55};
        //              0,  1,  2,  3,  4

        String[] names2 = {"Mike", "Adam", "Tonny", "John", "Ammy", "Ahmet", "Muhtar"};

      int maxs = scores2[0];
      String maxN = names2[0];
        int minS = scores2[0];
        String minN = names2[0];

        for (int i=0; i<scores2.length; i++){

            if (scores2[i]>maxs){
                maxs=scores2[i];
                maxN=names2[i];
            }

            if(scores2[i]<minS){
                minS=scores[i];
                minN=names2[i];
            }

        }
        System.out.println(maxN+":"+maxs);
        System.out.println(minN+":"+minS);


    }


}

