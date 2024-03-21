public class Patient {
    private int age;

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 130) {
            throw new InvalidAgeException(age);
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
