public class KarateGuard extends PistolProtection implements BodyGuard, BodyGuard.KickProtect {

    @Override
    public void kickProtect() {
        System.out.println("Атака ногой успешно отражена и нападавший был выбит в смятку");
    }

    @Override
    public void hitProtect() {
        System.out.println("Враг был легко отбит и убит локтем");
    }
}
