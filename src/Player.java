public class Player {

   private String playerName;

   public Player(String playerName) {

       this.playerName = playerName;

   }

   public String getPlayerName() {

       return playerName;

   }

   public void setPlayerName(String playerName) {

       this.playerName = playerName;

   }

      public Hand getHand() {

       return this.hand;

   }



   public void setHand(Hand hand) {

       this.hand = hand;

   }

}