package ru.job4j.tracker;
/**
класс ValidateInput -  получает данные из системы до тех под пока не введут правильные символы.
 Все выше описанное есть шаблон проектирования Декоратор.
 Смысл Декоратора - добавление нового поведение в уже существующее поведение.


 Если мы посмотрим на метод ConsoleInput.askInt(String question, int max), то мы увидим, что поведение этого метода не достаточно для наших нужд.
 Давайте добавим в него нужно поведение за счет механизма переопределения (override).
 Чтобы использовать переопределение метода нужно создать класс, который будет наследовать ConsoleInput.

 */
public class ValidateInput extends ConsoleInput {
//    @Override
//    public int askInt(String question) {
//        boolean invalid = true;
//        int value = -1;
//        do {
//            try {
//                value = super.askInt(question);
//                invalid = false;
//            } catch (NumberFormatException nfe) {
//                System.out.println("Please enter validate data again ");
//            }
//        } while (invalid);
//        return value;
//    }
    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        if (!invalid){
            throw new NumberFormatException("Please enter validate data again ");
        }
        value = super.askInt(question);
        invalid = false;
        return value;
    }



    @Override
    public int askInt(String question, int max) {
//        boolean invalid = true;
////        int value = -1;
////        do {
////            try {
////                value = super.askInt(question, max);
////                invalid = false;
////            } catch (IllegalStateException moe) {
////                System.out.println("Please select key from menu ");
////            } catch (NumberFormatException nfe) {
////                System.out.println("Please enter validate data again ");
////            }
////        } while (invalid);
////        return value;
        boolean invalid = true;
        int value = -1;
        if(!invalid){
            throw new IllegalStateException("Please select key from menu ");
            throw new NumberFormatException("Please enter validate data again ");
        }
        value = super.askInt(question, max);
        invalid = false;
        return value;
    }
}


//    public class ValidateInput implements Input{
//
//    private final Input input;
//
//    public ValidateInput(Input input) {
//        this.input = input;
//    }
//
//    @Override
//    public String ask(String question) {
//        return input.ask(question);
//    }
//
//    @Override
//    public int askInt(String question, int max) {
//        boolean invalid = true;
//        int value = -1;
//        do {
//            try {
//                value = input.askInt(question, max);
//                invalid = false;
//            } catch (IllegalStateException moe) {
//                System.out.println("Please select key from menu ");
//            } catch (NumberFormatException nfe) {
//                System.out.println("Please enter validate data again ");
//            }
//        } while (invalid);
//        return value;
//    }
//    @Override
//    public int askInt(String question) {
//        return Integer.valueOf(ask(question));
//    }
//}
