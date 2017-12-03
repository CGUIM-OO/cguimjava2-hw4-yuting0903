import java.util.ArrayList;
public class Player {

	private ArrayList<Card> oneRoundCard;//此牌局的卡
	
	private String name;//玩家姓名
	
	private int chips;// 玩家有的籌碼
	
	private int bet; //玩家此局下注的籌碼
	
	
	
	public Player(String name, int chips)//新增Player物件時，需要姓名、擁有的籌碼等兩個參數
	{
		 this.name=name;
		 this.chips=chips;
	}
	
	public String getName()//回傳姓名
	{
		return name;
	}
	
	public int makeBet()//回傳預計下注的籌碼
	{
		if(chips>0)//如果還有錢
			{
			bet=1;//預設下注1元
			return bet;
			}
		else
			return 0;//如果沒錢下注0元
		
	}
	public void setOneRoundCard(ArrayList<Card> cards)//這個牌局得到的牌放進去oneRoundCard中
	{
		oneRoundCard=cards;
	}
	
	public boolean hitMe()//判斷是否要牌
	{
		if(getTotalValue()<=16)//如果目前點數總和小於16則繼續要牌
			return true;
		else
			return false;//如果目前點數總和大於16則不要牌
	}
	
	public int getTotalValue()//計算目前點數的總和
	{	
		int score = 0;
		for(int i=0;i<=oneRoundCard.size()-1;i++)//從目前得到的牌這個陣列中取出每張牌並加總所有點數
		{
			if(oneRoundCard.get(i).getRank()==10||oneRoundCard.get(i).getRank()==11||oneRoundCard.get(i).getRank()==12||oneRoundCard.get(i).getRank()==13)
				score = score+10;//在牌的數字為10.11.12.13時點數要以10去計算
			else
				score = score+oneRoundCard.get(i).getRank();//其餘的數字就以原本的數字去計算
		}
		return score;//回傳總和
	}
	
	public int getCurrentChips()
	{
		return chips;//回傳玩家現有籌碼
	}
	
	public void increaseChips (int diff)
	{
		chips = chips+diff;//玩家籌碼變動
	}
	
	public void sayHello()
	{
		System.out.println("Hello, I am " + name + ".");
	    System.out.println("I have " + chips + " chips.");
	}
}


