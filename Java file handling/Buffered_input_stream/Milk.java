import java.io.*;
class Milk{

public static void main(String args[]) throws Exception{

BufferedInputStream bis = new BufferedInputStream(new FileInputStream("T.txt"));

int data;
while((data = bis.read())!=-1){

System.out.print((char)data);
}


}


}