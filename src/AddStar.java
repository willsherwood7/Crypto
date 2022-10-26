import java.util.ArrayList;

public class AddStar {
	public ArrayList<String> addStar(ArrayList<String> strings) {
		  for (int i = 0; i < strings.size(); i++)
		  {
		    strings.set(i, (strings.get(i) + "*"));
		  }
		  return strings;
		}
}
