package hw7;

import java.io.FileInputStream;
import java.io.IOException;

public class CopyFile {
	public static void main(String[] args) {
		
		String sourcefile = "source.txt";
		String destinationfile = "destinationfile.txt";
		
		try {
			copyFile(sourcefile, destinationfile);
			System.out.println("檔案成功複製");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		public static void copyFile(String sourcefile, String destinationfile)throws IOException {
			 
			try (
					FileInputStream inputStream = new FileInputStream(sourcePath);
		             FileOutputStream outputStream = new FileOutputStream(destinationPath)) {

		            byte[] buffer = new byte[1024]; // 定义一个缓冲区来存储读取的数据
		            int length;  // 每次读取的数据长度

		            // 循环读取文件，直到读取到文件末尾
		            while ((length = inputStream.read(buffer)) > 0) {
		                outputStream.write(buffer, 0, length);  // 将缓冲区中的数据写入目标文件
		            }
		        }
			
		}
		
		
	}

}
