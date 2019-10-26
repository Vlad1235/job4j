package ru.job4j.tracker;
/**
 класс ValidateInput -  получает данные из системы до тех под пока не введут правильные символы.

 Если мы посмотрим на метод ConsoleInput.askInt(String question, int max), то мы увидим, что поведение этого метода не достаточно для наших нужд.
 Давайте добавим в него нужно поведение за счет механизма переопределения (override).
 Чтобы использовать переопределение метода нужно создать класс, который будет наследовать ConsoleInput.Давайте его назовем ValidateInput.
 Теперь этот метод полностью удовлетворяет нашим нуждам.


 Давайте произведем рефакторинг класса Валидатор.
 Смысл введения этого класса - это добавление новой логики в существующий метод.
 В данном коде мы использовали наследование.
 В большинстве случаев, наследование жестко связывается два класса.
 Что по сути делает класс ValidateInput - он получает данные из системы до тех под пока не введут правильные символы.
 В данным коде нет указания на источник данных.
 Мы могли бы с легкостью написать тест на этот класс. Но у нас нет возможности управлять источником данных в этом примере.
 Источник приходиться на класс ConsoleInput.
 То есть, возникает жесткое связывание.
 Давайте избавимся от наследование за счет использование композиции.
 Создадим поле, которое будет содержать источник данных. В данном случае он описывается нашим интерфейсом Input.
 Давайте посмотри на получившийся код.



 */
public class ValidateInput implements Input {
    private final Input input;

    public ValidateInput(Input input) {
        this.input = input;
    }

    @Override
    public String ask(String question) {
        return input.ask(question);
    }

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


        /*
Как мы видим, мы произвели минимальные изменения. Но это изменения позволили избавиться от связи с классом ConsoleInput.
Мы так же расширяем интерфейс Input. Часть реализации мы получаем за счет ссылки на реализацию private Input input;
То есть мы можем в это поле передать класс ConsoleInput или StubInput и к их поведению добавить поведение валидации.
Теперь мы можем написать тест на данных класс.
В качестве источники данных мы будет использовать наш класс StubInput.


Все изменения коснулись только входящего параметра. Класс ConsoleInput - как бы вложился в класс ValidateInput.
Если рассматривать пример из жизни, то это можно рассмотреть как матрешки. Одна матрешка вкладывается в другую.
Все выше описанное есть шаблон проектирования Декоратор.
Смысл Декоратора - добавление нового поведение в уже существующее поведение.
         */
    }
}
