package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod(){
        System.out.println("This is a public method."+this.publicField);
    }

    void defaultMethod(){
        System.out.println("This is a default method."+this.defaultField);
    }

    private void privateMethod(){
        System.out.println("This is a private method."+this.privateField);
    }

    public void innerAccess(){
        System.out.println("내부호출 this is inner access method");
        this.publicField = 100;
        this.defaultField = 200;
        this.privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }



}
