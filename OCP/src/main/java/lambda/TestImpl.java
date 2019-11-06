package lambda;

public class TestImpl implements Test {
    @Override
    public boolean test(final Student s) {
        return s.hasAbility();
    }


}
