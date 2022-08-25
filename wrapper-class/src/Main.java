/* WRAPPER CLASS :
* provide a way to use primitive data type as reference data type
*
* pros: - reference data type contains a lot of useful methods (String is already a reference data type)
*       - can be used with collection (eg: ArrayList)
*
* cons: access primitive data type needs a lot more steps compared to primitive
*
* primitive         wrapper class
* ----------        --------------
* boolean           Boolean
* char              Character
* int               Integer
* double            Double
*
* autoboxing -> automatic conversion that the Java compiler makes
*               between the primitive types and their corresponding
*               object wrapper class
* unboxing  ->  the reverse of autoboxing. It is also an automatic conversion
*               but from the object wrapper class to primitive data type
*  */
public class Main {
    public static void main (String[] args){
        // autoboxing (primitive --> wrapper)
        // assign primitive (ex. true) to wrapper (ex. Boolean)
        Boolean a = true;
        Character b = 'b';
        Integer c = 1;
        Double d = 1.0;

        // unboxing (wrapper --> primitive)
        // even though it is a reference data type
        // but it still behaved as a primitive because of the unboxing feature of Java compiler
        if ( a == true ){
            System.out.println("This is true");
        }
    }
}
