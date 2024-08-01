//Created using CodeHS. Here is the link: https://codehs.com/sandbox/id/caesarciphercodescyher-6QpaA3
public class MyProgram
{
    public static void main(String[] args)
    {
        System.out.println(encrypt("computer science is fun", 3));
        System.out.println(decrypt("frpsxwhu vflhqfh lv ixq", 3));
    }
    
    public static String encrypt(String s, int key){
        char[] letters = s.toCharArray();
        for(int i = 0;i<letters.length;i++){
            if(Character.isLetter(letters[i])){
                if(letters[i]>(122-key)){
                    int difference = ((int) (letters[i])) - (122-key);
                    letters[i] = (char) (difference + 96);
                }else{
                    letters[i] = (char) (letters[i]+key); 
                }
            }
            
        }
        String encrypted = new String(letters);
        return encrypted;
    }
    
    public static String decrypt(String s, int key){
        char[] letters = s.toCharArray();
        for(int i = 0;i<letters.length;i++){
            if(Character.isLetter(letters[i])){
                if(letters[i]<(97+key)){
                    letters[i] = (char) (122 - (key - (letters[i]-96)));
                }else{
                    letters[i] = (char) (letters[i]-key); 
                }
            }
            
        }
        String encrypted = new String(letters);
        return encrypted;
    }
}
