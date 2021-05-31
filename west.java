package code2; //file convert
import java.util.ArrayList;

public class west{
    public static void main(String[]args){

        ArrayList<String> member = new ArrayList<String>();

        member.add("Kadraa");//list
        member.add("Logix");//list
        member.add("Bruh123");//list

        //member.set(0,"alpha"); //remove // if you want 
        //member.remove(2);
        //member.remove(1);
        //member.clear();

        for(int i=0; i<member.size(); i++){
            System.out.println(member.get(i));
        }
    }
}
