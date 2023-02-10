import java.io.*;

class Cup{

public static void main (String args[]) throws Exception{

FileInputStream fis = new FileInputStream("./rame.txt");

int i =fis.read();
int j =fis.read();
int k =fis.read();
int l =fis.read();
int m =fis.read();
int n =fis.read();
System.out.println((char)i);
System.out.println(j);
System.out.println(k);
System.out.println(l);
System.out.println(m);
System.out.println(n);
fis.close();


}

}