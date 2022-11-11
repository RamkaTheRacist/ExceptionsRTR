package Exceptions.Sem03.task3;

public class ZeroDivisionException extends ArithmeticException{
    public ZeroDivisionException(String message){
        super("Cant division by zero " + message);
    }
}
// * 1. Создайте класс исключения, который будет выбрасываться при делении на 0.
// * Исключение должно отображать понятное для пользователя сообщение об ошибке.