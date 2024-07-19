public class Choki implements Hand {

    private String HAND_NAME = "チョキ";


    /**
     * 手の強弱を比較する。
     * <p>
     * 返り値 -1 : 自身が引数で指定した手より弱い
     * <p>
     * 　　　　0 : 自身が引数で指定した手と同じ
     * <p>
     * 　　　　1 : 自身が引数で指定した手より強い
     */


    public int compare(Hand hand) {

        if (hand instanceof Gu) {    //グー　vs チョキ（自分）

            return -1;

        } else if (hand instanceof Pa) {    //パー　vs チョキ（自分）

            return 1;

        } else {

            return 0;    //グー　vs グー（自分）

        }

    }


    public String getHandName() {

        return this.HAND_NAME;

    }
}