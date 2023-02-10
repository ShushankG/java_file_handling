import java.io.*;
class Cha{

public static void main(String args[])throws Exception{

//we did not create a text file it automatically created when fos run
FileOutputStream fos = new FileOutputStream("./toast.txt");

fos.write(333);
fos.close();


}

}