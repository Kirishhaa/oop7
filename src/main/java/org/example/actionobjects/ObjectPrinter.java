package org.example.actionobjects;

import org.example.structures.DiagnosArray;
import org.example.structures.Patient;
import org.example.structures.PatientArray;

public class ObjectPrinter {
    public void print(Patient patient){
        if(patient!=null) System.out.println(patient.toText());
    }
    public void print(PatientArray patientArray){
        for(int i=0;i<patientArray.size();i++){
            print(patientArray.get(i));
        }
    }
    public void print(DiagnosArray diagnosArray){
        System.out.print(diagnosArray);
    }
}
