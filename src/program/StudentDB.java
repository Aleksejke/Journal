package program;


public class StudentDB {
    public String Group;
    public String Name;
    public String Surname;
    public int Number;
    
    public StudentDB() {       
    }
    
    public StudentDB(String g, String n, String s, int nm) {
       Group = g;
       Name = n;
       Surname = s;
       Number = nm;
   }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String Group) {
        this.Group = Group;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }
    
    
}
