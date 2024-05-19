package exam01;

public class Main {
    public static void main(String[] args) {
        ChildA childa = new ChildA();
        Parents parentsA = childa;
        parentsA.onlyParents();
    }
}



