package CarranoBook.chap02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadHelper {
	
	BufferedReader filereader(String filename){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(filename));
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		       // sb.append(System);
		        line = br.readLine();
		    }
		    String everything = sb.toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		    try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return br;
	}
	
	

		public char[] readFile(String filename)
		{
			char[] content = null;
		    File file = new File(filename); //for ex foo.txt
		    FileReader reader = null;
		    try {
		        reader = new FileReader(file);
		        char[] chars = new char[(int) file.length()];
		        reader.read(chars);
		        //content = new String(chars);
		        content=chars;
		        reader.close();
		    } catch (IOException e) {
		        e.printStackTrace();
		    } finally {
		        if(reader !=null){try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}
		    }
		    return content;
		}
	

}
