package program;


public class PointsDB {
   
    public String Student;
    public String Date;
    public int Points;
    public String Description;
    
    public PointsDB() {       
    }
    
    public PointsDB(String s, String dt, int p, String d) {
       Student = s;
       Date = dt;
       Points = p;
       Description = d;
   } 


    public String getStudent() {
        return Student;
    }

    public void setStudent(String Student) {
        this.Student = Student;
    }
    

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public int getPoints() {
        return Points;
    }

    public void setPoints(int Points) {
        this.Points = Points;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
}
