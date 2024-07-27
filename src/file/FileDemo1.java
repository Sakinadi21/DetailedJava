package file;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        File dir = new File("C:/Users/DELL/Documents/person");
        dir.mkdir(); //directory will be created
        String dirlocation = dir.getAbsolutePath();
        System.out.println(dirlocation);
        System.out.println(dir.getName());
        if(dir.delete()){
            System.out.println(dir.getName() + " folder has been deleted");
            System.out.println("\n \n");

            File file1 = new File("Mashu.txt");
            File file2 = new File("Saku.txt");
            try{
                file1.createNewFile();
                file2.createNewFile();
                System.out.println("Files are created");
            }catch(Exception e){
                System.out.println(e);
            }
            file2.delete();

            if(file2.exists()){
                System.out.println("File exists");
            }else{
                System.out.println("File does not exist");
            }
        }
    }
}
