import java.io.*;
class T{

public static void main(String args[]) throws Exception{

FileInputStream fis = new FileInputStream("abc.txt");

FileOutputStream fos = new FileOutputStream("bbc.txt");

int data;

while((data=fis.read())!=-1){

fos.write(data);

}



}



}