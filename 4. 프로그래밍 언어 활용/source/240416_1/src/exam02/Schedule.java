package exam02;

public class Schedule {
    private int year;
    private int month;
    private int day;

    public void setYear(int _year){ //멤버 변수의 값을 확인할 수 있는 접근 가능한 메서드 추가(set)
        year = _year;
    }

    public void setMonth(int _month){ //멤버 변수의 값을 확인할 수 있는 접근 가능한 메서드 추가(set)

        month = _month;
    }

    public void setDay(int _day){ //멤버 변수의 값을 확인할 수 있는 접근 가능한 메서드 추가(set)
        if(month == 2 && _day>28){
            _day=28;
        }
        day = _day;
    }

    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }

    void showDate(){
        System.out.printf("year : %d, month : %d, day : %d\n",year,month,day);

    }
}
