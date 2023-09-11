package registro_est;

import java.util.ArrayList;

public class Estudiante {

    public String name;
    public int age;
    public ArrayList<Double> qualifications;

    public double promedio(){

        double suma =0d;

        for (int i=0; i <qualifications.size(); i++){
            suma = suma+qualifications.get(i);
        }
        double prome = suma/qualifications.size();
        return prome;
    }

}
