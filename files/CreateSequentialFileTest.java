package files;

public class CreateSequentialFileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreateSequentialFile c=new CreateSequentialFile();
		c.openFile();
		c.addRecords();
		c.closeFile();
	}

}
