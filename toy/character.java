import java.util.Random;
import java.util.Scanner;


public class character{
	public static void main(String[] args) {
		Random rnd = new Random();

		int str = rnd.nextInt(15)+4;
		int con = rnd.nextInt(15)+4;
		int pow = rnd.nextInt(15)+4;
		int dex = rnd.nextInt(15)+4;
		int app = rnd.nextInt(15)+4;
		int siz = rnd.nextInt(9)+10;
		int innt = rnd.nextInt(9)+10;
		int edu = rnd.nextInt(15)+7;
		int db1=str+siz;
		String db2 ;
		if (db1<=12) {
			db2="-1D6";
		}else if(db1<=16){
			db2="-1D4";
		}else if(db1<=24){
			db2="0";
		}else if(db1<=32){
			db2="+1D4";
		}else if(db1<=40){
			db2="1d6";
		}else{
			db2="神話生物";
		}

		int san = pow*5;
		int idea = innt*5;
		int know = edu*5;


		//名前を入力
		System.out.println("探索者の名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();


		System.out.println("探索者名:"+name);
		System.out.println("STR:"+str+"\t"+"CON:"+con+"\t"+"DB:"+db2);
		System.out.println("POW:"+pow+"\t"+"DEX:"+dex+"\t"+"初期SAN値:"+san);
		System.out.println("APP:"+app+"\t"+"SIZ:"+siz+"\t"+"アイディア:"+idea);
		System.out.println("INT:"+innt+"\t"+"EDU:"+edu+"\t"+"知識:"+know);


		for (;;) {
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("機能を選んでください");
			System.out.println("1:修正　０:ステータス表示");
			Scanner scan = new Scanner(System.in);
			int select = scan.nextInt();
			int sts;
			int sel1;
			int sel2;
			int yn;
			if (select== 1) {
				sts = 0;
				if (sts==0) {
					System.out.println("修正");
					System.out.println("どれを修正しますか");
					System.out.println("1:STR");
					sel1 = scan.nextInt();
					if (sel1==1) {
						System.out.println("機能を選んでください");
						System.out.println("1:振り直し 2:数値修正");
						sel2=scan.nextInt();
						if (sel2==1) {
							str = rnd.nextInt(15)+4;
							System.out.println("振り直し結果   STR:"+str);
							System.out.println("");
							System.out.println("");
						}else if (sel2==2) {
							for (;;) {
								str=scan.nextInt();
								System.out.println("STR:"+str);
								System.out.println("");
								System.out.println("");	
								if (str>=19) {
									System.out.println("最大値を超えています。やり直してください");
								}else if(str<=2)  {
									System.out.println("最低値を下回っています。やり直してください");
								}else{
									break;
								}
							}
						}else{
							System.out.println("正しい値を入力してください");
						}	
					}
				}
			} else if (select==0) {
				System.out.println("探索者名:"+name);
				System.out.println("STR:"+str+"\t"+"CON:"+con+"\t"+"DB:"+db2);
				System.out.println("POW:"+pow+"\t"+"DEX:"+dex+"\t"+"初期SAN値:"+san);
				System.out.println("APP:"+app+"\t"+"SIZ:"+siz+"\t"+"アイディア:"+idea);
				System.out.println("INT:"+innt+"\t"+"EDU:"+edu+"\t"+"知識:"+know);
			}else{
				System.out.println("正しい値を入力してください");

			}
		}
	}
}