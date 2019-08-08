package problem_one;

public class Candidates {

private String name;
private int id;
private int votes;

public Candidates(String name, int id) {
this.name = name;
this.id = id;
votes = 0;
}

public Candidates() {
	// TODO Auto-generated constructor stub
}

public String getName() {
return name;
}
public void setName1(String newname) {
    name = newname;
}
public void setId1(int newid) {
    id = newid;
}
public int getId1() {
return id;
}

public void addVote() {
votes++;
}

public int getVotes() {
return votes;
}

public String toString() {
StringBuilder str = new StringBuilder();

str.append("\nCandidate: " + getName());
str.append("\nID: " + getId1());
str.append("\nVotes: " + getVotes() + "\n");

return str.toString();
}

public void setName11(String canName) {
	// TODO Auto-generated method stub
	
}

public void setName(String canName) {
	// TODO Auto-generated method stub
	
}




}