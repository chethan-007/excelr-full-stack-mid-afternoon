package pack1;

public class A
{
    public static void main(String[] args)
    {
        System.out.println("done:"+args);
    }
}
//commandline arguments
// if you are printing the reference you will get obeject memory loction like classname@hascode in the form of hexadecimal
//at the time of runing a program,we can pass some arguments to the program that is what we can call command line arguments
//while running a program even JVM also supply a default empty abject as argument to the main method of a class
// we acn able to supply some commends line arguments that would be converted into string objects