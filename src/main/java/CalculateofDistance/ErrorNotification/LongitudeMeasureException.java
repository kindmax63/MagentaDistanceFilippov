package CalculateofDistance.ErrorNotification;


public class LongitudeMeasureException extends Throwable {
    @Override
    public String toString() {
        return "Неправильное значение,должно быть -180 to 180";
    }
}
