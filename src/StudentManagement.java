/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Murtaza
 */
public class StudentManagement {

    public static String Decrypt(String pass)
    {
        String ans = "";
        for(int i=0;i<pass.length();i++)
        {
            int a = pass.charAt(i);
            a = a-i;
            while(a<0)
            {
                a = a+127;
            }
            ans = ans +""+ (char)a;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(StudentManagement.Decrypt("T1265"));
        System.out.println(StudentManagement.Decrypt("Si3weq"));
    }
    
}
