package code2;
import java.util.ArrayList;

public class west{
    public static void main(String[]args){

        ArrayList<String> member = new ArrayList<String>();

        member.add("Kadraa");
        member.add("Logix");
        member.add("Bruh123");

        //member.set(0,"alpha");
        //member.remove(2);
        //member.remove(1);
        //member.clear();

        for(int i=0; i<member.size(); i++){
            System.out.println(member.get(i));
        }
    }
}