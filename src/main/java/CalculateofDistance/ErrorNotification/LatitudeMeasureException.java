package CalculateofDistance.ErrorNotification;


public class LatitudeMeasureException extends Throwable {
    @Override
    public String toString() {
        return "Неправильное значение,должно быть -90 to 90";
    }
}
