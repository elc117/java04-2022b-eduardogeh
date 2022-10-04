import java.util.ArrayList;

public class Laboratory {
  private String name;
  private ArrayList<Student> students;
  private ArrayList<Professor> professors;

  public Laboratory() {
  }

  public Laboratory(String name) {
    this.name = name;
    this.students = new ArrayList<Student>();
    this.professors = new ArrayList<Professor>();
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addMember(Student s) {
    this.students.add(s);
  }

  public void addMember(Professor p) {
    this.professors.add(p);
  }
  
  public ArrayList<String> getContactInfos() {
    ArrayList<String> retorno = new ArrayList<String>();

    for (Student s : this.students) {
      retorno.add(s.getContactInfo());
    }
    for (Professor p : this.professors){
      retorno.add(p.getContactInfo());
    }
    return retorno;
    
  }

  public boolean userExists(String userId) {
    for (Student s : this.students){
      if(s.getUserId().equals(userId))
        return true;
    }
    for (Professor p : this.professors){
      if(p.getUserId().equals(userId))
        return true;
    }
    return false;
  }

  public int countMembers() {
    return this.students.size() + this.professors.size();
  }


}