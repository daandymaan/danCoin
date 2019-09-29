
import java.util.ArrayList;
import com.google.gson.GsonBuilder;

public class DanCoin
{
    public static ArrayList<Block> coins = new ArrayList<Block>();
    public static int difficulty = 5;
	public static void main(String[] args) {
        
        

		coins.add(new Block("Hi im the first block", "0"));
        System.out.println("Trying to Mine block 1..");
        coins.get(0).mineBlock(difficulty);
		
		coins.add(new Block("Yo im the second block",coins.get(coins.size()-1).hash));
		System.out.println("Trying to Mine block 2..");
        coins.get(1).mineBlock(difficulty);
		
        coins.add(new Block("Hey im the third block",coins.get(coins.size()-1).hash));
        System.out.println("Trying to Mine block 3..");
        coins.get(2).mineBlock(difficulty);
        
        System.out.println("\n Blockchain is valid:" + isChainValid());

        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(coins);
        System.out.println("The DANCOINS");
        System.out.println(blockchainJson);
        
		
    }
    public static Boolean isChainValid()
    {
        Block currentBlock;
        Block previousBlock;


        for(int i=1; i < coins.size(); i++)
        {
            currentBlock = coins.get(i);
            previousBlock = coins.get(i-1);

            if(!currentBlock.hash.equals(currentBlock.calculateHash()) )
            {
                System.out.println("Current hashes are not equal");
                return false;
            }

            if(!previousBlock.hash.equals(currentBlock.previousHash))
            {
                System.out.println("Previous Hashes not equal");
                return false;
            }
        }

        return true;
    }

}