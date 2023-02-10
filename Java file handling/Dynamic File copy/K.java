import java.io.*;

class K{
public static void main(String args[]) throws Exception{

FileInputStream fis = new FileInputStream(args[0]);
FileOutputStream fos = new FileOutputStream(args[1]);

int data;


while((data=fis.read())!=-1){

fos.write(data);

}

}


}