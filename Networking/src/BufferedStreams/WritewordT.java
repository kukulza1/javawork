package BufferedStreams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WritewordT {

	public static void main(String[] args) {
		try {
			Writer wt = new FileWriter("word.txt");
			
			String data ="ant bear chicken cow eagle elephant"+" "+ 
					"horse monkey penguin tiger";
					
			wt.write(data);
			wt.flush();
					
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
