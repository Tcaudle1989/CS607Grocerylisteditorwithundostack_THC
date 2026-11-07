import java.util.ArrayList;

public class SwapCommand extends UndoCommand {
   // TODO: Add field declarations here
	private ArrayList<String> sourceList;
	private int i, j;
   // TODO: Add constructor code here
	public SwapCommand(ArrayList<String> sourceList, int i, int j) {
		this.sourceList = sourceList;
		this.i = i;
		this.j = j;
	}
   @Override
   public void execute() {
      // TODO: Type your code here
	   String temp = sourceList.get(i);
	   sourceList.set(i, sourceList.get(j));
	   sourceList.set(j, temp);
   }

}
