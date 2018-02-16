package homework3;



public class MyString {
    public Character[] chars;


    public MyString(Character[] chars ){
        this.chars = new Character[chars.length];

        for (int x=0; x<chars.length;x++){
            this.chars[x] = chars[x];
        }
    }


    public int length(){
        return this.chars.length;
    }

    public Character charAt(int index){
        return this.chars[index];
    }

    public MyString substring(int begin, int end){
        int arrLen=end-begin;
        Character[] sub = new Character[arrLen];
        int counter=0;
        for (int x=begin;x<end;x++){

            sub[counter] = this.charAt(x);
            counter++;
        }

        return new MyString(sub);
    }


    public MyString substring(int begin){
        int counter=0;
        Character[] sub = new Character[chars.length];
        for (int x=begin;x<(chars.length-begin);x++){
            sub[counter] = this.charAt(x);
            counter++;
        }

        return new MyString(sub);
    }

    public MyString toLowerCase() {
        Character[] lower = new Character[chars.length];
        for (int x = 0; x < this.length(); x++) {
            lower[x] = this.chars[x];
            lower[x] = Character.toLowerCase(lower[x]);

        }
        return new MyString(lower);
    }

    public MyString toUpperCase(){
        Character[] upper = new Character[chars.length];
        for (int x=0;x< this.length();x++){
            upper[x]= this.chars[x];
           upper[x]=Character.toUpperCase(upper[x]);

        }

        return new MyString(upper);
    }

    public boolean equals(MyString s){
        if(this.length()==s.length()){
            return true;
        }
        else {
            return false;
        }
    }

    public MyString getMyString(){
        Character[] chars;
        chars=this.chars;
        return new MyString(chars);
    }

    public String toString(){
        String str=new String();

        for(int x=0;x<this.length();x++){
            str= str+this.charAt(x);
        }
        return str;
    }
    //im not sure if this is the best way to do this??
    public static MyString valueOf(int i){
        Character[] value=new Character[1];
        char[] x=new char[1];
        x = Integer.toString(i).toCharArray();
        value[0]= x[0];
    return new MyString (value);

    }

}

/*https://stackoverflow.com/questions/25821178/convert-lowercase-to-uppercase-using-ascii
https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html
https://www.tutorialspoint.com/java/java_object_classes.htm

https://www.geeksforgeeks.org/java-lang-integer-class-java/
 */