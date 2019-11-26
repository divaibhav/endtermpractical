/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 26-Nov-19
 *  Time: 5:24 PM
 */
package question8.solution8;

import java.util.Objects;

public class Student {
    private int rollNo;
    private String name;
    private double cpi;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCpi() {
        return cpi;
    }

    public void setCpi(double cpi) {
        this.cpi = cpi;
    }
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o instanceof Student){
            Student s = (Student)o;
            if(name.equals(s.name) && Integer.compare(rollNo, s.rollNo) == 0&& Double.compare(cpi,s.cpi)== 0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    @Override
    public int hashCode(){
        return Objects.hash(rollNo,name,cpi);
    }
}
