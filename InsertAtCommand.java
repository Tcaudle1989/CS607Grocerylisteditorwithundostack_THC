import java.util.ArrayList;

public class InsertAtCommand extends UndoCommand {
   // TODO: Add field declarations here
	private ArrayList<String> sourceList;
	private int index;
	private String item;
   // TODO: Add constructor code here
	public InsertAtCommand(ArrayList<String> sourceList, int index, String item) {
		this.sourceList = sourceList;
		this.index = index;
		this.item = item;
	}

   @Override
   public void execute() {
      // TODO: Type your code here
	   sourceList.add(index, item);
   }
}
