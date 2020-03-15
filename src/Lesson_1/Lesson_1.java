package Lesson_1;

public class Lesson_1 {
        private static void calc(int a, int b, int c, float d)
        {
            System.out.println(a * (b + (c / d)));
        }

        private static void task10and20(int x1, int x2) {
            if (x1 + x2 > 10) {
                if (x1 + x2 < 20) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            } else {
                System.out.println("False");
            }
        }

        private static void PositiveNegative(int x) {
            if (x>=0) { System.out.println("Положительное");
            } else { System.out.println("Отрицательное");
            }
        }

        private static void privet(String name) {
            System.out.println("Привет, " + name);
        }
        private static void visokosnij (int x) {
            if ((x % 4) == 0) { System.out.println("высокосный");
            } else { System.out.println("Не высокосный");
            }
        }
        public static void main(String[] args){
            calc(2,3,6,3);
            task10and20(5,10);
            PositiveNegative(-1);
            privet("Владимир");
            visokosnij (2019);
        };
}
