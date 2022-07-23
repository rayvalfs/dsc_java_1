package callSmartContract;

import java.math.BigDecimal;
import org.json.JSONObject;
import milfont.com.tezosj.model.TezosWallet;

public class TestWallet
{

   public static void test_wallet_main(String[] args)
   {
       System.out.println("package callSmartContract: class Main: function main(): ENTRY");
       System.out.println("package callSmartContract: class Main: Hello World!");
      try
      {
	  //TezosWallet wallet = new TezosWallet("mypassphrase");                // Change later for a testnet wallet that you control and has funds.
		   TezosWallet wallet = new milfont.com.tezosj.model.TezosWallet ("mypassphrase");
	  //         System.out.println("PubKey hash:" + wallet.getPublicKeyHash());
	  //         System.out.println("Mnemonic   : " + wallet.getMnemonicWords());
	  //         System.out.println("Balance    : " + wallet.getBalance());

         // Change wallet provider to use testnet.
	  //         wallet.setProvider("https://tezos-dev.cryptonomic-infra.tech");

         // Sets amount and fee for the transaction.
         BigDecimal amount = new BigDecimal("0");
         BigDecimal fee = new BigDecimal("0.1");

         //
         // IMPORTANT: Remember that you must have funds in your wallet for this code to work!
         //
         
         
         // Calls the contract entry point.
	 //         JSONObject jsonObject = wallet.callContractEntryPoint(wallet.getPublicKeyHash(),
	 //	       "KT18pK2MGrnTZqyTafUe1sWp2ubJ75eYT86t", amount, fee, "", "", "addCustomer",
	 //    new String[] { "1000000", "98765", "Bob", "99876787" });

         // Prints the operation hash in the console.
	 //         String opHash = (String) jsonObject.get("result");
	 //         System.out.println("OpHash : " + opHash);

      } catch (Exception e)
      {
         e.printStackTrace();
      }
       System.out.println("package callSmartContract: class Main: function main(): EXIT");
   }

}
