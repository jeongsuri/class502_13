package Quest03;


public class CongCaffee {

    public String order(int money) {
        if(money == Menu.CONGAMERICANO){
            return money+"으로 콩카페에서 아메리카노를 구매했습니다.";
        }else if(money == Menu.CONGLATTE){
            return money+"으로 콩카페에서 라떼를 구매했습니다.";
        }else{
            return null;
        }
    }
}
