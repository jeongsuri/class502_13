package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Transportation trans = Transportation.BUS;
        Enum<Transportation> trans2 = trans;
        switch(trans) {
            case BUS :
                System.out.println("버스");
                break;
            case SUBWAY :
                System.out.println("지하철");
            case TAXI :
                System.out.println("택시");
        }


    }
}
