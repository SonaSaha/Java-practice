package exam.exam.control_statements;

public class ControlStatements {

    // selection statements
    public void selectionStatementsDemo() {
//        int x = 1;
//        if(x == 1) {
//            System.out.println("Executes if x = 1");
//        } else if (x == 2){
//            System.out.println("Executes if x = 2");
//        } else {
//            System.out.println("If no true statement wasn't found");
//        }

//        // can be used only int, string and enum
//        switch (x) {
//            case 0:
//                System.out.println("Number is 0");
//                break;
//            case 1:
//                System.out.println("Number is 1");
//                break;
//            case 2:
//                System.out.println("Number is 2");
//                break;
//            default:
//                System.out.println(x);
//        }

        // new switch feature

        String sport = "Football";
        String bestPlayer = "";

        switch (sport) {
            case "Football":
                bestPlayer = "XXX";
                break;
            case "Tennis":
                bestPlayer = "YYY";
                break;
            case "Cricket":
                bestPlayer = "ZZZ";
                break;
            default:
                bestPlayer = "DDD";

        }
//        String res = switch(sport) {
//            case "Football" -> "XXX";
//            case "Tennis" -> "YYY";
//            case "Cricket" -> "ZZZ";
//            default -> "DDD";
//        };

        String res = switch(sport) {
            case "Football" -> {
                System.out.println("The best player in Football");
                yield "XXX";
            }
            case "Tennis" -> "YYY";
            case "Cricket" -> "ZZZ";
            default -> "DDD";
        };
        System.out.println(res);

    }


    public void loopStatementsDemo() {
        for(int i = 0; i < 5; ++i) {
            System.out.println(i);
        }

        int x = 5;
        while(x > 0) {
            System.out.println(x);
            --x;
        }

        do {
            System.out.println(x);
            ++x;
        } while (x < 5);

        int[] array = {1, 2 ,8, 6, 23};
        for(int y: array) {
            System.out.println(y);
        }
    }

    // jump statements demo
    public void jumpStatementsDemo() {

        // break used to break loop and switch statements
        // can be used with labels: break label name
        // label name: for()
        for(int i=0; i < 5; ++i) {
            if(i == 2) {
                break;
            }
            System.out.println(i);
        }
        // continue
        for(int i=0; i < 5; ++i) {
            if(i == 2) {
                continue;
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ControlStatements obj = new ControlStatements();
        obj.selectionStatementsDemo();

    }
}
