import java.util.Scanner;
public class Attack{
    public void attackBodyGuard(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как будем атаковать телохранителей?");
        System.out.println("1-Пистолет");
        System.out.println("2-Ударом ноги");
        System.out.println("3-Ударом руки");
        int how = scanner.nextInt();
        System.out.println("Кого будем атаковать?");
        System.out.println("1-Каратиста");
        System.out.println("2-Боксера");
        System.out.println("3-Джиу Джитсу");
        int who = scanner.nextInt()*10;
        switch(how+who){
            case 11 :
                BodyGuard attackToKarateGuardWithPistol = new KarateGuard();
                attackToKarateGuardWithPistol.pistolProtection();
                break;
            case 12 :
                BodyGuard.KickProtect attackToKarateGuardWithKick = new KarateGuard();
                attackToKarateGuardWithKick.kickProtect();
                break;
            case 13:
                BodyGuard attackToKarateGuardWithHit = new KarateGuard();
                attackToKarateGuardWithHit.hitProtect();
                break;
            case 21:
                BodyGuard attackToBoxGuardWithPistol = new BoxGuard();
                attackToBoxGuardWithPistol.pistolProtection();
                break;
            case 22:
                System.out.println("Это не честно. Нельзя бить рукопашного ногами");
                break;
            case 23:
                BodyGuard attackToBoxGuardWithHit = new BoxGuard();
                attackToBoxGuardWithHit.hitProtect();
                break;
            case 31:
                BodyGuard attackToJiuJitsuGuardWithPistol = new JiuJitsuGuard();
                attackToJiuJitsuGuardWithPistol.pistolProtection();
                break;
            case 32:
                System.out.println("Это не честно. Нельзя бить борца ногами");
                break;
            case 33:
                BodyGuard attackToJiuJitsuGuardWithHit = new JiuJitsuGuard();
                attackToJiuJitsuGuardWithHit.hitProtect();
                break;
            default:
                System.out.println("Извините, не понимать что вы сказать");
                break;
        }
    }
}
