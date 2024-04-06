class MyClass {
    int value;

    MyClass(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(20);
        System.out.println("Before: " + obj.value);
        modifyObject(obj);
        System.out.println("After: " + obj.value);
    }

    // Method to modify an object (reference passed by value)
    public static void modifyObject(MyClass obj) {
        obj.value = 30;
    }
}

public class PassByValueExample {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Before: " + num);
        modifyPrimitive(num);
        System.out.println("After: " + num);
    }

    // Method to modify a primitive type (passed by value)
    public static void modifyPrimitive(int number) {
        number = 20;
    }
}
