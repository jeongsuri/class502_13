package Quest03;

public class StarBucks {

    public String order(int money) {
        if(money == Menu.STARAMERICANO){
            return money+"으로 스타벅스에서 아메리카노를 구매했습니다.";
        }else if(money == Menu.STARLATTE){
            return money+"으로 스타벅스에서 라떼를 구매했습니다.";
        }else{
            return null;
        }
    }
}
