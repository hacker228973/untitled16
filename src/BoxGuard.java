public class BoxGuard extends PistolProtection implements BodyGuard{
    @Override
    public void hitProtect() {
        System.out.println("Удар был легко опережен и вам не удалось выжить");
    }
}
