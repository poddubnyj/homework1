package hw8;

/**
 * Created by user on 03.11.2015.
 */
public class FlyingTank implements ToFly, ToShoot {
    int caterpillar;
    int canon;

    @Override
    public String fly() {
        return "������";
    }

    @Override
    public String shoot() {
        return "�����";
    }
}
