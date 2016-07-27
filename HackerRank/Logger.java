import java.io.*;
public class Logger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream out=null;
		
		try {
			out=new FileOutputStream("numbers.bin");
			out.write(17);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//out.close();
		}
		
	}

}
