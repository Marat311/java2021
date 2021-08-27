package day43_OOP_Encapsulation;

import java.time.LocalDate;

public class FinalVariables {

    private final String gender;
    private final LocalDate DOB;

    public FinalVariables(String gender, LocalDate DOB) {
        this.gender = gender;
        this.DOB = DOB;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
      //  this.gender=gender;
    }




}
