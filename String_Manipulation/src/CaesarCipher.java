public class CaesarCipher
{
    public String Encrypt(String str,int n)
    {
        StringBuffer Encrypted=new StringBuffer();

        for(int i=0;i<str.length();i++)
        {

            if(Character.isAlphabetic(str.charAt(i)))
            {
                char c=(char)(str.charAt(i)+n);
                Encrypted.append(c);
            }
            else
            {
                Encrypted.append(str.charAt(i));
            }
        }
        return Encrypted.toString();

    }
    public String Decrypt(String str,int n)
    {
        StringBuffer Decrypted=new StringBuffer();
        for(int i=0;i<str.length();i++)
        {

            if(Character.isAlphabetic(str.charAt(i)))
            {
                char c=(char)(str.charAt(i)-n);
                Decrypted.append(c);
            }
            else
            {
                Decrypted.append(str.charAt(i));
            }
        }

        return Decrypted.toString();
    }
    public static void main(String[] args)
    {

        CaesarCipher cc=new CaesarCipher();

        String str="Hello World !";

        String encrypted=cc.Encrypt(str,3);

        System.out.println(encrypted);

        String decrypted=cc.Decrypt(encrypted,3);

        System.out.println(decrypted);



    }
}
