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
