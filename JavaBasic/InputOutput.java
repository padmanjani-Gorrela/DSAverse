/*
Input(user gives value): 7
Output: 7
*/

class Solution {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(a);
    }
}
/*
PUBLIC
Type: Access modifier
Meaning: It defines visibility (who can access this method).
public means this method is accessible from anywhere from any class, package, or JVM.
The Java Virtual Machine (JVM) needs to access this method from outside your class when it starts the program.
Without public, the JVM cannot call main(), because it wouldn’t have permission.
*/
public class Demo {
    private static void main(String[] args) { } //  JVM can't access this, it throwa an error like main method not found.
}

/*
STATIC
Type: Non-access modifier
Meaning: Belongs to the class, not to any object.
Normally, to call a method, you must create an object of the class.
But the JVM needs to call main() without creating an object first, because no objects exist yet.
So, main() must be static, meaning: It can be called directly using the class name without creating an instance.
*/

/*
VOID
Type: Return type
Meaning: This method does not return any value.
The main() method tells the JVM what to do, but it doesn’t send any value back when it finishes.
After main() finishes execution, the program simply ends.
void = no return value to JVM*/

/*
MAIN
Type: Method name (identifier)
Meaning: The predefined entry point of every Java application.
JVM looks for a method named exactly main to start execution.
You can have other methods in the program, but execution always begins with main().
In short: main() is where your program starts.
*/

/*
(String[] args)
Type: Parameter list
Meaning: It’s an array of String objects — used to take command-line arguments.
args is just a variable name — you can rename it (like String[] myArgs).
Example: If you run
``
java Demo hello world
``
then args[0] = "hello" and args[1] = "world"
You can absolutely replace args with any valid variable name, such as:
public static void main(String[] a) or string[] banana anything else, jvm doesnot care about the variable it's our choice.
*/
