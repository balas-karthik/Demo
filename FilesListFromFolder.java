import java.io.File;
public class FilesListFromFolder {
	 public static void main(String a[]){
	        File file = new File("C:/Temp/");
	        File[] files = file.listFiles();
	        for(File f: files){
	            System.out.println(f.getName());
	            System.out.println(sw);
	        }
	    }
}
