package files;

public class ReadSequentialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadSequentialFile r=new ReadSequentialFile();
		
		r.openFile();
		r.readRecord();
		r.closeFile();

	}

}
