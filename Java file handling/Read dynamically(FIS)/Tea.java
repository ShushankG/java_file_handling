import java.io.*;
class Tea{

public static void main(String args[]) throws Exception{

FileInputStream fis = new FileInputStream("./tata.txt");
int data=fis.read();

while(data!=-1){

System.out.println((char)data);

}
fis.close();

}


}
