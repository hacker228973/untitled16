public class JiuJitsuGuard extends PistolProtection implements BodyGuard{
    @Override
    public void hitProtect() {
        System.out.println("Первый удар прошел, но к соожелению мне сказали что все атаки должны быть отбиты, поэтому вы проиграли");
    }
}
