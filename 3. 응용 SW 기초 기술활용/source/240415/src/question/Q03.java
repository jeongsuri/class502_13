package question;
//5층 건물이 있습니다. 1층 약국, 2층 정형외과, 3층 피부과, 4층 치과, 5층 헬스클럽입니다. 건물의 층을 누르면 그 층이 어떤 곳인지 알려주는 엘리베이터가 있을 때 이를 swich ~ case문으로 구현하시오(5층인 경우 ‘5층 헬스클럽입니다.’)
public class Q03 {
    public static void main(String[] args) {
        int num = 5;
        switch (num){
            case 1:
                System.out.println("1층");
            case 2:
                System.out.println("2층");

        }
    }
}
