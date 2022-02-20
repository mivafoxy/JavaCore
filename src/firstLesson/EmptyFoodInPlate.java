package firstLesson;

public class EmptyFoodInPlate extends RuntimeException {
    @Override
    public String getMessage() {
        return "Еды в тарелке нет!";
    }
}
