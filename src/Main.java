
public class Main {

    public static void main(String[] args) {
        try {
            String msg = "nihao";
            DesEncoding des = new DesEncoding();
            byte[] desencode = des.Encrytor(msg);

            byte[] desdecode=des.Decryptor(desencode);
            System.out.println(msg);
            System.out.println(new String(desencode));
            System.out.println(new String(desdecode));
        } catch (Exception e) {

        }


    }
}
