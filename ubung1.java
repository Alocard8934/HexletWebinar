// добавлен на Git!!!!!!!!!!

package JavaHexletWebinar;

/* Дана строка, нужно написать функцию, которая позволяет вернуть значение true, 
если строка является палиндромом, и false - если нет. При этом нуэно учитывать
пробелы и знаки препинания
*/
/*Given a string, you need to write a function that allows you to return true,
if the string is a palindrome, and false otherwise. At the same time, it is necessary to take into account
spaces and punctuation marks*/

public class ubung1 {
    public static void main(String[] args) {
        String str = "abba";
        String strReversed = "";
        for(int i = str.length() - 1; i >= 0; i--){
            strReversed = strReversed + str.charAt(i);
        }   
        
        if(str.equals(strReversed)){
            System.out.println(str + " is Palendrome");
        } else {
        System.out.println(str + " is not Palendrome");
        }
    }
}
