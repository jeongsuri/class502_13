package org.choongang.global;

import org.choongang.global.constants.Menu;
import org.choongang.main.MainRouter;

import java.util.Scanner;

public abstract class AbstractController implements Controller {

    protected Scanner sc;

    public AbstractController() {
        sc = new Scanner(System.in);
    }

    //상단 공통 출력부분
    public void common() {
        System.out.println("학생관리 프로그램 Ver1.0");
        System.out.println("------------------------------------");
    }

    //프롬프트 입력항목
    public void prompt() {
        System.out.print("메뉴 선택: ");
        String menu = sc.nextLine();
        if (menu.equals("q") || menu.equals("quit") || menu.equals("exit")) {
            System.out.println("종료 합니다.");
            System.exit(0); // 0 - 정상 종료, 1 - 비정상 종료
        }

        try {
            int m = Integer.parseInt(menu);
            change(m); // 메뉴 변경
        } catch (Exception e) {
            System.out.println("메뉴는 숫자로 입력하세요.");
        }
    }

    @Override
    public final void run() {
        common();
        show();
        prompt();
    }

    private void change(int menuNo) {
        Menu menu = null;
        switch (menuNo) {
            case 1:
                menu = Menu.JOIN;
                break;
            case 2:
                menu = Menu.LOGIN;
                break;
            default:
                menu = Menu.MAIN;
        }
    }

}
