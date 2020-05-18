import java.util.Scanner;


public class Cipher {
	char[] encoder= new char[26];
	char[] decoder= new char[26];
	 
	public Cipher(int rot)
	{
		for (int i=0;i<26;i++)
		{
	encoder[i]=(char)('A'+(i+rot)%26);
	decoder[i]=(char)('A'+(i-rot+26)%26);
	}
	}

	public String encrypt(String message)
	{
		return transform(message,encoder);
	}
	
	public String decrypt(String secret)
	{
		return transform(secret,decoder);
	}
	
	public String transform(String original,char[] code)
	{
		char[] msg=original.toCharArray();
		for (int j=0;j<msg.length;j++)
		{
			if( Character.isUpperCase(msg[j]));
			{
			int k=msg[j]-'A';
			msg[j]=code[k];
			}
		
		}
		return new String(msg);
	}
	
	public static void main(String[] args )
	{
		Scanner sc= new Scanner(System.in);
		Cipher cipher= new Cipher(3);
		System.out.println("encoder= "+  new String(cipher.encoder));
		System.out.println("decoder= "+  new String(cipher.decoder));
		String x=sc.nextLine();
		int c=sc.nextInt();
		String coded=cipher.encrypt(x);
		System.out.println("encrypted message= "+coded);
		String decoded=cipher.decrypt(coded);
		System.out.println("decrypted message= "+decoded);
	}
}
