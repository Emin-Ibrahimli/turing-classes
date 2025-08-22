public class Box<T> {

    private T value;

    private Box(T value) {
        this.value = value;
    }

    public <T> Box<T> ofNullable(T value) {
        if (value == null) {
            Box<T> box = new Box<>(null);
            return box;
        } else {
            Box<T> box = new Box<>(value);
            return box;
        }
    }

    public T getValue() {
        if (value == null) {
            throw new NullPointerException();
        }
        return value;
    }

    public <T> Box<T> of(T value) {
        if (value == null) {
            throw new NullPointerException();
        }
        return new Box<>(value);
    }

    public boolean isPresent() {
        return value != null;
    }

    public boolean isEmpty() {
        return value == null;
    }
}
