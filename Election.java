package problem_one;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Election {


private static List<Candidates> ballot = new ArrayList<Candidates>();
private static List<Integer> votes = new ArrayList<Integer>();


public static void main(String args[]) {


Scanner sc = new Scanner(System.in);
System.out.println("Enter Num of Voters");
int n = sc.nextInt();

for(int i= 0 ; i<n ; i++){
System.out.println("Enter Candidate name & id");
Candidates candi = new Candidates();
String canName = sc.toString();
int canId = sc.nextInt();
candi.setName(canName);
candi.setId(canId);
addCandidate(candi);
}
for(int i = 0 ; i<n ; i++){
System.out.println("Enter Candidate Id for vote");
readVotes(sc);
}

System.out.println("Result Announced"); 
for(Candidates candit:ballot){ 
countVotes(candit);
}
}

public static void addCandidate(Candidates cand) {
ballot.add(cand);
}

public static void readVotes(Scanner readFile) {
int vote;

while (readFile.hasNextInt()) {
vote = readFile.nextInt();
votes.add(vote);
}
}

public static void countVotes(Candidates cand) {
for (int i = 1; i < votes.size(); i++) {
if (votes.get(i).equals(cand.getId())) {
cand.addVote();
}
}
}

public String toString() {
StringBuilder str = new StringBuilder();

for (Candidates cand : ballot) {
str.append(cand);
}
return str.toString();
}
}