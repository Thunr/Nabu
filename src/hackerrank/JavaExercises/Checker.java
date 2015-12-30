package hackerrank.JavaExercises;

import java.util.Comparator;

public class Checker implements Comparator<Player> {

	static final public Comparator<Player> desc = new Checker(){
		public int compare(Player p1, Player p2){
			if (p1.score == p2.score){
				return -p1.name.compareTo(p2.name);
			}
			else {
				return (p1.score < p2.score ? 1 : -1);
			}
		}
	};

	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
