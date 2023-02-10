import java.io.*;
class File1{

public static void main(String args[]){

try{
File obj = new File("myfile.txt");

obj.createNewFile();


}
catch(Exception e){

System.out.print(e);

}


}


}