# CGUIMJava2_HW4

1.	點選作業連結
2.	Clone GitHub repo到本機端資料夾CGUIMJava2_HW4
3.	建立新的Java Project，命名為HW4
4.	將HW3的 Card.java與Deck.java複製到CGUIMJava2_HW4，並拖拉到Java HW4 project中 （選link）
5.	將CGUIMJava2_HW4的HW4.java拖拉到Java HW4 project中 （選link）
6.	Card.java內容不變
7.	Deck.java中，一共要有以下內容：
  - private ArrayList<Card> cards; (原有內容)
  - private ArrayList<Card> usedCard; (原有內容)
  - private ArrayList<Card> openCard; (5pt)
    - 存放此副牌中所有打開的牌，洗牌時要重置
  - public int nUsed; (原有內容)
  - public Deck (int nDeck)  (原有內容)
  - public void printDeck() (原有內容)
  - public ArrayList<Card> getAllCards() (原有內容)
  - public void shuffle()
    - 洗牌時記得重置private ArrayList<Card> openCard; (5pt)
  - public Card getOneCard (boolean isOpened)
    - 拿到一張牌，修改原有method，加入isOpened參數，決定發出去的牌是開著還是蓋起來的，若是開著的牌，加入openCard。 (5pt)
  - public ArrayList<Card> getOpenedCard()
    - 回傳此副牌中所有打開過的牌，意即openCard  (5pt)
    
8.	新增Player.java，並包括以下內容：
  - private String name; (5pt)
    - 玩家姓名
  - private int chips; (5pt)
    - 玩家有的籌碼
  - private int bet; (5pt)
    - 玩家此局下注的籌碼
  - private ArrayList<Card> oneRoundCard; (5pt)
    - 此牌局的卡
  - public Player(String name, int chips) (5pt)
    - Player constructor，新增Player物件時，需要姓名、擁有的籌碼等兩個參數
  - public String getName() (5pt)
    - name的getter
    - return name;
  - public int makeBet() (5pt)
    - 下注，回傳預計下注的籌碼
    - 基本下注：一次1元
      - 如
      - bet=1;
      - return bet;
    - 注意：要檢查是否還有錢，沒錢了就不能再繼續下注
  - public void setOneRoundCard(ArrayList<Card> cards) (5pt)
    - 設定此牌局所得到的卡 setter
    - oneRoundCard=cards;
  - public boolean hitMe() (10pt)
    - 是否要牌，是回傳true，不再要牌則回傳false
    - 基本參考條件：16點以下要牌，17點以上不要牌
    - 提示：用oneRoundCard來算
  - public int getTotalValue() (5pt)
    - 回傳此牌局所得的卡點數加總
  - public int getCurrentChips() (5pt)
    - 回傳玩家現有籌碼
  - public void increaseChips (int diff) (5pt)
    - 玩家籌碼變動，setter
  - public void sayHello() (5pt)
    - 玩家Say Hello
    - System.out.println("Hello, I am " + name + ".");
    - System.out.println("I have " + chips + " chips.");

9.	HW4執行輸出範例如下：

Hello, I am Player 1.

I have 100 chips.

Hello, I am Player 2.

I have 300 chips.

Hit! Player 1's Cards now:

Heart,7

Diamond,8

Club,10

Player 1, Pass hit!

Player 1, Final Card:

Heart,7

Diamond,8

Club,10

Hit! Player 2's Cards now:

Club,Ace

Spade,4

Club,8

Hit! Player 2's Cards now:

Club,Ace

Spade,4

Club,8

Spade,11

Player 2, Pass hit!

Player 2, Final Card:

Club,Ace

Spade,4

Club,8

Spade,11

Need another game

Player 1 has 100 chips

Player 2 has 300 chips
