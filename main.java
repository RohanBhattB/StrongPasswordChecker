import java.io.*;
import java.util.*;


public class main{
    
    //method to check weather if the password is Strong
    public static void check_pass(String pass) throws IOException
    {
        boolean StrongPass = true;
        //if password has 7 characters
        if (pass.length()<7)
        {
            System.out.println("Your Password should must contain atleast 7 characters");
            StrongPass=false;
        }

        
        //if password has atleast one number in it
        if(!containnumber(pass))
        {
            System.out.println("Your password must contain atleast one number");
            StrongPass=false;
        }

        //if password has atleast one special character
        if(!containsc(pass))
        {
            System.out.println("Your password must contain atleast one special character");
            StrongPass=false;
        }

        //check if password in the default password file
        if(isincommonpass(pass,"commonfile.txt"))
        {
            System.out.println("Your password is too common");
        }

        if(StrongPass)
        {
            System.out.println("Your Password Looks Great!!");
        }
    }

    public static boolean containnumber(String pass)
    {
        for(char ch:pass.toCharArray())
        {
            if(ch>='0'&&ch<='9')
            {
                return true;
            }
        }
        return false;
    }

    public static boolean containsc(String pass)
    {
        String SpecialCharacters="!@#$%^&*(),.?\\\":{}|<>";
        for(char ch:pass.toCharArray())
        {
            if(SpecialCharacters.indexOf(ch)!=-1)
            return true;
        }
        return false;
    }
    public static boolean isincommonpass(String pass,String filename)throws IOException
    {
        BufferedReader bf = new BufferedReader(new FileReader(filename));
        String line;
        while((line=bf.readLine())!=null)
        {
            if(line.trim().equals(pass)){
                bf.close();
                return true;//if its in list
            }
        }
        bf.close();
        return false;
    }

    
    
    
    
}
//main file 